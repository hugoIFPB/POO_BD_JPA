package br.edu.ifpb.esp.poo.academico;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Turma {

	@Id
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="id_disciplina")
	private Disciplina disciplina;
	
	@ManyToMany
	@JoinTable(
		name="turma_professor",
		joinColumns={@JoinColumn(name="id_turma")},
		inverseJoinColumns={@JoinColumn(name="id_professor")}
	)
	private Set<Professor> professores;
	
	@ManyToMany
	@JoinTable(
		name="turma_aluno",
		joinColumns={@JoinColumn(name="id_turma")},
		inverseJoinColumns={@JoinColumn(name="id_aluno")}
	)
	private Set<Aluno> alunos;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public Set<Professor> getProfessores() {
		return professores;
	}
	public void setProfessores(Set<Professor> professores) {
		this.professores = professores;
	}
	public Set<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(Set<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	
	
}
