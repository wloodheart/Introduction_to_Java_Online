package by.training.java_intro.s04_programming_with_classes.t02_aggregation_and_composition;

/*
3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
столицу, количество областей, площадь, областные центры.
 */
public class Task3 {
	public static void main(String[] args) {
		Country country = new Country("Belarus", "Minsk", 207600);

		country.addRegion("Brest");
		country.addRegion("Vitebsk");
		country.addRegion("Gomel");
		country.addRegion("Grodno");
		country.addRegion("Mogilev");

		country.displayCapital();
		country.displayNumberOfRegions();
		country.displayArea();
		country.displayRegionalСenters();
	}
}

class Country {
	private String name;
	private City capital;
	private Region[] regions = new Region[1];
	private int area;
	
	public Country(String name, String capitalName, int area) {
		this.name = name;
		this.capital = new City(capitalName);
		this.area = area;
		this.regions[0] = new Region(this.capital);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getCapital() {
		return capital;
	}

	public void setCapital(City capital) {
		this.capital = capital;
	}

	public Region[] getRegions() {
		return regions;
	}

	public void setRegions(Region[] regions) {
		this.regions = regions;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int are) {
		this.area = are;
	}

	public void addRegion(String name) {
		Region[] temp = new Region[regions.length + 1];
		System.arraycopy(regions, 0, temp, 0, regions.length);
		regions = temp;

		regions[regions.length - 1] = new Region(new City(name));
	}

	public void displayCapital() {
		System.out.println(capital);
	}

	public void displayNumberOfRegions() {
		System.out.println(regions.length);
	}
	
	public void displayArea() {
		System.out.println(area + "km²");
	}

	public void displayRegionalСenters() {
		for (Region region : regions)
			System.out.println(region.getRegionalСenter());
	}
}

class Region {
	private String name;
	private City regionalСenter;
	private District[] districts = new District[1];

	public Region(City regionalCenter) {
		this.regionalСenter = regionalCenter;
		this.name = regionalСenter.getName();
		this.districts[0] = new District(regionalCenter);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getRegionalСenter() {
		return regionalСenter;
	}

	public void setRegionalСenter(City regionalСenter) {
		this.regionalСenter = regionalСenter;
	}

	public District[] getDistricts() {
		return districts;
	}

	public void setDistricts(District[] districts) {
		this.districts = districts;
	}

	@Override
	public String toString() {
		return name;
	}

}

class District {
	private String name;
	private City districtCenter;

	public District(City districtCenter) {
		this.name = districtCenter.getName();
		this.districtCenter = districtCenter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getDistrictCenter() {
		return districtCenter;
	}

	public void setDistrictCenter(City districtCenter) {
		this.districtCenter = districtCenter;
	}

	@Override
	public String toString() {
		return name + ", districtCenter=" + districtCenter;
	}
}

class City {
	private String name;

	public City(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}