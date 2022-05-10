package com.jindo.core.pattern;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ManhKM on 5/9/2022
 * @project java-partern
 */
public class DemoPattern {

    public void sendListEmail(List<String> to, String body){
        String subject = "Alarm OCS Support ${dd-MM-yyyy HH:mm:ss}";
        if(subject.contains("${")){
            Pattern pattern = Pattern.compile("\\$\\{(.*?)\\}", Pattern.DOTALL);
            Matcher matcher = pattern.matcher(subject);
            while (matcher.find()){
                subject = subject.replace(matcher.group(), new SimpleDateFormat(matcher.group(1)).format(new Date()));
            }
        }
    }
}
