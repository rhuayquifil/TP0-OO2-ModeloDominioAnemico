package ClaseNOAnemica;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class TiempoNOAnemico {

	private Calendar miTiempo;
	private TimeZone timeZone;
	private ZoneId zonaId;
	private LocalDate localDate;

	public TiempoNOAnemico(Calendar miTiempo) {
		super();

		this.miTiempo = miTiempo;

		timeZone = miTiempo.getTimeZone();

		zonaId = timeZone == null ? ZoneId.systemDefault() : timeZone.toZoneId();

		localDate = LocalDateTime.ofInstant(miTiempo.toInstant(), zonaId).toLocalDate();
	}

	public Calendar getMiTiempo() {
		return miTiempo;
	}

	public void setMiTiempo(Calendar miTiempo) {
		this.miTiempo = miTiempo;
	}

	public String toStringTiempoCorto() {
		return (new SimpleDateFormat("dd-MM-yyyy").format(miTiempo.getTime()));
	}

	public String toStringTiempoLargo() {
		return ((localDate.getDayOfWeek()).getDisplayName(TextStyle.FULL, Locale.getDefault()) + " "
				+ miTiempo.get(Calendar.DAY_OF_MONTH) + " de "
				+ (LocalDate.now().getMonth()).getDisplayName(TextStyle.FULL, Locale.getDefault()) + " de "
				+ miTiempo.get(Calendar.YEAR));
	}
}
