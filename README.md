# ZakupkiParser
Парсер для http://zakupki.gov.ru/

На данный момент реализована выгрузка планов закупки, договоров и извещений о закупке с ftp сервера.

## Инструкция по запуску (убедитесь, что используете ветку master)
Разработка ведется на Java 14, поэтому программа может не запускаться на более старых версиях.
(Я использую данный [JDK](https://libericajdk.ru/pages/java-14.0.1/))
### Настройка базы данных

В данной программе используется база данных MySQL и есть два способа ее настройки:
<ol>
<li>Стандартный</li>
<li>Docker</li>
</ol>

#### 1. Стандартный способ
Устанавливаем базу данных MySQL обычным способом. В интернете есть много инструкций для этого. <br>

**ВАЖНО!** Пароль для пользователя root должен быть 12345. <br>
В противном случае заходим в файл src/main/resources/application.yml и меняем 12345 на свой пароль.<br>
Также пароль нобходимо сменить в файле open_data/insert_from_file.py

После установки необходимо подключиться к базе данных и выполнить скрипт из файла database/docker/sql/create_db.sql

#### 2. Docker (только для тех, кто знает что это)
Заходим в папку database/docker и запускаем файл docker.sh.

#### Табличные данные
Перед парсингом необходимо заполнить базу данных табличными данными. Для этого переходим в папку open_data/ 
и запускаем скрипт insert_all.py. Вам понадобится библиотека pymysql

### Запуск парсера
<br>
Открываем проект в вашей среде разработки (Я рекомендую <a href="https://www.jetbrains.com/?from=ZakupkiParser">IntelliJ IDEA от Jetbrains</a>) и настраиваем проект Maven
(IntelliJ IDEA скорее всего сделает это самостоятельно при открытие папки с проектом).<br>
Все что вам остается это зайти в src/main/java/ru/homyakin/zakupki/Application.java и запустить программу.
<br>
Вы можете выбрать какие именно папки и регионы вам нужны перед началом загрузки

### Итог
На данный момент выгрузка происходит единоразово и полностью, поэтому это займет **ОЧЕНЬ** много
времени.
