
package datasupplychain;

import java.io.*;

// https://stackoverflow.com/questions/13991007/execute-external-program

public class ProcessBuilderExample2 
{
  public void runExternalCmd(String[] args) throws Exception 
  {
    //ProcessBuilder builder = new ProcessBuilder("ls", "-ltr");
    ProcessBuilder builder = new ProcessBuilder("python", "hello.py");
    Process process = builder.start();

    StringBuilder out = new StringBuilder();
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) 
    {
        String line = null;
        while ((line = reader.readLine()) != null) 
        {
            out.append(line);
            out.append("\n");
        }
        System.out.println(out);
    }
    catch (Exception e) 
    {
      System.out.println("Something went wrong.");
    }
  }
}
