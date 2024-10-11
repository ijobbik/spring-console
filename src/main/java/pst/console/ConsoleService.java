package pst.console;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ConsoleService implements CommandLineRunner {
    private final String msg;

    @Autowired
    Environment env;

    public ConsoleService(@Value("${app.message}") String msg) {
        this.msg = msg;

    }

    public void run(String... args) {
        log.info("Console service start.");
        log.info(msg);
        log.info(env.getProperty("app.message"));
    }
}
