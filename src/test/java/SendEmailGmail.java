import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

public class SendEmailGmail {

    private static final String EMAIL = "xcoolfirex@gmail.com";
    private static final String PASSWORD = "HZVtc6ZUqdK-K5J";
    private static final String TO_EMAIL = "oesengali4@gmail.com";
    private static final String SUBJECT = "Greetgo";
    private static final String MESSAGE = "Greetgo is the best";

    public static void main(String[] args) {
        // Открытие страницы Gmail.com
        Selenide.open("https://mail.google.com/");

        // Ввод адреса электронной почты
        Selenide.$("[type='email']").val(EMAIL).pressEnter();

        // Ввод пароля
        Selenide.$("[name='password']").val(PASSWORD).pressEnter();

        // Клик по кнопке "Написать"
        Selenide.$("div.T-I.J-J5-Ji.T-I-KE.L3").click();

        // Ввод адреса получателя
        Selenide.$("[name='to']").val(TO_EMAIL);

        // Ввод темы письма
        Selenide.$("[name='subjectbox']").val(SUBJECT);

        // Ввод текста письма
        Selenide.$("[role='textbox']").val(MESSAGE);

        // Клик по кнопке "Отправить"
        Selenide.$("[aria-label*='отправить']").click();

        // Проверка успешной отправки письма
        Selenide.$(".vh").shouldBe(Condition.visible);
        System.out.println("Email sent successfully!");

        // Закрытие браузера
        Selenide.closeWebDriver();
    }
}
