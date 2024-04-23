package org.example.JDBC_ORM_Practice_4_22_24.DAOinterface;

import org.example.JDBC_ORM_Practice_4_22_24.model.EmployeePerformanceReview;

public interface EmployeeReviewInterface {
    /*
    Create the DAO interface with the following method's:
    void insertPerformanceReview(EmployeePerformanceReview review);
    List<EmployeePerformanceReview> getAllPerformanceReviews();
    void deletePerformanceReview(int reviewId);
     */
    void insertPerformanceReview(EmployeePerformanceReview review);


}
