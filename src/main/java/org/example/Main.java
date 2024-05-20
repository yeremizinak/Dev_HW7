package org.example;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException, IOException {
        List<MaxProjectCountClient> maxProjectCountClients = new DatabaseQueryService().findMaxProjectClient();
        List<LongestProject> longestProjects = new DatabaseQueryService().findLongestProject();
        List<MaxSalaryWorker> maxSalaryWorker = new DatabaseQueryService().findMaxSalaryWorker();
        List<YoungestEldestWorkers> youngestEldestWorkers = new DatabaseQueryService().findYoungestEldestWorkers();
        List<ProjectPrices> projectPrices = new DatabaseQueryService().printProjectPrices();
        System.out.println(maxProjectCountClients);
        System.out.println(longestProjects);
        System.out.println(maxSalaryWorker);
        System.out.println(youngestEldestWorkers);
        System.out.println(projectPrices);
    }
}