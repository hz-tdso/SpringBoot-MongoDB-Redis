package indi.twc.boot.mongodb.controller;

import indi.twc.boot.mongodb.dao.ReportMongoDao;
import indi.twc.boot.mongodb.dao.UserMongoDao;
import indi.twc.boot.mongodb.entity.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/ReportController")
public class ReportController {

    @Autowired
    private ReportMongoDao reportMongoDao;

    @Autowired
    private UserMongoDao userMongoDao;

    @RequestMapping("/addReport")
    public void addReport() throws Exception {
        Report report = new Report();
        report.setContent("qqq");
        report.setDate(new Date().toString());
        report.setTitle("twctwc");
        reportMongoDao.save(report);
    }

    @RequestMapping("/listAll")
    public List<Report> listAll() throws Exception {
//        List<Report> reportList = reportMongoDao.find(new Query(),Report.class);
//        System.out.println(reportList);
        return null;
    }

    @RequestMapping("/findOneById/{id}")
    public Report findOneById(@PathVariable String id) throws Exception {
//        Report report = reportMongoDao.findById(id);
//        System.out.println(report);
        return null;
    }

    @RequestMapping("/findOneByIdAndCollectionName/{id}")
    public Report removeById(@PathVariable String id) throws Exception {
//        Report report = reportMongoDao.removeById();
//        System.out.println(report);
        return null;
    }
}
