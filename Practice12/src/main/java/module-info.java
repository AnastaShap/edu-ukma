//- ---- 5- --------
//
//        Завдання 5: RandomAccessFile + FileChannel
//        Що відбувається:
//        На відміну від звичайних стрімів, RandomAccessFile дозволяє стрибати в будь-яку точку файлу (seek). Ми використовуємо FileChannel для запису конкретного байта за індексом без переписування всього файлу.
//
//        Код
//import java.io.RandomAccessFile;
//import java.nio.ByteBuffer;
//import java.nio.channels.FileChannel;
//
//public class StatusFile {
//    public static void updateStatus(Path path, int index, byte status) throws IOException {
//        try (RandomAccessFile raf = new RandomAccessFile(path.toFile(), "rw");
//             FileChannel channel = raf.getChannel()) {
//
//            ByteBuffer buffer = ByteBuffer.allocate(1);
//            buffer.put(status);
//            buffer.flip();
//
//            channel.write(buffer, index);
//        }
//    }
//}