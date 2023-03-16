package mainTest;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import ClaseAnemica.TiempoAnemico;
import ClaseNOAnemica.TiempoNOAnemico;
import Records.TiempoRecord;

public class main {

	public static void main(String[] args) {

		// NO ANEMICO
		TiempoNOAnemico tiempoNoAnemico = new TiempoNOAnemico(Calendar.getInstance());
		System.out.println("NO ANEMICO");
		System.out.println(tiempoNoAnemico.toStringTiempoCorto());
		System.out.println(tiempoNoAnemico.toStringTiempoLargo());

		// ANEMICO
//		TiempoAnemico tiempoAnemico = new TiempoAnemico(Calendar.getInstance());
//
//		Calendar miTiempo = tiempoAnemico.getMiTiempo();
//
//		TimeZone timeZone = miTiempo.getTimeZone();
//
//		ZoneId zonaId = timeZone == null ? ZoneId.systemDefault() : timeZone.toZoneId();
//
//		LocalDate localDate = LocalDateTime.ofInstant(miTiempo.toInstant(), zonaId).toLocalDate();
//
//		// tiempo corto
//		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(miTiempo.getTime()));
//		
//		// tiempo largo
//		System.out.println((localDate.getDayOfWeek()).getDisplayName(TextStyle.FULL, Locale.getDefault()) + " "
//				+ miTiempo.get(Calendar.DAY_OF_MONTH) + " de "
//				+ (LocalDate.now().getMonth()).getDisplayName(TextStyle.FULL, Locale.getDefault()) + " de "
//				+ miTiempo.get(Calendar.YEAR));

		// RECORD
//		TiempoRecord miTiempoRecord = new TiempoRecord(Calendar.getInstance());
//
//		Calendar miTiempo = miTiempoRecord.miTiempo();
//
//		TimeZone timeZone = miTiempo.getTimeZone();
//
//		ZoneId zonaId = timeZone == null ? ZoneId.systemDefault() : timeZone.toZoneId();
//
//		LocalDate localDate = LocalDateTime.ofInstant(miTiempo.toInstant(), zonaId).toLocalDate();
//
//		// tiempo corto
//		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(miTiempo.getTime()));
//
//		// tiempo largo
//		System.out.println((localDate.getDayOfWeek()).getDisplayName(TextStyle.FULL, Locale.getDefault()) + " "
//				+ miTiempo.get(Calendar.DAY_OF_MONTH) + " de "
//				+ (LocalDate.now().getMonth()).getDisplayName(TextStyle.FULL, Locale.getDefault()) + " de "
//				+ miTiempo.get(Calendar.YEAR));
	}

}
