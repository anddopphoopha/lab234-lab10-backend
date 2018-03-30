package camt.se234.lab10.service;

import camt.se234.lab10.entity.Grade;
import org.springframework.stereotype.Service;

@Service
public class GradeServiceImpl implements GradeService {
    @Override
    public String getGrade(double score) {
        if (score >= 80) {
            return "A";
        } else if (score >= 75) {
            return "B";
        } else if (score >= 60) {
            return "C";
        } else if (score >= 33) {
            return "D";
        } else
            return "F";
    }

    public String getGrade(double midtermScore, double finalScore) {
        if (midtermScore + finalScore >= 80) {
            return "A";
        } else if (midtermScore + finalScore >= 75) {
            return "B";
        } else if (midtermScore + finalScore >= 60) {
            return "C";
        } else if (midtermScore + finalScore >= 33) {
            return "D";
        } else
            return "F";
    }
}
