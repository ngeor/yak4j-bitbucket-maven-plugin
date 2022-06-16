import java.nio.charset.StandardCharsets
import java.nio.file.Files

def logFile = new File(basedir, "build.log")
assert logFile.isFile()

def contents = new String(Files.readAllBytes(logFile.toPath()), StandardCharsets.UTF_8)
assert !contents.isEmpty()
assert contents.contains("Found correct version on line   <version>0.1.0</version>")
