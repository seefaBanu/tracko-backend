package com.app.tracko.service;

import com.app.tracko.entity.IssueEntity;
import com.app.tracko.entity.Status;
import com.app.tracko.model.Issue;

import java.util.List;

public interface IssueService {
    List<Issue> getAllIssues();

    Issue createIssue(Issue issue);

    long getIssueCount();

    Issue getStatus(String status);

//    List<Issue> getAssignee(String assignee);
}