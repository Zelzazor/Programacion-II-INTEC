javac OneToX.java
javac Par.java
javac Suma.java
SET /p number="Inserte un numero: "
(java OnetoX %number% 2> ErroresOnetoX.txt | java Par 2> ErroresPar.txt | java Suma 2> ErroresSuma.txt) 2> ErroresCMD.txt
PAUSE
DEL /F OneToX.class
DEL /F Suma.class
DEL /F Par.class
PAUSE