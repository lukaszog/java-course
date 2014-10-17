java-course
===========

pragmatic java course (prepared for UMK)

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
