import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

public class DetailedEnvVerify {
    public static void main(String[] args) {
        // Basic Java version
        System.out.println("Java Version: " + System.getProperty("java.version"));

        // Detailed runtime version (major.minor.security)
        Runtime.Version version = Runtime.version();
        System.out.println("Runtime Version: " + version);
        System.out.println("Feature: " + version.feature() + ", Interim: " + version.interim() +
                ", Update: " + version.update() + ", Patch: " + version.patch());

        // Vendor and VM details
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java VM Name: " + System.getProperty("java.vm.name"));
        System.out.println("Java VM Version: " + System.getProperty("java.vm.version"));

        // Runtime specs (uptime, available processors)
        RuntimeMXBean mxBean = ManagementFactory.getRuntimeMXBean();
        System.out.println("VM Uptime: " + mxBean.getUptime() + " ms");
        System.out.println("Available Processors: " + Runtime.getRuntime().availableProcessors());

        System.out.println("Environment ready for development.");
    }
}