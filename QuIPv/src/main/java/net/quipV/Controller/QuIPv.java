package net.quipV.Controller;

import net.quipV.DBO.MySQLConnection;
import net.quipV.Model.InterviewEntry;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

/**
 *Main Back-End Controller for the QuIPv Application
 *Interacts with UI then performs appropiate actions using package modules
 */
public class QuIPv
{

    public static void main( String[] args )
    {
        List<InterviewEntry> interiewEntries = populateInterviewEntries();

        for (InterviewEntry interviewEntry : interiewEntries) {
            System.out.println(interviewEntry);
        }

    }

    private static List<InterviewEntry> populateInterviewEntries() {
        List<InterviewEntry> interiewEntries = new LinkedList<>();
        try {
            Connection myConnection = MySQLConnection.getInstance().getConnection();
            Statement stmt = myConnection.createStatement();
            ResultSet rs=stmt.executeQuery("select * from SDR_LIVE_MainTable");
            while(rs.next()){
                InterviewEntry interviewEntry = new InterviewEntry.InterviewEntryBuilder().with($ -> {
                    try {
                        $.respondentID = rs.getString(4);
                        $.questionID = rs.getString(5);
                        $.question = rs.getString(6);
                        $.fullAnswer = rs.getString(7);
                        $.brokenAnswer = rs.getString(8);
                        $.driver = rs.getString(9);
                        $.primaryOutcome = rs.getString(10);
                        $.secondaryOutcome = rs.getString(11);
                        $.tertiaryOutcome = rs.getString(12);
                        $.projectName = rs.getString(18);
                    } catch (Exception e){ System.out.println("Exception in lambda" + e);}

                }).build();
                interiewEntries.add(interviewEntry);
            }

            myConnection.close();


        }catch (Exception e){System.out.println(e);}

        return interiewEntries;
    }

}
