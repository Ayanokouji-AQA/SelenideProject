import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class CheckSentGmail {
    public static void main(String[] args) {
        // Открываем страницу Gmail.com
        open("https://mail.google.com");
        // Находим поле для ввода адреса электронной почты
        $("[type='email']").setValue("xcoolfirex@gmail.com");
        // Нажимаем кнопку "Далее"
        $("[id='identifierNext']").click();
        // Находим поле для ввода пароля и вводим пароль
        $("[name='password']").setValue("HZVtc6ZUqdK-K5J");
        // Нажимаем кнопку "Далее"
        $("[id='passwordNext']").click();
        // Проверяем, что мы успешно авторизовались, находясь на странице почты
        $(".aYF").shouldBe(visible);
        // Нажимаем на ссылку "Отправленные"
        $("[aria-label='Отправленные']").click();
        // Проверяем, что последнее отправленное письмо появилось в списке
        $(".Cp").shouldHave(text("Test Subject"));
        // Закрываем браузер
        closeWebDriver();
    }
}
