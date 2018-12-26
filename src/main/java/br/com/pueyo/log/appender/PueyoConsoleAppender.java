package br.com.pueyo.log.appender;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class PueyoConsoleAppender extends Handler {

    @Override
    public void publish(LogRecord record) {
        StringBuilder sb = new StringBuilder();
        sb.append(record.getMessage());
        System.out.println(sb.toString());
    }

    @Override
    public void flush() {
        // TODO Auto-generated method stub

    }

    @Override
    public void close() throws SecurityException {
        // TODO Auto-generated method stub

    }

}
