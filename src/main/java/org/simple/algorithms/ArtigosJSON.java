package org.simple.algorithms;

import java.io.*;
import java.util.*;
//import com.google.gson.Gson;

class Articles{
    String name;
    String title;
    String url;
    String author;
    String num_comments;
    String story_id;
    String story_url;
    String parent_id;
    String create_at;
}

class Data 
{
    public List<Articles> articles;
}



class ArtigosJSON {

    /*
     * Complete the 'getArticleTitles' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING author as parameter.
     * 
     * URL for cut and paste: 
     * https://jsonmock.hackerrank.com/api/articles?author=<authorName>&page=<num>
     *
     */
    
    public static void main(String[] args) {
        List<String> titulos = getArticleTitles("patricktomas");
        
        for (String titulo : titulos) {
            System.out.println(titulo);
        }
    }

    public static List<String> getArticleTitles(String author) {
        String result = "!";
        List<String> answer = new ArrayList<String>(); 
        try{
            result = readUrl("https://jsonmock.hackerrank.com/api/articles?author="+author);
            
//            Gson gson = new Gson();
//            Data data = gson.fromJson(result, Data.class);
//            String title;
            
            //not working on this website for some reason, so will try manually
            //for (Articles a : data.articles) {
            //    answer.add(a.title);    
            //}    


            //ain't much but it's honest work :)            
            String titles[] = result.split("\"title\"");
            for (String string : titles) {
                //String filter2 = string.split("\"url\"")[0].substring(2);
                //String filter3 = filter2.substring(0, filter2.length()-2);
                answer.add(string);
            }
            
            answer.remove(0);
        }catch(Exception e){
            e.printStackTrace();
        }
        
        answer.add(result);

        return answer;
    }
    
    private static String readUrl(String urlString) throws Exception {
        BufferedReader reader = null;
        try {
            java.net.URL url = new java.net.URL(urlString);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuffer buffer = new StringBuffer();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1)
                buffer.append(chars, 0, read); 

            return buffer.toString();
        } finally {
            if (reader != null)
                reader.close();
        }
    }

}


