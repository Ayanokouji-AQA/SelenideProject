import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class GmailTest {
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
        System.out.println("Login successful!");

        // Открываем страницу настроек
        $("[data-tooltip='Настройки']").click();
        $(".J-Ke.n0").shouldBe(visible);
        // Выбираем вкладку "Общие"
        $("[data-tooltip='Общие']").click();
        // Находим поле для ввода подписи и вводим текст подписи
        $("[name='sx_sg']").setValue("Это моя тестовая подпись");
        // Сохраняем изменения
        $("[class='T-I J-J5-Ji AO7 T-I-atl L3']").click();
        // Подтверждаем сохранение изменений
        $(".vh").shouldBe(visible);
        $(".TN.gl").click();
        System.out.println("Signature added successfully!");

        // Нажимаем кнопку "Написать"
        $("[class='T-I J-J5-Ji T-I-KE L3']").click();
        // Вводим адрес получателя
        $("[name='to']").setValue("recipient_email@gmail.com");
        // Вводим тему письма
        $("[name='subjectbox']").setValue("Тестовое письмо с подписью");
        // Вводим текст письма
        $("[role='textbox']").setValue("Это тестовое письмо с подписью.");
        // Нажимаем кнопку "Отправить"
        $("[class='T-I J-J5-Ji aoO T-I-atl L3']").click();
        System.out.println("Email sent successfully!");
        // Закрываем браузер
        closeWebDriver();
    }
}
