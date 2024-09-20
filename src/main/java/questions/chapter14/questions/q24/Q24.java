package questions.chapter14.questions.q24;

public class Q24 {
    /*
24. Assume that the source instance passed to the following method represents a file that exists.
Also assume that /flip/sounds.txt exists as a file prior to executing this method. When
this method is executed, which statement correctly copies the file to the path specified by
/flip/sounds.txt?
void copyIntoFlipDirectory(Path source) throws IOException {
var dolphinDir = Path.of("/flip");
dolphinDir = Files.createDirectories(dolphinDir);
var n = Paths.get("sounds.txt");
_________________;
}
A. Files.copy(source, dolphinDir)
++B. Files.copy(source, dolphinDir.resolve(n),
StandardCopyOption.REPLACE_EXISTING)
C. Files.copy(source, dolphinDir,
StandardCopyOption.REPLACE_EXISTING )
D. Files.copy(source, dolphinDir.resolve(n))
E. The method does not compile, regardless of what is placed in the blank.
F. The method compiles but throws an exception at runtime, regardless of what is placed
in the blank.

     */
}
