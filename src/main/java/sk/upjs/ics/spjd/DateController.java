package sk.upjs.ics.spjd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

@Controller
public class DateController {

	@RequestMapping("/")
	public String getDate(Map<String, Object> model) {
		model.put("time", new Date());
		return "date";
	}
}
