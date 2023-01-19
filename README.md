# Проект автоматизации тестирования API на платформе [regres.in](https://reqres.in/)

##	Содержание

- [Технологии и инструменты](#technologist-технологии-и-инструменты)
- [Реализованныe проверки](#bookmark_tabs-реализованные-проверки)
- [Запуск тестов из терминала](#computer-запуск-тестов-из-терминала)
- [Запуск тестов в Jenkins](#-запуск-тестов-в-jenkins)
- [Отчет о результатах тестирования в Allure Report](#-отчет-о-результатах-тестирования-в-Allure-report)
- [Интеграция с Allure TestOps](#-интеграция-с-allure-testops)
- [Уведомления в Telegram с использованием бота](#-уведомления-в-telegram-с-использованием-бота)


## Технологии и инструменты
<p  align="center">

<code><img width="5%" title="IntelliJ IDEA" src="images/logo/Idea.svg"></code>
<code><img width="5%" title="Java" src="images/logo/Java.svg"></code>
<code><img width="5%" title="Gradle" src="images/logo/Gradle.svg"></code>
<code><img width="5%" title="Junit5" src="images/logo/Junit5.svg"></code>
<code><img width="5%" title="Appium" src="images/logo/Appium.svg"></code>
<code><img width="5%" title="Allure Report" src="images/logo/Allure.svg"></code>
<code><img width="5%" title="Allure TestOps" src="images/logo/Allure_TO.svg"></code>
<code><img width="5%" title="GitHub" src="images/logo/GitHub.svg"></code>
<code><img width="5%" title="Jenkins" src="images/logo/Jenkins.svg"></code>
<code><img width="5%" title="Telegram" src="images/logo/Telegram.svg"></code>

</p>

## Реализованные проверки:

- Успешная регистрация пользователя
- Вызов списка пользователей
- Создание пользователя
- Вход пользователя в систему
- Неуспешный вход пользователя в систему
- Проверка наличия емейла конкретного пользователя в списке пользователей
- Удаление пользователя

## Запуск тестов из терминала
```bash
gradle clean test 
```
в случае если вы не добавили файл с конфигурацией базового URL (src/test/resources/config/user.properties) вы можете изменить его через команду:
```bash
gradle clean test -DbaseURL=ваш базовый URL
```
## <img width="4%" title="Jenkins" src="images/logo/Jenkins.svg"> Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/15ronin226RegresInAPI/)

В качестве CI в проекте использован сервис Jenkins. Для запуска сборки необходимо нажать кнопку <code><strong>*Собрать сейчас*</strong></code>.

<p align="center">
  <img src="images/screen/jenkins1.png" alt="Jenkins" width="800">
</p>

После выполнения сборки, в блоке <code><strong>*История сборок*</strong></code> напротив номера сборки отобразятся
иконки *Allure Report* и *Allure TestOPS*, которые по клику открывают страницы соответствующих отчетов.

<p align="center">
  <img src="images/screen/jenkins2.png" alt="Jenkins" width="800">
</p>

## <img width="4%" title="Allure Report" src="images/logo/Allure.svg"> Отчет о результатах тестирования в [Allure Report](https://jenkins.autotests.cloud/job/15ronin226RegresInAPI/allure/)

<p align="center">
  <img src="images/screen/allureRep1.png" alt="allure-report1" width="900">
</p>


## <img width="4%" title="Allure TestOPS" src="images/logo/Allure_TO.svg"> Интеграция с [Allure TestOps](https://allure.autotests.cloud/launch/18601)

### Основной дашборд

<p align="center">
  <img src="images/screen/allureTO1.png" alt="dashboard" width="900">
</p>

### Список тестов с результатами тестирования

<p align="center">
  <img src="images/screen/allureTO2.png" alt="dashboard" width="900">
</p>

