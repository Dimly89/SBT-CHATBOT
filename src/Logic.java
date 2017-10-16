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
     * ������ ����� ������� � ��������� ������
     * @param filePath ���� � ����� �������
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

            System.out.println("�� ������ ���� ������� " + filePath);

          
}
        hello  = answers.get(0);
        answers.remove(0);

        goodbye = answers.get(answers.size() - 1);
answers.remove(answers.size() - 1);
        return answers;
	 }
	 /**
	     * �������� ������-����������
	     * @return
	     */
	    public String getHello(){

	        return hello;
	    }

	    /**
	     * �������� ������-��������
	     * @return
	     */
	    public String getGoodbye(){

	        return goodbye;
	    }

	    /**
	     * ����� ���������� ������ �� ������� answers
	     * @return
	     */
	    public String getRandomAnswer() {

	        Random rand = new Random();
	        int n = rand.nextInt(answers.size());

	        return answers.get(n);
	    }
}

