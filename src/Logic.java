import java.io.*;
import java.util.*;
import java.nio.charset.Charset;


public class Logic {
	 private List<String> answers; 
	 private String hello;
	 private String goodbye;
	 public Logic(String filePath) {

	        try {
	            readAnswersFile(filePath);
	         

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}
	 
	  /**
     * Чтение файла ответов в строковый массив
     * @param filePath путь к файлу ответов
     * @return
     * @throws Exception
     */
	 
	 public List<String> readAnswersFile(String filePath) throws Exception {

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            answers = new ArrayList<String>();

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {

                answers.add(new String(sCurrentLine.getBytes(), Charset.defaultCharset()));
            
}


        } catch (FileNotFoundException e) {

            System.out.println("Не найден файл ответов " + filePath);

          
}
        hello  = answers.get(0);
        answers.remove(0);

        goodbye = answers.get(answers.size() - 1);
answers.remove(answers.size() - 1);
        return answers;
	 }
	 /**
	     * Получить строку-привествие
	     * @return
	     */
	    public String getHello(){

	        return hello;
	    }

	    /**
	     * Получить строку-прощание
	     * @return
	     */
	    public String getGoodbye(){

	        return goodbye;
	    }

	    /**
	     * Вывод случайного ответа из массива answers
	     * @return
	     */
	    public String getRandomAnswer() {

	        Random rand = new Random();
	        int n = rand.nextInt(answers.size());

	        return answers.get(n);
	    }
}

