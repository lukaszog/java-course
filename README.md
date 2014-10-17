java-course
===========

pragmatic java course (prepared for UMK)


TOC
---

| commitId| step    | description                      |
|:--------|:--------|:---------------------------------|
| 0a1f6e5 | Step 10 | runnable application             |
| cbd110f | Step 9  | refactoring -> mockito           |
| 77fc925 | Step 8  | refactoring -> extract validator |
| 2197f4f | Step 7  | refactoring classes -> interface |
| b2bcab7 | Step 6  | encrypt function                 |
| c653a1e | Step 5  | refactoring class                |
| 21b8a30 | Step 4  | add example with space           |
| 12c2491 | Step 3  | next tests, for better algorythm |
| 829df3d | Step 2  | add validation alphabet          |
| c31ede8 | Step 1  | init repository                  |


Pobranie aplikacji
------------------

Aby pograć aplikacją proponuję to zrobić za pomocą polecenia:

```
git clone https://github.com/jwest/java-course.git
```

Projekt zostanie dodany do kataloku java-course znajdującego się w aktualnym katalogu w którym jesteś

W systemie windows mamy do operowania git-em osobny terminal "git bash"


Uruchomienie środowiska
-----------------------

- Próbujemy otworzyć projekt w inteliJ
- Puszczemy testy (klikamy w menu kontekstowym katalogu java (test/java) w inteliJ "Run all tests")
- Jeżeli zaświecą się na zielono to wszystko jest skonfigurowane


Uruchomienie programu
---------------------

Aby zbudować projekt za pomocą gradla w terminalu w katalogu z projektem wykonujemy polecenie (w windows zamiast ./gradlew mamy ./gradlew.bat):

```
./gradlew fatJar
```

Następnie możemy go uruchomić za pomocą polecenia:

```
java -jar build/libs/java-course-1-all-1.0.jar abc
```
