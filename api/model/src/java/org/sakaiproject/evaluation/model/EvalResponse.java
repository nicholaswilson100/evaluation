package org.sakaiproject.evaluation.model;

// Generated Jan 18, 2007 3:54:56 PM by Hibernate Tools 3.2.0.beta6a

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * EvalResponse generated by hbm2java
 */
public class EvalResponse implements java.io.Serializable {

	// Fields    

	private Long id;

	private Date lastModified;

	private String owner;

	private String context;

	private Date startTime;

	private Date endTime;

	private Set answers = new HashSet(0);

	private EvalEvaluation evaluation;

	// Constructors

	/** default constructor */
	public EvalResponse() {
	}

	/** minimal constructor */
	public EvalResponse(Date lastModified, String owner, String context, Date startTime, EvalEvaluation evaluation) {
		this.lastModified = lastModified;
		this.owner = owner;
		this.context = context;
		this.startTime = startTime;
		this.evaluation = evaluation;
	}

	/** full constructor */
	public EvalResponse(Date lastModified, String owner, String context, Date startTime, Date endTime, Set answers,
			EvalEvaluation evaluation) {
		this.lastModified = lastModified;
		this.owner = owner;
		this.context = context;
		this.startTime = startTime;
		this.endTime = endTime;
		this.answers = answers;
		this.evaluation = evaluation;
	}

	// Property accessors
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getContext() {
		return this.context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Set getAnswers() {
		return this.answers;
	}

	public void setAnswers(Set answers) {
		this.answers = answers;
	}

	public EvalEvaluation getEvaluation() {
		return this.evaluation;
	}

	public void setEvaluation(EvalEvaluation evaluation) {
		this.evaluation = evaluation;
	}

}
