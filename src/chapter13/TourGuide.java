package chapter13;

public class TourGuide {
	// ������ ���� ����
	private Providable tour;
	
	pubilc TourGuide(String loaction) {
		if(location.equals("Korean")) {
			tour = new KoreaTour();
		} else if(location.equals("japan")) {
			tour = new JapanTour();
		}
	}
	
	public void doLeisureSports() {
		tour.leisureSports();
	}
	public void dosightseeing() {
		tour.sightseeing();
	}
	public void eatfood() {
		tour.food();
	}
}
