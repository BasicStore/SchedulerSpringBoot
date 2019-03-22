package com.annotations.scheduler.schedule;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class ScheduledTasks {
	
	// ALL WELL AND GOOD, BUT TO CHANGE THE TRIGGER ON THE FLY USE THE TRIGGER APPROACH WITH QUARTZ 
	
	private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    
    // this method will run every 5 seconds
    //@Scheduled(fixedRate = 5000) 
    @Scheduled(cron="0/5 * * * * ?")
    public void reportCurrentTime() {
        log.info("The time is now {}", dateFormat.format(new Date()));
    }
	
    
    @Scheduled(cron="0/2 * * * * ?")
    public void reportFrequently() {
        log.info("I am reporting every 2 seconds");
    }
    
    @Scheduled(cron = "${cron.myschedule1}")
    public void reportDynamicallyBasedOnScheduleValue() {
        log.info("I am dynamically BLAR BALR BLAR");
    }
    
}

