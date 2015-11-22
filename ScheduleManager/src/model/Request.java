package model;

import java.util.List;
/**
 *
 * @author Angie
 */
public class Request {
    
    private int id_request;
    private String applicant;
    private String message;
    private String state;
    private String subject;
    private List<User> users;

    
    /**
     * Method wich gets request's id.
     * @return id_request
     */
    public int getId_request() {
        return id_request;
    }
    
    /**
     * Method wich gets applicant's dni.
     * @return apliccant
     */
    public String getApplicant() {
        return applicant;
    }
    
    /**
     * Method wich gets request's message.
     * @return message
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * Method wich gets request's state.
     * @return state
     */
    public String getState() {
        return state;
    }
    
    /**
     * Method wich gets request's subject.
     * @return subject
     */
    public String getSubject() {
        return subject;
    }
    
    /**
     * Method wich returns a list of user.
     * @return users
     */
    public List<User> getUsers() {
        return users;
    }
    
    /**
     * Method wich sets request's id.
     * @param id_request of request 
     */
    public void setId_request(int id_request) {
        this.id_request = id_request;
    }

     
    /**
     * Method wich sets request's applicant.
     * @param applicant of request 
     */
    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }
    
    /**
     * Method wich sets request's message.
     * @param message of request 
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Method wich sets request's state.
     * @param state of request 
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * Method wich sets request's subject.
     * @param subject of request 
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    /**
     * Method wich sets a list of users.
     * @param users is a List of user.
     */
    public void setUsers(List<User> users) {
        this.users = users;
    }
    
    /**
     * Class constructor.
     * @param id_request
     * @param applicant
     * @param message
     * @param state
     * @param subject
     * @param users 
     */
    public Request(int id_request, String applicant, String message, String state, String subject, List<User> users) {
        this.id_request = id_request;
        this.applicant = applicant;
        this.message = message;
        this.state = state;
        this.subject = subject;
        this.users = users;
    }
}