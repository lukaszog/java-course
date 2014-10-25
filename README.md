java-course
===========

pragmatic java course (prepared for UMK)


TOC
---

| commitId| step    | description                      |
|:--------|:--------|:---------------------------------|
| 3c4b8a9 | Step 6  | request parameter added          |
| 810869b | Step 5  | components and second controller |
| 1c819b8 | Step 4  | building a first controller      |
| 3c4b8a9 | Step 3  | Application class change         |
| ae2b044 | Step 2  | project restructure              |
| ecb3780 | Step 1  | build.gradle for spring app      |


Pobranie aplikacji
------------------

Aby pobrać aplikację, najlepiej wykonać polecenie:

```
git clone https://github.com/mirog/java-course.git
```

Przełącz brancha na spring-boot:

```
git checkout spring-boot
```

Projekt zostanie dodany do katalogu java-course znajdującego się w aktualnym katalogu, w którym jesteś.

W systemie windows mamy do operowania git-em osobny terminal "git bash".


Uruchomienie środowiska
-----------------------

- Próbujemy otworzyć projekt w IntelliJ (najlepiej wybierając plik build.gradle).
- Puszczamy testy (klikamy w menu kontekstowym katalogu java (test/java) w IntelliJ "Run all tests").
- Jeżeli zaświecą się na zielono, to wszystko jest skonfigurowane.


Uruchomienie programu
---------------------

Aby uruchomić aplikację Spring Boot, wykonujemy polecenie (w windows zamiast ./gradlew mamy ./gradlew.bat):

```
./gradlew bootRun
```