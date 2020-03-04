package tk.zetsuboutoshio.cathr.searchorchestrator;

import io.zonky.test.db.AutoConfigureEmbeddedDatabase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@ActiveProfiles("test")
@Import({SearchOrchestratorApplication.class})
@AutoConfigureEmbeddedDatabase(beanName = "dataSource")
public class SearchOrchestratorApplicationTests {

    @Test
    public void contextLoads() {
    }

}
