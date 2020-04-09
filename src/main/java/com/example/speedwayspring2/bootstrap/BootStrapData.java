package com.example.speedwayspring2.bootstrap;

import com.impinj.octane.*;

import com.example.speedwayspring2.domain.InventoryTag;
import com.example.speedwayspring2.repository.TagRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class BootStrapData implements CommandLineRunner {

    private final TagRepo TagRepo;

    public BootStrapData(com.example.speedwayspring2.repository.TagRepo tagRepo) {
        this.TagRepo = tagRepo;
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello");

        InventoryTag tag1 = new InventoryTag();
        tag1.setEPC("EPC 2222000");
        tag1.setAntNum((short) 2);
        tag1.setChnNum((short) 3);
        TagRepo.save(tag1);

        System.out.println(TagRepo.count());

        try {

            String hostname = "10.0.0.117";

            ImpinjReader reader = new ImpinjReader();

            System.out.println("Connecting to " + hostname);
            reader.connect(hostname);
//
//            //FeatureSet features = reader.queryFeatureSet();
//            Settings settings = reader.queryDefaultSettings();
//
//            ReportConfig report = settings.getReport();
//            report.setIncludeAntennaPortNumber(true);
//
//            System.out.println("Applying Settings");
//            reader.applySettings(settings);
//
//            System.out.println("Starting");
//            reader.start();
////            Thread.sleep(11000);
//            System.out.println("Press Enter to continue and read all tags.");
//            Scanner s = new Scanner(System.in);
//            s.nextLine();
//            reader.queryTags();
//
//
//            System.out.println("Stopping " + hostname);
//            reader.stop();
//
//            System.out.println("Disconnecting from " + hostname);
//            reader.disconnect();
//
//            System.out.println("Done");
//
        } catch (OctaneSdkException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace(System.out);
        }
    }
}
