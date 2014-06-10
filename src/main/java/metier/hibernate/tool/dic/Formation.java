package metier.hibernate.tool.dic;

public class Formation {
	private Long id;
	private String theme;
	
	// Getters et Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	
	// Constructeur
	public Formation(String theme){
		super();
		this.theme = theme;
	}
	
}
