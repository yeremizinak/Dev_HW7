package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DatabaseQueryService {

    public List<LongestProject> findLongestProject() throws SQLException, IOException {
        List<LongestProject> longestProjects = new ArrayList<>();
        File file = new File("src/sql/find_longest_project.sql");
        String sqlTemplate = Files.readString(file.toPath());
        try (Connection connection = Database.getConnection();
             PreparedStatement queryStatement = connection.prepareStatement(sqlTemplate))
        {
            ResultSet resultSet = queryStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                longestProjects.add(new LongestProject(name));
            }
        }
        return longestProjects;
    }

    public List<MaxProjectCountClient> findMaxProjectClient() throws SQLException, IOException {
        List<MaxProjectCountClient> maxProjectCountClients = new ArrayList<>();
        File file = new File("src/sql/find_max_projects_client.sql");
        String sqlTemplate = Files.readString(file.toPath());
        try (Connection connection = Database.getConnection();
             PreparedStatement queryStatement = connection.prepareStatement(sqlTemplate)) {
            ResultSet resultSet = queryStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("Name");
                int projectCount = resultSet.getInt("Project_Count");
                maxProjectCountClients.add(new MaxProjectCountClient(name, projectCount));
            }
        }
        return maxProjectCountClients;
    }

    public List<MaxSalaryWorker> findMaxSalaryWorker() throws SQLException, IOException {
        List<MaxSalaryWorker> maxSalaryWorkers = new ArrayList<>();
        File file = new File("src/sql/find_max_salary_worker.sql");
        String sqlTemplate = Files.readString(file.toPath());
        try (Connection connection = Database.getConnection();
             PreparedStatement queryStatement = connection.prepareStatement(sqlTemplate)) {
            ResultSet resultSet = queryStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                Long salary = resultSet.getLong("salary");
                maxSalaryWorkers.add(new MaxSalaryWorker(name, salary));
            }
        }
        return maxSalaryWorkers;
    }

    public List<YoungestEldestWorkers> findYoungestEldestWorkers() throws SQLException, IOException {
        List<YoungestEldestWorkers> youngestEldestWorkers = new ArrayList<>();
        File file = new File("src/sql/find_youngest_eldest_workers.sql");
        String sqlTemplate = Files.readString(file.toPath());
        try (Connection connection = Database.getConnection();
             PreparedStatement queryStatement = connection.prepareStatement(sqlTemplate)) {
            ResultSet resultSet = queryStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String type = resultSet.getString("type");
                Date birthday = resultSet.getDate("birthday");
                youngestEldestWorkers.add(new YoungestEldestWorkers(name, type, birthday));
            }
        }
        return youngestEldestWorkers;
    }

    public List<ProjectPrices> printProjectPrices() throws SQLException, IOException {
        List<ProjectPrices> projectPrices = new ArrayList<>();
        File file = new File("src/sql/print_project_prices.sql");
        String sqlTemplate = Files.readString(file.toPath());
        try (Connection connection = Database.getConnection();
             PreparedStatement queryStatement = connection.prepareStatement(sqlTemplate)) {
            ResultSet resultSet = queryStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                Long price = resultSet.getLong("price");
                projectPrices.add(new ProjectPrices(name, price));
            }
        }
        return projectPrices;
    }
}
