//import static com.codeborne.selenide.Condition.*;
//import static com.codeborne.selenide.Selenide.*;
//
//public class LoginGmail {
//    public static void main(String[] args) {
//        // Открываем страницу Gmail.com
//        open("https://mail.google.com");
//        // Находим поле для ввода адреса электронной почты
//        $("[type='email']").setValue("xcoolfirex@gmail.com");
//        // Нажимаем кнопку "Далее"
//        $("[id='identifierNext']").click();
//        // Находим поле для ввода пароля и вводим пароль
//        $("[name='password']").setValue("HZVtc6ZUqdK-K5J");
//        // Нажимаем кнопку "Далее"
//        $("[id='passwordNext']").click();
//        // Проверяем, что мы успешно авторизовались, находясь на странице почты
//        $(".aYF").shouldBe(visible);
//        System.out.println("Login successful!");
//        // Закрываем браузер
//        closeWebDriver();
//    }
//}

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

public class LoginGmail {

    private static final String EMAIL = "xcoolfirex@gmail.com";
    private static final String PASSWORD = "HZVtc6ZUqdK-K5J";

    public static void main(String[] args) {
        // Открытие страницы Gmail.com
        Selenide.open("https://mail.google.com/");

        // Ввод адреса электронной почты
        Selenide.$("[type='email']").val(EMAIL).pressEnter();

        // Ввод пароля
        Selenide.$("[name='password']").val(PASSWORD).pressEnter();

        // Проверка успешной авторизации
        Selenide.$(".gb_8a").shouldBe(Condition.visible);
        System.out.println("Login successful!");

        // Закрытие браузера
        Selenide.closeWebDriver();
    }
}