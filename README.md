java-course
===========

pragmatic java course (prepared for UMK)


TOC
---

| commitId| step    | description                      |
|:--------|:--------|:---------------------------------|
| b2bcab7 | Step 6  | request parameter added          |
| c653a1e | Step 5  | components and second controller |
| 21b8a30 | Step 4  | building a first controller      |
| 12c2491 | Step 3  | Application class change         |
| 829df3d | Step 2  | project restructure              |
| c31ede8 | Step 1  | build.gradle for spring app      |


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