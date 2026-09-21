package edu.sdsu.cs160l.university.lab5.application;

/* TODO
 *  1) create your own template for admission with the following specs
 *     a) Create a class ScholarshipApplication in the application package.
       b) That class should implement UniversityApplication Interface
 *     c) submitScore should accept Applicant with score of 3.2 and above if not throw and Exception
 *     d) submitDocuments must set documents String to applicants document variable
 *     e) checkStatus must return true if applicants score is 3.2 and above and has non null document string
 *     f) uncomment line 14 on ScholarshipApplicationTest class and run tests
 *  2) make cs150, cs160, cs210 and cs340 courses a singleton class (Refer Registrar for inspiration)
        *     a) Note your code change has a cascading change in you CourseFactory class (hint you can't do a "new" Anymore, use getInstance instead)
        *
*/
public class ScholarshipApplication implements UniversityApplication{

    @Override
    public void submitScore(Applicant s, float score) {
        if(score >= 3.2)
        {
            s.setApplicantScore(score);
        }
        else
        {
            throw new UnsupportedOperationException("Cannot accept scholarship application if applicant score is below 3.2");
        }
    }

    @Override
    public void submitDocuments(Applicant s, String documents) {
        s.setApplicantDocuments(documents);

    }
    @Override
    public boolean checkStatus(Applicant applicant) {
        if(applicant.getApplicantScore() >= 3.2 && applicant.getApplicantDocuments() != null)
        {
            return true;
        }
        return false;
    }
}
