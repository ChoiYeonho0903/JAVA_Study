package ch8;

public class NewExceptionTest {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("공간을 확보한 후에 다시 설치");
        } catch (MemoryException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.gc();
            System.out.println("다시 설치를 시도하시오");
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if(!enoughSpace())
            throw new SpaceException("설치할 공간 부족");
        if(!enoughMemory())
            throw new MemoryException("메모리가 부족");
    }

    static void copyFiles() {}
    static void deleteTempFiles() {}

    static boolean enoughSpace() {
        return false;
    }
    static boolean enoughMemory() {
        return true;
    }
}

class SpaceException extends Exception {
    public SpaceException(String message) {
        super(message);
    }
}
class MemoryException extends Exception {
    public MemoryException(String message) {
        super(message);
    }
}

