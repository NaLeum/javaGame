package Four;

import java.io.File;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
public class ding {
       public void abc() {
              File bgm;
              AudioInputStream stream;
              AudioFormat format;
              DataLine.Info info;
              
              bgm = new File("/Users/leejaehoon/Desktop/bell.wav"); // 사용시에는 개별 폴더로 변경할 것
              
              Clip clip;
              
              try {
                     stream = AudioSystem.getAudioInputStream(bgm);
                     format = stream.getFormat();
                     info = new DataLine.Info(Clip.class, format);
                     clip = (Clip)AudioSystem.getLine(info);
                     clip.open(stream);
                     clip.start();
                     
              } catch (Exception e) {
                     System.out.println("err : " + e);
                     }
              
       }
       public void def() {
           File bgm;
           AudioInputStream stream;
           AudioFormat format;
           DataLine.Info info;
           
           bgm = new File("/Users/leejaehoon/Desktop/ding.wav"); // 사용시에는 개별 폴더로 변경할 것
           
           Clip clip;
           
           try {
                  stream = AudioSystem.getAudioInputStream(bgm);
                  format = stream.getFormat();
                  info = new DataLine.Info(Clip.class, format);
                  clip = (Clip)AudioSystem.getLine(info);
                  clip.open(stream);
                  clip.start();
                  
           } catch (Exception e) {
                  System.out.println("err : " + e);
                  }
           
    }
       public void k() {
           File bgm;
           AudioInputStream stream;
           AudioFormat format;
           DataLine.Info info;
           
           bgm = new File("/Users/leejaehoon/Desktop/back.wav"); // 사용시에는 개별 폴더로 변경할 것
           
           Clip clip;
           
           try {
                  stream = AudioSystem.getAudioInputStream(bgm);
                  format = stream.getFormat();
                  info = new DataLine.Info(Clip.class, format);
                  clip = (Clip)AudioSystem.getLine(info);
                  clip.open(stream);
                  clip.start();
                  
           } catch (Exception e) {
                  System.out.println("err : " + e);
                  }
           
    }
       public void book() {
           File bgm;
           AudioInputStream stream;
           AudioFormat format;
           DataLine.Info info;
           
           bgm = new File("/Users/leejaehoon/Desktop/book.wav"); // 사용시에는 개별 폴더로 변경할 것
           
           Clip clip;
           
           try {
                  stream = AudioSystem.getAudioInputStream(bgm);
                  format = stream.getFormat();
                  info = new DataLine.Info(Clip.class, format);
                  clip = (Clip)AudioSystem.getLine(info);
                  clip.open(stream);
                  clip.start();
                  
           } catch (Exception e) {
                  System.out.println("err : " + e);
                  }
           
    }
       public void box() {
           File bgm;
           AudioInputStream stream;
           AudioFormat format;
           DataLine.Info info;
           
           bgm = new File("/Users/leejaehoon/Desktop/box.wav"); // 사용시에는 개별 폴더로 변경할 것
           
           Clip clip;
           
           try {
                  stream = AudioSystem.getAudioInputStream(bgm);
                  format = stream.getFormat();
                  info = new DataLine.Info(Clip.class, format);
                  clip = (Clip)AudioSystem.getLine(info);
                  clip.open(stream);
                  clip.start();
                  
           } catch (Exception e) {
                  System.out.println("err : " + e);
                  }
           
    }

}
