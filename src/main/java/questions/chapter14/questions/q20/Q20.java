package questions.chapter14.questions.q20;

public class Q20 {

    /*

    20. Assume that monkey.txt is a file that exists in the current working directory. Which statements
about the following code snippet are correct? (Choose all that apply.)
Files.move(Path.of("monkey.txt"), Paths.get("/animals"),
StandardCopyOption.ATOMIC_MOVE,
LinkOption.NOFOLLOW_LINKS);
A. If /animals/monkey.txt exists, it will be overwritten at runtime.
B. If /animals exists as an empty directory, /animals/monkey.txt will be the new
location of the file.
C. If monkey.txt is a symbolic link, the file it points to will be moved at runtime
++D. If the move is successful and another process is monitoring the file system, it will not see
an incomplete file at runtime.
E. None of the above

     */
}
