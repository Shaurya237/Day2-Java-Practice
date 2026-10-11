# Day 2 Live-Coding — Java Solutions

This folder contains one standalone Java program for each of the five Day 2 problems.

## Programs

1. `VowelConsonantCounter.java` — counts vowels and consonants using `charAt()` and `length()`.
2. `CsvStudentRecordParser.java` — splits and validates a three-field CSV record.
3. `FileExtensionValidator.java` — validates PDF, DOCX, and ZIP extensions without case sensitivity.
4. `MaskedPhoneNumberFormatter.java` — validates a 10-digit phone number and masks the first six digits using `StringBuilder`.
5. `BankTransactionReferenceValidator.java` — trims and normalizes a transaction reference, validates its format without regex, and formats the date and sequence.

## Compile and run

Make sure Java is installed. In Terminal, change directory to this folder, then compile all programs:

```bash
javac *.java
```

Run one program at a time, for example:

```bash
java VowelConsonantCounter
java CsvStudentRecordParser
java FileExtensionValidator
java MaskedPhoneNumberFormatter
java BankTransactionReferenceValidator
```

Each program reads its input from the terminal. Compile and run one at a time if your IDE has a single-file run configuration.
