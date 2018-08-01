package partner.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HTTP;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import partner.classes.Utils;
import partner.model.*;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@Controller
public class MainController {

	private Company_dao company_dao;
	private Hall_dao hall_dao;
	private Studio_dao studio_dao;
	private Dress_dao dress_dao;
	private Makeup_dao makeup_dao;
	private Snap_dao snap_dao;
	private Suit_dao suit_dao;
	private Korea_dao korea_dao;
	private Jewelry_dao jewelry_dao;
	private Pb_dao pb_dao;
	private User2_dao user2_dao;
	private Cont_hall_dao cont_hall_dao;
	private Cont_other_dao cont_other_dao;

	private Ques_dao ques_dao;
	private Ques3_dao ques3_dao;
	private Answer_dao answer_dao;
	private Answer2_dao answer2_dao;
	private Checklist_dao checklist_dao;
	private Sms_dao sms_dao;
	private Tip_dao tip_dao;
	private Scrap_dao scrap_dao;
	private Scrap_sdm_dao scrap_sdm_dao;
	private Ques3_sort_dao ques3_sort_dao;

	private Est_hall_dao est_hall_dao;
	private Message_dao message_dao;

	private Stats_dao stats_dao;
	private Stats_page_dao stats_page_dao;
	private Stats_avg_dao stats_avg_dao;
	private Stats_shop_dao stats_shop_dao;
	private Stats_point_dao stats_point_dao;
	private Stats_est_dao stats_est_dao;
	private Stats_banner_dao stats_banner_dao;
	private Stats_schedule_dao stats_schedule_dao;
	private Stats_auto_dao stats_auto_dao;
	private Stats_pro_dao stats_pro_dao;
	private Stats_package_dao stats_package_dao;
	private Stats_fake_dao stats_fake_dao;

	private See_dao see_dao;
	private See_sdm_dao see_sdm_dao;
	private Payment_sdm_dao payment_sdm_dao;
	private Voc_dao voc_dao;
	private Fake_dao fake_dao;
	private Landing_dao landing_dao;
	private Voc2_dao voc2_dao;
	private Pro_package_dao pro_package_dao;
	private Pro_package2_dao pro_package2_dao;
	private Cont_package_dao cont_package_dao;
	private Cont_drawer_dao cont_drawer_dao;
	private Cont_self_dao cont_self_dao;
	private Stats_pack_dao stats_pack_dao;
	private Review_dao review_dao;
	private Est_honey_dao est_honey_dao;

	public void setEst_honey_dao(Est_honey_dao est_honey_dao) {
		this.est_honey_dao = est_honey_dao;
	}

	public void setReview_dao(Review_dao review_dao) {
		this.review_dao = review_dao;
	}

	public void setStats_pack_dao(Stats_pack_dao stats_pack_dao) {
		this.stats_pack_dao = stats_pack_dao;
	}

	public void setStats_point_dao(Stats_point_dao stats_point_dao) {
		this.stats_point_dao = stats_point_dao;
	}

	public void setPro_package_dao(Pro_package_dao pro_package_dao) {
		this.pro_package_dao = pro_package_dao;
	}

	public void setPro_package2_dao(Pro_package2_dao pro_package2_dao) {
		this.pro_package2_dao = pro_package2_dao;
	}

	public void setCont_package_dao(Cont_package_dao cont_package_dao) {
		this.cont_package_dao = cont_package_dao;
	}

	public void setCont_drawer_dao(Cont_drawer_dao cont_drawer_dao) {
		this.cont_drawer_dao = cont_drawer_dao;
	}

	public void setCont_self_dao(Cont_self_dao cont_self_dao) {
		this.cont_self_dao = cont_self_dao;
	}

	public void setVoc2_dao(Voc2_dao voc2_dao) {
		this.voc2_dao = voc2_dao;
	}

	public void setStats_fake_dao(Stats_fake_dao stats_fake_dao) {
		this.stats_fake_dao = stats_fake_dao;
	}

	public void setLanding_dao(Landing_dao landing_dao) {
		this.landing_dao = landing_dao;
	}

	public void setStats_page_dao(Stats_page_dao stats_page_dao) {
		this.stats_page_dao = stats_page_dao;
	}

	public void setFake_dao(Fake_dao fake_dao) {
		this.fake_dao = fake_dao;
	}

	public void setStats_pro_dao(Stats_pro_dao stats_pro_dao) {
		this.stats_pro_dao = stats_pro_dao;
	}

	public void setStats_package_dao(Stats_package_dao stats_package_dao) {
		this.stats_package_dao = stats_package_dao;
	}

	public void setVoc_dao(Voc_dao voc_dao) {
		this.voc_dao = voc_dao;
	}

	public void setPayment_sdm_dao(Payment_sdm_dao payment_sdm_dao) {
		this.payment_sdm_dao = payment_sdm_dao;
	}

	public void setStats_est_dao(Stats_est_dao stats_est_dao) {
		this.stats_est_dao = stats_est_dao;
	}

	public void setSee_dao(See_dao see_dao) {
		this.see_dao = see_dao;
	}

	public void setSee_sdm_dao(See_sdm_dao see_sdm_dao) {
		this.see_sdm_dao = see_sdm_dao;
	}

	public void setStats_shop_dao(Stats_shop_dao stats_shop_dao) {
		this.stats_shop_dao = stats_shop_dao;
	}

	public void setStats_avg_dao(Stats_avg_dao stats_avg_dao) {
		this.stats_avg_dao = stats_avg_dao;
	}

	public void setStats_banner_dao(Stats_banner_dao stats_banner_dao) {
		this.stats_banner_dao = stats_banner_dao;
	}

	public void setStats_schedule_dao(Stats_schedule_dao stats_schedule_dao) {
		this.stats_schedule_dao = stats_schedule_dao;
	}

	public void setStats_auto_dao(Stats_auto_dao stats_auto_dao) {
		this.stats_auto_dao = stats_auto_dao;
	}

	public void setStats_dao(Stats_dao stats_dao) {
		this.stats_dao = stats_dao;
	}

	public void setMessage_dao(Message_dao message_dao) {
		this.message_dao = message_dao;
	}

	public void setEst_hall_dao(Est_hall_dao est_hall_dao) {
		this.est_hall_dao = est_hall_dao;
	}

	public void setQues3_sort_dao(Ques3_sort_dao ques3_sort_dao) {
		this.ques3_sort_dao = ques3_sort_dao;
	}

	public void setScrap_dao(Scrap_dao scrap_dao) {
		this.scrap_dao = scrap_dao;
	}

	public void setScrap_sdm_dao(Scrap_sdm_dao scrap_sdm_dao) {
		this.scrap_sdm_dao = scrap_sdm_dao;
	}

	public void setCont_other_dao(Cont_other_dao cont_other_dao) {
		this.cont_other_dao = cont_other_dao;
	}

	public void setSnap_dao(Snap_dao snap_dao) {
		this.snap_dao = snap_dao;
	}

	public void setQues_dao(Ques_dao ques_dao) {
		this.ques_dao = ques_dao;
	}

	public void setQues3_dao(Ques3_dao ques3_dao) {
		this.ques3_dao = ques3_dao;
	}

	public void setAnswer_dao(Answer_dao answer_dao) {
		this.answer_dao = answer_dao;
	}

	public void setAnswer2_dao(Answer2_dao answer2_dao) {
		this.answer2_dao = answer2_dao;
	}

	public void setChecklist_dao(Checklist_dao checklist_dao) {
		this.checklist_dao = checklist_dao;
	}

	public void setSms_dao(Sms_dao sms_dao) {
		this.sms_dao = sms_dao;
	}

	public void setTip_dao(Tip_dao tip_dao) {
		this.tip_dao = tip_dao;
	}

	public void setCont_hall_dao(Cont_hall_dao cont_hall_dao) {
		this.cont_hall_dao = cont_hall_dao;
	}

	public void setUser2_dao(User2_dao user2_dao) {
		this.user2_dao = user2_dao;
	}

	public void setCompany_dao(Company_dao company_dao) {
		this.company_dao = company_dao;
	}

	public void setHall_dao(Hall_dao hall_dao) {
		this.hall_dao = hall_dao;
	}

	public void setStudio_dao(Studio_dao studio_dao) {
		this.studio_dao = studio_dao;
	}

	public void setDress_dao(Dress_dao dress_dao) {
		this.dress_dao = dress_dao;
	}

	public void setMakeup_dao(Makeup_dao makeup_dao) {
		this.makeup_dao = makeup_dao;
	}

	public void setSuit_dao(Suit_dao suit_dao) {
		this.suit_dao = suit_dao;
	}

	public void setKorea_dao(Korea_dao korea_dao) {
		this.korea_dao = korea_dao;
	}

	public void setJewelry_dao(Jewelry_dao jewelry_dao) {
		this.jewelry_dao = jewelry_dao;
	}

	public void setPb_dao(Pb_dao pb_dao) {
		this.pb_dao = pb_dao;
	}

	@RequestMapping("/jusoPopup.pnp")
	public ModelAndView jusoPopup(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/jusoPopup");

		return mav;
	}

	@RequestMapping("/select_all.pnp")
	public ModelAndView select_all(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/select_all");

		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			System.out.println(json);
			String type = new JSONObject(json).getString("type");
			String align = new JSONObject(json).getString("align");
			String search = new JSONObject(json).getString("search");
			int page = Integer.parseInt(new JSONObject(json).getString("page"));

			int user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));

			String return_json = "9001";

			String query = "1";
			if ("hall".equals(type)) {
				query += " and (pro_name like '%" + search + "%' or pro_addr1 like '%" + search
						+ "%' or pro_addr2 like '%" + search + "%' or " + "pro_subway1 like '%" + search
						+ "%' or pro_subway2 like '%" + search + "%' or pro_subway3 like '%" + search + "%' or "
						+ "pro_type like '%" + search + "%' or pro_menu like '%" + search + "%')";

				query += " and pro_status = 'Y'";
			} else if ("studio".equals(type)) {
				query += " and (pro_name like '%" + search + "%' or pro_addr1 like '%" + search
						+ "%' or pro_addr2 like '%" + search + "%' or " + "pro_subway1 like '%" + search
						+ "%' or pro_subway2 like '%" + search + "%' or pro_subway3 like '%" + search + "%' or "
						+ "pro_type like '%" + search + "%')";

				query += " and pro_status = 'Y'";
			} else if ("dress".equals(type)) {
				query += " and (pro_name like '%" + search + "%' or pro_addr1 like '%" + search
						+ "%' or pro_addr2 like '%" + search + "%' or " + "pro_subway1 like '%" + search
						+ "%' or pro_subway2 like '%" + search + "%' or pro_subway3 like '%" + search + "%')";

				query += " and pro_status = 'Y'";
			} else if ("makeup".equals(type)) {
				query += " and (pro_name like '%" + search + "%' or pro_addr1 like '%" + search
						+ "%' or pro_addr2 like '%" + search + "%' or " + "pro_subway1 like '%" + search
						+ "%' or pro_subway2 like '%" + search + "%' or pro_subway3 like '%" + search + "%')";

				query += " and pro_status = 'Y'";
			} else if ("snap".equals(type)) {
				query += " and (pro_name like '%" + search + "%' or pro_addr1 like '%" + search
						+ "%' or pro_addr2 like '%" + search + "%' or " + "pro_subway1 like '%" + search
						+ "%' or pro_subway2 like '%" + search + "%' or pro_subway3 like '%" + search + "%')";

				query += " and pro_status = 'Y'";
			} else if ("suit".equals(type)) {
				query += " and (pro_name like '%" + search + "%' or pro_addr1 like '%" + search
						+ "%' or pro_addr2 like '%" + search + "%' or " + "pro_subway1 like '%" + search
						+ "%' or pro_subway2 like '%" + search + "%' or pro_subway3 like '%" + search + "%')";

				query += " and pro_status = 'Y'";
			} else if ("korea".equals(type)) {
				query += " and (pro_name like '%" + search + "%' or pro_addr1 like '%" + search
						+ "%' or pro_addr2 like '%" + search + "%' or " + "pro_subway1 like '%" + search
						+ "%' or pro_subway2 like '%" + search + "%' or pro_subway3 like '%" + search + "%')";

				query += " and pro_status = 'Y'";
			} else if ("jewelry".equals(type)) {
				query += " and (pro_name like '%" + search + "%' or pro_addr1 like '%" + search
						+ "%' or pro_addr2 like '%" + search + "%' or " + "pro_subway1 like '%" + search
						+ "%' or pro_subway2 like '%" + search + "%' or pro_subway3 like '%" + search + "%')";

				query += " and pro_status = 'Y'";
			} else if ("pb".equals(type)) {
				query += " and (pro_name like '%" + search + "%' or pro_addr1 like '%" + search
						+ "%' or pro_addr2 like '%" + search + "%' or " + "pro_subway1 like '%" + search
						+ "%' or pro_subway2 like '%" + search + "%' or pro_subway3 like '%" + search + "%')";

				query += " and pro_status = 'Y'";
			}
			return_json = pro_select(user_idx, type, query, align, page, 8);
			mav.addObject("json", return_json);

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/select_one.pnp")
	public ModelAndView select_one(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/select_one");

		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			String type = new JSONObject(json).getString("type");
			int pro_idx = Integer.parseInt(new JSONObject(json).getString("pro_idx"));

			String return_json = "9001";

			String query = "1 and pro_idx = " + pro_idx;

			return_json = pro_select(0, type, query, "", 1, 1);
			mav.addObject("json", return_json);

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/select_filter.pnp")
	public ModelAndView select_filter(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/select_filter");

		try {
			request.setCharacterEncoding("UTF-8");
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			String type = new JSONObject(json).getString("type");
			String align = new JSONObject(json).getString("align");
			String search = new JSONObject(json).getString("search");
			int page = Integer.parseInt(new JSONObject(json).getString("page"));

			int user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));

			String return_json = "9001";

			String query = "1";

			if ("hall".equals(type)) {
				String pro_addr1 = new JSONObject(json).getString("pro_addr1");
				String pro_addr2 = new JSONObject(json).getString("pro_addr2");
				String pro_type = new JSONObject(json).getString("pro_type");
				String pro_type_arr[] = pro_type.split(",");
				String pro_wedding_type = new JSONObject(json).getString("pro_wedding_type");
				String pro_wedding_type_arr[] = pro_wedding_type.split(",");
				String pro_menu = new JSONObject(json).getString("pro_menu");
				String pro_menu_arr[] = pro_menu.split(",");
				String pro_eat_pay = new JSONObject(json).getString("pro_eat_pay");
				String pro_eat_pay_arr[] = pro_eat_pay.split("~");
				String pro_person = new JSONObject(json).getString("pro_person");
				String pro_person_arr[] = pro_person.split("~");

				query += " and (pro_addr1 like '%" + pro_addr1 + "%' and pro_addr1 like '%" + pro_addr2 + "%')";

				for (int i = 0; i < pro_type_arr.length; i++) {
					if (i == 0) {
						query += " and (pro_type like ";
						query += "'%" + pro_type_arr[i] + "%'";
					} else {
						query += " or pro_type like ";
						query += "'%" + pro_type_arr[i] + "%'";
					}

					if (i == pro_type_arr.length - 1) // 마지막이라면
					{
						query += ")";
					}
				}
				for (int i = 0; i < pro_wedding_type_arr.length; i++) {
					if (i == 0) {
						query += " and (pro_wedding_type like ";
						query += "'%" + pro_wedding_type_arr[i] + "%'";
					} else {
						query += " or pro_wedding_type like ";
						query += "'%" + pro_wedding_type_arr[i] + "%'";
					}

					if (i == pro_wedding_type_arr.length - 1) // 마지막이라면
					{
						query += ")";
					}
				}

				for (int i = 0; i < pro_menu_arr.length; i++) {
					if (i == 0) {
						query += " and (pro_menu like ";
						query += "'%" + pro_menu_arr[i] + "%'";
					} else {
						query += " or pro_menu like ";
						query += "'%" + pro_menu_arr[i] + "%'";
					}

					if (i == pro_menu_arr.length - 1) // 마지막이라면
					{
						query += ")";
					}
				}

				if (pro_eat_pay != null && !"".equals(pro_eat_pay)) {
					query += " and (substr(replace(pro_eat_pay, ',', ''), 1, instr(replace(pro_eat_pay, ',', ''), '~')-1) <= "
							+ pro_eat_pay_arr[1] + "";
					query += " and substr(replace(pro_eat_pay, ',', ''), instr(replace(pro_eat_pay, ',', ''), '~')+1, char_length(replace(pro_eat_pay, ',', ''))) >= "
							+ pro_eat_pay_arr[0] + ")";
				}

				if (pro_person != null && !"".equals(pro_person)) {
					query += " and (replace(pro_person, '명', '') >= " + pro_person_arr[0]
							+ " and replace(pro_person, '명', '') <= " + pro_person_arr[1] + ")";
				}

				if (!"".equals(search)) {
					query += " and (pro_name like '%" + search + "%' or pro_addr1 like '%" + search
							+ "%' or pro_addr2 like '%" + search + "%' or " + "pro_subway1 like '%" + search
							+ "%' or pro_subway2 like '%" + search + "%' or pro_subway3 like '%" + search + "%' or "
							+ "pro_type like '%" + search + "%' or pro_menu like '%" + search + "%')";
				}

				query += " and pro_status = 'Y'";
			} else if ("studio".equals(type)) {
				String pro_addr1 = new JSONObject(json).getString("pro_addr1");
				String pro_addr2 = new JSONObject(json).getString("pro_addr2");
				String pro_type = new JSONObject(json).getString("pro_type");
				String pro_type_arr[] = pro_type.split(",");
				String pro_concept2 = new JSONObject(json).getString("pro_concept2");
				String pro_concept2_arr[] = pro_concept2.split(",");
				String pro_event = new JSONObject(json).getString("pro_event");
				if ("on".equals(pro_event)) {
					query += " and pro_event is not null and pro_event != ''";
				}

				query += " and (pro_addr1 like '%" + pro_addr1 + "%' and pro_addr1 like '%" + pro_addr2 + "%')";

				for (int i = 0; i < pro_type_arr.length; i++) {
					if (i == 0) {
						query += " and (pro_type like ";
						query += "'%" + pro_type_arr[i] + "%'";
					} else {
						query += " or pro_type like ";
						query += "'%" + pro_type_arr[i] + "%'";
					}

					if (i == pro_type_arr.length - 1) // 마지막이라면
					{
						query += ")";
					}
				}
				for (int i = 0; i < pro_concept2_arr.length; i++) {
					if (i == 0) {
						query += " and (pro_concept2 like ";
						query += "'%" + pro_concept2_arr[i] + "%'";
					} else {
						query += " or pro_concept2 like ";
						query += "'%" + pro_concept2_arr[i] + "%'";
					}

					if (i == pro_concept2_arr.length - 1) // 마지막이라면
					{
						query += ")";
					}
				}
				if (!"".equals(search)) {
					query += " and (pro_name like '%" + search + "%' or pro_addr1 like '%" + search
							+ "%' or pro_addr2 like '%" + search + "%' or " + "pro_subway1 like '%" + search
							+ "%' or pro_subway2 like '%" + search + "%' or pro_subway3 like '%" + search + "%')";
				}

				query += " and pro_status = 'Y'";
			} else if ("dress".equals(type)) {
				String pro_addr1 = new JSONObject(json).getString("pro_addr1");
				String pro_addr2 = new JSONObject(json).getString("pro_addr2");
				String pro_type = new JSONObject(json).getString("pro_type");
				String pro_type_arr[] = pro_type.split(",");
				String pro_brand = new JSONObject(json).getString("pro_brand");
				String pro_brand_arr[] = pro_brand.split(",");
				String pro_event = new JSONObject(json).getString("pro_event");
				if ("on".equals(pro_event)) {
					query += " and pro_event is not null and pro_event != ''";
				}

				query += " and (pro_addr1 like '%" + pro_addr1 + "%' and pro_addr1 like '%" + pro_addr2 + "%')";

				for (int i = 0; i < pro_type_arr.length; i++) {
					if (i == 0) {
						query += " and (pro_type like ";
						query += "'%" + pro_type_arr[i] + "%'";
					} else {
						query += " or pro_type like ";
						query += "'%" + pro_type_arr[i] + "%'";
					}

					if (i == pro_type_arr.length - 1) // 마지막이라면
					{
						query += ")";
					}
				}
				for (int i = 0; i < pro_brand_arr.length; i++) {
					if (i == 0) {
						query += " and (pro_brand like ";
						query += "'%" + pro_brand_arr[i] + "%'";
					} else {
						query += " or pro_brand like ";
						query += "'%" + pro_brand_arr[i] + "%'";
					}

					if (i == pro_brand_arr.length - 1) // 마지막이라면
					{
						query += ")";
					}
				}
				if (!"".equals(search)) {
					query += " and (pro_name like '%" + search + "%' or pro_addr1 like '%" + search
							+ "%' or pro_addr2 like '%" + search + "%' or " + "pro_subway1 like '%" + search
							+ "%' or pro_subway2 like '%" + search + "%' or pro_subway3 like '%" + search + "%')";
				}

				query += " and pro_status = 'Y'";
			} else if ("makeup".equals(type)) {
				String pro_addr1 = new JSONObject(json).getString("pro_addr1");
				String pro_addr2 = new JSONObject(json).getString("pro_addr2");
				String pro_event = new JSONObject(json).getString("pro_event");
				if ("on".equals(pro_event)) {
					query += " and pro_event is not null and pro_event != ''";
				}

				query += " and (pro_addr1 like '%" + pro_addr1 + "%' and pro_addr1 like '%" + pro_addr2 + "%')";

				if (!"".equals(search)) {
					query += " and (pro_name like '%" + search + "%' or pro_addr1 like '%" + search
							+ "%' or pro_addr2 like '%" + search + "%' or " + "pro_subway1 like '%" + search
							+ "%' or pro_subway2 like '%" + search + "%' or pro_subway3 like '%" + search + "%')";
				}

				query += " and pro_status = 'Y'";
			} else if ("snap".equals(type)) {
				String pro_location = new JSONObject(json).getString("pro_location");
				String pro_location_arr[] = pro_location.split(",");
				String pro_event = new JSONObject(json).getString("pro_event");
				if ("on".equals(pro_event)) {
					query += " and pro_event is not null and pro_event != ''";
				}

				for (int i = 0; i < pro_location_arr.length; i++) {
					if (i == 0) {
						query += " and (pro_location like ";
						query += "'%" + pro_location_arr[i] + "%'";
					} else {
						query += " or pro_location like ";
						query += "'%" + pro_location_arr[i] + "%'";
					}

					if (i == pro_location_arr.length - 1) // 마지막이라면
					{
						query += ")";
					}
				}

				if (!"".equals(search)) {
					query += " and (pro_name like '%" + search + "%' or pro_addr1 like '%" + search
							+ "%' or pro_addr2 like '%" + search + "%' or " + "pro_subway1 like '%" + search
							+ "%' or pro_subway2 like '%" + search + "%' or pro_subway3 like '%" + search + "%')";
				}

				query += " and pro_status = 'Y'";
			} else if ("suit".equals(type)) {
				String pro_addr1 = new JSONObject(json).getString("pro_addr1");
				String pro_addr2 = new JSONObject(json).getString("pro_addr2");
				String pro_event = new JSONObject(json).getString("pro_event");
				if ("on".equals(pro_event)) {
					query += " and pro_event is not null and pro_event != ''";
				}

				query += " and (pro_addr1 like '%" + pro_addr1 + "%' and pro_addr1 like '%" + pro_addr2 + "%')";

				if (!"".equals(search)) {
					query += " and (pro_name like '%" + search + "%' or pro_addr1 like '%" + search
							+ "%' or pro_addr2 like '%" + search + "%' or " + "pro_subway1 like '%" + search
							+ "%' or pro_subway2 like '%" + search + "%' or pro_subway3 like '%" + search + "%')";
				}

				query += " and pro_status = 'Y'";
			} else if ("korea".equals(type)) {
				String pro_addr1 = new JSONObject(json).getString("pro_addr1");
				String pro_addr2 = new JSONObject(json).getString("pro_addr2");
				String pro_event = new JSONObject(json).getString("pro_event");
				if ("on".equals(pro_event)) {
					query += " and pro_event is not null and pro_event != ''";
				}

				query += " and (pro_addr1 like '%" + pro_addr1 + "%' and pro_addr1 like '%" + pro_addr2 + "%')";

				if (!"".equals(search)) {
					query += " and (pro_name like '%" + search + "%' or pro_addr1 like '%" + search
							+ "%' or pro_addr2 like '%" + search + "%' or " + "pro_subway1 like '%" + search
							+ "%' or pro_subway2 like '%" + search + "%' or pro_subway3 like '%" + search + "%')";
				}
				query += " and pro_status = 'Y'";
			} else if ("jewelry".equals(type)) {
				String pro_addr1 = new JSONObject(json).getString("pro_addr1");
				String pro_addr2 = new JSONObject(json).getString("pro_addr2");
				String pro_event = new JSONObject(json).getString("pro_event");
				if ("on".equals(pro_event)) {
					query += " and pro_event is not null and pro_event != ''";
				}

				query += " and (pro_addr1 like '%" + pro_addr1 + "%' and pro_addr1 like '%" + pro_addr2 + "%')";

				if (!"".equals(search)) {
					query += " and (pro_name like '%" + search + "%' or pro_addr1 like '%" + search
							+ "%' or pro_addr2 like '%" + search + "%' or " + "pro_subway1 like '%" + search
							+ "%' or pro_subway2 like '%" + search + "%' or pro_subway3 like '%" + search + "%')";
				}
				query += " and pro_status = 'Y'";
			} else if ("pb".equals(type)) {
				String pro_addr1 = new JSONObject(json).getString("pro_addr1");
				String pro_addr2 = new JSONObject(json).getString("pro_addr2");

				query += " and (pro_addr1 like '%" + pro_addr1 + "%' and pro_addr1 like '%" + pro_addr2 + "%')";

				if (!"".equals(search)) {
					query += " and (pro_name like '%" + search + "%' or pro_addr1 like '%" + search
							+ "%' or pro_addr2 like '%" + search + "%' or " + "pro_subway1 like '%" + search
							+ "%' or pro_subway2 like '%" + search + "%' or pro_subway3 like '%" + search + "%')";
				}
				query += " and pro_status = 'Y'";
			}
			return_json = pro_select(user_idx, type, query, align, page, 8);
			mav.addObject("json", return_json);

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/login.pnp")
	public ModelAndView login(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/login");

		return mav;
	}

	@RequestMapping("/stats_insert.pnp")
	public ModelAndView stats_insert(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/stats_insert");

		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

		List<Stats_auto_vo> list1 = stats_auto_dao.getStats_auto("1 and stats_content = '견적내기'");

		List<Stats_auto_vo> list2 = stats_auto_dao
				.getStats_auto("1 and stats_content = '견적내기' and stats_submit_date like '" + sdf.format(now) + "%'");

		List<Stats_fake_vo> list3 = stats_fake_dao.getStats_fake("1 and stats_cate = 'sdm'");

		List<Stats_fake_vo> list4 = stats_fake_dao
				.getStats_fake("1 and stats_cate = 'sdm' and stats_submit_date like '" + sdf.format(now) + "%'");

		mav.addObject("sdm_total_real", list1.size());
		mav.addObject("sdm_total_fake", list1.size() + 2000 + list3.size());
		mav.addObject("sdm_today_real", list2.size());
		mav.addObject("sdm_today_fake", list2.size() + list4.size());

		List<User2_vo> list5 = user2_dao.selList_user("1");

		List<User2_vo> list6 = user2_dao.selList_user("1 and user_submit_date like '" + sdf.format(now) + "%'");

		List<Stats_fake_vo> list7 = stats_fake_dao.getStats_fake("1 and stats_cate = 'join'");

		List<Stats_fake_vo> list8 = stats_fake_dao
				.getStats_fake("1 and stats_cate = 'join' and stats_submit_date like '" + sdf.format(now) + "%'");

		mav.addObject("join_total_real", list5.size());
		mav.addObject("join_total_fake", list5.size() + 1000 + list7.size());
		mav.addObject("join_today_real", list6.size());
		mav.addObject("join_today_fake", list6.size() + list8.size());

		return mav;
	}

	@RequestMapping("/stats_insert_output.pnp")
	public ModelAndView stats_insert_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/stats_insert_output");

		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

		String today = sdf.format(now);
		String nowTime = today.substring(8, 10);
		String nowMinu = today.substring(10, 12);

		// 스드메 자동카운팅

		try {
			if ("07".equals(nowTime) || "08".equals(nowTime)) {
				if (Integer.parseInt(nowMinu) % 4 == 0) {
					stats_fake_dao.setStats_fake("sdm");
				}
			} else if ("09".equals(nowTime) || "10".equals(nowTime) || "11".equals(nowTime)) {
				if (Integer.parseInt(nowMinu) % 10 == 0) {
					for (int i = 0; i < 2; i++) {
						stats_fake_dao.setStats_fake("sdm");
					}
				}
			} else if ("12".equals(nowTime) || "13".equals(nowTime)) {
				if (Integer.parseInt(nowMinu) % 2 == 0) {
					stats_fake_dao.setStats_fake("sdm");
				}
			} else if ("14".equals(nowTime) || "15".equals(nowTime) || "16".equals(nowTime) || "17".equals(nowTime)) {
				if (Integer.parseInt(nowMinu) % 10 == 0) {
					for (int i = 0; i < 3; i++) {
						stats_fake_dao.setStats_fake("sdm");
					}
				}
			} else if ("18".equals(nowTime) || "19".equals(nowTime) || "20".equals(nowTime)) {
				if (Integer.parseInt(nowMinu) % 4 == 0) {
					for (int i = 0; i < 2; i++) {
						stats_fake_dao.setStats_fake("sdm");
					}
				}
			} else if ("21".equals(nowTime) || "22".equals(nowTime) || "23".equals(nowTime)) {
				if (Integer.parseInt(nowMinu) % 10 == 0) {
					for (int i = 0; i < 2; i++) {
						stats_fake_dao.setStats_fake("sdm");
					}
				}
			} else if ("00".equals(nowTime) || "01".equals(nowTime)) {
				if (Integer.parseInt(nowMinu) % 10 == 0) {
					for (int i = 0; i < 2; i++) {
						stats_fake_dao.setStats_fake("sdm");
					}
				}
			} else if ("02".equals(nowTime) || "03".equals(nowTime) || "04".equals(nowTime) || "05".equals(nowTime)
					|| "06".equals(nowTime)) {
				if (Integer.parseInt(nowMinu) % 20 == 0) {
					stats_fake_dao.setStats_fake("sdm");
				}
			}
			// 스드메 자동카운팅

			// 회원가입 자동카운팅
			if ("08".equals(nowTime)) {
				if (Integer.parseInt(nowMinu) % 30 == 0) {
					for (int i = 0; i < 2; i++) {
						stats_fake_dao.setStats_fake("join");
					}
				}
			} else if ("09".equals(nowTime) || "10".equals(nowTime)) {
				if (Integer.parseInt(nowMinu) % 20 == 0) {
					stats_fake_dao.setStats_fake("join");
				}
			} else if ("13".equals(nowTime) || "14".equals(nowTime) || "15".equals(nowTime)) {
				if (Integer.parseInt(nowMinu) % 15 == 0) {
					stats_fake_dao.setStats_fake("join");
				}
			} else if ("17".equals(nowTime) || "18".equals(nowTime) || "19".equals(nowTime)) {
				if (Integer.parseInt(nowMinu) % 20 == 0) {
					stats_fake_dao.setStats_fake("join");
				}
			} else if ("21".equals(nowTime) || "22".equals(nowTime)) {
				if (Integer.parseInt(nowMinu) % 15 == 0) {
					stats_fake_dao.setStats_fake("join");
				}
			} else if ("00".equals(nowTime)) {
				if (Integer.parseInt(nowMinu) % 30 == 0) {
					for (int i = 0; i < 2; i++) {
						stats_fake_dao.setStats_fake("join");
					}
				}
			}
			// 회원가입 자동카운팅
		} catch (Exception e) {
			e.printStackTrace();

			mav.addObject("err", e.toString());
		}

		return mav;
	}

	@RequestMapping("/intro.pnp")
	public ModelAndView intro(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/intro");

		stats_page_dao.setStats_page("intro");

		return mav;
	}

	@RequestMapping("/landing.pnp")
	public ModelAndView landing(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/landing");

		stats_page_dao.setStats_page("landing");

		return mav;
	}

	@RequestMapping("/sdmPromotion.pnp")
	public ModelAndView sdmPromotion(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/sdmPromotion");

		List<Pro_package_vo> list = pro_package_dao.selPro_package("1");

		mav.addObject("list", list);

		return mav;
	}

	@RequestMapping("/sdmPromotion_output.pnp")
	public ModelAndView sdmPromotion_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/sdmPromotion_output");

		String cont_user_name = request.getParameter("u_name");
		String cont_user_phone = request.getParameter("u_phone");
		String cont_call_date = request.getParameter("u_date1") + "년" + request.getParameter("u_date2") + "월"
				+ request.getParameter("u_date3") + "일";
		String cont_call_time = request.getParameter("u_calltime");
		int cont_pack_idx = Integer.parseInt(request.getParameter("u_pack"));
		String cont_content = request.getParameter("u_other").replace("\r\n", "<br>").replace("\"", "＂").replace("\'",
				"＇");

		List<Pro_package_vo> list = pro_package_dao.selPro_package("1 and pack_idx = '" + cont_pack_idx + "'");

		String cont_pack_name = list.get(0).getPack_name();

		cont_package_dao.insCont_package(cont_pack_idx, cont_pack_name, cont_user_name, cont_content, cont_user_phone,
				cont_call_date, cont_call_time);

		// 문자전송
		Utils utils = new Utils();
		utils.sendSMS("1090095264", "[웨딩큐] 기획전 문의신청이 도착하였습니다.");
		// 문자전송
		return mav;
	}

	@RequestMapping("/landing_output.pnp")
	public ModelAndView landing_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/landing_output");

		try {
			String u_name = request.getParameter("u_name");
			String u_phone = request.getParameter("u_phone1") + "-" + request.getParameter("u_phone2") + "-"
					+ request.getParameter("u_phone3");
			String u_gender = request.getParameter("u_gender");
			String due_date = request.getParameter("due_date1");
			String agent = request.getParameter("agent");

			landing_dao.insLanding("weddingQ", agent, u_name, u_gender, u_phone, due_date);

			// 메일전송
			String mailBody = "이름 : " + u_name + "<br>전화번호 : " + u_phone + "<br>성별 : " + u_gender + "<br>방문예정일 : "
					+ due_date + "<br>접수경로 : " + agent;
			; // 내용

			String toMAil = "wnpq@hanmail.net";
			String mailTitle = "[(주)웨딩큐] 초대전 무료참가 신청내역이 도착하였습니다.";
			JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
			MimeMessage message = mailSender.createMimeMessage();

			// Properties 설정
			Properties props = new Properties();

			// 인증여부
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.quitwait", "false");
			// 디버그 모드
			// props.put("mail.debug","true");
			props.put("mail.debug", "false");

			mailSender.setJavaMailProperties(props);
			// GMAIL 서버정보
			mailSender.setProtocol("smtp");
			mailSender.setHost("smtp.gmail.com");
			mailSender.setPort(587);
			// GMAIL 계정정보
			mailSender.setUsername("chaplin2004");
			mailSender.setPassword("l0adingg");
			mailSender.setDefaultEncoding("utf-8");

			try {
				MimeMessageHelper messageHelper = new MimeMessageHelper(message, true, "UTF-8");

				messageHelper.setSubject(mailTitle); // 제목
				messageHelper.setTo(toMAil); // 받는사람
				messageHelper.setText(mailBody, true);

				mailSender.send(message);

			} catch (MessagingException e) {
				e.printStackTrace();
			}
			// 메일전송

			// 문자전송
			Utils utils = new Utils();
			utils.sendSMS("1090095264", "[(주)웨딩큐] 초대전 무료참가 신청내역이 도착하였습니다.");
			// 문자전송
		} catch (Exception e) {
			mav.addObject("err", "alert('서비스가 잠시 지연중입니다. 잠시 후 다시 시도해주세요.');");
			e.printStackTrace();
		}
		return mav;
	}

	@RequestMapping("/insLanding.pnp")
	public ModelAndView insLanding(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insLanding");

		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			String lan_name = new JSONObject(json).getString("name");
			String lan_gender = new JSONObject(json).getString("gender");
			String lan_phone = new JSONObject(json).getString("phone");
			String lan_due_date = new JSONObject(json).getString("date");

			landing_dao.insLanding("weddingQ", "APP", lan_name, lan_gender, lan_phone, lan_due_date);

			// 메일전송
			String mailBody = "이름 : " + lan_name + "<br>전화번호 : " + lan_phone + "<br>성별 : " + lan_gender + "<br>방문예정일 : "
					+ lan_due_date + "<br>접수경로 : APP"; // 내용

			String toMAil = "wnpq@hanmail.net";
			String mailTitle = "[(주)웨딩큐] 초대전 무료참가 신청내역이 도착하였습니다.";
			JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
			MimeMessage message = mailSender.createMimeMessage();

			// Properties 설정
			Properties props = new Properties();

			// 인증여부
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.quitwait", "false");
			// 디버그 모드
			// props.put("mail.debug","true");
			props.put("mail.debug", "false");

			mailSender.setJavaMailProperties(props);
			// GMAIL 서버정보
			mailSender.setProtocol("smtp");
			mailSender.setHost("smtp.gmail.com");
			mailSender.setPort(587);
			// GMAIL 계정정보
			mailSender.setUsername("chaplin2004");
			mailSender.setPassword("l0adingg");
			mailSender.setDefaultEncoding("utf-8");

			try {
				MimeMessageHelper messageHelper = new MimeMessageHelper(message, true, "UTF-8");

				messageHelper.setSubject(mailTitle); // 제목
				messageHelper.setTo(toMAil); // 받는사람
				messageHelper.setText(mailBody, true);

				mailSender.send(message);

			} catch (MessagingException e) {
				e.printStackTrace();
			}
			// 메일전송

			// 문자전송
			Utils utils = new Utils();
			utils.sendSMS("1090095264", "[(주)웨딩큐] 초대전 무료참가 신청내역이 도착하였습니다.");
			// 문자전송

			mav.addObject("json", "9000");

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/insert_fake.pnp")
	public ModelAndView insert_fake(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insert_fake");

		String query = "1";
		query += " and stats_content = '견적내기'";
		List<Stats_auto_vo> list = stats_auto_dao.getStats_auto(query);

		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

		query += " and stats_submit_date like '" + sdf.format(now) + "%'";

		List<Stats_auto_vo> list2 = stats_auto_dao.getStats_auto(query);

		String return_json = "";
		return_json += "{";
		return_json += "\"total_cnt\":\"" + (list.size() + 2000) + "\",";
		return_json += "\"today_cnt\":\"" + list2.size() + "\"";
		return_json += "}";

		mav.addObject("total_cnt", (list.size() + 2000));
		mav.addObject("today_cnt", list2.size());

		return mav;
	}

	@RequestMapping("/insert_fake_output.pnp")
	public ModelAndView insert_fake_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insert_fake_output");

		int fake_cnt = Integer.parseInt(request.getParameter("fake_cnt"));

		for (int i = 0; i < fake_cnt; i++) {
			stats_auto_dao.setStats_auto("견적내기", "", 0);
		}

		return mav;
	}

	@RequestMapping("/login_fake.pnp")
	public ModelAndView login_fake(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/login_fake");

		return mav;
	}

	@RequestMapping("/login_output.pnp")
	public ModelAndView login_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/login_output");

		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");

		String query = "1 and com_id = '" + user_id + "' and com_pw = '" + user_pw + "'";
		List<Company_vo> list = company_dao.selList_company(query);

		HttpSession session = request.getSession();
		if (list.size() > 0) {
			session.setAttribute("session", user_id);
			session.setAttribute("com_category", list.get(0).getCom_category());
			session.setAttribute("com_idx", list.get(0).getCom_idx());
		} else if ("root".equals(user_id) && "cream.12".equals(user_pw)) {
			session.setAttribute("session", user_id);
			session.setAttribute("com_category", "master");
		}

		return mav;
	}

	@RequestMapping("/login_fake_output.pnp")
	public ModelAndView login_fake_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/login_fake_output");

		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");

		HttpSession session = request.getSession();
		if ("root".equals(user_id) && "cream.12".equals(user_pw)) {
			session.setAttribute("session", user_id);
			session.setAttribute("com_category", "master");
		}

		return mav;
	}

	@RequestMapping("/fake_api.pnp")
	public ModelAndView fake_api(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/fake_api");

		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			String fake_cate = new JSONObject(json).getString("cate");

			String query = "1";
			query += " and fake_cate = '" + fake_cate + "' and fake_status = 'Y'";
			List<Fake_vo> list = fake_dao.selFake(query);

			String return_json = "";
			return_json += "[";
			for (int i = 0; i < list.size(); i++) {
				if (i != 0) {
					return_json += ",";
				}
				return_json += "{";
				return_json += "\"fake_idx\":\"" + list.get(i).getFake_idx() + "\",";
				return_json += "\"fake_etc1\":\"" + list.get(i).getFake_etc1() + "\",";
				return_json += "\"fake_etc2\":\"" + list.get(i).getFake_etc2() + "\",";
				return_json += "\"fake_etc3\":\"" + list.get(i).getFake_etc3() + "\",";
				return_json += "\"fake_submit_date\":\"" + list.get(i).getFake_submit_date() + "\"";
				return_json += "}";
			}
			return_json += "]";
			mav.addObject("json", return_json);

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/sdm_cnt.pnp")
	public ModelAndView sdm_cnt(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/sdm_cnt");

		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

		List<Stats_auto_vo> list1 = stats_auto_dao.getStats_auto("1 and stats_content = '견적내기'");

		List<Stats_auto_vo> list2 = stats_auto_dao
				.getStats_auto("1 and stats_content = '견적내기' and stats_submit_date like '" + sdf.format(now) + "%'");

		List<Stats_fake_vo> list3 = stats_fake_dao.getStats_fake("1 and stats_cate = 'sdm'");

		List<Stats_fake_vo> list4 = stats_fake_dao
				.getStats_fake("1 and stats_cate = 'sdm' and stats_submit_date like '" + sdf.format(now) + "%'");

		String return_json = "";
		return_json += "{";
		return_json += "\"total_cnt\":\"" + (list1.size() + 2000 + list3.size()) + "\",";
		return_json += "\"today_cnt\":\"" + (list2.size() + list4.size()) + "\"";
		return_json += "}";
		mav.addObject("json", return_json);

		return mav;
	}

	@RequestMapping("/join_cnt.pnp")
	public ModelAndView join_cnt(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/join_cnt");

		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

		List<User2_vo> list1 = user2_dao.selList_user("1");

		List<User2_vo> list2 = user2_dao.selList_user("1 and user_submit_date like '" + sdf.format(now) + "%'");

		List<Stats_fake_vo> list3 = stats_fake_dao.getStats_fake("1 and stats_cate = 'join'");

		List<Stats_fake_vo> list4 = stats_fake_dao
				.getStats_fake("1 and stats_cate = 'join' and stats_submit_date like '" + sdf.format(now) + "%'");

		String return_json = "";
		return_json += "{";
		return_json += "\"total_cnt\":\"" + (list1.size() + 1000 + list3.size()) + "\",";
		return_json += "\"today_cnt\":\"" + (list2.size() + list4.size()) + "\"";
		return_json += "}";
		mav.addObject("json", return_json);

		return mav;
	}

	@RequestMapping("/fake.pnp")
	public ModelAndView fake(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/fake");

		String cate = request.getParameter("cate");

		String query = "1 and fake_cate = '" + cate + "'";

		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

		List<Fake_vo> list_today = fake_dao.selFake(query + " and fake_submit_date like '" + sdf.format(now) + "%'");

		String sort_val = "fake_idx";

		String sort_type = "";
		if (!"".equals(request.getParameter("sort_val")) && request.getParameter("sort_val") != null) {
			sort_type = request.getParameter("sort_type");
			sort_val = request.getParameter("sort_val");
			query += " order by " + sort_val + " " + sort_type;
		} else {
			query += " order by fake_idx desc";
			sort_type = "desc";
			sort_val = "fake_idx";
		}

		List<Fake_vo> list = fake_dao.selFake(query);

		mav.addObject("list_size", list.size());
		mav.addObject("list_today_size", list_today.size());
		mav.addObject("list", list);
		mav.addObject("cate", cate);
		mav.addObject("sort_type", sort_type);
		mav.addObject("sort_val", sort_val);

		return mav;
	}

	@RequestMapping("/fake_output.pnp")
	public ModelAndView fake_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/fake_output");

		String fake_cate = request.getParameter("cate");
		String fake_etc1 = request.getParameter("etc1");
		String fake_etc2 = request.getParameter("etc2");
		String fake_etc3 = request.getParameter("etc3");
		String fake_submit_date = request.getParameter("fake_submit_date");

		if ("".equals(fake_submit_date) || fake_submit_date == null) {
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

			fake_submit_date = sdf.format(now);
		} else {
			fake_submit_date += "0000";
		}

		fake_dao.insFake(fake_etc1, fake_etc2, fake_etc3, fake_cate, fake_submit_date);

		return mav;
	}

	@RequestMapping("/fake_status.pnp")
	public ModelAndView fake_status(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/fake_status");

		int fake_idx = Integer.parseInt(request.getParameter("change_idx"));
		String fake_status = request.getParameter("change_status");

		fake_dao.upFake_status(fake_idx, fake_status);

		return mav;
	}

	@RequestMapping("/fake_status2.pnp")
	public ModelAndView fake_status2(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/fake_status2");

		int fake_idx = Integer.parseInt(request.getParameter("change_idx2"));
		String fake_etc3 = request.getParameter("change_status2");

		fake_dao.upFake_status2(fake_idx, fake_etc3);

		return mav;
	}

	@RequestMapping("/logout.pnp")
	public ModelAndView logout(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/logout");

		try {
			HttpSession session = request.getSession();
			session.invalidate();
		} catch (Exception e) {
			mav.addObject("err", "alert('서비스가 잠시 지연중입니다. 잠시 후 다시 시도해주세요.');");
		}
		return mav;
	}

	@RequestMapping("/main.pnp")
	public ModelAndView main(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/main");

		return mav;
	}

	@RequestMapping("/ques_info.pnp")
	public ModelAndView ques_info(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/ques_info");

		String query = "1";

		String search_val = "";
		if (!"".equals(request.getParameter("search_val")) && request.getParameter("search_val") != null) {
			search_val = request.getParameter("search_val");
			query += " and (ques_cate like '%" + search_val + "%' or ques_title like '%" + search_val
					+ "%' or ques_content like '%" + search_val + "%')";
		}

		List<Ques_vo> list_size = ques_dao.selList_ques(query);

		int page = 1;
		if (!"".equals(request.getParameter("page")) && request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		int page1 = page * 15 - 15;
		int ten = page - (page % 10);

		if (page % 10 == 0) // 10, 20페이지 눌렀는데 넘어가면 안되니까~ 처리!
		{
			mav.addObject("list_size1", ten - 9);
			mav.addObject("list_size2", ten);
			if (ten < list_size.size() / 15 + 1) {
				mav.addObject("next", "next");
			} else {
				mav.addObject("next", "done");
			}
		} else {
			mav.addObject("list_size1", ten + 1);
			if (ten + 10 > list_size.size() / 15 + 1) {
				mav.addObject("list_size2", list_size.size() / 15 + 1);
				mav.addObject("next", "done");
			} else {
				mav.addObject("list_size2", ten + 10);
				mav.addObject("next", "next");
			}

		}
		mav.addObject("list_size", list_size.size() / 15 + 1);
		mav.addObject("page", page);

		String sort_val = "ques_idx";

		String sort_type = "";
		if (!"".equals(request.getParameter("sort_val")) && request.getParameter("sort_val") != null) {
			sort_type = request.getParameter("sort_type");
			sort_val = request.getParameter("sort_val");
			query += " order by " + sort_val + " " + sort_type;
		}

		query += " limit " + page1 + ",15";

		List<Ques_vo> list = ques_dao.selList_ques(query);

		mav.addObject("list", list);
		mav.addObject("max_page", list_size.size());
		mav.addObject("search_val", search_val);
		mav.addObject("sort_type", sort_type);
		mav.addObject("sort_val", sort_val);

		return mav;
	}

	@RequestMapping("/ques_delete.pnp")
	public ModelAndView ques_delete(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/ques_delete");

		String idx = request.getParameter("del_idx");

		ques_dao.delQues(idx);

		return mav;
	}

	@RequestMapping("/ques_insert.pnp")
	public ModelAndView ques_insert(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/ques_insert");

		return mav;
	}

	@RequestMapping("/ques_insert_output.pnp")
	public ModelAndView ques_insert_output(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/ques_insert_output");

		try {
			// IDX 번호 가져옴.
			List<Ques_vo> quesIdx = ques_dao.selIdx();
			int ques_idx;
			if (quesIdx.size() == 0) {
				ques_idx = 1;
			} else {
				ques_idx = quesIdx.get(0).getQues_idx() + 1;
			}
			// IDX 번호 가져옴.

			String savePath = "/plan/weddingQ/" + ques_idx + "/";
			int sizeLimit = 1024 * 1024 * 1000; // 1000메가..
			File dir = new File(savePath);
			if (!dir.exists()) { // 디렉토리가 존재하지 않으면
				dir.mkdirs(); // 디렉토리 생성.!
			}

			MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "utf-8",
					new DefaultFileRenamePolicy());

			String ques_sort = multi.getParameter("ques_sort");
			String ques_sort_cnt = multi.getParameter("ques_sort_cnt");
			String ques_arr[] = ques_sort.split(",");
			String ques_arr_cnt[] = ques_sort_cnt.split(",");
			String ques_content = "";

			int title_cnt = 1;
			int only_cnt = 1;
			int multi_cnt = 1;
			int seek_cnt = 1;
			int text_cnt = 1;
			int date_cnt = 1;
			int img_cnt = 1;

			ques_content += "[";

			for (int i = 0; i < ques_arr.length; i++) {
				if ("title".equals(ques_arr[i])) {
					if (ques_content.indexOf("type") > -1) {
						ques_content += ",";
					}
					ques_content += "{";
					ques_content += "\"type\":\"" + ques_arr[i] + "\",";
					ques_content += "\"answer\":";
					ques_content += "[";
					ques_content += "{";
					ques_content += "\"keyword\":\"" + multi.getParameter("title_" + title_cnt) + "\",";
					ques_content += "\"src\":\"\",";
					ques_content += "\"info\":\"\",";
					ques_content += "\"help\":\"" + multi.getParameter("title_help_" + title_cnt) + "\",";
					ques_content += "\"next\":\"\"";
					ques_content += "}";
					ques_content += "]";
					ques_content += "}";

					title_cnt++;
				} else if ("only".equals(ques_arr[i])) {
					if (ques_content.indexOf("type") > -1) {
						ques_content += ",";
					}
					ques_content += "{";
					ques_content += "\"type\":\"" + ques_arr[i] + "\",";
					ques_content += "\"answer\":";
					ques_content += "[";
					for (int j = 1; j <= Integer.parseInt(ques_arr_cnt[i]); j++) {
						if (j != 1) {
							ques_content += ",";
						}
						ques_content += "{";
						ques_content += "\"keyword\":\"" + multi.getParameter("only_" + only_cnt + "_" + j) + "\",";
						ques_content += "\"src\":\"\",";
						ques_content += "\"info\":\"\",";
						ques_content += "\"help\":\"" + multi.getParameter("only_help_" + only_cnt + "_" + j) + "\",";
						ques_content += "\"next\":\"" + multi.getParameter("only_next_" + only_cnt + "_" + j) + "\"";
						ques_content += "}";
					}
					ques_content += "]";
					ques_content += "}";

					only_cnt++;
				} else if ("multi".equals(ques_arr[i])) {
					if (ques_content.indexOf("type") > -1) {
						ques_content += ",";
					}
					ques_content += "{";
					ques_content += "\"type\":\"" + ques_arr[i] + "\",";
					ques_content += "\"answer\":";
					ques_content += "[";
					for (int j = 1; j <= Integer.parseInt(ques_arr_cnt[i]); j++) {
						if (j != 1) {
							ques_content += ",";
						}
						ques_content += "{";
						ques_content += "\"keyword\":\"" + multi.getParameter("multi_" + multi_cnt + "_" + j) + "\",";
						ques_content += "\"src\":\"\",";
						ques_content += "\"info\":\"\",";
						ques_content += "\"help\":\"" + multi.getParameter("multi_help_" + multi_cnt + "_" + j) + "\",";
						ques_content += "\"next\":\"" + multi.getParameter("multi_next_" + multi_cnt + "_" + j) + "\"";
						ques_content += "}";
					}
					ques_content += "]";
					ques_content += "}";

					multi_cnt++;
				} else if ("seek".equals(ques_arr[i])) {
					if (ques_content.indexOf("type") > -1) {
						ques_content += ",";
					}
					ques_content += "{";
					ques_content += "\"type\":\"" + ques_arr[i] + "\",";
					ques_content += "\"answer\":";
					ques_content += "[";
					for (int j = 1; j <= Integer.parseInt(ques_arr_cnt[i]); j++) {
						if (j != 1) {
							ques_content += ",";
						}
						ques_content += "{";
						ques_content += "\"keyword\":\"" + multi.getParameter("seek_" + seek_cnt + "_" + j) + "\",";
						ques_content += "\"src\":\"\",";
						ques_content += "\"info\":\"\",";
						ques_content += "\"help\":\"" + multi.getParameter("seek_help_" + seek_cnt + "_" + j) + "\",";
						ques_content += "\"next\":\"" + multi.getParameter("seek_next_" + seek_cnt + "_" + j) + "\"";
						ques_content += "}";
					}
					ques_content += "]";
					ques_content += "}";

					seek_cnt++;
				} else if ("text".equals(ques_arr[i])) {
					if (ques_content.indexOf("type") > -1) {
						ques_content += ",";
					}
					ques_content += "{";
					ques_content += "\"type\":\"" + ques_arr[i] + "\",";
					ques_content += "\"answer\":";
					ques_content += "[";
					ques_content += "{";
					ques_content += "\"keyword\":\"\",";
					ques_content += "\"src\":\"\",";
					ques_content += "\"info\":\"\",";
					ques_content += "\"help\":\"" + multi.getParameter("text_help_" + text_cnt) + "\",";
					ques_content += "\"next\":\"" + multi.getParameter("text_next_" + text_cnt) + "\"";
					ques_content += "}";
					ques_content += "]";
					ques_content += "}";

					text_cnt++;
				} else if ("date".equals(ques_arr[i])) {
					if (ques_content.indexOf("type") > -1) {
						ques_content += ",";
					}
					ques_content += "{";
					ques_content += "\"type\":\"" + ques_arr[i] + "\",";
					ques_content += "\"answer\":";
					ques_content += "[";
					ques_content += "{";
					ques_content += "\"keyword\":\"\",";
					ques_content += "\"src\":\"\",";
					ques_content += "\"info\":\"\",";
					ques_content += "\"help\":\"\",";
					ques_content += "\"next\":\"" + multi.getParameter("date_next_" + date_cnt) + "\"";
					ques_content += "}";
					ques_content += "]";
					ques_content += "}";

					date_cnt++;
				} else if ("img".equals(ques_arr[i])) {
					if (ques_content.indexOf("type") > -1) {
						ques_content += ",";
					}
					ques_content += "{";
					ques_content += "\"type\":\"" + ques_arr[i] + "\",";
					ques_content += "\"answer\":";
					ques_content += "[";
					for (int j = 1; j <= Integer.parseInt(ques_arr_cnt[i]); j++) {
						if (j != 1) {
							ques_content += ",";
						}
						ques_content += "{";
						ques_content += "\"keyword\":\"\",";
						ques_content += "\"src\":\"" + multi.getParameter("img_src_" + img_cnt + "_" + j) + "\",";
						ques_content += "\"info\":\"" + multi.getParameter("img_alt_" + img_cnt + "_" + j) + "\",";
						ques_content += "\"help\":\"" + multi.getParameter("img_help_" + img_cnt + "_" + j) + "\",";
						ques_content += "\"next\":\"" + multi.getParameter("img_next_" + img_cnt + "_" + j) + "\"";
						ques_content += "}";
					}
					ques_content += "]";
					ques_content += "}";

					img_cnt++;
				}

			}
			ques_content += "]";

			String ques_cate = multi.getParameter("ques_cate");
			String ques_title = multi.getParameter("ques_title").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "＇");

			ques_dao.insQues(ques_idx, ques_cate, ques_title, ques_content);
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
		}

		return mav;
	}

	@RequestMapping("/ques_search.pnp")
	public ModelAndView ques_search(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/ques_search");

		String ques_query = request.getParameter("ques_query");

		String next_type = request.getParameter("next_type");
		String next_id = request.getParameter("next_id");

		if (!"".equals(ques_query) && null != ques_query) {
			String query = "ques_idx like '%" + ques_query + "%' or ques_title like '%" + ques_query
					+ "%' or ques_content like '%" + ques_query + "%' or ques_cate like '%" + ques_query + "%'";
			List<Ques_vo> list = ques_dao.selList_ques(query);
			mav.addObject("list", list);
			mav.addObject("search_status", "on");
		}
		mav.addObject("next_type", next_type);
		mav.addObject("next_id", next_id);
		return mav;
	}

	@RequestMapping("/ques_update.pnp")
	public ModelAndView ques_update(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/ques_update");

		String query = "1";
		String ques_idx = request.getParameter("idx");
		query += " and ques_idx = '" + ques_idx + "'";

		List<Ques_vo> list = ques_dao.selList_ques(query);

		String img_files = "";
		try {
			File directory = new File("/plan/weddingQ/" + ques_idx);
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					if (file.isFile()) {
						img_files += "&&" + file.getName();
					}
				}
			}
			if (img_files.length() > 0) {
				img_files = img_files.substring(2, img_files.length());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("list", list);
		mav.addObject("img_files", img_files);
		mav.addObject("ques_idx", list.get(0).getQues_idx());
		mav.addObject("ques_cate", list.get(0).getQues_cate());
		mav.addObject("ques_title", list.get(0).getQues_title());
		mav.addObject("ques_content", list.get(0).getQues_content());
		return mav;
	}

	@RequestMapping("/ques_update_output.pnp")
	public ModelAndView ques_update_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/ques_update_output");

		try {
			String savePath = "/plan/weddingQ/";
			int sizeLimit = 1024 * 1024 * 1000; // 1000메가..
			File dir = new File(savePath);
			if (!dir.exists()) { // 디렉토리가 존재하지 않으면
				dir.mkdirs(); // 디렉토리 생성.!
			}

			MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "utf-8",
					new DefaultFileRenamePolicy());

			int ques_idx = Integer.parseInt(multi.getParameter("ques_idx"));

			String ques_sort = multi.getParameter("ques_sort");
			String ques_sort_cnt = multi.getParameter("ques_sort_cnt");
			String ques_arr[] = ques_sort.split(",");
			String ques_arr_cnt[] = ques_sort_cnt.split(",");
			String ques_content = "";

			int title_cnt = 1;
			int only_cnt = 1;
			int multi_cnt = 1;
			int seek_cnt = 1;
			int text_cnt = 1;
			int date_cnt = 1;
			int img_cnt = 1;

			ques_content += "[";

			for (int i = 0; i < ques_arr.length; i++) {
				if ("title".equals(ques_arr[i])) {
					if (ques_content.indexOf("type") > -1) {
						ques_content += ",";
					}
					ques_content += "{";
					ques_content += "\"type\":\"" + ques_arr[i] + "\",";
					ques_content += "\"answer\":";
					ques_content += "[";
					ques_content += "{";
					ques_content += "\"keyword\":\"" + multi.getParameter("title_" + title_cnt) + "\",";
					ques_content += "\"src\":\"\",";
					ques_content += "\"info\":\"\",";
					ques_content += "\"help\":\"" + multi.getParameter("title_help_" + title_cnt) + "\",";
					ques_content += "\"next\":\"\"";
					ques_content += "}";
					ques_content += "]";
					ques_content += "}";

					title_cnt++;
				} else if ("only".equals(ques_arr[i])) {
					if (ques_content.indexOf("type") > -1) {
						ques_content += ",";
					}
					ques_content += "{";
					ques_content += "\"type\":\"" + ques_arr[i] + "\",";
					ques_content += "\"answer\":";
					ques_content += "[";
					for (int j = 1; j <= Integer.parseInt(ques_arr_cnt[i]); j++) {
						if (j != 1) {
							ques_content += ",";
						}
						ques_content += "{";
						ques_content += "\"keyword\":\"" + multi.getParameter("only_" + only_cnt + "_" + j) + "\",";
						ques_content += "\"src\":\"\",";
						ques_content += "\"info\":\"\",";
						ques_content += "\"help\":\"" + multi.getParameter("only_help_" + only_cnt + "_" + j) + "\",";
						ques_content += "\"next\":\"" + multi.getParameter("only_next_" + only_cnt + "_" + j) + "\"";
						ques_content += "}";
					}
					ques_content += "]";
					ques_content += "}";

					only_cnt++;
				} else if ("multi".equals(ques_arr[i])) {
					if (ques_content.indexOf("type") > -1) {
						ques_content += ",";
					}
					ques_content += "{";
					ques_content += "\"type\":\"" + ques_arr[i] + "\",";
					ques_content += "\"answer\":";
					ques_content += "[";
					for (int j = 1; j <= Integer.parseInt(ques_arr_cnt[i]); j++) {
						if (j != 1) {
							ques_content += ",";
						}
						ques_content += "{";
						ques_content += "\"keyword\":\"" + multi.getParameter("multi_" + multi_cnt + "_" + j) + "\",";
						ques_content += "\"src\":\"\",";
						ques_content += "\"info\":\"\",";
						ques_content += "\"help\":\"" + multi.getParameter("multi_help_" + multi_cnt + "_" + j) + "\",";
						ques_content += "\"next\":\"" + multi.getParameter("multi_next_" + multi_cnt + "_" + j) + "\"";
						ques_content += "}";
					}
					ques_content += "]";
					ques_content += "}";

					multi_cnt++;
				} else if ("seek".equals(ques_arr[i])) {
					if (ques_content.indexOf("type") > -1) {
						ques_content += ",";
					}
					ques_content += "{";
					ques_content += "\"type\":\"" + ques_arr[i] + "\",";
					ques_content += "\"answer\":";
					ques_content += "[";
					for (int j = 1; j <= Integer.parseInt(ques_arr_cnt[i]); j++) {
						if (j != 1) {
							ques_content += ",";
						}
						ques_content += "{";
						ques_content += "\"keyword\":\"" + multi.getParameter("seek_" + seek_cnt + "_" + j) + "\",";
						ques_content += "\"src\":\"\",";
						ques_content += "\"info\":\"\",";
						ques_content += "\"help\":\"" + multi.getParameter("seek_help_" + seek_cnt + "_" + j) + "\",";
						ques_content += "\"next\":\"" + multi.getParameter("seek_next_" + seek_cnt + "_" + j) + "\"";
						ques_content += "}";
					}
					ques_content += "]";
					ques_content += "}";

					seek_cnt++;
				} else if ("text".equals(ques_arr[i])) {
					if (ques_content.indexOf("type") > -1) {
						ques_content += ",";
					}
					ques_content += "{";
					ques_content += "\"type\":\"" + ques_arr[i] + "\",";
					ques_content += "\"answer\":";
					ques_content += "[";
					ques_content += "{";
					ques_content += "\"keyword\":\"\",";
					ques_content += "\"src\":\"\",";
					ques_content += "\"info\":\"\",";
					ques_content += "\"help\":\"" + multi.getParameter("text_help_" + text_cnt) + "\",";
					ques_content += "\"next\":\"" + multi.getParameter("text_next_" + text_cnt) + "\"";
					ques_content += "}";
					ques_content += "]";
					ques_content += "}";

					text_cnt++;
				} else if ("date".equals(ques_arr[i])) {
					if (ques_content.indexOf("type") > -1) {
						ques_content += ",";
					}
					ques_content += "{";
					ques_content += "\"type\":\"" + ques_arr[i] + "\",";
					ques_content += "\"answer\":";
					ques_content += "[";
					ques_content += "{";
					ques_content += "\"keyword\":\"\",";
					ques_content += "\"src\":\"\",";
					ques_content += "\"info\":\"\",";
					ques_content += "\"help\":\"\",";
					ques_content += "\"next\":\"" + multi.getParameter("date_next_" + date_cnt) + "\"";
					ques_content += "}";
					ques_content += "]";
					ques_content += "}";

					date_cnt++;
				} else if ("img".equals(ques_arr[i])) {
					if (ques_content.indexOf("type") > -1) {
						ques_content += ",";
					}
					ques_content += "{";
					ques_content += "\"type\":\"" + ques_arr[i] + "\",";
					ques_content += "\"answer\":";
					ques_content += "[";
					for (int j = 1; j <= Integer.parseInt(ques_arr_cnt[i]); j++) {
						if (j != 1) {
							ques_content += ",";
						}
						ques_content += "{";
						ques_content += "\"keyword\":\"\",";
						ques_content += "\"src\":\"" + multi.getParameter("img_src_" + img_cnt + "_" + j) + "\",";
						ques_content += "\"info\":\"" + multi.getParameter("img_alt_" + img_cnt + "_" + j) + "\",";
						ques_content += "\"help\":\"" + multi.getParameter("img_help_" + img_cnt + "_" + j) + "\",";
						ques_content += "\"next\":\"" + multi.getParameter("img_next_" + img_cnt + "_" + j) + "\"";
						ques_content += "}";

						// 이미지 수정 확인
						if ("".equals(multi.getFilesystemName("img_" + img_cnt + "_" + j))
								|| multi.getFilesystemName("img_" + img_cnt + "_" + j) == null) // 이미지를 수정하지 않았다.
						{
						} else // 이미지가 수정되었다면..
						{
							// 지금 올라온 이미지를 넘김
							File directory = new File("/plan/weddingQ/" + ques_idx);
							Utils.fileMove(savePath + multi.getFilesystemName("img_" + img_cnt + "_" + j),
									directory + "/" + multi.getFilesystemName("img_" + img_cnt + "_" + j));
							// 지금 올라온 이미지를 넘김
						}
						// 이미지 수정 확인
					}
					ques_content += "]";
					ques_content += "}";

					img_cnt++;
				}

			}
			ques_content += "]";

			String ques_cate = multi.getParameter("ques_cate");
			String ques_title = multi.getParameter("ques_title").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "＇");
			;

			ques_dao.upQues(ques_idx, ques_cate, ques_title, ques_content);
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
		}
		return mav;
	}

	@RequestMapping("/getQuesType.pnp")
	public ModelAndView getQuesType(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/questype");
		try {
			String json = request.getParameter("json");
			String type = new JSONObject(json).getString("type");

			List<Ques_vo> list = ques_dao.getList_Type(type);

			JSONArray ques_json = new JSONArray();
			for (int i = 0; i < list.size(); i++) {
				JSONObject jobj = new JSONObject();

				jobj.put("ques_idx", list.get(i).getQues_idx());
				jobj.put("ques_title", list.get(i).getQues_title());
				jobj.put("ques_cate", list.get(i).getQues_cate());
				JSONArray jarray = new JSONArray(list.get(i).getQues_content());
				jobj.put("ques_content", jarray);
				jobj.put("ques_submit_date", list.get(i).getQues_submit_date());
				ques_json.put(jobj);
			}
			mav.addObject("json", ques_json.toString());

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/getQuesIdx.pnp")
	public ModelAndView getQuesIdx(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/questype");
		try {
			String json = request.getParameter("json");
			String type = new JSONObject(json).getString("type");

			String query = "1";
			query += " and ques_idx = '" + type + "'";
			List<Ques_vo> list = ques_dao.selList_ques(query);

			JSONObject jobj = new JSONObject();

			jobj.put("ques_idx", String.valueOf(list.get(0).getQues_idx()));
			jobj.put("ques_title", list.get(0).getQues_title());
			jobj.put("ques_cate", list.get(0).getQues_cate());
			JSONArray jarray = new JSONArray(list.get(0).getQues_content());
			jobj.put("ques_content", jarray);
			jobj.put("ques_submit_date", list.get(0).getQues_submit_date());

			mav.addObject("json", jobj.toString());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/insertNick.pnp")
	public ModelAndView insertNick(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/questype");
		try {
			String json = request.getParameter("json");
			String nick = new JSONObject(json).getString("nick");

			if (ques_dao.getNick(nick).size() == 0) {

				ques_dao.insNick(nick);
				ques_dao.insAnswer(nick);
				mav.addObject("json", "9000");
			} else {
				mav.addObject("json", "9002"); // 중
			}

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
		}

		return mav;
	}

	@RequestMapping("/updateNick.pnp")
	public ModelAndView updateNick(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/questype");
		try {
			String json = request.getParameter("json");
			String nick = new JSONObject(json).getString("nick");
			String oldnick = new JSONObject(json).getString("oldnick");

			if (ques_dao.getNick(nick).size() == 0) {

				ques_dao.updateNick(nick, oldnick);
				ques_dao.updateAnswer(nick, oldnick);
				mav.addObject("json", "9000");
			} else {
				mav.addObject("json", "9002"); // 중
			}

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
		}

		return mav;
	}

	@RequestMapping("/login_app.pnp")
	public ModelAndView login_app(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/login_app");

		try {
			String json = request.getParameter("json");
			String login_email = new JSONObject(json).getString("login_email");
			String login_password = new JSONObject(json).getString("login_password");

			List<User2_vo> list = user2_dao.selUser(login_email, login_password);

			if (list.size() > 0) {
				String user_schedule[] = list.get(0).getUser_schedule().split("&&");
				JSONObject jsonobj = new JSONObject();
				jsonobj.put("user_email", list.get(0).getUser_email());
				jsonobj.put("user_nickname", list.get(0).getUser_nickname());
				jsonobj.put("user_gender", list.get(0).getUser_gender());
				jsonobj.put("user_idx", list.get(0).getUser_idx());
				jsonobj.put("user_schedule", user_schedule[user_schedule.length - 1]);
				jsonobj.put("user_start", list.get(0).getUser_submit_date());
				jsonobj.put("result", "9000");
				JSONArray jarray = new JSONArray();
				jarray.put(jsonobj);
				mav.addObject("json", jarray.toString());
			} else {
				mav.addObject("json", "9001");
			}

		} catch (JSONException e) {
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
		}

		return mav;
	}

	@RequestMapping("/user_gender.pnp")
	public ModelAndView user_gender(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/user_gender");

		try {
			String json = request.getParameter("json");
			int user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));

			List<User2_vo> list = user2_dao.find_user(user_idx);

			if (list.size() > 0) {
				JSONObject jsonobj = new JSONObject();
				jsonobj.put("user_idx", list.get(0).getUser_idx());
				jsonobj.put("user_name", list.get(0).getUser_name());
				jsonobj.put("user_gender", list.get(0).getUser_gender());
				jsonobj.put("user_phone", list.get(0).getUser_phone());
				jsonobj.put("result", "9000");
				JSONArray jarray = new JSONArray();
				jarray.put(jsonobj);
				mav.addObject("json", jarray.toString());
			} else {
				mav.addObject("json", "9001");
			}

		} catch (JSONException e) {
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
		}

		return mav;
	}

	@RequestMapping("/join.pnp")
	public ModelAndView join(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/join");

		try {
			String json = request.getParameter("json");
			String join_email = new JSONObject(json).getString("join_email");
			String join_name = new JSONObject(json).getString("join_name").replaceAll(" ", "");
			String join_password = new JSONObject(json).getString("join_password");
			String join_phone = new JSONObject(json).getString("join_phone");
			String join_gender = new JSONObject(json).getString("join_gender");
			String join_nickname = new JSONObject(json).getString("join_nickname");
			String join_schedule = new JSONObject(json).getString("join_schedule");
			String join_type = new JSONObject(json).getString("join_type");
			String join_addr = new JSONObject(json).getString("join_addr");

			user2_dao.insUser(join_email, join_name, join_password, join_phone, join_gender, join_nickname,
					join_schedule, join_type, join_addr);

			int idx = user2_dao.getIdx(join_nickname);
			mav.addObject("json", String.valueOf(idx));
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
		}

		// 일평균 가입자 통계를위한부분
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

		List<Stats_avg_vo> list = stats_avg_dao
				.selStats_avg("1 and stats_date = '" + sdf.format(now) + "' and stats_cate = 'join'");

		if (list.size() == 0) {
			stats_avg_dao.setStats_avg("join", sdf.format(now));
		} else {
			stats_avg_dao.upStats_avg("join", sdf.format(now));
		}
		// 일평균 가입자 통계를위한부분

		return mav;
	}

	@RequestMapping("/delete_user.pnp")
	public ModelAndView delete_user(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/delete_user");

		try {
			String json = request.getParameter("json");
			int user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));

			user2_dao.delete_user(user_idx);
			cont_hall_dao.delUserData_cont_hall(user_idx);
			cont_other_dao.delUserData_cont_other(user_idx);
			answer2_dao.delUserData_ans2(user_idx);
			checklist_dao.delChk(user_idx);
			est_hall_dao.delUserData_est_hall(user_idx);
			message_dao.delUserData_message(user_idx);
			scrap_dao.delUserData_scrap(user_idx);
			see_dao.delUserData_see(user_idx);
			see_sdm_dao.delUserData_see_sdm(user_idx);

			// 기존 프로필 지움
			File directory = new File("/plan/weddingq_user/profile_img/" + user_idx);
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					Utils.fileDelete(directory + "/" + file.getName());
				}
			}
			// 기존 프로필 지움

			mav.addObject("json", "9000");

		} catch (JSONException e) {
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
		}

		return mav;
	}

	@RequestMapping("/email_check.pnp")
	public ModelAndView email_check(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/email_check");

		try {
			String json = request.getParameter("json");
			String join_email = new JSONObject(json).getString("join_email");

			List<User2_vo> list = user2_dao.email_check(join_email);

			if (list.size() > 0) {
				mav.addObject("json", "9002");
			} else {
				mav.addObject("json", "9000");
			}

		} catch (JSONException e) {
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
		}

		return mav;
	}

	@RequestMapping("/sendSMS.pnp")
	public ModelAndView sendSMS(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/sendSMS");

		try {
			Utils utils = new Utils();
			String json = request.getParameter("json");
			String send_tel = utils.decode(new JSONObject(json).getString("send_tel"));
			send_tel = send_tel.substring(1, send_tel.length());
			send_tel = send_tel.replaceAll("-", "");
			int sms_num = (int) (Math.random() * (999999 - 100000 + 1)) + 100000;
			String message = "[웨딩큐] 인증번호는 [" + sms_num + "] 입니다. 정확히 입력해주세요.";
			String smsSendReturn = utils.sendSMS(send_tel, message);

			String err_code = smsSendReturn.substring(smsSendReturn.indexOf("<err_code>") + 10,
					smsSendReturn.indexOf("</err_code>"));
			if ("1000".equals(err_code)) {
				sms_dao.insSms(utils.encode("0" + send_tel), sms_num);
				mav.addObject("json", "9000");
			} else {
				mav.addObject("json", "9001");
			}

		} catch (JSONException e) {
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/sendSMS_find.pnp")
	public ModelAndView sendSMS_find(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/sendSMS_find");

		try {
			String json = request.getParameter("json");
			String send_tel = new JSONObject(json).getString("send_tel");
			String send_name = new JSONObject(json).getString("send_name");
			List<User2_vo> list = user2_dao.findUser(send_name, send_tel);
			if (list.size() == 0) {
				mav.addObject("json", "9005");
			} else {
				Utils utils = new Utils();
				send_tel = utils.decode(send_tel);
				send_tel = send_tel.substring(1, send_tel.length());
				send_tel = send_tel.replaceAll("-", "");
				int sms_num = (int) (Math.random() * (999999 - 100000 + 1)) + 100000;
				String message = "[웨딩큐] 인증번호는 [" + sms_num + "] 입니다. 정확히 입력해주세요.";
				String smsSendReturn = utils.sendSMS(send_tel, message);

				String err_code = smsSendReturn.substring(smsSendReturn.indexOf("<err_code>") + 10,
						smsSendReturn.indexOf("</err_code>"));
				if ("1000".equals(err_code)) {
					sms_dao.insSms(utils.encode("0" + send_tel), sms_num);
					mav.addObject("json", "9000");
				} else {
					mav.addObject("json", "9001");
				}
			}

		} catch (JSONException e) {
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/checkSMS.pnp")
	public ModelAndView checkSMS(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/checkSMS");

		try {
			Utils utils = new Utils();
			String json = request.getParameter("json");
			String check_tel = utils.decode(new JSONObject(json).getString("check_tel"));

			check_tel = check_tel.substring(1, check_tel.length());
			int check_num = Integer.parseInt(new JSONObject(json).getString("check_num"));

			List<Sms_vo> list = sms_dao.selSms(utils.encode("0" + check_tel), check_num);

			if (list.size() > 0) {
				sms_dao.delSms(utils.encode("0" + check_tel), check_num);
				mav.addObject("json", "9000");
			} else {
				mav.addObject("json", "9001");
			}

		} catch (JSONException e) {
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/checkSMS_find.pnp")
	public ModelAndView checkSMS_find(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/checkSMS_find");

		try {
			Utils utils = new Utils();
			String json = request.getParameter("json");
			String check_tel = utils.decode(new JSONObject(json).getString("check_tel"));

			check_tel = check_tel.substring(1, check_tel.length());
			int check_num = Integer.parseInt(new JSONObject(json).getString("check_num"));

			List<Sms_vo> list = sms_dao.selSms(utils.encode("0" + check_tel), check_num);
			List<User2_vo> list_user = user2_dao.selUser_phone(utils.encode("0" + check_tel));

			if (list.size() > 0) {
				sms_dao.delSms(utils.encode("0" + check_tel), check_num);
				mav.addObject("json", "[{\"isLogin\":\"9000\",\"user_email\":\"" + list_user.get(0).getUser_email()
						+ "\",\"user_submit_date\":\"" + list_user.get(0).getUser_submit_date() + "\"}]");
			} else {
				mav.addObject("json", "9001");
			}

		} catch (JSONException e) {
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/findUser.pnp")
	public ModelAndView findUser(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/findUser");

		try {
			String json = request.getParameter("json");
			String user_email = new JSONObject(json).getString("user_email");
			String user_phone = new JSONObject(json).getString("user_phone");

			Utils utils = new Utils();
			List<User2_vo> list = user2_dao.findUser_email(user_email, user_phone);

			if (list.size() > 0) {
				mav.addObject("json", "9000");
			} else {
				mav.addObject("json", "9002");
			}

		} catch (JSONException e) {
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/user_password_update.pnp")
	public ModelAndView user_password_update(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/user_password_update");

		try {
			String json = request.getParameter("json");
			String user_phone = new JSONObject(json).getString("user_phone");
			String user_password = new JSONObject(json).getString("user_password");

			user2_dao.user_password_update(user_phone, user_password);

			mav.addObject("json", "9000");

		} catch (JSONException e) {
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/user_phone_check.pnp")
	public ModelAndView user_phone_check(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/user_phone_check");

		try {
			String json = request.getParameter("json");
			String user_phone = new JSONObject(json).getString("user_phone");

			List<User2_vo> list = user2_dao.user_phone_check(user_phone);

			if (list.size() > 0) {
				mav.addObject("json", "9002");
			} else {
				mav.addObject("json", "9000");
			}

		} catch (JSONException e) {
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/insChk.pnp")
	public ModelAndView insChk(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insChk");

		try {
			String json = request.getParameter("json");
			JSONObject jobj = new JSONObject(json);
			int chk_user = Integer.parseInt(jobj.getString("chk_user").toString());
			String chk_meeting = jobj.getJSONArray("chk_meeting").toString();
			String chk_hall = jobj.getJSONArray("chk_hall").toString();
			String chk_honey = jobj.getJSONArray("chk_honey").toString();
			String chk_package = jobj.getJSONArray("chk_package").toString();
			String chk_suit = jobj.getJSONArray("chk_suit").toString();
			String chk_korea = jobj.getJSONArray("chk_korea").toString();
			String chk_jewelry = jobj.getJSONArray("chk_jewelry").toString();
			String chk_gift = jobj.getJSONArray("chk_gift").toString();
			String chk_drawer = jobj.getJSONArray("chk_drawer").toString();
			String chk_pb = jobj.getJSONArray("chk_pb").toString();
			String chk_card = jobj.getJSONArray("chk_card").toString();
			String chk_prepare = jobj.getJSONArray("chk_prepare").toString();
			String chk_other = jobj.getJSONArray("chk_other").toString();
			String chk_seven = jobj.getJSONArray("chk_seven").toString();

			checklist_dao.insChk(chk_user, chk_meeting, chk_hall, chk_honey, chk_package, chk_suit, chk_korea,
					chk_jewelry, chk_gift, chk_drawer, chk_pb, chk_card, chk_prepare, chk_other, chk_seven);

			mav.addObject("json", "9000");

		} catch (JSONException e) {
			mav.addObject("json", e.toString());
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001_");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/selChk.pnp")
	public ModelAndView selChk(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/selChk");

		try {
			String json = request.getParameter("json");
			int chk_user = Integer.parseInt(new JSONObject(json).getString("chk_user"));

			List<Checklist_vo> list = checklist_dao.selChk(chk_user);
			if (list.size() > 0) {
				mav.addObject("json", "" + "{"

						+ "\"상견례\":" + list.get(0).getChk_meeting() + "," + "\"웨딩홀\":" + list.get(0).getChk_hall() + ","
						+ "\"허니문\":" + list.get(0).getChk_honey() + "," + "\"스드메\":" + list.get(0).getChk_package()
						+ "," + "\"예복\":" + list.get(0).getChk_suit() + "," + "\"한복\":" + list.get(0).getChk_korea()
						+ "," + "\"예물\":" + list.get(0).getChk_jewelry() + "," + "\"예단\":" + list.get(0).getChk_gift()
						+ "," + "\"혼수\":" + list.get(0).getChk_drawer() + "," + "\"폐백\":" + list.get(0).getChk_pb()
						+ "," + "\"청첩장\":" + list.get(0).getChk_card() + "," + "\"결혼식준비\":"
						+ list.get(0).getChk_prepare() + "," + "\"기타\":" + list.get(0).getChk_other() + "," + "\"+7\":"
						+ list.get(0).getChk_seven()

						+ "}");

			} else {
				mav.addObject("json", "9001");
			}

		} catch (JSONException e) {
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/delChk.pnp")
	public ModelAndView delChk(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/delChk");

		try {
			String json = request.getParameter("json");
			int chk_user = Integer.parseInt(new JSONObject(json).getString("chk_user"));

			checklist_dao.delChk(chk_user);

			mav.addObject("json", "9000");

		} catch (JSONException e) {
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
		}

		return mav;
	}

	@RequestMapping("/upChk.pnp")
	public ModelAndView upChk(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/upChk");

		try {
			String json = request.getParameter("json");
			int chk_user = Integer.parseInt(new JSONObject(json).getString("chk_user"));
			String chk_meeting = new JSONObject(json).getString("chk_meeting");
			String chk_hall = new JSONObject(json).getString("chk_hall");
			String chk_honey = new JSONObject(json).getString("chk_honey");
			String chk_package = new JSONObject(json).getString("chk_package");
			String chk_suit = new JSONObject(json).getString("chk_suit");
			String chk_korea = new JSONObject(json).getString("chk_korea");
			String chk_jewelry = new JSONObject(json).getString("chk_jewelry");
			String chk_gift = new JSONObject(json).getString("chk_gift");
			String chk_drawer = new JSONObject(json).getString("chk_drawer");
			String chk_pb = new JSONObject(json).getString("chk_pb");
			String chk_card = new JSONObject(json).getString("chk_card");
			String chk_prepare = new JSONObject(json).getString("chk_prepare");
			String chk_other = new JSONObject(json).getString("chk_other");
			String chk_seven = new JSONObject(json).getString("chk_seven");

			checklist_dao.upChk(chk_user, chk_meeting, chk_hall, chk_honey, chk_package, chk_suit, chk_korea,
					chk_jewelry, chk_gift, chk_drawer, chk_pb, chk_card, chk_prepare, chk_other, chk_seven);

			mav.addObject("json", "9000");

		} catch (JSONException e) {
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
		}

		return mav;
	}

	@RequestMapping("/upChk_category.pnp")
	public ModelAndView upChk_category(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/upChk_category");

		try {
			String json = request.getParameter("json");
			int chk_user = Integer.parseInt(new JSONObject(json).getString("chk_user"));
			String chk_type = new JSONObject(json).getString("chk_type");

			System.out.println(json);
			if ("meeting".equals(chk_type)) {
				String chk_meeting = new JSONObject(json).getString("chk_data");
				checklist_dao.upChk_meeting(chk_user, chk_meeting);
			} else if ("hall".equals(chk_type)) {
				String chk_hall = new JSONObject(json).getString("chk_data");
				checklist_dao.upChk_hall(chk_user, chk_hall);
			} else if ("honey".equals(chk_type)) {
				String chk_honey = new JSONObject(json).getString("chk_data");
				checklist_dao.upChk_honey(chk_user, chk_honey);
			} else if ("package".equals(chk_type)) {
				String chk_package = new JSONObject(json).getString("chk_data");
				checklist_dao.upChk_package(chk_user, chk_package);
			} else if ("suit".equals(chk_type)) {
				String chk_suit = new JSONObject(json).getString("chk_data");
				checklist_dao.upChk_suit(chk_user, chk_suit);
			} else if ("korea".equals(chk_type)) {
				String chk_korea = new JSONObject(json).getString("chk_data");
				checklist_dao.upChk_korea(chk_user, chk_korea);
			} else if ("jewelry".equals(chk_type)) {
				String chk_jewelry = new JSONObject(json).getString("chk_data");
				checklist_dao.upChk_jewelry(chk_user, chk_jewelry);
			} else if ("gift".equals(chk_type)) {
				String chk_gift = new JSONObject(json).getString("chk_data");
				checklist_dao.upChk_gift(chk_user, chk_gift);
			} else if ("drawer".equals(chk_type)) {
				String chk_drawer = new JSONObject(json).getString("chk_data");
				checklist_dao.upChk_drawer(chk_user, chk_drawer);
			} else if ("pb".equals(chk_type)) {
				String chk_pb = new JSONObject(json).getString("chk_data");
				checklist_dao.upChk_pb(chk_user, chk_pb);
			} else if ("card".equals(chk_type)) {
				String chk_card = new JSONObject(json).getString("chk_data");
				checklist_dao.upChk_card(chk_user, chk_card);
			} else if ("prepare".equals(chk_type)) {
				String chk_prepare = new JSONObject(json).getString("chk_data");
				checklist_dao.upChk_prepare(chk_user, chk_prepare);
			} else if ("other".equals(chk_type)) {
				String chk_other = new JSONObject(json).getString("chk_data");
				checklist_dao.upChk_other(chk_user, chk_other);
			} else if ("seven".equals(chk_type)) {
				String chk_seven = new JSONObject(json).getString("chk_data");
				checklist_dao.upChk_seven(chk_user, chk_seven);
			}

			mav.addObject("json", "9000");

		} catch (JSONException e) {
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
		}

		return mav;
	}

	@RequestMapping("/imgUpProfile.pnp")
	public ModelAndView imgUpProfile(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/imgUpProfile");

		try {

			String savePath = "/plan/wnp_server/profile_img/"; // 서버
			// 경로
			// String savePath = "/Users/fish_mac/aaa/"; // 서버 경로
			int sizeLimit = 1024 * 1024 * 15;
			File dir = new File(savePath);
			if (!dir.exists()) { // 디렉토리가 존재하지 않으면
				dir.mkdirs(); // 디렉토리 생성.!
			}

			MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "utf-8",
					new DefaultFileRenamePolicy());
			int idx = Integer.parseInt(multi.getParameter("idx"));
			String outFolder = "/plan/weddingq_user/profile_img/" + idx + "/"; // 이동될 폴더 경로
			dir = new File(outFolder);
			if (!dir.exists()) { // 디렉토리가 존재하지 않으면
				dir.mkdirs(); // 디렉토리 생성.!
			}

			String oldpath = savePath + idx + ".jpg";
			String newpath = outFolder + idx + ".jpg";
			Utils.fileMove(oldpath, newpath);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/insReview.pnp")
	public ModelAndView insReview(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insReview");

		try {
			// **************************** idx 번호 가져옴 ************************** //
			List<Review_vo> reviewIdx = review_dao.selIdx_review();
			int review_idx;
			if (reviewIdx.size() == 0) {
				review_idx = 1;
			} else {
				review_idx = reviewIdx.get(0).getReview_idx() + 1;
			}
			// **************************** idx 번호 가져옴 ************************** //

			String savePath = "/plan/weddingQ_review/" + review_idx + "/";
			int sizeLimit = 1024 * 1024 * 10; // 10메가..
			File dir = new File(savePath);
			if (!dir.exists()) { // 디렉토리가 존재하지 않으면
				dir.mkdirs(); // 디렉토리 생성.!
			}

			MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "utf-8",
					new DefaultFileRenamePolicy());
			Utils utils = new Utils();

			String json = multi.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int review_pro_idx = Integer.parseInt(new JSONObject(json).getString("pro_idx"));
			int review_user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));
			String review_pro_cate = new JSONObject(json).getString("pro_cate");
			String review_point = new JSONObject(json).getString("point");
			String review_content = new JSONObject(json).getString("content");

			List<User2_vo> list = user2_dao.selList_user("1 and user_idx = '" + review_user_idx + "'");

			String review_user_name = "";
			if (review_user_idx == 0) {
				review_user_name = "비회원";
			} else {
				review_user_name = utils.decode(list.get(0).getUser_name());
			}

			review_dao.insReview(review_idx, review_pro_idx, review_user_idx, review_pro_cate, review_user_name,
					review_point, review_content);
			mav.addObject("json", "9000");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			mav.addObject("json", "9001");
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
			mav.addObject("json", "9001");
		}
		return mav;
	}

	@RequestMapping("/insReview_noImg.pnp")
	public ModelAndView insReview_noImg(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insReview_noImg");

		try {
			// **************************** idx 번호 가져옴 ************************** //
			List<Review_vo> reviewIdx = review_dao.selIdx_review();
			int review_idx;
			if (reviewIdx.size() == 0) {
				review_idx = 1;
			} else {
				review_idx = reviewIdx.get(0).getReview_idx() + 1;
			}
			// **************************** idx 번호 가져옴 ************************** //

			Utils utils = new Utils();

			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int review_pro_idx = Integer.parseInt(new JSONObject(json).getString("pro_idx"));
			int review_user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));
			String review_pro_cate = new JSONObject(json).getString("pro_cate");
			String review_point = new JSONObject(json).getString("point");
			String review_content = new JSONObject(json).getString("content");

			List<User2_vo> list = user2_dao.selList_user("1 and user_idx = '" + review_user_idx + "'");

			String review_user_name = "";
			if (review_user_idx == 0) {
				review_user_name = "비회원";
			} else {
				review_user_name = utils.decode(list.get(0).getUser_name());
			}

			review_dao.insReview(review_idx, review_pro_idx, review_user_idx, review_pro_cate, review_user_name,
					review_point, review_content);

			mav.addObject("json", "9000");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			mav.addObject("json", "9001");
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
			mav.addObject("json", "9001");
		}
		return mav;
	}

	@RequestMapping("/upReview_noImg.pnp")
	public ModelAndView upReview_noImg(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/upReview_noImg");

		try {

			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용

			int review_idx = Integer.parseInt(new JSONObject(json).getString("idx"));
			String review_point = new JSONObject(json).getString("point");
			String review_content = new JSONObject(json).getString("content");

			review_dao.upReview(review_idx, review_point, review_content);
			mav.addObject("json", "9000");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			mav.addObject("json", "9001");
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
			mav.addObject("json", "9001");
		}
		return mav;
	}

	@RequestMapping("/upReview.pnp")
	public ModelAndView upReview(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/upReview");

		try {
			String savePath = "/plan/weddingQ_review/";
			int sizeLimit = 1024 * 1024 * 10; // 10메가..
			File dir = new File(savePath);
			if (!dir.exists()) { // 디렉토리가 존재하지 않으면
				dir.mkdirs(); // 디렉토리 생성.!
			}

			MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "utf-8",
					new DefaultFileRenamePolicy());

			String json = multi.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용

			int review_idx = Integer.parseInt(new JSONObject(json).getString("idx"));
			int review_user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));
			String review_point = new JSONObject(json).getString("point");
			String review_content = new JSONObject(json).getString("content");

			// 기존 이미지를 지움
			File directory = new File("/plan/weddingQ_review/" + review_idx);
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					if (file.isFile()) {
						Utils.fileDelete(directory + "/" + file.getName());
					}
				}
			}
			// 기존 이미지를 지움

			// 지금 올라온 이미지를 넘김
			Utils.fileMove(savePath + review_user_idx + ".jpg", directory + "/" + review_user_idx + ".jpg");
			// 지금 올라온 이미지를 넘김

			review_dao.upReview(review_idx, review_point, review_content);
			mav.addObject("json", "9000");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			mav.addObject("json", "9001");
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
			mav.addObject("json", "9001");
		}
		return mav;
	}

	@RequestMapping("/delReview.pnp")
	public ModelAndView delReview(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/delReview");

		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용

			int review_idx = Integer.parseInt(new JSONObject(json).getString("idx"));

			// 기존 이미지를 지움
			File directory = new File("/plan/weddingQ_review/" + review_idx);
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					if (file.isFile()) {
						Utils.fileDelete(directory + "/" + file.getName());
					}
				}
			}
			// 기존 이미지를 지움

			review_dao.delReview(review_idx);
			mav.addObject("json", "9000");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			mav.addObject("json", "9001");
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
			mav.addObject("json", "9001");
		}
		return mav;
	}

	@RequestMapping("/goodReview.pnp")
	public ModelAndView goodReview(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/goodReview");

		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			String review_idx = new JSONObject(json).getString("idx");
			String review_user_idx = new JSONObject(json).getString("user_idx");
			String action = new JSONObject(json).getString("action");

			ArrayList list = new ArrayList();
			List<Review_vo> list_review = review_dao.selList_review("1 and review_idx = '" + review_idx + "'");
			String review_good_arr[] = list_review.get(0).getReview_good().split("@");

			String isIn = "off";
			for (int i = 0; i < review_good_arr.length; i++) {
				if (review_user_idx.equals(review_good_arr[i])) {
					isIn = "on";
				}
			}
			if ("sel".equals(action)) {
				mav.addObject("json", isIn);
			} else if ("good".equals(action)) {
				if (!"".equals(list_review.get(0).getReview_good())) {
					for (int i = 0; i < review_good_arr.length; i++) {
						list.add(review_good_arr[i]);
					}
				}
				if ("off".equals(isIn)) {
					list.add(review_user_idx);
				} else if ("on".equals(isIn)) {
					for (int i = 0; i < list.size(); i++) {
						if (review_user_idx.equals(list.get(i))) {
							list.remove(i);
						}
					}
				}

				String review_good = "";
				for (int i = 0; i < list.size(); i++) {
					review_good += "@" + list.get(i);
				}
				if (review_good.length() > 1) {
					review_good = review_good.substring(1, review_good.length());
				}
				review_dao.upReview_good(review_idx, review_good);
				mav.addObject("json", "9000");
			}

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/selReview.pnp")
	public ModelAndView selReview(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/selReview");

		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			String review_pro_idx = new JSONObject(json).getString("idx");
			String review_pro_cate = new JSONObject(json).getString("cate");

			List<Review_vo> list = review_dao.selList_review(
					"1 and review_pro_cate = '" + review_pro_cate + "' and review_pro_idx = '" + review_pro_idx + "'");

			String return_json = "";
			return_json += "[";
			for (int i = 0; i < list.size(); i++) {
				if (i != 0) {
					return_json += ",";
				}
				return_json += "{";
				return_json += "\"review_idx\":\"" + list.get(i).getReview_idx() + "\",";
				return_json += "\"review_pro_idx\":\"" + list.get(i).getReview_pro_idx() + "\",";
				return_json += "\"review_user_idx\":\"" + list.get(i).getReview_user_idx() + "\",";
				return_json += "\"review_pro_cate\":\"" + list.get(i).getReview_pro_cate() + "\",";
				return_json += "\"review_user_name\":\"" + list.get(i).getReview_user_name() + "\",";
				return_json += "\"review_point\":\"" + list.get(i).getReview_point() + "\",";
				return_json += "\"review_content\":\"" + list.get(i).getReview_content() + "\",";
				return_json += "\"review_good\":\"" + list.get(i).getReview_good() + "\",";

				String img_name = "";
				File directory = new File("/plan/weddingQ_review/" + list.get(i).getReview_idx());
				File[] files = directory.listFiles();
				if (files != null) {
					for (File file : files) {
						img_name += "@" + file.getName();
					}
				}
				if (img_name.length() > 1) {
					img_name = img_name.substring(1, img_name.length());
				}
				return_json += "\"review_img\":\"" + img_name + "\",";

				return_json += "\"review_submit_date\":\"" + list.get(i).getReview_submit_date() + "\"";
				return_json += "}";
			}
			return_json += "]";
			mav.addObject("json", return_json);

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/updateSc.pnp")
	public ModelAndView updateSc(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/upChk");
		try {
			String json = request.getParameter("json");
			int idx = Integer.parseInt(new JSONObject(json).getString("idx"));
			String date = "&&" + new JSONObject(json).getString("date");
			user2_dao.update_Date(idx, date);
			mav.addObject("json", "9000");

		} catch (JSONException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("json", "9001");
		}

		return mav;
	}

	@RequestMapping("/selTip.pnp")
	public ModelAndView selTip(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/selTip");

		try {
			String json = request.getParameter("json");
			int tip1 = Integer.parseInt(new JSONObject(json).getString("tip1"));
			int tip2 = 0;
			if (!"".equals(new JSONObject(json).getString("tip2"))) {
				tip2 = Integer.parseInt(new JSONObject(json).getString("tip2"));
			}

			List<Tip_vo> list = tip_dao.selTip(tip1, tip2);

			String result = "";

			if (list.size() > 0) {
				result += "[";
				for (int i = 0; i < list.size(); i++) {
					result += "{";
					result += "\"tip_title\":\"" + list.get(i).getTip_title().replaceAll("\"", "〃")
							+ "\",\"tip_subtitle\":\"" + list.get(i).getTip_subtitle().replaceAll("\"", "〃")
							+ "\",\"tip_thumbnail\":\"" + list.get(i).getTip_thumbnail().replaceAll("\"", "〃")
							+ "\",\"tip_category\":\"" + list.get(i).getTip_category().replaceAll("\"", "〃")
							+ "\",\"tip_tag\":\"" + list.get(i).getTip_tag().replaceAll("\"", "〃") + "\"";
					result += "}";
					if (i == 0 && list.size() > 1) {
						result += ",";
					}
				}
				result += "]";
				mav.addObject("json", result);
			} else {
				mav.addObject("json", "9001");
			}

		} catch (JSONException e) {
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/selTip_webview.pnp")
	public ModelAndView selTip_webview(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/selTip_webview");

		int tip_idx = Integer.parseInt(request.getParameter("idx"));

		List<Tip_vo> list = tip_dao.selTip(tip_idx, tip_idx);

		mav.addObject("list", list);

		return mav;
	}

	@RequestMapping("/zip_search.pnp")
	public ModelAndView zip_search(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/zip_search");
		if (!"".equals(request.getParameter("zip_query")) && request.getParameter("zip_query") != null
				&& !"null".equals(request.getParameter("zip_query"))) {
			String zip_api = "http://biz.epost.go.kr/KpostPortal/openapi";
			String regkey = "ef14f56a4eb3f7f7e1443674900704";
			String query = request.getParameter("zip_query").replaceAll(" ", "");
			String zip_type = request.getParameter("zip_type");

			try {
				String xmlData = new String();
				URL tmpUrl = new URL(zip_api + "?regkey=" + regkey + "&target=" + zip_type + "&query="
						+ URLEncoder.encode(query, "EUC-KR") + "&countPerPage=50");
				URLConnection url_conn = null;
				url_conn = (HttpURLConnection) tmpUrl.openConnection();

				String line = null;
				BufferedReader br = new BufferedReader(new InputStreamReader(url_conn.getInputStream()));

				ArrayList<String> postcd = new ArrayList<String>();
				ArrayList<String> address = new ArrayList<String>();
				ArrayList<String> addrjibun = new ArrayList<String>();
				while ((line = br.readLine()) != null) {
					if (line.indexOf("<postcd>") > -1) {
						postcd.add((line.substring(line.indexOf("<postcd>") + 17, line.indexOf("</postcd>") - 3))
								.replaceAll(",", "，"));
					}
					if (line.indexOf("<address>") > -1) {
						address.add((line.substring(line.indexOf("<address>") + 18, line.indexOf("</address>") - 3))
								.replaceAll(",", "，"));
					}
					if (line.indexOf("<addrjibun>") > -1) {
						addrjibun.add(
								(line.substring(line.indexOf("<addrjibun>") + 20, line.indexOf("</addrjibun>") - 3))
										.replaceAll(",", "，"));
					}
					xmlData += line.trim();
				}

				br.close();

				mav.addObject("postcd", postcd);
				mav.addObject("address", address);
				mav.addObject("addrjibun", addrjibun);
				mav.addObject("search_status", "on");
				mav.addObject("query", query);
				mav.addObject("zip_type", zip_type);
			} catch (Exception e543) {

			}
		}
		return mav;
	}

	@RequestMapping("/overlap.pnp")
	public ModelAndView overlap(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/overlap");
		String overlap_id = request.getParameter("overlap_id");
		List<Company_vo> list = company_dao.overlap(overlap_id);
		if (list.size() > 0) {
			mav.addObject("overlap", "true");
		} else {
			mav.addObject("overlap", "false");
		}
		return mav;
	}

	@RequestMapping("/search_com_name.pnp")
	public ModelAndView search_com_name(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/search_com_name");

		String com_name = request.getParameter("com_name");

		String query = "1 and com_name like '%" + com_name + "%'";
		List<Company_vo> list = company_dao.selList_company(query);

		mav.addObject("list", list);

		return mav;
	}

	@RequestMapping("/pro_search_sdm.pnp")
	public ModelAndView pro_search_sdm(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/pro_search_sdm");

		String cate = request.getParameter("cate");
		mav.addObject("cate", cate);

		String pro_name = request.getParameter("pro_name");

		String query = "1 and pro_name like '%" + pro_name + "%' and pro_status = 'Y'";

		if ("studio".equals(cate)) {
			List<Studio_vo> list = studio_dao.selList_studio(query);
			mav.addObject("list", list);
		} else if ("dress".equals(cate) || "dress1".equals(cate) || "dress2".equals(cate) || "dress3".equals(cate)) {
			List<Dress_vo> list = dress_dao.selList_dress(query);
			mav.addObject("list", list);
		} else if ("makeup".equals(cate)) {
			List<Makeup_vo> list = makeup_dao.selList_makeup(query);
			mav.addObject("list", list);
		} else if ("snap".equals(cate)) {
			List<Snap_vo> list = snap_dao.selList_snap(query);
			mav.addObject("list", list);
		}

		return mav;
	}

	@RequestMapping("/search_est_name.pnp")
	public ModelAndView search_est_name(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/search_est_name");

		String type = request.getParameter("type");
		String cnt = request.getParameter("cnt");
		if ("hall".equals(type)) {
			String pro_name = request.getParameter("pro_name");
			String query = "1 and pro_name like '%" + pro_name + "%'";
			List<Hall_vo> list = hall_dao.selList_hall(query);
			mav.addObject("list", list);
		}
		mav.addObject("type", type);
		mav.addObject("cnt", cnt);
		return mav;
	}

	@RequestMapping("/search_user.pnp")
	public ModelAndView search_user(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/search_user");

		Utils utils = new Utils();

		String user_name = request.getParameter("user_name");
		if (user_name != null) {
			String query = "1 and user_name like '%" + utils.encode(user_name) + "%' and user_status = 'Y'";
			List<User2_vo> list = user2_dao.selList_user(query);
			mav.addObject("list", list);
		}

		return mav;
	}

	@RequestMapping("/search_hall.pnp")
	public ModelAndView search_hall(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/search_hall");

		String pro_name = request.getParameter("pro_name");

		String query = "1 and pro_name like '%" + pro_name + "%'";

		List<Hall_vo> list = hall_dao.selList_hall(query);

		mav.addObject("list", list);

		return mav;
	}

	@RequestMapping("/search_other.pnp")
	public ModelAndView search_other(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/search_other");

		String pro_name = request.getParameter("pro_name");

		HttpSession session = request.getSession();
		String query = "1 and pro_name like '%" + pro_name + "%'";
		query += " and pro_com_idx = " + session.getAttribute("com_idx");

		List<Studio_vo> list1 = studio_dao.selList_studio(query);
		List<Dress_vo> list2 = dress_dao.selList_dress(query);
		List<Makeup_vo> list3 = makeup_dao.selList_makeup(query);
		List<Snap_vo> list4 = snap_dao.selList_snap(query);
		List<Suit_vo> list5 = suit_dao.selList_suit(query);
		List<Korea_vo> list6 = korea_dao.selList_korea(query);
		List<Jewelry_vo> list7 = jewelry_dao.selList_jewelry(query);
		List<Pb_vo> list8 = pb_dao.selList_pb(query);

		mav.addObject("list1", list1);
		mav.addObject("list2", list2);
		mav.addObject("list3", list3);
		mav.addObject("list4", list4);
		mav.addObject("list5", list5);
		mav.addObject("list6", list6);
		mav.addObject("list7", list7);
		mav.addObject("list8", list8);

		return mav;
	}

	@RequestMapping("/search_person_hall.pnp")
	public ModelAndView search_person_hall(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/search_person_hall");

		String pro_com_idx = request.getParameter("person_idx");
		String query = "1 and com_idx = '" + pro_com_idx + "'";

		List<Company_vo> list = company_dao.selList_company(query);

		mav.addObject("com_persons", list.get(0).getCom_persons());
		mav.addObject("com_persons_tel", list.get(0).getCom_persons_tel());
		mav.addObject("com_fax", list.get(0).getCom_fax());
		return mav;
	}

	@RequestMapping("/user_search.pnp")
	public ModelAndView user_search(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/user_search");

		Utils utils = new Utils();

		if (request.getParameter("user_name") != null && !"".equals(request.getParameter("user_name"))) {
			String user_name = utils.encode(request.getParameter("user_name"));
			String user_phone = utils.encode(request.getParameter("user_phone"));

			if (user_phone.indexOf("-") > -1) {
				user_phone = user_phone.replaceAll("-", "");
			}
			String query = "1 and user_name = '" + user_name + "' and user_phone = '" + user_phone + "'";
			List<User2_vo> list = user2_dao.selList_user(query);
			if (list.size() > 0) {
				mav.addObject("user_idx", list.get(0).getUser_idx());
				mav.addObject("user_name", utils.decode(user_name));
				mav.addObject("user_phone", utils.decode(user_phone));
			}
		}

		return mav;
	}

	@RequestMapping("/user_search_sdm.pnp")
	public ModelAndView user_search_sdm(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/user_search_sdm");

		Utils utils = new Utils();

		if (request.getParameter("user_name") != null && !"".equals(request.getParameter("user_name"))) {
			String user_name = utils.encode(request.getParameter("user_name"));
			String user_phone = utils.encode(request.getParameter("user_phone"));

			if (user_phone.indexOf("-") > -1) {
				user_phone = user_phone.replaceAll("-", "");
			}
			String query = "1 and user_name = '" + user_name + "' and user_phone = '" + user_phone
					+ "' and user_status = 'Y'";
			List<User2_vo> list = user2_dao.selList_user(query);
			if (list.size() > 0) {
				mav.addObject("user_idx", list.get(0).getUser_idx());
				mav.addObject("user_name", utils.decode(user_name));
				mav.addObject("user_phone", utils.decode(user_phone));

				String query2 = "1";
				query2 += " and see_user_idx = " + list.get(0).getUser_idx();
				query2 += " and see_status != '견적신청'";
				List<See_sdm_vo> list2 = see_sdm_dao.selSee_sdm(query2);

				if (list2.size() > 0) {
					mav.addObject("isHave", "on");
				} else {
					mav.addObject("isHave", "off");
				}

			}

		}

		return mav;
	}

	@RequestMapping("/user_search_other.pnp")
	public ModelAndView user_search_other(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/user_search_other");

		if (request.getParameter("user_name") != null && !"".equals(request.getParameter("user_name"))) {
			String user_name = request.getParameter("user_name");
			String user_phone = request.getParameter("user_phone");

			if (user_phone.indexOf("-") > -1) {
				user_phone = user_phone.replaceAll("-", "");
			}
			String query = "1 and user_name = '" + user_name + "' and user_phone = '" + user_phone + "'";
			List<User2_vo> list = user2_dao.selList_user(query);
			if (list.size() > 0) {
				mav.addObject("user_idx", list.get(0).getUser_idx());
				mav.addObject("user_name", user_name);
				mav.addObject("user_phone", user_phone);
			}
		}
		mav.addObject("category", request.getParameter("category"));

		return mav;
	}

	@RequestMapping("/info_company.pnp")
	public ModelAndView info_company(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/info_company");

		String query = "1";

		String searchDate1 = "";
		String searchDate2 = "";
		String searchCategory = "";
		String searchAddr = "";
		String search_val = "";

		mav.addObject("selMonth", request.getParameter("selMonth"));

		if (!"".equals(request.getParameter("searchDate1")) && request.getParameter("searchDate1") != null) {
			searchDate1 = request.getParameter("searchDate1") + "000000";
			query += " and com_submit_date >= " + searchDate1;
			mav.addObject("searchDate1", searchDate1.substring(0, 8));
		}
		if (!"".equals(request.getParameter("searchDate2")) && request.getParameter("searchDate2") != null) {
			searchDate2 = request.getParameter("searchDate2") + "999999";
			query += " and com_submit_date <=" + searchDate2;
			mav.addObject("searchDate2", searchDate2.substring(0, 8));
		}
		if (!"".equals(request.getParameter("searchCategory")) && request.getParameter("searchCategory") != null) {
			searchCategory = request.getParameter("searchCategory");
			query += " and com_category like '%" + searchCategory + "%'";
			mav.addObject("searchCategory", searchCategory);
		}
		if (!"".equals(request.getParameter("searchAddr")) && request.getParameter("searchAddr") != null) {
			searchAddr = request.getParameter("searchAddr");
			query += " and com_addr1 like '%" + searchAddr + "%'";
			mav.addObject("searchAddr", searchAddr);
		}
		if (!"".equals(request.getParameter("search_val")) && request.getParameter("search_val") != null) {
			search_val = request.getParameter("search_val");
			query += " and (com_name like '%" + search_val + "%' or com_number like '%" + search_val + "%')";
			mav.addObject("search_val", search_val);
		}

		List<Company_vo> list_size = company_dao.selList_company(query);

		int page = 1;
		if (!"".equals(request.getParameter("page")) && request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		int page1 = page * 15 - 15;
		int ten = page - (page % 10);

		if (page % 10 == 0) // 10, 20페이지 눌렀는데 넘어가면 안되니까~ 처리!
		{
			mav.addObject("list_size1", ten - 9);
			mav.addObject("list_size2", ten);
			if (ten < list_size.size() / 15 + 1) {
				mav.addObject("next", "next");
			} else {
				mav.addObject("next", "done");
			}
		} else {
			mav.addObject("list_size1", ten + 1);
			if (ten + 10 > list_size.size() / 15 + 1) {
				mav.addObject("list_size2", list_size.size() / 15 + 1);
				mav.addObject("next", "done");
			} else {
				mav.addObject("list_size2", ten + 10);
				mav.addObject("next", "next");
			}

		}
		mav.addObject("list_size", list_size.size() / 15 + 1);
		mav.addObject("page", page);

		String sort_val = "com_idx";

		String sort_type = "";
		if (!"".equals(request.getParameter("sort_val")) && request.getParameter("sort_val") != null) {
			sort_type = request.getParameter("sort_type");
			sort_val = request.getParameter("sort_val");
			query += " order by " + sort_val + " " + sort_type;
		}

		query += " limit " + page1 + ",15";

		List<Company_vo> list = company_dao.selList_company(query);

		mav.addObject("list", list);
		mav.addObject("max_page", list_size.size());
		mav.addObject("sort_type", sort_type);
		mav.addObject("sort_val", sort_val);

		return mav;
	}

	@RequestMapping("/insert_company.pnp")
	public ModelAndView insert_company(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insert_company");

		return mav;
	}

	@RequestMapping("/insert_company_output.pnp")
	public ModelAndView insert_company_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insert_company_output");

		try {
			// **************************** idx 번호 가져옴 ************************** //
			List<Company_vo> comIdx = company_dao.selIdx_company();
			int com_idx;
			if (comIdx.size() == 0) {
				com_idx = 1;
			} else {
				com_idx = comIdx.get(0).getCom_idx() + 1;
			}
			// **************************** idx 번호 가져옴 ************************** //

			String savePath = "/plan/weddingQ_product/company/" + com_idx + "/";
			int sizeLimit = 1024 * 1024 * 1000; // 1000메가..
			File dir = new File(savePath);
			if (!dir.exists()) { // 디렉토리가 존재하지 않으면
				dir.mkdirs(); // 디렉토리 생성.!
			}

			MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "utf-8",
					new DefaultFileRenamePolicy());

			String com_id = multi.getParameter("com_id");
			String com_pw = multi.getParameter("com_pw");
			String com_persons = multi.getParameter("com_persons");
			String com_persons_tel = multi.getParameter("com_persons_tel1") + "-"
					+ multi.getParameter("com_persons_tel2") + "-" + multi.getParameter("com_persons_tel3");
			String com_category = multi.getParameter("com_category");

			String com_name = multi.getParameter("com_name");
			String com_ceo = multi.getParameter("com_ceo");
			String com_number = multi.getParameter("com_number");
			String com_condition = multi.getParameter("com_condition");
			String com_type = multi.getParameter("com_type");
			String com_tel = multi.getParameter("com_tel1") + "-" + multi.getParameter("com_tel2") + "-"
					+ multi.getParameter("com_tel3");
			String com_fax = multi.getParameter("com_fax1") + "-" + multi.getParameter("com_fax2") + "-"
					+ multi.getParameter("com_fax3");
			String com_email = multi.getParameter("com_email1") + "@" + multi.getParameter("com_email2");
			String com_homepage = multi.getParameter("com_homepage");
			String com_zipcode = multi.getParameter("com_zipcode");
			String com_addr1 = multi.getParameter("com_addr1");
			String com_addr2 = multi.getParameter("com_addr2");
			String com_subway1 = multi.getParameter("com_subway1") + "&&"
					+ multi.getParameter(multi.getParameter("com_subway1") + "1") + "&&"
					+ multi.getParameter("com_subway1_3") + "&&" + multi.getParameter("com_subway1_4");
			String com_subway2 = multi.getParameter("com_subway2") + "&&"
					+ multi.getParameter(multi.getParameter("com_subway2") + "2") + "&&"
					+ multi.getParameter("com_subway2_3") + "&&" + multi.getParameter("com_subway2_4");
			String com_subway3 = multi.getParameter("com_subway3") + "&&"
					+ multi.getParameter(multi.getParameter("com_subway3") + "3") + "&&"
					+ multi.getParameter("com_subway3_3") + "&&" + multi.getParameter("com_subway3_4");
			String com_bus = multi.getParameter("com_bus").replace("\r\n", "<br>").replace("\"", "＂").replace("\'",
					"’");
			String com_pay_engine = multi.getParameter("com_pay_engine");
			String com_pay_number = multi.getParameter("com_pay_number");
			String com_pay_name = multi.getParameter("com_pay_name");

			company_dao.insCompany(com_idx, com_id, com_pw, com_persons, com_persons_tel, com_category, com_name,
					com_ceo, com_number, com_condition, com_type, com_tel, com_fax, com_email, com_homepage,
					com_zipcode, com_addr1, com_addr2, com_subway1, com_subway2, com_subway3, com_bus, com_pay_engine,
					com_pay_number, com_pay_name);

		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
		}
		return mav;
	}

	@RequestMapping("/delete_company.pnp")
	public ModelAndView delete_company(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/delete_company");

		String query = "1";

		String com_idx = (request.getParameter("del_idx")).substring(0, (request.getParameter("del_idx")).length() - 1);
		String com_idx_arr[] = com_idx.split(",");

		query += " and com_idx in (" + com_idx + ")";

		company_dao.delCompany(query);

		// 기존 파일 지움
		for (int i = 0; i < com_idx_arr.length; i++) {
			File directory = new File("/plan/weddingQ_product/company/" + com_idx_arr[i]);
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					Utils.fileDelete(directory + "/" + file.getName());
				}
			}
		}
		// 기존 파일 지움

		return mav;
	}

	@RequestMapping("/info_hall.pnp")
	public ModelAndView info_hall(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/info_hall");

		String query = "1";

		String searchAddr = "";
		String searchSubway = "";
		String searchType = "";
		String searchWeddingType = "";
		String searchMenu = "";
		String search_val = "";
		String searchPerson = "";

		if (!"".equals(request.getParameter("searchAddr")) && request.getParameter("searchAddr") != null) {
			searchAddr = request.getParameter("searchAddr");
			query += " and pro_addr1 like '%" + searchAddr + "%'";
			mav.addObject("searchAddr", searchAddr);
		}
		if (!"".equals(request.getParameter("searchSubway")) && request.getParameter("searchSubway") != null) {
			searchSubway = request.getParameter("searchSubway");
			query += " and (pro_subway1 like '%" + searchSubway + "%' or pro_subway2 like '%" + searchSubway
					+ "%' or pro_subway3 like '%" + searchSubway + "%')";
			mav.addObject("searchSubway", searchSubway);
		}
		if (!"".equals(request.getParameter("searchType")) && request.getParameter("searchType") != null) {
			searchType = request.getParameter("searchType");
			query += " and pro_type like '%" + searchType + "%'";
			mav.addObject("searchType", searchType);
		}
		if (!"".equals(request.getParameter("searchWeddingType"))
				&& request.getParameter("searchWeddingType") != null) {
			searchWeddingType = request.getParameter("searchWeddingType");
			query += " and pro_wedding_type like '%" + searchWeddingType + "%'";
			mav.addObject("searchWeddingType", searchWeddingType);
		}
		if (!"".equals(request.getParameter("searchMenu")) && request.getParameter("searchMenu") != null) {
			searchMenu = request.getParameter("searchMenu");
			query += " and (pro_menu like '%" + searchMenu + "%' or pro_menu_type like '%" + searchMenu + "%')";
			mav.addObject("searchMenu", searchMenu);
		}
		if (!"".equals(request.getParameter("search_val")) && request.getParameter("search_val") != null) {
			search_val = request.getParameter("search_val");
			query += " and (pro_name like '%" + search_val + "%' or pro_addr1 like '%" + search_val
					+ "%' or pro_com_name like '%" + search_val + "%')";
			mav.addObject("search_val", search_val);
		}
		if (!"".equals(request.getParameter("searchPerson")) && request.getParameter("searchPerson") != null) {
			searchPerson = request.getParameter("searchPerson");
			if ("up".equals(request.getParameter("searchUpDown"))) {
				query += " and pro_person >= " + searchPerson;
				mav.addObject("searchUpDown", "up");
			} else {
				query += " and pro_person <= " + searchPerson;
				mav.addObject("searchUpDown", "down");
			}
			mav.addObject("searchPerson", searchPerson);
		}
		HttpSession session = request.getSession();
		if (!"root".equals(session.getAttribute("session"))) {
			query += " and pro_com_idx = " + session.getAttribute("com_idx");
		}

		// 고객이 스크랩한 부분을 보여주기 위함 ! 스크랩 기능 외에 다른곳엔 쓰이지않음.

		String scrap_pro_idx = request.getParameter("scrap_pro_idx");
		if (!"".equals(scrap_pro_idx) && scrap_pro_idx != null) {
			query = "1 and pro_idx in (" + scrap_pro_idx + ")";
		}

		// 고객이 스크랩한 부분을 보여주기 위함 ! 스크랩 기능 외에 다른곳엔 쓰이지않음.
		List<Hall_vo> list_size = hall_dao.selList_hall(query);

		int page = 1;
		if (!"".equals(request.getParameter("page")) && request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		int page1 = page * 15 - 15;
		int ten = page - (page % 10);

		if (page % 10 == 0) // 10, 20페이지 눌렀는데 넘어가면 안되니까~ 처리!
		{
			mav.addObject("list_size1", ten - 9);
			mav.addObject("list_size2", ten);
			if (ten < list_size.size() / 15 + 1) {
				mav.addObject("next", "next");
			} else {
				mav.addObject("next", "done");
			}
		} else {
			mav.addObject("list_size1", ten + 1);
			if (ten + 10 > list_size.size() / 15 + 1) {
				mav.addObject("list_size2", list_size.size() / 15 + 1);
				mav.addObject("next", "done");
			} else {
				mav.addObject("list_size2", ten + 10);
				mav.addObject("next", "next");
			}

		}
		mav.addObject("list_size", list_size.size() / 15 + 1);
		mav.addObject("page", page);

		String sort_val = "pro_idx";

		String sort_type = "";
		if (!"".equals(request.getParameter("sort_val")) && request.getParameter("sort_val") != null) {
			sort_type = request.getParameter("sort_type");
			sort_val = request.getParameter("sort_val");
			query += " order by " + sort_val + " " + sort_type;
		}

		query += " limit " + page1 + ",15";

		List<Hall_vo> list = hall_dao.selList_hall(query);

		mav.addObject("list", list);
		mav.addObject("max_page", list_size.size());
		mav.addObject("sort_type", sort_type);
		mav.addObject("sort_val", sort_val);

		return mav;
	}

	@RequestMapping("/insert_hall.pnp")
	public ModelAndView insert_hall(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insert_hall");

		return mav;
	}

	@RequestMapping("/insert_hall_output.pnp")
	public ModelAndView insert_hall_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insert_hall_output");

		try {
			// **************************** idx 번호 가져옴 ************************** //
			List<Hall_vo> proIdx = hall_dao.selIdx_hall();
			int pro_idx;
			if (proIdx.size() == 0) {
				pro_idx = 1;
			} else {
				pro_idx = proIdx.get(0).getPro_idx() + 1;
			}
			// **************************** idx 번호 가져옴 ************************** //

			String savePath = "/plan/weddingQ_product/hall/" + pro_idx + "/";
			int sizeLimit = 1024 * 1024 * 1000; // 1000메가..
			File dir = new File(savePath);
			if (!dir.exists()) { // 디렉토리가 존재하지 않으면
				dir.mkdirs(); // 디렉토리 생성.!
			}

			MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "utf-8",
					new DefaultFileRenamePolicy());

			String pro_sort = multi.getParameter("pro_sort");
			String pro_com_idx = multi.getParameter("pro_com_idx");
			String pro_com_name = multi.getParameter("com_name");
			String pro_category = multi.getParameter("pro_category");

			String pro_name = multi.getParameter("pro_name");
			String pro_homepage = multi.getParameter("pro_homepage");
			String pro_tel = multi.getParameter("pro_tel1") + "-" + multi.getParameter("pro_tel2") + "-"
					+ multi.getParameter("pro_tel3");
			String pro_zipcode = multi.getParameter("pro_zipcode");
			String pro_addr1 = multi.getParameter("pro_addr1");
			String pro_addr2 = multi.getParameter("pro_addr2");
			String pro_subway1 = multi.getParameter("pro_subway1") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway1") + "1") + "&&"
					+ multi.getParameter("pro_subway1_3") + "&&" + multi.getParameter("pro_subway1_4");
			String pro_subway2 = multi.getParameter("pro_subway2") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway2") + "2") + "&&"
					+ multi.getParameter("pro_subway2_3") + "&&" + multi.getParameter("pro_subway2_4");
			String pro_subway3 = multi.getParameter("pro_subway3") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway3") + "3") + "&&"
					+ multi.getParameter("pro_subway3_3") + "&&" + multi.getParameter("pro_subway3_4");
			String pro_bus = multi.getParameter("pro_bus").replace("\r\n", "<br>").replace("\"", "＂").replace("\'",
					"’");
			String pro_intro1 = multi.getParameter("pro_intro1").replace("\r\n", "  <br>  ").replace("\"", "＂")
					.replace("\'", "’");
			String pro_intro2 = multi.getParameter("pro_intro2").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");

			String pro_type = "";

			if ("on".equals(multi.getParameter("일반웨딩홀"))) {
				pro_type += "&&일반웨딩홀";
			}
			if ("on".equals(multi.getParameter("컨벤션웨딩홀"))) {
				pro_type += "&&컨벤션웨딩홀";
			}
			if ("on".equals(multi.getParameter("호텔웨딩홀"))) {
				pro_type += "&&호텔웨딩홀";
			}
			if ("on".equals(multi.getParameter("하우스웨딩"))) {
				pro_type += "&&하우스웨딩";
			}
			if ("on".equals(multi.getParameter("야외예식"))) {
				pro_type += "&&야외예식";
			}
			if ("on".equals(multi.getParameter("전통혼례"))) {
				pro_type += "&&전통혼례";
			}
			if ("on".equals(multi.getParameter("채플웨딩"))) {
				pro_type += "&&채플웨딩";
			}
			if ("on".equals(multi.getParameter("공공기관"))) {
				pro_type += "&&공공기관";
			}
			if ("on".equals(multi.getParameter("강당"))) {
				pro_type += "&&강당";
			}

			if (pro_type.length() > 2) {
				pro_type = pro_type.substring(2, pro_type.length());
			}

			String pro_wedding_type = "";

			if ("on".equals(multi.getParameter("동시예식"))) {
				pro_wedding_type += "&&동시예식";
			}
			if ("on".equals(multi.getParameter("분리예식"))) {
				pro_wedding_type += "&&분리예식";
			}

			if (pro_wedding_type.length() > 2) {
				pro_wedding_type = pro_wedding_type.substring(2, pro_wedding_type.length());
			}

			String pro_wedding_time = multi.getParameter("pro_wedding_time");
			String pro_hall_seat = multi.getParameter("pro_hall_seat");
			String pro_party_seat = multi.getParameter("pro_party_seat");
			String pro_person = multi.getParameter("pro_person");
			String pro_parking = multi.getParameter("pro_parking").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");
			String pro_talk_time = multi.getParameter("pro_talk_time1") + ":" + multi.getParameter("pro_talk_time2")
					+ "~" + multi.getParameter("pro_talk_time3") + ":" + multi.getParameter("pro_talk_time4");
			String pro_menu = "";

			if ("on".equals(multi.getParameter("뷔페"))) {
				pro_menu += "&&뷔페";
			}
			if ("on".equals(multi.getParameter("한식"))) {
				pro_menu += "&&한식";
			}
			if ("on".equals(multi.getParameter("양식"))) {
				pro_menu += "&&양식";
			}
			if ("on".equals(multi.getParameter("중식"))) {
				pro_menu += "&&중식";
			}
			if ("on".equals(multi.getParameter("일식"))) {
				pro_menu += "&&일식";
			}
			if ("on".equals(multi.getParameter("기타"))) {
				pro_menu += "&&기타";
			}

			if (pro_menu.length() > 2) {
				pro_menu = pro_menu.substring(2, pro_menu.length());
			}

			String pro_eat_pay = multi.getParameter("pro_eat_pay1") + "~" + multi.getParameter("pro_eat_pay2");
			String pro_other_pay = multi.getParameter("pro_other_pay");
			String pro_rent_pay = multi.getParameter("pro_rent_pay");

			int pro_basic_option_cnt = Integer.parseInt(multi.getParameter("pro_basic_option_cnt"));
			String pro_basic_option = "";
			for (int i = 1; i <= pro_basic_option_cnt; i++) {
				pro_basic_option += multi.getParameter("pro_basic_option_" + i) + "&&";
			}
			pro_basic_option = pro_basic_option.substring(0, pro_basic_option.length() - 2);

			int pro_essential_option_cnt = Integer.parseInt(multi.getParameter("pro_essential_option_cnt"));
			String pro_essential_option = "";
			String pro_essential_option_pay = "";
			for (int i = 1; i <= pro_essential_option_cnt; i++) {
				pro_essential_option += multi.getParameter("pro_essential_option_" + i) + "&&";
				pro_essential_option_pay += multi.getParameter("pro_essential_option_pay_" + i) + "&&";
			}
			pro_essential_option = pro_essential_option.substring(0, pro_essential_option.length() - 2);
			pro_essential_option_pay = pro_essential_option_pay.substring(0, pro_essential_option_pay.length() - 2);

			int pro_menu_cnt = Integer.parseInt(multi.getParameter("pro_menu_cnt"));
			String pro_menu_name = "";
			String pro_menu_pay = "";
			String pro_menu_type = "";

			for (int i = 1; i <= pro_menu_cnt; i++) {
				pro_menu_name += multi.getParameter("pro_menu_name_" + i) + "&&";
				pro_menu_pay += multi.getParameter("pro_menu_pay_" + i) + "&&";

				String menu_result = "";
				if ("on".equals(multi.getParameter("뷔페_" + i))) {
					menu_result += ",뷔페";
				}
				if ("on".equals(multi.getParameter("한식_" + i))) {
					menu_result += ",한식";
				}
				if ("on".equals(multi.getParameter("양식_" + i))) {
					menu_result += ",양식";
				}
				if ("on".equals(multi.getParameter("중식_" + i))) {
					menu_result += ",중식";
				}
				if ("on".equals(multi.getParameter("일식_" + i))) {
					menu_result += ",일식";
				}
				if ("on".equals(multi.getParameter("기타_" + i))) {
					menu_result += ",기타";
				}
				if (menu_result.length() > 1) {
					menu_result = menu_result.substring(1, menu_result.length());
				}

				pro_menu_type += menu_result + "&&";

			}
			pro_menu_name = pro_menu_name.substring(0, pro_menu_name.length() - 2);
			pro_menu_pay = pro_menu_pay.substring(0, pro_menu_pay.length() - 2);
			pro_menu_type = pro_menu_type.substring(0, pro_menu_type.length() - 2);

			String pro_charge1 = multi.getParameter("pro_charge1");
			String pro_charge2 = multi.getParameter("pro_charge2");
			String pro_charge3 = multi.getParameter("pro_charge3");

			hall_dao.insHall(pro_idx, pro_sort, pro_com_idx, pro_com_name, pro_category, pro_name, pro_homepage,
					pro_tel, pro_zipcode, pro_addr1, pro_addr2, pro_subway1, pro_subway2, pro_subway3, pro_bus,
					pro_intro1, pro_intro2, pro_type, pro_wedding_type, pro_wedding_time, pro_hall_seat, pro_party_seat,
					pro_person, pro_parking, pro_talk_time, pro_menu, pro_eat_pay, pro_other_pay, pro_rent_pay,
					pro_basic_option, pro_essential_option, pro_essential_option_pay, pro_menu_name, pro_menu_pay,
					pro_menu_type, pro_charge1, pro_charge2, pro_charge3);

			// 상품명 기입
			String query = "com_idx = '" + pro_com_idx + "'";
			List<Company_vo> list = company_dao.selList_company(query);

			String com_pro_name = list.get(0).getCom_pro_name();
			if ("".equals(com_pro_name) || "null".equals(com_pro_name) || com_pro_name == null) {
				com_pro_name = pro_name;
			} else {
				com_pro_name += "&&" + pro_name;
			}
			company_dao.upComProName(pro_com_idx, com_pro_name);
			// 상품명 기입

		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
		}
		return mav;
	}

	@RequestMapping("/delete_hall.pnp")
	public ModelAndView delete_hall(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/delete_hall");

		String query = "1";

		String pro_idx = (request.getParameter("del_idx")).substring(0, (request.getParameter("del_idx")).length() - 1);
		String pro_idx_arr[] = pro_idx.split(",");

		query += " and pro_idx in (" + pro_idx + ")";

		List<Hall_vo> list = hall_dao.selList_hall(query);
		for (int i = 0; i < list.size(); i++) {
			String pro_name = list.get(i).getPro_name();
			String query3 = "1 and com_pro_name like '%" + pro_name + "%'";
			List<Company_vo> list_com = company_dao.selList_company(query3);

			for (int j = 0; j < list_com.size(); j++) {
				String com_pro_name = list_com.get(j).getCom_pro_name();
				if (com_pro_name.indexOf("&&" + pro_name) > -1) {
					com_pro_name = com_pro_name.replace("&&" + pro_name, "");
				} else if (com_pro_name.indexOf(pro_name + "&&") > -1) {
					com_pro_name = com_pro_name.replace(pro_name + "&&", "");
				} else if (com_pro_name.indexOf(pro_name) > -1) {
					com_pro_name = com_pro_name.replace(pro_name, "");
				}
				company_dao.upComProName(Integer.toString(list_com.get(j).getCom_idx()), com_pro_name);
			}

		}

		hall_dao.delHall(query);

		// 기존 파일 지움
		for (int i = 0; i < pro_idx_arr.length; i++) {
			File directory = new File("/plan/weddingQ_product/hall/" + pro_idx_arr[i]);
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					Utils.fileDelete(directory + "/" + file.getName());
				}
			}
		}
		// 기존 파일 지움

		return mav;
	}

	@RequestMapping("/delete_voc.pnp")
	public ModelAndView delete_voc(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/delete_voc");

		String query = "1";

		String voc_idx = (request.getParameter("del_idx")).substring(0, (request.getParameter("del_idx")).length() - 1);

		query += " and voc_idx in (" + voc_idx + ")";

		voc_dao.delVoc(query);

		return mav;
	}

	@RequestMapping("/delete_fake.pnp")
	public ModelAndView delete_fake(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/delete_fake");

		String query = "1";

		String fake_idx = (request.getParameter("del_idx")).substring(0,
				(request.getParameter("del_idx")).length() - 1);

		query += " and fake_idx in (" + fake_idx + ")";

		fake_dao.delFake(query);

		return mav;
	}

	@RequestMapping("/info_studio.pnp")
	public ModelAndView info_studio(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/info_studio");

		String query = "1";

		String searchAddr = "";
		String searchSubway = "";
		String searchType = "";
		String search_val = "";

		if (!"".equals(request.getParameter("searchAddr")) && request.getParameter("searchAddr") != null) {
			searchAddr = request.getParameter("searchAddr");
			query += " and pro_addr1 like '%" + searchAddr + "%'";
			mav.addObject("searchAddr", searchAddr);
		}
		if (!"".equals(request.getParameter("searchSubway")) && request.getParameter("searchSubway") != null) {
			searchSubway = request.getParameter("searchSubway");
			query += " and (pro_subway1 like '%" + searchSubway + "%' or pro_subway2 like '%" + searchSubway
					+ "%' or pro_subway3 like '%" + searchSubway + "%')";
			mav.addObject("searchSubway", searchSubway);
		}
		if (!"".equals(request.getParameter("searchType")) && request.getParameter("searchType") != null) {
			searchType = request.getParameter("searchType");
			query += " and pro_type like '%" + searchType + "%'";
			mav.addObject("searchType", searchType);
		}
		if (!"".equals(request.getParameter("search_val")) && request.getParameter("search_val") != null) {
			search_val = request.getParameter("search_val");
			query += " and (pro_name like '%" + search_val + "%' or pro_addr1 like '%" + search_val
					+ "%' or pro_com_name like '%" + search_val + "%')";
			mav.addObject("search_val", search_val);
		}

		HttpSession session = request.getSession();
		if (!"root".equals(session.getAttribute("session"))) {
			query += " and pro_com_idx = " + session.getAttribute("com_idx");
		}
		List<Studio_vo> list_size = studio_dao.selList_studio(query);

		int page = 1;
		if (!"".equals(request.getParameter("page")) && request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		int page1 = page * 15 - 15;
		int ten = page - (page % 10);

		if (page % 10 == 0) // 10, 20페이지 눌렀는데 넘어가면 안되니까~ 처리!
		{
			mav.addObject("list_size1", ten - 9);
			mav.addObject("list_size2", ten);
			if (ten < list_size.size() / 15 + 1) {
				mav.addObject("next", "next");
			} else {
				mav.addObject("next", "done");
			}
		} else {
			mav.addObject("list_size1", ten + 1);
			if (ten + 10 > list_size.size() / 15 + 1) {
				mav.addObject("list_size2", list_size.size() / 15 + 1);
				mav.addObject("next", "done");
			} else {
				mav.addObject("list_size2", ten + 10);
				mav.addObject("next", "next");
			}

		}
		mav.addObject("list_size", list_size.size() / 15 + 1);
		mav.addObject("page", page);

		String sort_val = "pro_idx";

		String sort_type = "";
		if (!"".equals(request.getParameter("sort_val")) && request.getParameter("sort_val") != null) {
			sort_type = request.getParameter("sort_type");
			sort_val = request.getParameter("sort_val");
			query += " order by " + sort_val + " " + sort_type;
		}

		query += " limit " + page1 + ",15";

		List<Studio_vo> list = studio_dao.selList_studio(query);

		mav.addObject("list", list);
		mav.addObject("max_page", list_size.size());
		mav.addObject("sort_type", sort_type);
		mav.addObject("sort_val", sort_val);

		return mav;
	}

	@RequestMapping("/insert_studio.pnp")
	public ModelAndView insert_studio(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insert_studio");

		return mav;
	}

	@RequestMapping("/insert_pack.pnp")
	public ModelAndView insert_pack(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insert_pack");

		return mav;
	}

	@RequestMapping("/insert_pack2.pnp")
	public ModelAndView insert_pack2(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insert_pack2");

		return mav;
	}

	@RequestMapping("/insert_studio_output.pnp")
	public ModelAndView insert_studio_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insert_studio_output");

		try {
			// **************************** idx 번호 가져옴 ************************** //
			List<Studio_vo> proIdx = studio_dao.selIdx_studio();
			int pro_idx;
			if (proIdx.size() == 0) {
				pro_idx = 1;
			} else {
				pro_idx = proIdx.get(0).getPro_idx() + 1;
			}
			// **************************** idx 번호 가져옴 ************************** //

			String savePath = "/plan/weddingQ_product/studio/" + pro_idx + "/";
			int sizeLimit = 1024 * 1024 * 1000; // 1000메가..
			File dir = new File(savePath);
			if (!dir.exists()) { // 디렉토리가 존재하지 않으면
				dir.mkdirs(); // 디렉토리 생성.!
			}

			MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "utf-8",
					new DefaultFileRenamePolicy());

			String pro_sort = multi.getParameter("pro_sort");
			String pro_com_idx = multi.getParameter("pro_com_idx");
			String pro_com_name = multi.getParameter("com_name");
			String pro_category = multi.getParameter("pro_category");

			String pro_name = multi.getParameter("pro_name");
			String pro_homepage = multi.getParameter("pro_homepage");
			String pro_tel = multi.getParameter("pro_tel1") + "-" + multi.getParameter("pro_tel2") + "-"
					+ multi.getParameter("pro_tel3");
			String pro_zipcode = multi.getParameter("pro_zipcode");
			String pro_addr1 = multi.getParameter("pro_addr1");
			String pro_addr2 = multi.getParameter("pro_addr2");
			String pro_subway1 = multi.getParameter("pro_subway1") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway1") + "1") + "&&"
					+ multi.getParameter("pro_subway1_3") + "&&" + multi.getParameter("pro_subway1_4");
			String pro_subway2 = multi.getParameter("pro_subway2") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway2") + "2") + "&&"
					+ multi.getParameter("pro_subway2_3") + "&&" + multi.getParameter("pro_subway2_4");
			String pro_subway3 = multi.getParameter("pro_subway3") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway3") + "3") + "&&"
					+ multi.getParameter("pro_subway3_3") + "&&" + multi.getParameter("pro_subway3_4");
			String pro_bus = multi.getParameter("pro_bus").replace("\r\n", "<br>").replace("\"", "＂").replace("\'",
					"’");
			String pro_intro1 = multi.getParameter("pro_intro1").replace("\r\n", "  <br>  ").replace("\"", "＂")
					.replace("\'", "’");
			String pro_intro2 = multi.getParameter("pro_intro2").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");

			String pro_type = "";

			if ("on".equals(multi.getParameter("웨딩스튜디오"))) {
				pro_type += "&&웨딩스튜디오";
			}
			if ("on".equals(multi.getParameter("세미촬영"))) {
				pro_type += "&&세미촬영";
			}
			if ("on".equals(multi.getParameter("데이트스냅"))) {
				pro_type += "&&데이트스냅";
			}
			if ("on".equals(multi.getParameter("허니문스냅"))) {
				pro_type += "&&허니문스냅";
			}
			if ("on".equals(multi.getParameter("셀프웨딩촬영"))) {
				pro_type += "&&셀프웨딩촬영";
			}

			if (pro_type.length() > 2) {
				pro_type = pro_type.substring(2, pro_type.length());
			}

			String pro_clothes = multi.getParameter("pro_clothes");
			String pro_props = multi.getParameter("pro_props");
			String pro_play_time = multi.getParameter("pro_play_time");
			String pro_photo_time = multi.getParameter("pro_photo_time1") + ":" + multi.getParameter("pro_photo_time2")
					+ "~" + multi.getParameter("pro_photo_time3") + ":" + multi.getParameter("pro_photo_time4");
			String pro_talk_time = multi.getParameter("pro_talk_time1") + ":" + multi.getParameter("pro_talk_time2")
					+ "~" + multi.getParameter("pro_talk_time3") + ":" + multi.getParameter("pro_talk_time4");

			String pro_holiday = multi.getParameter("pro_holiday");
			String pro_parking = multi.getParameter("pro_parking").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");

			String pro_concept1 = "";

			if ("on".equals(multi.getParameter("심플 모던"))) {
				pro_concept1 += "&&심플 모던";
			}
			if ("on".equals(multi.getParameter("럭셔리 클래식"))) {
				pro_concept1 += "&&럭셔리 클래식";
			}
			if ("on".equals(multi.getParameter("러블리"))) {
				pro_concept1 += "&&러블리";
			}
			if ("on".equals(multi.getParameter("컬러풀"))) {
				pro_concept1 += "&&컬러풀";
			}
			if ("on".equals(multi.getParameter("내추럴 빈티지"))) {
				pro_concept1 += "&&내추럴 빈티지";
			}

			if (pro_concept1.length() > 2) {
				pro_concept1 = pro_concept1.substring(2, pro_concept1.length());
			}

			String pro_concept2 = "";

			if ("on".equals(multi.getParameter("인물중심"))) {
				pro_concept2 += "&&인물중심";
			}
			if ("on".equals(multi.getParameter("배경중심"))) {
				pro_concept2 += "&&배경중심";
			}

			if (pro_concept2.length() > 2) {
				pro_concept2 = pro_concept2.substring(2, pro_concept2.length());
			}

			int pro_composition_cnt = Integer.parseInt(multi.getParameter("pro_composition_cnt"));
			String pro_composition = "";
			String pro_composition_pay = "";
			String pro_composition_charge = "";
			String pro_composition_price = "";
			String pro_composition_dc = "";
			for (int i = 1; i <= pro_composition_cnt; i++) {
				pro_composition += multi.getParameter("pro_composition_" + i) + "&&";
				pro_composition_pay += multi.getParameter("pro_composition_pay_" + i) + "&&";
				pro_composition_charge += multi.getParameter("pro_composition_charge_" + i) + "&&";
				pro_composition_price += multi.getParameter("pro_composition_price_" + i) + "&&";
				pro_composition_dc += multi.getParameter("pro_composition_dc_" + i) + "&&";
			}
			pro_composition = pro_composition.substring(0, pro_composition.length() - 2);
			pro_composition_pay = pro_composition_pay.substring(0, pro_composition_pay.length() - 2);
			pro_composition_charge = pro_composition_charge.substring(0, pro_composition_charge.length() - 2);
			pro_composition_price = pro_composition_price.substring(0, pro_composition_price.length() - 2);
			pro_composition_dc = pro_composition_dc.substring(0, pro_composition_dc.length() - 2);

			int pro_add_cnt = Integer.parseInt(multi.getParameter("pro_add_cnt"));
			String pro_add_name = "";
			String pro_add_pay = "";
			for (int i = 1; i <= pro_add_cnt; i++) {
				pro_add_name += multi.getParameter("pro_add_name_" + i) + "&&";
				pro_add_pay += multi.getParameter("pro_add_pay_" + i) + "&&";
			}
			pro_add_name = pro_add_name.substring(0, pro_add_name.length() - 2);
			pro_add_pay = pro_add_pay.substring(0, pro_add_pay.length() - 2);

			String pro_pay_engine = multi.getParameter("pro_pay_engine");
			String pro_pay_number = multi.getParameter("pro_pay_number");
			String pro_pay_name = multi.getParameter("pro_pay_name");

			String pro_change_date = multi.getParameter("pro_change_date").replace("\r\n", "  <br>  ")
					.replace("\"", "＂").replace("\'", "’");
			String pro_sorry_pay = multi.getParameter("pro_sorry_pay").replace("\r\n", "  <br>  ").replace("\"", "＂")
					.replace("\'", "’");

			String pro_sdm_pay = "";
			if ("on".equals(multi.getParameter("100만원미만"))) {
				pro_sdm_pay += "&&100만원미만";
			}
			if ("on".equals(multi.getParameter("100만원~150만원"))) {
				pro_sdm_pay += "&&100만원~150만원";
			}
			if ("on".equals(multi.getParameter("150만원~200만원"))) {
				pro_sdm_pay += "&&150만원~200만원";
			}
			if ("on".equals(multi.getParameter("200만원~250만원"))) {
				pro_sdm_pay += "&&200만원~250만원";
			}
			if ("on".equals(multi.getParameter("250만원~300만원"))) {
				pro_sdm_pay += "&&250만원~300만원";
			}
			if ("on".equals(multi.getParameter("300만원~350만원"))) {
				pro_sdm_pay += "&&300만원~350만원";
			}
			if ("on".equals(multi.getParameter("350만원~400만원"))) {
				pro_sdm_pay += "&&350만원~400만원";
			}
			if ("on".equals(multi.getParameter("400만원~450만원"))) {
				pro_sdm_pay += "&&400만원~450만원";
			}
			if ("on".equals(multi.getParameter("450만원~500만원"))) {
				pro_sdm_pay += "&&450만원~500만원";
			}
			if ("on".equals(multi.getParameter("500만원 이상"))) {
				pro_sdm_pay += "&&500만원 이상";
			}

			if (pro_sdm_pay.length() > 2) {
				pro_sdm_pay = pro_sdm_pay.substring(2, pro_sdm_pay.length());
			}

			int pro_event_cnt = Integer.parseInt(multi.getParameter("pro_event_cnt"));
			String pro_event = "";
			for (int i = 1; i <= pro_event_cnt; i++) {
				if ("on".equals(multi.getParameter("pro_event_bold_" + i))) {
					pro_event += "(bold)";
				}
				pro_event += multi.getParameter("pro_event_" + i) + "&&";
			}
			pro_event = pro_event.substring(0, pro_event.length() - 2);

			studio_dao.insStudio(pro_idx, pro_sort, pro_com_idx, pro_com_name, pro_category, pro_name, pro_homepage,
					pro_tel, pro_zipcode, pro_addr1, pro_addr2, pro_subway1, pro_subway2, pro_subway3, pro_bus,
					pro_intro1, pro_intro2, pro_type, pro_clothes, pro_props, pro_play_time, pro_photo_time,
					pro_talk_time, pro_holiday, pro_parking, pro_concept1, pro_concept2, pro_composition,
					pro_composition_pay, pro_composition_charge, pro_composition_price, pro_composition_dc, pro_sdm_pay,
					pro_add_name, pro_add_pay, pro_event, pro_pay_engine, pro_pay_number, pro_pay_name, pro_change_date,
					pro_sorry_pay);

			// 상품명 기입
			String query = "com_idx = '" + pro_com_idx + "'";
			List<Company_vo> list = company_dao.selList_company(query);

			String com_pro_name = list.get(0).getCom_pro_name();
			if ("".equals(com_pro_name) || "null".equals(com_pro_name) || com_pro_name == null) {
				com_pro_name = pro_name;
			} else {
				com_pro_name += "&&" + pro_name;
			}
			company_dao.upComProName(pro_com_idx, com_pro_name);
			// 상품명 기입

		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
		}
		return mav;
	}

	@RequestMapping("/insert_pack_output.pnp")
	public ModelAndView insert_pack_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insert_pack_output");

		try {
			// **************************** idx 번호 가져옴 ************************** //
			List<Pro_package_vo> packIdx = pro_package_dao.selIdx_pack();
			int pack_idx;
			if (packIdx.size() == 0) {
				pack_idx = 1;
			} else {
				pack_idx = packIdx.get(0).getPack_idx() + 1;
			}
			// **************************** idx 번호 가져옴 ************************** //

			String savePath = "/plan/weddingQ_product/package/" + pack_idx + "/";
			int sizeLimit = 1024 * 1024 * 1000; // 1000메가..
			File dir = new File(savePath);
			if (!dir.exists()) { // 디렉토리가 존재하지 않으면
				dir.mkdirs(); // 디렉토리 생성.!
			}

			MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "utf-8",
					new DefaultFileRenamePolicy());

			String pack_name = multi.getParameter("pack_name");
			String pack_pay = multi.getParameter("pack_pay");
			String pack_sort = multi.getParameter("pack_sort");
			String pack_end_date = multi.getParameter("pack_end_date");
			String pack_people = multi.getParameter("pack_people");
			String pack_pro_idx = "";
			String pack_pro_cate = "";
			String pack_pro_name = "";
			String pack_pro_option = "";

			for (int i = 1; i <= 4; i++) {
				if (!"".equals(multi.getParameter("pack_pro_idx_" + i))
						&& multi.getParameter("pack_pro_idx_" + i) != null) {
					pack_pro_idx += "&&" + multi.getParameter("pack_pro_idx_" + i);
					pack_pro_cate += "&&" + multi.getParameter("pack_pro_cate_" + i);
					pack_pro_name += "&&" + multi.getParameter("pack_pro_name_" + i);
					pack_pro_option += "&&" + multi.getParameter("pack_pro_option_" + i);
				}
			}
			pack_pro_idx = pack_pro_idx.substring(2, pack_pro_idx.length());
			pack_pro_cate = pack_pro_cate.substring(2, pack_pro_cate.length());
			pack_pro_name = pack_pro_name.substring(2, pack_pro_name.length());
			pack_pro_option = pack_pro_option.substring(2, pack_pro_option.length());

			pro_package_dao.insPro_package(pack_idx, pack_sort, pack_name, pack_pro_idx, pack_pro_cate, pack_pro_name,
					pack_pro_option, pack_pay, pack_people, pack_end_date);

		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
		}
		return mav;
	}

	@RequestMapping("/insert_pack2_output.pnp")
	public ModelAndView insert_pack2_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insert_pack2_output");

		try {
			// **************************** idx 번호 가져옴 ************************** //
			List<Pro_package2_vo> packIdx = pro_package2_dao.selIdx_pack2();
			int pack_idx;
			if (packIdx.size() == 0) {
				pack_idx = 1;
			} else {
				pack_idx = packIdx.get(0).getPack_idx() + 1;
			}
			// **************************** idx 번호 가져옴 ************************** //

			String savePath = "/plan/weddingQ_product/package2/" + pack_idx + "/";
			int sizeLimit = 1024 * 1024 * 1000; // 1000메가..
			File dir = new File(savePath);
			if (!dir.exists()) { // 디렉토리가 존재하지 않으면
				dir.mkdirs(); // 디렉토리 생성.!
			}

			MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "utf-8",
					new DefaultFileRenamePolicy());

			String pack_cate = multi.getParameter("pack_cate");
			String pack_sort = multi.getParameter("pack_sort");
			String pack_name = "";
			String pack_pro_idx = "";
			String pack_pro_name = "";
			String pack_pro_option = "";
			String pack_pay = "";
			for (int i = 1; i <= 5; i++) {
				if (!"".equals(multi.getParameter("pack_name_" + i))) {
					if (i != 1) {
						pack_name += "@";
					}
					pack_name += multi.getParameter("pack_name_" + i);
				}
			}
			for (int i = 1; i <= 15; i++) {
				if (!"".equals(multi.getParameter("pack_pro_idx_" + i))) {
					if (i != 1) {
						pack_pro_idx += "@";
					}
					pack_pro_idx += multi.getParameter("pack_pro_idx_" + i);
				}
			}
			for (int i = 1; i <= 15; i++) {
				if (!"".equals(multi.getParameter("pack_pro_name_" + i))) {
					if (i != 1) {
						pack_pro_name += "@";
					}
					pack_pro_name += multi.getParameter("pack_pro_name_" + i);
				}
			}
			for (int i = 1; i <= 15; i++) {
				if (!"".equals(multi.getParameter("pack_pro_option_" + i))
						&& multi.getParameter("pack_pro_option_" + i) != null) {
					if (i != 1) {
						pack_pro_option += "@";
					}
					pack_pro_option += multi.getParameter("pack_pro_option_" + i);
				}
			}
			for (int i = 1; i <= 5; i++) {
				if (!"".equals(multi.getParameter("pack_pay_" + i))) {
					if (i != 1) {
						pack_pay += "@";
					}
					pack_pay += multi.getParameter("pack_pay_" + i);
				}
			}

			pro_package2_dao.insPro_package2(pack_idx, pack_sort, pack_cate, pack_name, pack_pro_idx, pack_pro_name,
					pack_pro_option, pack_pay);

		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
		}
		return mav;
	}

	@RequestMapping("/update_pack2_output.pnp")
	public ModelAndView update_pack2_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/update_pack2_output");

		try {
			String savePath = "/plan/weddingQ_product/package2/";
			int sizeLimit = 1024 * 1024 * 1000; // 1000메가..
			File dir = new File(savePath);
			if (!dir.exists()) { // 디렉토리가 존재하지 않으면
				dir.mkdirs(); // 디렉토리 생성.!
			}

			MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "utf-8",
					new DefaultFileRenamePolicy());

			// **************************** idx 번호 가져옴 ************************** //
			int pack_idx = Integer.parseInt(multi.getParameter("pack_idx"));
			// **************************** idx 번호 가져옴 ************************** //

			if ("".equals(multi.getParameter("pack_img_list")) || multi.getParameter("pack_img_list") == null) // 이미지를
																												// 수정하지
																												// 않았다.
			{

			} else // 이미지가 수정되었다면..
			{
				// 기존 이미지를 지움
				File directory = new File("/plan/weddingQ_product/package2/" + pack_idx);
				File[] files = directory.listFiles();
				if (files != null) {
					for (File file : files) {
						if (file.isFile()) {
							Utils.fileDelete(directory + "/" + file.getName());
						}
					}
				}
				// 기존 이미지를 지움

				// 지금 올라온 이미지를 넘김
				String pack_img_list[] = (multi.getParameter("pack_img_list")).split("&&");
				for (int i = 0; i < pack_img_list.length; i++) {
					Utils.fileMove(savePath + pack_img_list[i], directory + "/" + pack_img_list[i]);
				}
				// 지금 올라온 이미지를 넘김
			}

			String pack_cate = multi.getParameter("pack_cate");
			String pack_sort = multi.getParameter("pack_sort");
			String pack_name = "";
			String pack_pro_idx = "";
			String pack_pro_name = "";
			String pack_pro_option = "";
			String pack_pay = "";
			for (int i = 1; i <= 5; i++) {
				if (!"".equals(multi.getParameter("pack_name_" + i))) {
					if (i != 1) {
						pack_name += "@";
					}
					pack_name += multi.getParameter("pack_name_" + i);
				}
			}
			for (int i = 1; i <= 15; i++) {
				if (!"".equals(multi.getParameter("pack_pro_idx_" + i))) {
					if (i != 1) {
						pack_pro_idx += "@";
					}
					pack_pro_idx += multi.getParameter("pack_pro_idx_" + i);
				}
			}
			for (int i = 1; i <= 15; i++) {
				if (!"".equals(multi.getParameter("pack_pro_name_" + i))) {
					if (i != 1) {
						pack_pro_name += "@";
					}
					pack_pro_name += multi.getParameter("pack_pro_name_" + i);
				}
			}
			for (int i = 1; i <= 15; i++) {
				if (!"".equals(multi.getParameter("pack_pro_option_" + i))
						&& multi.getParameter("pack_pro_option_" + i) != null) {
					if (i != 1) {
						pack_pro_option += "@";
					}
					pack_pro_option += multi.getParameter("pack_pro_option_" + i);
				}
			}
			for (int i = 1; i <= 5; i++) {
				if (!"".equals(multi.getParameter("pack_pay_" + i))) {
					if (i != 1) {
						pack_pay += "@";
					}
					pack_pay += multi.getParameter("pack_pay_" + i);
				}
			}

			pro_package2_dao.upPro_package2(pack_idx, pack_sort, pack_cate, pack_name, pack_pro_idx, pack_pro_name,
					pack_pro_option, pack_pay);

		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
		}
		return mav;
	}

	@RequestMapping("/update_pack.pnp")
	public ModelAndView update_pack(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/update_pack");

		String pack_idx = request.getParameter("idx");

		String query = "1 and pack_idx = '" + pack_idx + "'";
		List<Pro_package_vo> list = pro_package_dao.selPro_package(query);

		mav.addObject("pack_idx", list.get(0).getPack_idx());
		mav.addObject("pack_sort", list.get(0).getPack_sort());
		mav.addObject("pack_name", list.get(0).getPack_name());
		mav.addObject("pack_pro_idx", list.get(0).getPack_pro_idx());
		mav.addObject("pack_pro_cate", list.get(0).getPack_pro_cate());
		mav.addObject("pack_pro_name", list.get(0).getPack_pro_name());
		mav.addObject("pack_pro_option", list.get(0).getPack_pro_option());
		mav.addObject("pack_pay", list.get(0).getPack_pay());
		mav.addObject("pack_people", list.get(0).getPack_people());
		mav.addObject("pack_cnt", list.get(0).getPack_cnt());
		mav.addObject("pack_stats_detail", list.get(0).getPack_stats_detail());
		mav.addObject("pack_stats_submit", list.get(0).getPack_stats_submit());
		mav.addObject("pack_stats_comple", list.get(0).getPack_stats_comple());
		mav.addObject("pack_status", list.get(0).getPack_status());
		mav.addObject("pack_end_date", list.get(0).getPack_end_date());
		mav.addObject("pack_submit_date", list.get(0).getPack_submit_date());

		String cate_arr[] = list.get(0).getPack_pro_cate().split("&&");
		String idx_arr[] = list.get(0).getPack_pro_idx().split("&&");

		String option_arr = "";
		for (int i = 0; i < cate_arr.length; i++) {
			if ("studio".equals(cate_arr[i])) {
				List<Studio_vo> list_studio = studio_dao.selList_studio("1 and pro_idx = '" + idx_arr[i] + "'");
				option_arr += "@" + list_studio.get(0).getPro_composition();
			}
			if ("dress".equals(cate_arr[i])) {
				List<Dress_vo> list_dress = dress_dao.selList_dress("1 and pro_idx = '" + idx_arr[i] + "'");
				option_arr += "@" + list_dress.get(0).getPro_composition();
			}
			if ("makeup".equals(cate_arr[i])) {
				List<Makeup_vo> list_makeup = makeup_dao.selList_makeup("1 and pro_idx = '" + idx_arr[i] + "'");
				option_arr += "@" + list_makeup.get(0).getPro_composition();
			}
			if ("snap".equals(cate_arr[i])) {
				List<Snap_vo> list_snap = snap_dao.selList_snap("1 and pro_idx = '" + idx_arr[i] + "'");
				option_arr += "@" + list_snap.get(0).getPro_composition();
			}
		}
		option_arr = option_arr.substring(1, option_arr.length());

		mav.addObject("option_arr", option_arr);

		String zipFilePath = "/plan/weddingQ_product/package/" + list.get(0).getPack_idx();
		String zipFileName = "/plan/weddingQ_product/package/" + list.get(0).getPack_idx() + "/package_"
				+ list.get(0).getPack_idx() + ".zip";
		String isFile = "f";
		try {
			// 기존 압축파일 지움
			File directory = new File("/plan/weddingQ_product/package/" + list.get(0).getPack_idx());
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					isFile = "t";
					if (file.isFile() && (file.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory + "/" + file.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile)) {
				Utils.createZip(zipFilePath, zipFileName);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile", isFile);

		return mav;
	}

	@RequestMapping("/update_pack2.pnp")
	public ModelAndView update_pack2(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/update_pack2");

		String pack_idx = request.getParameter("idx");

		String query = "1 and pack_idx = '" + pack_idx + "'";
		List<Pro_package2_vo> list = pro_package2_dao.selPro_package2(query);

		mav.addObject("pack_idx", list.get(0).getPack_idx());
		mav.addObject("pack_sort", list.get(0).getPack_sort());
		mav.addObject("pack_cate", list.get(0).getPack_cate());
		mav.addObject("pack_name", list.get(0).getPack_name());
		mav.addObject("pack_pro_idx", list.get(0).getPack_pro_idx());
		mav.addObject("pack_pro_name", list.get(0).getPack_pro_name());
		mav.addObject("pack_pro_option", list.get(0).getPack_pro_option());
		mav.addObject("pack_pay", list.get(0).getPack_pay());
		mav.addObject("pack_status", list.get(0).getPack_status());
		mav.addObject("pack_submit_date", list.get(0).getPack_submit_date());

		String idx_arr[] = list.get(0).getPack_pro_idx().split("@");

		String option1 = "";
		String option2 = "";
		String option3 = "";
		if ("스드메 패키지".equals(list.get(0).getPack_cate())) {
			for (int i = 0; i < idx_arr.length; i++) {
				if (i == 0 || i == 3 || i == 6 || i == 9 || i == 12) {
					List<Studio_vo> list_studio = studio_dao.selList_studio("1 and pro_idx = '" + idx_arr[i] + "'");

					if (i != 0) {
						option1 += "@";
					}
					option1 += list_studio.get(0).getPro_composition();
				}
				if (i == 1 || i == 4 || i == 7 || i == 10 || i == 13) {
					List<Dress_vo> list_dress = dress_dao.selList_dress("1 and pro_idx = '" + idx_arr[i] + "'");

					if (i != 1) {
						option2 += "@";
					}
					option2 += list_dress.get(0).getPro_composition();
				}
				if (i == 2 || i == 5 || i == 8 || i == 11 || i == 14) {
					List<Makeup_vo> list_makeup = makeup_dao.selList_makeup("1 and pro_idx = '" + idx_arr[i] + "'");

					if (i != 2) {
						option3 += "@";
					}
					option3 += list_makeup.get(0).getPro_composition();
				}
			}
		} else if ("드메 패키지".equals(list.get(0).getPack_cate())) {
			for (int i = 0; i < idx_arr.length; i++) {
				if (i == 0 || i == 3 || i == 6 || i == 9 || i == 12) {
					List<Dress_vo> list_dress = dress_dao.selList_dress("1 and pro_idx = '" + idx_arr[i] + "'");

					if (i != 0) {
						option1 += "@";
					}
					option1 += list_dress.get(0).getPro_composition();
				}
				if (i == 1 || i == 4 || i == 7 || i == 10 || i == 13) {
					List<Dress_vo> list_dress = dress_dao.selList_dress("1 and pro_idx = '" + idx_arr[i] + "'");

					if (i != 1) {
						option2 += "@";
					}
					option2 += list_dress.get(0).getPro_composition();
				}
				if (i == 2 || i == 5 || i == 8 || i == 11 || i == 14) {
					List<Makeup_vo> list_makeup = makeup_dao.selList_makeup("1 and pro_idx = '" + idx_arr[i] + "'");

					if (i != 2) {
						option3 += "@";
					}
					option3 += list_makeup.get(0).getPro_composition();
				}
			}
		} else {
			for (int i = 0; i < idx_arr.length; i++) {
				if (i == 0 || i == 3 || i == 6 || i == 9 || i == 12) {
					List<Snap_vo> list_snap = snap_dao.selList_snap("1 and pro_idx = '" + idx_arr[i] + "'");

					if (i != 0) {
						option1 += "@";
					}
					option1 += list_snap.get(0).getPro_composition();
				}
				if (i == 1 || i == 4 || i == 7 || i == 10 || i == 13) {
					List<Dress_vo> list_dress = dress_dao.selList_dress("1 and pro_idx = '" + idx_arr[i] + "'");

					if (i != 1) {
						option2 += "@";
					}
					option2 += list_dress.get(0).getPro_composition();
				}
				if (i == 2 || i == 5 || i == 8 || i == 11 || i == 14) {
					List<Makeup_vo> list_makeup = makeup_dao.selList_makeup("1 and pro_idx = '" + idx_arr[i] + "'");

					if (i != 2) {
						option3 += "@";
					}
					option3 += list_makeup.get(0).getPro_composition();
				}
			}
		}
		mav.addObject("option1", option1);
		mav.addObject("option2", option2);
		mav.addObject("option3", option3);
		String zipFilePath = "/plan/weddingQ_product/package2/" + list.get(0).getPack_idx();
		String zipFileName = "/plan/weddingQ_product/package2/" + list.get(0).getPack_idx() + "/package_"
				+ list.get(0).getPack_idx() + ".zip";
		String isFile = "f";
		try {
			// 기존 압축파일 지움
			File directory = new File("/plan/weddingQ_product/package2/" + list.get(0).getPack_idx());
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					isFile = "t";
					if (file.isFile() && (file.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory + "/" + file.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile)) {
				Utils.createZip(zipFilePath, zipFileName);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile", isFile);

		return mav;
	}

	@RequestMapping("/update_pack_output.pnp")
	public ModelAndView update_pack_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/update_pack_output");

		try {
			String savePath = "/plan/weddingQ_product/package/";
			int sizeLimit = 1024 * 1024 * 1000; // 1000메가..
			File dir = new File(savePath);
			if (!dir.exists()) { // 디렉토리가 존재하지 않으면
				dir.mkdirs(); // 디렉토리 생성.!
			}

			MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "utf-8",
					new DefaultFileRenamePolicy());

			// **************************** idx 번호 가져옴 ************************** //
			int pack_idx = Integer.parseInt(multi.getParameter("pack_idx"));
			// **************************** idx 번호 가져옴 ************************** //

			if ("".equals(multi.getParameter("pack_img_list")) || multi.getParameter("pack_img_list") == null) // 이미지를
																												// 수정하지
																												// 않았다.
			{

			} else // 이미지가 수정되었다면..
			{
				// 기존 이미지를 지움
				File directory = new File("/plan/weddingQ_product/package/" + pack_idx);
				File[] files = directory.listFiles();
				if (files != null) {
					for (File file : files) {
						if (file.isFile()) {
							Utils.fileDelete(directory + "/" + file.getName());
						}
					}
				}
				// 기존 이미지를 지움

				// 지금 올라온 이미지를 넘김
				String pack_img_list[] = (multi.getParameter("pack_img_list")).split("&&");
				for (int i = 0; i < pack_img_list.length; i++) {
					Utils.fileMove(savePath + pack_img_list[i], directory + "/" + pack_img_list[i]);
				}
				// 지금 올라온 이미지를 넘김
			}

			String pack_name = multi.getParameter("pack_name");
			String pack_pay = multi.getParameter("pack_pay");
			String pack_sort = multi.getParameter("pack_sort");
			String pack_end_date = multi.getParameter("pack_end_date");
			String pack_people = multi.getParameter("pack_people");
			String pack_pro_idx = "";
			String pack_pro_cate = "";
			String pack_pro_name = "";
			String pack_pro_option = "";

			for (int i = 1; i <= 4; i++) {
				if (!"".equals(multi.getParameter("pack_pro_idx_" + i))
						&& multi.getParameter("pack_pro_idx_" + i) != null) {
					pack_pro_idx += "&&" + multi.getParameter("pack_pro_idx_" + i);
					pack_pro_cate += "&&" + multi.getParameter("pack_pro_cate_" + i);
					pack_pro_name += "&&" + multi.getParameter("pack_pro_name_" + i);
					pack_pro_option += "&&" + multi.getParameter("pack_pro_option_" + i);
				}
			}

			pack_pro_idx = pack_pro_idx.substring(2, pack_pro_idx.length());
			pack_pro_cate = pack_pro_cate.substring(2, pack_pro_cate.length());
			pack_pro_name = pack_pro_name.substring(2, pack_pro_name.length());
			pack_pro_option = pack_pro_option.substring(2, pack_pro_option.length());

			pro_package_dao.upPro_package(pack_idx, pack_sort, pack_name, pack_pro_idx, pack_pro_cate, pack_pro_name,
					pack_pro_option, pack_pay, pack_people, pack_end_date);

		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
		}
		return mav;
	}

	@RequestMapping("/delete_studio.pnp")
	public ModelAndView delete_studio(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/delete_studio");

		String query = "1";

		String pro_idx = (request.getParameter("del_idx")).substring(0, (request.getParameter("del_idx")).length() - 1);
		String pro_idx_arr[] = pro_idx.split(",");

		query += " and pro_idx in (" + pro_idx + ")";

		List<Studio_vo> list = studio_dao.selList_studio(query);
		for (int i = 0; i < list.size(); i++) {
			String pro_name = list.get(i).getPro_name();
			String query3 = "1 and com_pro_name like '%" + pro_name + "%'";
			List<Company_vo> list_com = company_dao.selList_company(query3);

			for (int j = 0; j < list_com.size(); j++) {
				String com_pro_name = list_com.get(j).getCom_pro_name();
				if (com_pro_name.indexOf("&&" + pro_name) > -1) {
					com_pro_name = com_pro_name.replace("&&" + pro_name, "");
				} else if (com_pro_name.indexOf(pro_name + "&&") > -1) {
					com_pro_name = com_pro_name.replace(pro_name + "&&", "");
				} else if (com_pro_name.indexOf(pro_name) > -1) {
					com_pro_name = com_pro_name.replace(pro_name, "");
				}
				company_dao.upComProName(Integer.toString(list_com.get(j).getCom_idx()), com_pro_name);
			}

		}

		studio_dao.delStudio(query);

		// 기존 파일 지움
		for (int i = 0; i < pro_idx_arr.length; i++) {
			File directory = new File("/plan/weddingQ_product/studio/" + pro_idx_arr[i]);
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					Utils.fileDelete(directory + "/" + file.getName());
				}
			}
		}
		// 기존 파일 지움

		return mav;
	}

	@RequestMapping("/delete_pack.pnp")
	public ModelAndView delete_pack(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/delete_pack");

		String query = "1";

		String pack_idx = (request.getParameter("del_idx")).substring(0,
				(request.getParameter("del_idx")).length() - 1);
		String pack_idx_arr[] = pack_idx.split(",");

		query += " and pack_idx in (" + pack_idx + ")";

		pro_package_dao.delPro_pack(query);

		// 기존 파일 지움
		for (int i = 0; i < pack_idx_arr.length; i++) {
			File directory = new File("/plan/weddingQ_product/package/" + pack_idx_arr[i]);
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					Utils.fileDelete(directory + "/" + file.getName());
				}
			}
		}
		// 기존 파일 지움

		return mav;
	}

	@RequestMapping("/delete_pack2.pnp")
	public ModelAndView delete_pack2(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/delete_pack2");

		String query = "1";

		String pack_idx = (request.getParameter("del_idx")).substring(0,
				(request.getParameter("del_idx")).length() - 1);
		String pack_idx_arr[] = pack_idx.split(",");

		query += " and pack_idx in (" + pack_idx + ")";

		pro_package2_dao.delPro_pack2(query);

		// 기존 파일 지움
		for (int i = 0; i < pack_idx_arr.length; i++) {
			File directory = new File("/plan/weddingQ_product/package2/" + pack_idx_arr[i]);
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					Utils.fileDelete(directory + "/" + file.getName());
				}
			}
		}
		// 기존 파일 지움

		return mav;
	}

	@RequestMapping("/info_dress.pnp")
	public ModelAndView info_dress(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/info_dress");

		String query = "1";

		String searchAddr = "";
		String searchSubway = "";
		String searchBrand = "";
		String search_val = "";

		if (!"".equals(request.getParameter("searchAddr")) && request.getParameter("searchAddr") != null) {
			searchAddr = request.getParameter("searchAddr");
			query += " and pro_addr1 like '%" + searchAddr + "%'";
			mav.addObject("searchAddr", searchAddr);
		}
		if (!"".equals(request.getParameter("searchSubway")) && request.getParameter("searchSubway") != null) {
			searchSubway = request.getParameter("searchSubway");
			query += " and (pro_subway1 like '%" + searchSubway + "%' or pro_subway2 like '%" + searchSubway
					+ "%' or pro_subway3 like '%" + searchSubway + "%')";
			mav.addObject("searchSubway", searchSubway);
		}
		if (!"".equals(request.getParameter("searchBrand")) && request.getParameter("searchBrand") != null) {
			searchBrand = request.getParameter("searchBrand");
			query += " and pro_brand like '%" + searchBrand + "%'";
			mav.addObject("searchBrand", searchBrand);
		}
		if (!"".equals(request.getParameter("search_val")) && request.getParameter("search_val") != null) {
			search_val = request.getParameter("search_val");
			query += " and (pro_name like '%" + search_val + "%' or pro_addr1 like '%" + search_val
					+ "%' or pro_com_name like '%" + search_val + "%')";
			mav.addObject("search_val", search_val);
		}

		HttpSession session = request.getSession();
		if (!"root".equals(session.getAttribute("session"))) {
			query += " and pro_com_idx = " + session.getAttribute("com_idx");
		}
		List<Dress_vo> list_size = dress_dao.selList_dress(query);

		int page = 1;
		if (!"".equals(request.getParameter("page")) && request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		int page1 = page * 15 - 15;
		int ten = page - (page % 10);

		if (page % 10 == 0) // 10, 20페이지 눌렀는데 넘어가면 안되니까~ 처리!
		{
			mav.addObject("list_size1", ten - 9);
			mav.addObject("list_size2", ten);
			if (ten < list_size.size() / 15 + 1) {
				mav.addObject("next", "next");
			} else {
				mav.addObject("next", "done");
			}
		} else {
			mav.addObject("list_size1", ten + 1);
			if (ten + 10 > list_size.size() / 15 + 1) {
				mav.addObject("list_size2", list_size.size() / 15 + 1);
				mav.addObject("next", "done");
			} else {
				mav.addObject("list_size2", ten + 10);
				mav.addObject("next", "next");
			}

		}
		mav.addObject("list_size", list_size.size() / 15 + 1);
		mav.addObject("page", page);

		String sort_val = "pro_idx";

		String sort_type = "";
		if (!"".equals(request.getParameter("sort_val")) && request.getParameter("sort_val") != null) {
			sort_type = request.getParameter("sort_type");
			sort_val = request.getParameter("sort_val");
			query += " order by " + sort_val + " " + sort_type;
		}

		query += " limit " + page1 + ",15";

		List<Dress_vo> list = dress_dao.selList_dress(query);

		mav.addObject("list", list);
		mav.addObject("max_page", list_size.size());
		mav.addObject("sort_type", sort_type);
		mav.addObject("sort_val", sort_val);

		return mav;
	}

	@RequestMapping("/info_snap.pnp")
	public ModelAndView info_snap(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/info_snap");

		String query = "1";

		String search_val = "";

		if (!"".equals(request.getParameter("search_val")) && request.getParameter("search_val") != null) {
			search_val = request.getParameter("search_val");
			query += " and (pro_name like '%" + search_val + "%' or pro_addr1 like '%" + search_val
					+ "%' or pro_com_name like '%" + search_val + "%')";
			mav.addObject("search_val", search_val);
		}

		HttpSession session = request.getSession();
		if (!"root".equals(session.getAttribute("session"))) {
			query += " and pro_com_idx = " + session.getAttribute("com_idx");
		}
		List<Snap_vo> list_size = snap_dao.selList_snap(query);

		int page = 1;
		if (!"".equals(request.getParameter("page")) && request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		int page1 = page * 15 - 15;
		int ten = page - (page % 10);

		if (page % 10 == 0) // 10, 20페이지 눌렀는데 넘어가면 안되니까~ 처리!
		{
			mav.addObject("list_size1", ten - 9);
			mav.addObject("list_size2", ten);
			if (ten < list_size.size() / 15 + 1) {
				mav.addObject("next", "next");
			} else {
				mav.addObject("next", "done");
			}
		} else {
			mav.addObject("list_size1", ten + 1);
			if (ten + 10 > list_size.size() / 15 + 1) {
				mav.addObject("list_size2", list_size.size() / 15 + 1);
				mav.addObject("next", "done");
			} else {
				mav.addObject("list_size2", ten + 10);
				mav.addObject("next", "next");
			}

		}
		mav.addObject("list_size", list_size.size() / 15 + 1);
		mav.addObject("page", page);

		String sort_val = "pro_idx";

		String sort_type = "";
		if (!"".equals(request.getParameter("sort_val")) && request.getParameter("sort_val") != null) {
			sort_type = request.getParameter("sort_type");
			sort_val = request.getParameter("sort_val");
			query += " order by " + sort_val + " " + sort_type;
		}

		query += " limit " + page1 + ",15";

		List<Snap_vo> list = snap_dao.selList_snap(query);

		mav.addObject("list", list);
		mav.addObject("max_page", list_size.size());
		mav.addObject("sort_type", sort_type);
		mav.addObject("sort_val", sort_val);

		return mav;
	}

	@RequestMapping("/insert_dress.pnp")
	public ModelAndView insert_dress(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insert_dress");

		return mav;
	}

	@RequestMapping("/insert_dress_output.pnp")
	public ModelAndView insert_dress_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insert_dress_output");

		try {
			// **************************** idx 번호 가져옴 ************************** //
			List<Dress_vo> proIdx = dress_dao.selIdx_dress();
			int pro_idx;
			if (proIdx.size() == 0) {
				pro_idx = 1;
			} else {
				pro_idx = proIdx.get(0).getPro_idx() + 1;
			}
			// **************************** idx 번호 가져옴 ************************** //

			String savePath = "/plan/weddingQ_product/dress/" + pro_idx + "/";
			int sizeLimit = 1024 * 1024 * 1000; // 1000메가..
			File dir = new File(savePath);
			if (!dir.exists()) { // 디렉토리가 존재하지 않으면
				dir.mkdirs(); // 디렉토리 생성.!
			}

			MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "utf-8",
					new DefaultFileRenamePolicy());

			String pro_sort = multi.getParameter("pro_sort");
			String pro_com_idx = multi.getParameter("pro_com_idx");
			String pro_com_name = multi.getParameter("com_name");
			String pro_category = multi.getParameter("pro_category");

			String pro_name = multi.getParameter("pro_name");
			String pro_homepage = multi.getParameter("pro_homepage");
			String pro_tel = multi.getParameter("pro_tel1") + "-" + multi.getParameter("pro_tel2") + "-"
					+ multi.getParameter("pro_tel3");
			String pro_zipcode = multi.getParameter("pro_zipcode");
			String pro_addr1 = multi.getParameter("pro_addr1");
			String pro_addr2 = multi.getParameter("pro_addr2");
			String pro_subway1 = multi.getParameter("pro_subway1") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway1") + "1") + "&&"
					+ multi.getParameter("pro_subway1_3") + "&&" + multi.getParameter("pro_subway1_4");
			String pro_subway2 = multi.getParameter("pro_subway2") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway2") + "2") + "&&"
					+ multi.getParameter("pro_subway2_3") + "&&" + multi.getParameter("pro_subway2_4");
			String pro_subway3 = multi.getParameter("pro_subway3") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway3") + "3") + "&&"
					+ multi.getParameter("pro_subway3_3") + "&&" + multi.getParameter("pro_subway3_4");
			String pro_bus = multi.getParameter("pro_bus").replace("\r\n", "<br>").replace("\"", "＂").replace("\'",
					"’");
			String pro_intro1 = multi.getParameter("pro_intro1").replace("\r\n", "  <br>  ").replace("\"", "＂")
					.replace("\'", "’");
			String pro_intro2 = multi.getParameter("pro_intro2").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");

			String pro_type = "";

			if ("on".equals(multi.getParameter("대여"))) {
				pro_type += "&&대여";
			}
			if ("on".equals(multi.getParameter("판매"))) {
				pro_type += "&&판매";
			}

			if (pro_type.length() > 2) {
				pro_type = pro_type.substring(2, pro_type.length());
			}

			String pro_brand = "";

			if ("on".equals(multi.getParameter("수입드레스"))) {
				pro_brand += "&&수입드레스";
			}
			if ("on".equals(multi.getParameter("멀티샵"))) {
				pro_brand += "&&멀티샵";
			}
			if (pro_brand.length() > 2) {
				pro_brand = pro_brand.substring(2, pro_brand.length());
			}

			String pro_talk_time = multi.getParameter("pro_talk_time1") + ":" + multi.getParameter("pro_talk_time2")
					+ "~" + multi.getParameter("pro_talk_time3") + ":" + multi.getParameter("pro_talk_time4");

			String pro_holiday = multi.getParameter("pro_holiday");
			String pro_parking = multi.getParameter("pro_parking").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");

			int pro_composition_cnt = Integer.parseInt(multi.getParameter("pro_composition_cnt"));
			String pro_composition = "";
			String pro_composition_pay = "";
			String pro_composition_charge = "";
			String pro_composition_price = "";
			String pro_composition_dc = "";
			for (int i = 1; i <= pro_composition_cnt; i++) {
				pro_composition += multi.getParameter("pro_composition_" + i) + "&&";
				pro_composition_pay += multi.getParameter("pro_composition_pay_" + i) + "&&";
				pro_composition_charge += multi.getParameter("pro_composition_charge_" + i) + "&&";
				pro_composition_price += multi.getParameter("pro_composition_price_" + i) + "&&";
				pro_composition_dc += multi.getParameter("pro_composition_dc_" + i) + "&&";
			}
			pro_composition = pro_composition.substring(0, pro_composition.length() - 2);
			pro_composition_pay = pro_composition_pay.substring(0, pro_composition_pay.length() - 2);
			pro_composition_charge = pro_composition_charge.substring(0, pro_composition_charge.length() - 2);
			pro_composition_price = pro_composition_price.substring(0, pro_composition_price.length() - 2);
			pro_composition_dc = pro_composition_dc.substring(0, pro_composition_dc.length() - 2);

			int pro_add_cnt = Integer.parseInt(multi.getParameter("pro_add_cnt"));
			String pro_add_name = "";
			String pro_add_pay = "";
			for (int i = 1; i <= pro_add_cnt; i++) {
				pro_add_name += multi.getParameter("pro_add_name_" + i) + "&&";
				pro_add_pay += multi.getParameter("pro_add_pay_" + i) + "&&";
			}
			pro_add_name = pro_add_name.substring(0, pro_add_name.length() - 2);
			pro_add_pay = pro_add_pay.substring(0, pro_add_pay.length() - 2);

			String pro_pay_engine = multi.getParameter("pro_pay_engine");
			String pro_pay_number = multi.getParameter("pro_pay_number");
			String pro_pay_name = multi.getParameter("pro_pay_name");

			String pro_change_date = multi.getParameter("pro_change_date").replace("\r\n", "  <br>  ")
					.replace("\"", "＂").replace("\'", "’");
			String pro_sorry_pay = multi.getParameter("pro_sorry_pay").replace("\r\n", "  <br>  ").replace("\"", "＂")
					.replace("\'", "’");

			String pro_sdm_pay = "";
			if ("on".equals(multi.getParameter("100만원미만"))) {
				pro_sdm_pay += "&&100만원미만";
			}
			if ("on".equals(multi.getParameter("100만원~150만원"))) {
				pro_sdm_pay += "&&100만원~150만원";
			}
			if ("on".equals(multi.getParameter("150만원~200만원"))) {
				pro_sdm_pay += "&&150만원~200만원";
			}
			if ("on".equals(multi.getParameter("200만원~250만원"))) {
				pro_sdm_pay += "&&200만원~250만원";
			}
			if ("on".equals(multi.getParameter("250만원~300만원"))) {
				pro_sdm_pay += "&&250만원~300만원";
			}
			if ("on".equals(multi.getParameter("300만원~350만원"))) {
				pro_sdm_pay += "&&300만원~350만원";
			}
			if ("on".equals(multi.getParameter("350만원~400만원"))) {
				pro_sdm_pay += "&&350만원~400만원";
			}
			if ("on".equals(multi.getParameter("400만원~450만원"))) {
				pro_sdm_pay += "&&400만원~450만원";
			}
			if ("on".equals(multi.getParameter("450만원~500만원"))) {
				pro_sdm_pay += "&&450만원~500만원";
			}
			if ("on".equals(multi.getParameter("500만원 이상"))) {
				pro_sdm_pay += "&&500만원 이상";
			}

			if (pro_sdm_pay.length() > 2) {
				pro_sdm_pay = pro_sdm_pay.substring(2, pro_sdm_pay.length());
			}
			int pro_event_cnt = Integer.parseInt(multi.getParameter("pro_event_cnt"));
			String pro_event = "";
			for (int i = 1; i <= pro_event_cnt; i++) {
				if ("on".equals(multi.getParameter("pro_event_bold_" + i))) {
					pro_event += "(bold)";
				}
				pro_event += multi.getParameter("pro_event_" + i) + "&&";
			}
			pro_event = pro_event.substring(0, pro_event.length() - 2);

			dress_dao.insDress(pro_idx, pro_sort, pro_com_idx, pro_com_name, pro_category, pro_name, pro_homepage,
					pro_tel, pro_zipcode, pro_addr1, pro_addr2, pro_subway1, pro_subway2, pro_subway3, pro_bus,
					pro_intro1, pro_intro2, pro_type, pro_brand, pro_talk_time, pro_holiday, pro_parking,
					pro_composition, pro_composition_pay, pro_composition_charge, pro_composition_price,
					pro_composition_dc, pro_sdm_pay, pro_add_name, pro_add_pay, pro_event, pro_pay_engine,
					pro_pay_number, pro_pay_name, pro_change_date, pro_sorry_pay);

			// 상품명 기입
			String query = "com_idx = '" + pro_com_idx + "'";
			List<Company_vo> list = company_dao.selList_company(query);

			String com_pro_name = list.get(0).getCom_pro_name();
			if ("".equals(com_pro_name) || "null".equals(com_pro_name) || com_pro_name == null) {
				com_pro_name = pro_name;
			} else {
				com_pro_name += "&&" + pro_name;
			}
			company_dao.upComProName(pro_com_idx, com_pro_name);
			// 상품명 기입

		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
		}
		return mav;
	}

	@RequestMapping("/insert_snap_output.pnp")
	public ModelAndView insert_snap_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insert_snap_output");

		try {
			// **************************** idx 번호 가져옴 ************************** //
			List<Snap_vo> proIdx = snap_dao.selIdx_snap();
			int pro_idx;
			if (proIdx.size() == 0) {
				pro_idx = 1;
			} else {
				pro_idx = proIdx.get(0).getPro_idx() + 1;
			}
			// **************************** idx 번호 가져옴 ************************** //

			String savePath = "/plan/weddingQ_product/snap/" + pro_idx + "/";
			int sizeLimit = 1024 * 1024 * 1000; // 1000메가..
			File dir = new File(savePath);
			if (!dir.exists()) { // 디렉토리가 존재하지 않으면
				dir.mkdirs(); // 디렉토리 생성.!
			}

			MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "utf-8",
					new DefaultFileRenamePolicy());

			String pro_sort = multi.getParameter("pro_sort");
			String pro_com_idx = multi.getParameter("pro_com_idx");
			String pro_com_name = multi.getParameter("com_name");
			String pro_category = multi.getParameter("pro_category");

			String pro_name = multi.getParameter("pro_name");
			String pro_homepage = multi.getParameter("pro_homepage");
			String pro_tel = multi.getParameter("pro_tel1") + "-" + multi.getParameter("pro_tel2") + "-"
					+ multi.getParameter("pro_tel3");
			String pro_zipcode = multi.getParameter("pro_zipcode");
			String pro_addr1 = multi.getParameter("pro_addr1");
			String pro_addr2 = multi.getParameter("pro_addr2");
			String pro_subway1 = multi.getParameter("pro_subway1") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway1") + "1") + "&&"
					+ multi.getParameter("pro_subway1_3") + "&&" + multi.getParameter("pro_subway1_4");
			String pro_subway2 = multi.getParameter("pro_subway2") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway2") + "2") + "&&"
					+ multi.getParameter("pro_subway2_3") + "&&" + multi.getParameter("pro_subway2_4");
			String pro_subway3 = multi.getParameter("pro_subway3") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway3") + "3") + "&&"
					+ multi.getParameter("pro_subway3_3") + "&&" + multi.getParameter("pro_subway3_4");
			String pro_bus = multi.getParameter("pro_bus").replace("\r\n", "<br>").replace("\"", "＂").replace("\'",
					"’");
			String pro_intro1 = multi.getParameter("pro_intro1").replace("\r\n", "  <br>  ").replace("\"", "＂")
					.replace("\'", "’");
			String pro_intro2 = multi.getParameter("pro_intro2").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");

			String pro_location = "";

			if ("on".equals(multi.getParameter("전국"))) {
				pro_location += "&&전국";
			}
			if ("on".equals(multi.getParameter("서울"))) {
				pro_location += "&&서울";
			}
			if ("on".equals(multi.getParameter("경기"))) {
				pro_location += "&&경기";
			}
			if ("on".equals(multi.getParameter("인천"))) {
				pro_location += "&&인천";
			}
			if ("on".equals(multi.getParameter("강원도"))) {
				pro_location += "&&강원도";
			}
			if ("on".equals(multi.getParameter("경상도"))) {
				pro_location += "&&경상도";
			}
			if ("on".equals(multi.getParameter("경상남도"))) {
				pro_location += "&&경상남도";
			}
			if ("on".equals(multi.getParameter("경상북도"))) {
				pro_location += "&&경상북도";
			}
			if ("on".equals(multi.getParameter("광주"))) {
				pro_location += "&&광주";
			}
			if ("on".equals(multi.getParameter("대구"))) {
				pro_location += "&&대구";
			}
			if ("on".equals(multi.getParameter("대전"))) {
				pro_location += "&&대전";
			}
			if ("on".equals(multi.getParameter("부산"))) {
				pro_location += "&&부산";
			}
			if ("on".equals(multi.getParameter("울산"))) {
				pro_location += "&&울산";
			}
			if ("on".equals(multi.getParameter("전라도"))) {
				pro_location += "&&전라도";
			}
			if ("on".equals(multi.getParameter("전남"))) {
				pro_location += "&&전남";
			}
			if ("on".equals(multi.getParameter("전북"))) {
				pro_location += "&&전북";
			}
			if ("on".equals(multi.getParameter("제주도"))) {
				pro_location += "&&제주도";
			}
			if ("on".equals(multi.getParameter("충청도"))) {
				pro_location += "&&충청도";
			}
			if ("on".equals(multi.getParameter("충남"))) {
				pro_location += "&&충남";
			}
			if ("on".equals(multi.getParameter("충북"))) {
				pro_location += "&&충북";
			}
			if ("on".equals(multi.getParameter("세종"))) {
				pro_location += "&&세종";
			}

			if (pro_location.length() > 2) {
				pro_location = pro_location.substring(2, pro_location.length());
			}

			String pro_talk_time = multi.getParameter("pro_talk_time1") + ":" + multi.getParameter("pro_talk_time2")
					+ "~" + multi.getParameter("pro_talk_time3") + ":" + multi.getParameter("pro_talk_time4");

			String pro_holiday = multi.getParameter("pro_holiday");

			int pro_composition_cnt = Integer.parseInt(multi.getParameter("pro_composition_cnt"));
			String pro_composition = "";
			String pro_composition_pay = "";
			String pro_composition_charge = "";
			String pro_composition_price = "";
			String pro_composition_dc = "";
			for (int i = 1; i <= pro_composition_cnt; i++) {
				pro_composition += multi.getParameter("pro_composition_" + i) + "&&";
				pro_composition_pay += multi.getParameter("pro_composition_pay_" + i) + "&&";
				pro_composition_charge += multi.getParameter("pro_composition_charge_" + i) + "&&";
				pro_composition_price += multi.getParameter("pro_composition_price_" + i) + "&&";
				pro_composition_dc += multi.getParameter("pro_composition_dc_" + i) + "&&";
			}
			pro_composition = pro_composition.substring(0, pro_composition.length() - 2);
			pro_composition_pay = pro_composition_pay.substring(0, pro_composition_pay.length() - 2);
			pro_composition_charge = pro_composition_charge.substring(0, pro_composition_charge.length() - 2);
			pro_composition_price = pro_composition_price.substring(0, pro_composition_price.length() - 2);
			pro_composition_dc = pro_composition_dc.substring(0, pro_composition_dc.length() - 2);

			int pro_add_cnt = Integer.parseInt(multi.getParameter("pro_add_cnt"));
			String pro_add_name = "";
			String pro_add_pay = "";
			for (int i = 1; i <= pro_add_cnt; i++) {
				pro_add_name += multi.getParameter("pro_add_name_" + i) + "&&";
				pro_add_pay += multi.getParameter("pro_add_pay_" + i) + "&&";
			}
			pro_add_name = pro_add_name.substring(0, pro_add_name.length() - 2);
			pro_add_pay = pro_add_pay.substring(0, pro_add_pay.length() - 2);

			String pro_pay_engine = multi.getParameter("pro_pay_engine");
			String pro_pay_number = multi.getParameter("pro_pay_number");
			String pro_pay_name = multi.getParameter("pro_pay_name");

			int pro_event_cnt = Integer.parseInt(multi.getParameter("pro_event_cnt"));
			String pro_event = "";
			for (int i = 1; i <= pro_event_cnt; i++) {
				if ("on".equals(multi.getParameter("pro_event_bold_" + i))) {
					pro_event += "(bold)";
				}
				pro_event += multi.getParameter("pro_event_" + i) + "&&";
			}
			pro_event = pro_event.substring(0, pro_event.length() - 2);

			snap_dao.insSnap(pro_idx, pro_sort, pro_com_idx, pro_com_name, pro_category, pro_name, pro_homepage,
					pro_tel, pro_zipcode, pro_addr1, pro_addr2, pro_subway1, pro_subway2, pro_subway3, pro_bus,
					pro_intro1, pro_intro2, pro_location, pro_talk_time, pro_holiday, pro_composition,
					pro_composition_pay, pro_composition_charge, pro_composition_price, pro_composition_dc,
					pro_add_name, pro_add_pay, pro_event, pro_pay_engine, pro_pay_number, pro_pay_name);

			// 상품명 기입
			String query = "com_idx = '" + pro_com_idx + "'";
			List<Company_vo> list = company_dao.selList_company(query);

			String com_pro_name = list.get(0).getCom_pro_name();
			if ("".equals(com_pro_name) || "null".equals(com_pro_name) || com_pro_name == null) {
				com_pro_name = pro_name;
			} else {
				com_pro_name += "&&" + pro_name;
			}
			company_dao.upComProName(pro_com_idx, com_pro_name);
			// 상품명 기입

		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
		}
		return mav;
	}

	@RequestMapping("/delete_dress.pnp")
	public ModelAndView delete_dress(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/delete_dress");

		String query = "1";

		String pro_idx = (request.getParameter("del_idx")).substring(0, (request.getParameter("del_idx")).length() - 1);
		String pro_idx_arr[] = pro_idx.split(",");

		query += " and pro_idx in (" + pro_idx + ")";

		List<Dress_vo> list = dress_dao.selList_dress(query);
		for (int i = 0; i < list.size(); i++) {
			String pro_name = list.get(i).getPro_name();
			String query3 = "1 and com_pro_name like '%" + pro_name + "%'";
			List<Company_vo> list_com = company_dao.selList_company(query3);

			for (int j = 0; j < list_com.size(); j++) {
				String com_pro_name = list_com.get(j).getCom_pro_name();
				if (com_pro_name.indexOf("&&" + pro_name) > -1) {
					com_pro_name = com_pro_name.replace("&&" + pro_name, "");
				} else if (com_pro_name.indexOf(pro_name + "&&") > -1) {
					com_pro_name = com_pro_name.replace(pro_name + "&&", "");
				} else if (com_pro_name.indexOf(pro_name) > -1) {
					com_pro_name = com_pro_name.replace(pro_name, "");
				}
				company_dao.upComProName(Integer.toString(list_com.get(j).getCom_idx()), com_pro_name);
			}

		}

		dress_dao.delDress(query);

		// 기존 파일 지움
		for (int i = 0; i < pro_idx_arr.length; i++) {
			File directory = new File("/plan/weddingQ_product/dress/" + pro_idx_arr[i]);
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					Utils.fileDelete(directory + "/" + file.getName());
				}
			}
		}
		// 기존 파일 지움

		return mav;
	}

	@RequestMapping("/delete_snap.pnp")
	public ModelAndView delete_snap(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/delete_snap");

		String query = "1";

		String pro_idx = (request.getParameter("del_idx")).substring(0, (request.getParameter("del_idx")).length() - 1);
		String pro_idx_arr[] = pro_idx.split(",");

		query += " and pro_idx in (" + pro_idx + ")";

		List<Snap_vo> list = snap_dao.selList_snap(query);
		for (int i = 0; i < list.size(); i++) {
			String pro_name = list.get(i).getPro_name();
			String query3 = "1 and com_pro_name like '%" + pro_name + "%'";
			List<Company_vo> list_com = company_dao.selList_company(query3);

			for (int j = 0; j < list_com.size(); j++) {
				String com_pro_name = list_com.get(j).getCom_pro_name();
				if (com_pro_name.indexOf("&&" + pro_name) > -1) {
					com_pro_name = com_pro_name.replace("&&" + pro_name, "");
				} else if (com_pro_name.indexOf(pro_name + "&&") > -1) {
					com_pro_name = com_pro_name.replace(pro_name + "&&", "");
				} else if (com_pro_name.indexOf(pro_name) > -1) {
					com_pro_name = com_pro_name.replace(pro_name, "");
				}
				company_dao.upComProName(Integer.toString(list_com.get(j).getCom_idx()), com_pro_name);
			}

		}

		snap_dao.delSnap(query);

		// 기존 파일 지움
		for (int i = 0; i < pro_idx_arr.length; i++) {
			File directory = new File("/plan/weddingQ_product/snap/" + pro_idx_arr[i]);
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					Utils.fileDelete(directory + "/" + file.getName());
				}
			}
		}
		// 기존 파일 지움

		return mav;
	}

	@RequestMapping("/info_makeup.pnp")
	public ModelAndView info_makeup(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/info_makeup");

		String query = "1";

		String searchAddr = "";
		String searchSubway = "";
		String searchGo = "";
		String search_val = "";

		if (!"".equals(request.getParameter("searchAddr")) && request.getParameter("searchAddr") != null) {
			searchAddr = request.getParameter("searchAddr");
			query += " and pro_addr1 like '%" + searchAddr + "%'";
			mav.addObject("searchAddr", searchAddr);
		}
		if (!"".equals(request.getParameter("searchSubway")) && request.getParameter("searchSubway") != null) {
			searchSubway = request.getParameter("searchSubway");
			query += " and (pro_subway1 like '%" + searchSubway + "%' or pro_subway2 like '%" + searchSubway
					+ "%' or pro_subway3 like '%" + searchSubway + "%')";
			mav.addObject("searchSubway", searchSubway);
		}
		if ("on".equals(request.getParameter("searchGo"))) {
			searchGo = request.getParameter("searchGo");
			query += " and pro_go = '출장가능'";
			mav.addObject("searchGo", searchGo);
		}
		if (!"".equals(request.getParameter("search_val")) && request.getParameter("search_val") != null) {
			search_val = request.getParameter("search_val");
			query += " and (pro_name like '%" + search_val + "%' or pro_addr1 like '%" + search_val
					+ "%' or pro_com_name like '%" + search_val + "%')";
			mav.addObject("search_val", search_val);
		}

		HttpSession session = request.getSession();
		if (!"root".equals(session.getAttribute("session"))) {
			query += " and pro_com_idx = " + session.getAttribute("com_idx");
		}
		List<Makeup_vo> list_size = makeup_dao.selList_makeup(query);

		int page = 1;
		if (!"".equals(request.getParameter("page")) && request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		int page1 = page * 15 - 15;
		int ten = page - (page % 10);

		if (page % 10 == 0) // 10, 20페이지 눌렀는데 넘어가면 안되니까~ 처리!
		{
			mav.addObject("list_size1", ten - 9);
			mav.addObject("list_size2", ten);
			if (ten < list_size.size() / 15 + 1) {
				mav.addObject("next", "next");
			} else {
				mav.addObject("next", "done");
			}
		} else {
			mav.addObject("list_size1", ten + 1);
			if (ten + 10 > list_size.size() / 15 + 1) {
				mav.addObject("list_size2", list_size.size() / 15 + 1);
				mav.addObject("next", "done");
			} else {
				mav.addObject("list_size2", ten + 10);
				mav.addObject("next", "next");
			}

		}
		mav.addObject("list_size", list_size.size() / 15 + 1);
		mav.addObject("page", page);

		String sort_val = "pro_idx";

		String sort_type = "";
		if (!"".equals(request.getParameter("sort_val")) && request.getParameter("sort_val") != null) {
			sort_type = request.getParameter("sort_type");
			sort_val = request.getParameter("sort_val");
			query += " order by " + sort_val + " " + sort_type;
		}

		query += " limit " + page1 + ",15";

		List<Makeup_vo> list = makeup_dao.selList_makeup(query);

		mav.addObject("list", list);
		mav.addObject("max_page", list_size.size());
		mav.addObject("sort_type", sort_type);
		mav.addObject("sort_val", sort_val);

		return mav;
	}

	@RequestMapping("/insert_makeup.pnp")
	public ModelAndView insert_makeup(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insert_makeup");

		return mav;
	}

	@RequestMapping("/insert_snap.pnp")
	public ModelAndView insert_snap(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insert_snap");

		return mav;
	}

	@RequestMapping("/insert_makeup_output.pnp")
	public ModelAndView insert_makeup_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insert_makeup_output");

		try {
			// **************************** idx 번호 가져옴 ************************** //
			List<Makeup_vo> proIdx = makeup_dao.selIdx_makeup();
			int pro_idx;
			if (proIdx.size() == 0) {
				pro_idx = 1;
			} else {
				pro_idx = proIdx.get(0).getPro_idx() + 1;
			}
			// **************************** idx 번호 가져옴 ************************** //

			String savePath = "/plan/weddingQ_product/makeup/" + pro_idx + "/";
			int sizeLimit = 1024 * 1024 * 1000; // 1000메가..
			File dir = new File(savePath);
			if (!dir.exists()) { // 디렉토리가 존재하지 않으면
				dir.mkdirs(); // 디렉토리 생성.!
			}

			MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "utf-8",
					new DefaultFileRenamePolicy());

			String pro_sort = multi.getParameter("pro_sort");
			String pro_com_idx = multi.getParameter("pro_com_idx");
			String pro_com_name = multi.getParameter("com_name");
			String pro_category = multi.getParameter("pro_category");

			String pro_name = multi.getParameter("pro_name");
			String pro_homepage = multi.getParameter("pro_homepage");
			String pro_tel = multi.getParameter("pro_tel1") + "-" + multi.getParameter("pro_tel2") + "-"
					+ multi.getParameter("pro_tel3");
			String pro_zipcode = multi.getParameter("pro_zipcode");
			String pro_addr1 = multi.getParameter("pro_addr1");
			String pro_addr2 = multi.getParameter("pro_addr2");
			String pro_subway1 = multi.getParameter("pro_subway1") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway1") + "1") + "&&"
					+ multi.getParameter("pro_subway1_3") + "&&" + multi.getParameter("pro_subway1_4");
			String pro_subway2 = multi.getParameter("pro_subway2") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway2") + "2") + "&&"
					+ multi.getParameter("pro_subway2_3") + "&&" + multi.getParameter("pro_subway2_4");
			String pro_subway3 = multi.getParameter("pro_subway3") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway3") + "3") + "&&"
					+ multi.getParameter("pro_subway3_3") + "&&" + multi.getParameter("pro_subway3_4");
			String pro_bus = multi.getParameter("pro_bus").replace("\r\n", "<br>").replace("\"", "＂").replace("\'",
					"’");
			String pro_intro1 = multi.getParameter("pro_intro1").replace("\r\n", "  <br>  ").replace("\"", "＂")
					.replace("\'", "’");
			String pro_intro2 = multi.getParameter("pro_intro2").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");

			String pro_go = "";

			if ("on".equals(multi.getParameter("출장가능"))) {
				pro_go = "출장가능";
			}

			String pro_talk_time = multi.getParameter("pro_talk_time1") + ":" + multi.getParameter("pro_talk_time2")
					+ "~" + multi.getParameter("pro_talk_time3") + ":" + multi.getParameter("pro_talk_time4");

			String pro_holiday = multi.getParameter("pro_holiday");
			String pro_parking = multi.getParameter("pro_parking").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");

			String pro_concept = "";

			if ("on".equals(multi.getParameter("내추럴"))) {
				pro_concept += "&&내추럴";
			}
			if ("on".equals(multi.getParameter("스모키"))) {
				pro_concept += "&&스모키";
			}
			if ("on".equals(multi.getParameter("세미스모키"))) {
				pro_concept += "&&세미스모키";
			}
			if ("on".equals(multi.getParameter("포인트"))) {
				pro_concept += "&&포인트";
			}
			if ("on".equals(multi.getParameter("로맨틱"))) {
				pro_concept += "&&로맨틱";
			}
			if ("on".equals(multi.getParameter("큐트"))) {
				pro_concept += "&&큐트";
			}

			if (pro_concept.length() > 2) {
				pro_concept = pro_concept.substring(2, pro_concept.length());
			}

			int pro_composition_cnt = Integer.parseInt(multi.getParameter("pro_composition_cnt"));
			String pro_composition = "";
			String pro_composition_pay = "";
			String pro_composition_charge = "";
			String pro_composition_price = "";
			String pro_composition_dc = "";
			for (int i = 1; i <= pro_composition_cnt; i++) {
				pro_composition += multi.getParameter("pro_composition_" + i) + "&&";
				pro_composition_pay += multi.getParameter("pro_composition_pay_" + i) + "&&";
				pro_composition_charge += multi.getParameter("pro_composition_charge_" + i) + "&&";
				pro_composition_price += multi.getParameter("pro_composition_price_" + i) + "&&";
				pro_composition_dc += multi.getParameter("pro_composition_dc_" + i) + "&&";
			}
			pro_composition = pro_composition.substring(0, pro_composition.length() - 2);
			pro_composition_pay = pro_composition_pay.substring(0, pro_composition_pay.length() - 2);
			pro_composition_charge = pro_composition_charge.substring(0, pro_composition_charge.length() - 2);
			pro_composition_price = pro_composition_price.substring(0, pro_composition_price.length() - 2);
			pro_composition_dc = pro_composition_dc.substring(0, pro_composition_dc.length() - 2);

			int pro_add_cnt = Integer.parseInt(multi.getParameter("pro_add_cnt"));
			String pro_add_name = "";
			String pro_add_pay = "";
			for (int i = 1; i <= pro_add_cnt; i++) {
				pro_add_name += multi.getParameter("pro_add_name_" + i) + "&&";
				pro_add_pay += multi.getParameter("pro_add_pay_" + i) + "&&";
			}
			pro_add_name = pro_add_name.substring(0, pro_add_name.length() - 2);
			pro_add_pay = pro_add_pay.substring(0, pro_add_pay.length() - 2);

			String pro_pay_engine = multi.getParameter("pro_pay_engine");
			String pro_pay_number = multi.getParameter("pro_pay_number");
			String pro_pay_name = multi.getParameter("pro_pay_name");

			String pro_change_date = multi.getParameter("pro_change_date").replace("\r\n", "  <br>  ")
					.replace("\"", "＂").replace("\'", "’");
			String pro_sorry_pay = multi.getParameter("pro_sorry_pay").replace("\r\n", "  <br>  ").replace("\"", "＂")
					.replace("\'", "’");

			String pro_sdm_pay = "";
			if ("on".equals(multi.getParameter("100만원미만"))) {
				pro_sdm_pay += "&&100만원미만";
			}
			if ("on".equals(multi.getParameter("100만원~150만원"))) {
				pro_sdm_pay += "&&100만원~150만원";
			}
			if ("on".equals(multi.getParameter("150만원~200만원"))) {
				pro_sdm_pay += "&&150만원~200만원";
			}
			if ("on".equals(multi.getParameter("200만원~250만원"))) {
				pro_sdm_pay += "&&200만원~250만원";
			}
			if ("on".equals(multi.getParameter("250만원~300만원"))) {
				pro_sdm_pay += "&&250만원~300만원";
			}
			if ("on".equals(multi.getParameter("300만원~350만원"))) {
				pro_sdm_pay += "&&300만원~350만원";
			}
			if ("on".equals(multi.getParameter("350만원~400만원"))) {
				pro_sdm_pay += "&&350만원~400만원";
			}
			if ("on".equals(multi.getParameter("400만원~450만원"))) {
				pro_sdm_pay += "&&400만원~450만원";
			}
			if ("on".equals(multi.getParameter("450만원~500만원"))) {
				pro_sdm_pay += "&&450만원~500만원";
			}
			if ("on".equals(multi.getParameter("500만원 이상"))) {
				pro_sdm_pay += "&&500만원 이상";
			}

			if (pro_sdm_pay.length() > 2) {
				pro_sdm_pay = pro_sdm_pay.substring(2, pro_sdm_pay.length());
			}

			int pro_event_cnt = Integer.parseInt(multi.getParameter("pro_event_cnt"));
			String pro_event = "";
			for (int i = 1; i <= pro_event_cnt; i++) {
				if ("on".equals(multi.getParameter("pro_event_bold_" + i))) {
					pro_event += "(bold)";
				}
				pro_event += multi.getParameter("pro_event_" + i) + "&&";
			}
			pro_event = pro_event.substring(0, pro_event.length() - 2);

			makeup_dao.insMakeup(pro_idx, pro_sort, pro_com_idx, pro_com_name, pro_category, pro_name, pro_homepage,
					pro_tel, pro_zipcode, pro_addr1, pro_addr2, pro_subway1, pro_subway2, pro_subway3, pro_bus,
					pro_intro1, pro_intro2, pro_go, pro_talk_time, pro_holiday, pro_parking, pro_concept,
					pro_composition, pro_composition_pay, pro_composition_charge, pro_composition_price,
					pro_composition_dc, pro_sdm_pay, pro_add_name, pro_add_pay, pro_event, pro_pay_engine,
					pro_pay_number, pro_pay_name, pro_change_date, pro_sorry_pay);

			// 상품명 기입
			String query = "com_idx = '" + pro_com_idx + "'";
			List<Company_vo> list = company_dao.selList_company(query);

			String com_pro_name = list.get(0).getCom_pro_name();
			if ("".equals(com_pro_name) || "null".equals(com_pro_name) || com_pro_name == null) {
				com_pro_name = pro_name;
			} else {
				com_pro_name += "&&" + pro_name;
			}
			company_dao.upComProName(pro_com_idx, com_pro_name);
			// 상품명 기입

		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
		}
		return mav;
	}

	@RequestMapping("/delete_makeup.pnp")
	public ModelAndView delete_makeup(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/delete_makeup");

		String query = "1";

		String pro_idx = (request.getParameter("del_idx")).substring(0, (request.getParameter("del_idx")).length() - 1);
		String pro_idx_arr[] = pro_idx.split(",");

		query += " and pro_idx in (" + pro_idx + ")";

		List<Makeup_vo> list = makeup_dao.selList_makeup(query);
		for (int i = 0; i < list.size(); i++) {
			String pro_name = list.get(i).getPro_name();
			String query3 = "1 and com_pro_name like '%" + pro_name + "%'";
			List<Company_vo> list_com = company_dao.selList_company(query3);

			for (int j = 0; j < list_com.size(); j++) {
				String com_pro_name = list_com.get(j).getCom_pro_name();
				if (com_pro_name.indexOf("&&" + pro_name) > -1) {
					com_pro_name = com_pro_name.replace("&&" + pro_name, "");
				} else if (com_pro_name.indexOf(pro_name + "&&") > -1) {
					com_pro_name = com_pro_name.replace(pro_name + "&&", "");
				} else if (com_pro_name.indexOf(pro_name) > -1) {
					com_pro_name = com_pro_name.replace(pro_name, "");
				}
				company_dao.upComProName(Integer.toString(list_com.get(j).getCom_idx()), com_pro_name);
			}

		}

		makeup_dao.delMakeup(query);

		// 기존 파일 지움
		for (int i = 0; i < pro_idx_arr.length; i++) {
			File directory = new File("/plan/weddingQ_product/makeup/" + pro_idx_arr[i]);
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					Utils.fileDelete(directory + "/" + file.getName());
				}
			}
		}
		// 기존 파일 지움

		return mav;
	}

	@RequestMapping("/info_suit.pnp")
	public ModelAndView info_suit(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/info_suit");

		String query = "1";

		String searchAddr = "";
		String searchSubway = "";
		String searchType = "";
		String search_val = "";

		if (!"".equals(request.getParameter("searchAddr")) && request.getParameter("searchAddr") != null) {
			searchAddr = request.getParameter("searchAddr");
			query += " and pro_addr1 like '%" + searchAddr + "%'";
			mav.addObject("searchAddr", searchAddr);
		}
		if (!"".equals(request.getParameter("searchSubway")) && request.getParameter("searchSubway") != null) {
			searchSubway = request.getParameter("searchSubway");
			query += " and (pro_subway1 like '%" + searchSubway + "%' or pro_subway2 like '%" + searchSubway
					+ "%' or pro_subway3 like '%" + searchSubway + "%')";
			mav.addObject("searchSubway", searchSubway);
		}
		if (!"".equals(request.getParameter("searchType")) && request.getParameter("searchType") != null) {
			searchType = request.getParameter("searchType");
			query += " and pro_type like '%" + searchType + "%'";
			mav.addObject("searchType", searchType);
		}
		if (!"".equals(request.getParameter("search_val")) && request.getParameter("search_val") != null) {
			search_val = request.getParameter("search_val");
			query += " and (pro_name like '%" + search_val + "%' or pro_addr1 like '%" + search_val
					+ "%' or pro_com_name like '%" + search_val + "%')";
			mav.addObject("search_val", search_val);
		}

		HttpSession session = request.getSession();
		if (!"root".equals(session.getAttribute("session"))) {
			query += " and pro_com_idx = " + session.getAttribute("com_idx");
		}
		List<Suit_vo> list_size = suit_dao.selList_suit(query);

		int page = 1;
		if (!"".equals(request.getParameter("page")) && request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		int page1 = page * 15 - 15;
		int ten = page - (page % 10);

		if (page % 10 == 0) // 10, 20페이지 눌렀는데 넘어가면 안되니까~ 처리!
		{
			mav.addObject("list_size1", ten - 9);
			mav.addObject("list_size2", ten);
			if (ten < list_size.size() / 15 + 1) {
				mav.addObject("next", "next");
			} else {
				mav.addObject("next", "done");
			}
		} else {
			mav.addObject("list_size1", ten + 1);
			if (ten + 10 > list_size.size() / 15 + 1) {
				mav.addObject("list_size2", list_size.size() / 15 + 1);
				mav.addObject("next", "done");
			} else {
				mav.addObject("list_size2", ten + 10);
				mav.addObject("next", "next");
			}

		}
		mav.addObject("list_size", list_size.size() / 15 + 1);
		mav.addObject("page", page);

		String sort_val = "pro_idx";

		String sort_type = "";
		if (!"".equals(request.getParameter("sort_val")) && request.getParameter("sort_val") != null) {
			sort_type = request.getParameter("sort_type");
			sort_val = request.getParameter("sort_val");
			query += " order by " + sort_val + " " + sort_type;
		}

		query += " limit " + page1 + ",15";

		List<Suit_vo> list = suit_dao.selList_suit(query);

		mav.addObject("list", list);
		mav.addObject("max_page", list_size.size());
		mav.addObject("sort_type", sort_type);
		mav.addObject("sort_val", sort_val);

		return mav;
	}

	@RequestMapping("/insert_suit.pnp")
	public ModelAndView insert_suit(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insert_suit");

		return mav;
	}

	@RequestMapping("/insert_suit_output.pnp")
	public ModelAndView insert_suit_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insert_suit_output");

		try {
			// **************************** idx 번호 가져옴 ************************** //
			List<Suit_vo> proIdx = suit_dao.selIdx_suit();
			int pro_idx;
			if (proIdx.size() == 0) {
				pro_idx = 1;
			} else {
				pro_idx = proIdx.get(0).getPro_idx() + 1;
			}
			// **************************** idx 번호 가져옴 ************************** //

			String savePath = "/plan/weddingQ_product/suit/" + pro_idx + "/";
			int sizeLimit = 1024 * 1024 * 1000; // 1000메가..
			File dir = new File(savePath);
			if (!dir.exists()) { // 디렉토리가 존재하지 않으면
				dir.mkdirs(); // 디렉토리 생성.!
			}

			MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "utf-8",
					new DefaultFileRenamePolicy());

			String pro_sort = multi.getParameter("pro_sort");
			String pro_com_idx = multi.getParameter("pro_com_idx");
			String pro_com_name = multi.getParameter("com_name");
			String pro_category = multi.getParameter("pro_category");

			String pro_name = multi.getParameter("pro_name");
			String pro_homepage = multi.getParameter("pro_homepage");
			String pro_tel = multi.getParameter("pro_tel1") + "-" + multi.getParameter("pro_tel2") + "-"
					+ multi.getParameter("pro_tel3");
			String pro_zipcode = multi.getParameter("pro_zipcode");
			String pro_addr1 = multi.getParameter("pro_addr1");
			String pro_addr2 = multi.getParameter("pro_addr2");
			String pro_subway1 = multi.getParameter("pro_subway1") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway1") + "1") + "&&"
					+ multi.getParameter("pro_subway1_3") + "&&" + multi.getParameter("pro_subway1_4");
			String pro_subway2 = multi.getParameter("pro_subway2") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway2") + "2") + "&&"
					+ multi.getParameter("pro_subway2_3") + "&&" + multi.getParameter("pro_subway2_4");
			String pro_subway3 = multi.getParameter("pro_subway3") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway3") + "3") + "&&"
					+ multi.getParameter("pro_subway3_3") + "&&" + multi.getParameter("pro_subway3_4");
			String pro_bus = multi.getParameter("pro_bus").replace("\r\n", "<br>").replace("\"", "＂").replace("\'",
					"’");
			String pro_intro1 = multi.getParameter("pro_intro1").replace("\r\n", "  <br>  ").replace("\"", "＂")
					.replace("\'", "’");
			String pro_intro2 = multi.getParameter("pro_intro2").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");

			String pro_type = "";

			if ("on".equals(multi.getParameter("맞춤"))) {
				pro_type += "&&맞춤";
			}
			if ("on".equals(multi.getParameter("대여"))) {
				pro_type += "&&대여";
			}
			if ("on".equals(multi.getParameter("맞춤시 대여서비스"))) {
				pro_type += "&&맞춤시 대여서비스";
			}
			if ("on".equals(multi.getParameter("맞춤시 턱시도 리폼"))) {
				pro_type += "&&맞춤시 턱시도 리폼";
			}

			if (pro_type.length() > 2) {
				pro_type = pro_type.substring(2, pro_type.length());
			}

			String pro_talk_time = multi.getParameter("pro_talk_time1") + ":" + multi.getParameter("pro_talk_time2")
					+ "~" + multi.getParameter("pro_talk_time3") + ":" + multi.getParameter("pro_talk_time4");

			String pro_holiday = multi.getParameter("pro_holiday");
			String pro_parking = multi.getParameter("pro_parking").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");

			int pro_service_cnt = Integer.parseInt(multi.getParameter("pro_service_cnt"));
			String pro_service = "";
			for (int i = 1; i <= pro_service_cnt; i++) {
				pro_service += multi.getParameter("pro_service_" + i) + "&&";
			}
			pro_service = pro_service.substring(0, pro_service.length() - 2);

			int pro_composition_cnt = Integer.parseInt(multi.getParameter("pro_composition_cnt"));
			String pro_composition = "";
			String pro_composition_charge = "";
			String pro_composition_price = "";
			for (int i = 1; i <= pro_composition_cnt; i++) {
				pro_composition += multi.getParameter("pro_composition_" + i) + "&&";
				pro_composition_charge += multi.getParameter("pro_composition_charge_" + i) + "&&";
				pro_composition_price += multi.getParameter("pro_composition_price_" + i) + "&&";
			}
			pro_composition = pro_composition.substring(0, pro_composition.length() - 2);
			pro_composition_charge = pro_composition_charge.substring(0, pro_composition_charge.length() - 2);
			pro_composition_price = pro_composition_price.substring(0, pro_composition_price.length() - 2);

			int pro_add_cnt = Integer.parseInt(multi.getParameter("pro_add_cnt"));
			String pro_add_name = "";
			String pro_add_pay = "";
			for (int i = 1; i <= pro_add_cnt; i++) {
				pro_add_name += multi.getParameter("pro_add_name_" + i) + "&&";
				pro_add_pay += multi.getParameter("pro_add_pay_" + i) + "&&";
			}
			pro_add_name = pro_add_name.substring(0, pro_add_name.length() - 2);
			pro_add_pay = pro_add_pay.substring(0, pro_add_pay.length() - 2);

			int pro_event_cnt = Integer.parseInt(multi.getParameter("pro_event_cnt"));
			String pro_event = "";
			for (int i = 1; i <= pro_event_cnt; i++) {
				if ("on".equals(multi.getParameter("pro_event_bold_" + i))) {
					pro_event += "(bold)";
				}
				pro_event += multi.getParameter("pro_event_" + i) + "&&";
			}
			pro_event = pro_event.substring(0, pro_event.length() - 2);

			String pro_pay_engine = multi.getParameter("pro_pay_engine");
			String pro_pay_number = multi.getParameter("pro_pay_number");
			String pro_pay_name = multi.getParameter("pro_pay_name");

			String pro_cashback = multi.getParameter("pro_cashback");
			suit_dao.insSuit(pro_idx, pro_sort, pro_com_idx, pro_com_name, pro_category, pro_name, pro_homepage,
					pro_tel, pro_zipcode, pro_addr1, pro_addr2, pro_subway1, pro_subway2, pro_subway3, pro_bus,
					pro_intro1, pro_intro2, pro_type, pro_talk_time, pro_holiday, pro_parking, pro_service,
					pro_composition, pro_composition_charge, pro_composition_price, pro_add_name, pro_add_pay,
					pro_event, pro_cashback, pro_pay_engine, pro_pay_number, pro_pay_name);

			// 상품명 기입
			String query = "com_idx = '" + pro_com_idx + "'";
			List<Company_vo> list = company_dao.selList_company(query);

			String com_pro_name = list.get(0).getCom_pro_name();
			if ("".equals(com_pro_name) || "null".equals(com_pro_name) || com_pro_name == null) {
				com_pro_name = pro_name;
			} else {
				com_pro_name += "&&" + pro_name;
			}
			company_dao.upComProName(pro_com_idx, com_pro_name);
			// 상품명 기입

		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
		}
		return mav;
	}

	@RequestMapping("/delete_suit.pnp")
	public ModelAndView delete_suit(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/delete_suit");

		String query = "1";

		String pro_idx = (request.getParameter("del_idx")).substring(0, (request.getParameter("del_idx")).length() - 1);
		String pro_idx_arr[] = pro_idx.split(",");

		query += " and pro_idx in (" + pro_idx + ")";

		List<Suit_vo> list = suit_dao.selList_suit(query);
		for (int i = 0; i < list.size(); i++) {
			String pro_name = list.get(i).getPro_name();
			String query3 = "1 and com_pro_name like '%" + pro_name + "%'";
			List<Company_vo> list_com = company_dao.selList_company(query3);

			for (int j = 0; j < list_com.size(); j++) {
				String com_pro_name = list_com.get(j).getCom_pro_name();
				if (com_pro_name.indexOf("&&" + pro_name) > -1) {
					com_pro_name = com_pro_name.replace("&&" + pro_name, "");
				} else if (com_pro_name.indexOf(pro_name + "&&") > -1) {
					com_pro_name = com_pro_name.replace(pro_name + "&&", "");
				} else if (com_pro_name.indexOf(pro_name) > -1) {
					com_pro_name = com_pro_name.replace(pro_name, "");
				}
				company_dao.upComProName(Integer.toString(list_com.get(j).getCom_idx()), com_pro_name);
			}

		}

		suit_dao.delSuit(query);

		// 기존 파일 지움
		for (int i = 0; i < pro_idx_arr.length; i++) {
			File directory = new File("/plan/weddingQ_product/suit/" + pro_idx_arr[i]);
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					Utils.fileDelete(directory + "/" + file.getName());
				}
			}
		}
		// 기존 파일 지움

		return mav;
	}

	@RequestMapping("/info_korea.pnp")
	public ModelAndView info_korea(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/info_korea");

		String query = "1";

		String searchAddr = "";
		String searchSubway = "";
		String searchType = "";
		String search_val = "";

		if (!"".equals(request.getParameter("searchAddr")) && request.getParameter("searchAddr") != null) {
			searchAddr = request.getParameter("searchAddr");
			query += " and pro_addr1 like '%" + searchAddr + "%'";
			mav.addObject("searchAddr", searchAddr);
		}
		if (!"".equals(request.getParameter("searchSubway")) && request.getParameter("searchSubway") != null) {
			searchSubway = request.getParameter("searchSubway");
			query += " and (pro_subway1 like '%" + searchSubway + "%' or pro_subway2 like '%" + searchSubway
					+ "%' or pro_subway3 like '%" + searchSubway + "%')";
			mav.addObject("searchSubway", searchSubway);
		}
		if (!"".equals(request.getParameter("searchType")) && request.getParameter("searchType") != null) {
			searchType = request.getParameter("searchType");
			query += " and pro_type like '%" + searchType + "%'";
			mav.addObject("searchType", searchType);
		}
		if (!"".equals(request.getParameter("search_val")) && request.getParameter("search_val") != null) {
			search_val = request.getParameter("search_val");
			query += " and (pro_name like '%" + search_val + "%' or pro_addr1 like '%" + search_val
					+ "%' or pro_com_name like '%" + search_val + "%')";
			mav.addObject("search_val", search_val);
		}

		HttpSession session = request.getSession();
		if (!"root".equals(session.getAttribute("session"))) {
			query += " and pro_com_idx = " + session.getAttribute("com_idx");
		}
		List<Korea_vo> list_size = korea_dao.selList_korea(query);

		int page = 1;
		if (!"".equals(request.getParameter("page")) && request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		int page1 = page * 15 - 15;
		int ten = page - (page % 10);

		if (page % 10 == 0) // 10, 20페이지 눌렀는데 넘어가면 안되니까~ 처리!
		{
			mav.addObject("list_size1", ten - 9);
			mav.addObject("list_size2", ten);
			if (ten < list_size.size() / 15 + 1) {
				mav.addObject("next", "next");
			} else {
				mav.addObject("next", "done");
			}
		} else {
			mav.addObject("list_size1", ten + 1);
			if (ten + 10 > list_size.size() / 15 + 1) {
				mav.addObject("list_size2", list_size.size() / 15 + 1);
				mav.addObject("next", "done");
			} else {
				mav.addObject("list_size2", ten + 10);
				mav.addObject("next", "next");
			}

		}
		mav.addObject("list_size", list_size.size() / 15 + 1);
		mav.addObject("page", page);

		String sort_val = "pro_idx";

		String sort_type = "";
		if (!"".equals(request.getParameter("sort_val")) && request.getParameter("sort_val") != null) {
			sort_type = request.getParameter("sort_type");
			sort_val = request.getParameter("sort_val");
			query += " order by " + sort_val + " " + sort_type;
		}

		query += " limit " + page1 + ",15";

		List<Korea_vo> list = korea_dao.selList_korea(query);

		mav.addObject("list", list);
		mav.addObject("max_page", list_size.size());
		mav.addObject("sort_type", sort_type);
		mav.addObject("sort_val", sort_val);

		return mav;
	}

	@RequestMapping("/insert_korea.pnp")
	public ModelAndView insert_korea(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insert_korea");

		return mav;
	}

	@RequestMapping("/insert_korea_output.pnp")
	public ModelAndView insert_korea_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insert_korea_output");

		try {
			// **************************** idx 번호 가져옴 ************************** //
			List<Korea_vo> proIdx = korea_dao.selIdx_korea();
			int pro_idx;
			if (proIdx.size() == 0) {
				pro_idx = 1;
			} else {
				pro_idx = proIdx.get(0).getPro_idx() + 1;
			}
			// **************************** idx 번호 가져옴 ************************** //

			String savePath = "/plan/weddingQ_product/korea/" + pro_idx + "/";
			int sizeLimit = 1024 * 1024 * 1000; // 1000메가..
			File dir = new File(savePath);
			if (!dir.exists()) { // 디렉토리가 존재하지 않으면
				dir.mkdirs(); // 디렉토리 생성.!
			}

			MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "utf-8",
					new DefaultFileRenamePolicy());

			String pro_sort = multi.getParameter("pro_sort");
			String pro_com_idx = multi.getParameter("pro_com_idx");
			String pro_com_name = multi.getParameter("com_name");
			String pro_category = multi.getParameter("pro_category");

			String pro_name = multi.getParameter("pro_name");
			String pro_homepage = multi.getParameter("pro_homepage");
			String pro_tel = multi.getParameter("pro_tel1") + "-" + multi.getParameter("pro_tel2") + "-"
					+ multi.getParameter("pro_tel3");
			String pro_zipcode = multi.getParameter("pro_zipcode");
			String pro_addr1 = multi.getParameter("pro_addr1");
			String pro_addr2 = multi.getParameter("pro_addr2");
			String pro_subway1 = multi.getParameter("pro_subway1") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway1") + "1") + "&&"
					+ multi.getParameter("pro_subway1_3") + "&&" + multi.getParameter("pro_subway1_4");
			String pro_subway2 = multi.getParameter("pro_subway2") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway2") + "2") + "&&"
					+ multi.getParameter("pro_subway2_3") + "&&" + multi.getParameter("pro_subway2_4");
			String pro_subway3 = multi.getParameter("pro_subway3") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway3") + "3") + "&&"
					+ multi.getParameter("pro_subway3_3") + "&&" + multi.getParameter("pro_subway3_4");
			String pro_bus = multi.getParameter("pro_bus").replace("\r\n", "<br>").replace("\"", "＂").replace("\'",
					"’");
			String pro_intro1 = multi.getParameter("pro_intro1").replace("\r\n", "  <br>  ").replace("\"", "＂")
					.replace("\'", "’");
			String pro_intro2 = multi.getParameter("pro_intro2").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");

			String pro_type = "";

			if ("on".equals(multi.getParameter("맞춤"))) {
				pro_type += "&&맞춤";
			}
			if ("on".equals(multi.getParameter("대여"))) {
				pro_type += "&&대여";
			}

			if (pro_type.length() > 2) {
				pro_type = pro_type.substring(2, pro_type.length());
			}

			String pro_talk_time = multi.getParameter("pro_talk_time1") + ":" + multi.getParameter("pro_talk_time2")
					+ "~" + multi.getParameter("pro_talk_time3") + ":" + multi.getParameter("pro_talk_time4");

			String pro_holiday = multi.getParameter("pro_holiday");
			String pro_parking = multi.getParameter("pro_parking").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");

			int pro_service_cnt = Integer.parseInt(multi.getParameter("pro_service_cnt"));
			String pro_service = "";
			for (int i = 1; i <= pro_service_cnt; i++) {
				pro_service += multi.getParameter("pro_service_" + i) + "&&";
			}
			pro_service = pro_service.substring(0, pro_service.length() - 2);

			int pro_composition_cnt = Integer.parseInt(multi.getParameter("pro_composition_cnt"));
			String pro_composition = "";
			String pro_composition_charge = "";
			String pro_composition_price = "";
			for (int i = 1; i <= pro_composition_cnt; i++) {
				pro_composition += multi.getParameter("pro_composition_" + i) + "&&";
				pro_composition_charge += multi.getParameter("pro_composition_charge_" + i) + "&&";
				pro_composition_price += multi.getParameter("pro_composition_price_" + i) + "&&";
			}
			pro_composition = pro_composition.substring(0, pro_composition.length() - 2);
			pro_composition_charge = pro_composition_charge.substring(0, pro_composition_charge.length() - 2);
			pro_composition_price = pro_composition_price.substring(0, pro_composition_price.length() - 2);

			int pro_add_cnt = Integer.parseInt(multi.getParameter("pro_add_cnt"));
			String pro_add_name = "";
			String pro_add_pay = "";
			for (int i = 1; i <= pro_add_cnt; i++) {
				pro_add_name += multi.getParameter("pro_add_name_" + i) + "&&";
				pro_add_pay += multi.getParameter("pro_add_pay_" + i) + "&&";
			}
			pro_add_name = pro_add_name.substring(0, pro_add_name.length() - 2);
			pro_add_pay = pro_add_pay.substring(0, pro_add_pay.length() - 2);

			int pro_event_cnt = Integer.parseInt(multi.getParameter("pro_event_cnt"));
			String pro_event = "";
			for (int i = 1; i <= pro_event_cnt; i++) {
				if ("on".equals(multi.getParameter("pro_event_bold_" + i))) {
					pro_event += "(bold)";
				}
				pro_event += multi.getParameter("pro_event_" + i) + "&&";
			}
			pro_event = pro_event.substring(0, pro_event.length() - 2);

			String pro_pay_engine = multi.getParameter("pro_pay_engine");
			String pro_pay_number = multi.getParameter("pro_pay_number");
			String pro_pay_name = multi.getParameter("pro_pay_name");

			String pro_cashback = multi.getParameter("pro_cashback");
			korea_dao.insKorea(pro_idx, pro_sort, pro_com_idx, pro_com_name, pro_category, pro_name, pro_homepage,
					pro_tel, pro_zipcode, pro_addr1, pro_addr2, pro_subway1, pro_subway2, pro_subway3, pro_bus,
					pro_intro1, pro_intro2, pro_type, pro_talk_time, pro_holiday, pro_parking, pro_service,
					pro_composition, pro_composition_charge, pro_composition_price, pro_add_name, pro_add_pay,
					pro_event, pro_cashback, pro_pay_engine, pro_pay_number, pro_pay_name);

			// 상품명 기입
			String query = "com_idx = '" + pro_com_idx + "'";
			List<Company_vo> list = company_dao.selList_company(query);

			String com_pro_name = list.get(0).getCom_pro_name();
			if ("".equals(com_pro_name) || "null".equals(com_pro_name) || com_pro_name == null) {
				com_pro_name = pro_name;
			} else {
				com_pro_name += "&&" + pro_name;
			}
			company_dao.upComProName(pro_com_idx, com_pro_name);
			// 상품명 기입

		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
		}
		return mav;
	}

	@RequestMapping("/delete_korea.pnp")
	public ModelAndView delete_korea(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/delete_korea");

		String query = "1";

		String pro_idx = (request.getParameter("del_idx")).substring(0, (request.getParameter("del_idx")).length() - 1);
		String pro_idx_arr[] = pro_idx.split(",");

		query += " and pro_idx in (" + pro_idx + ")";

		List<Korea_vo> list = korea_dao.selList_korea(query);
		for (int i = 0; i < list.size(); i++) {
			String pro_name = list.get(i).getPro_name();
			String query3 = "1 and com_pro_name like '%" + pro_name + "%'";
			List<Company_vo> list_com = company_dao.selList_company(query3);

			for (int j = 0; j < list_com.size(); j++) {
				String com_pro_name = list_com.get(j).getCom_pro_name();
				if (com_pro_name.indexOf("&&" + pro_name) > -1) {
					com_pro_name = com_pro_name.replace("&&" + pro_name, "");
				} else if (com_pro_name.indexOf(pro_name + "&&") > -1) {
					com_pro_name = com_pro_name.replace(pro_name + "&&", "");
				} else if (com_pro_name.indexOf(pro_name) > -1) {
					com_pro_name = com_pro_name.replace(pro_name, "");
				}
				company_dao.upComProName(Integer.toString(list_com.get(j).getCom_idx()), com_pro_name);
			}

		}

		korea_dao.delKorea(query);

		// 기존 파일 지움
		for (int i = 0; i < pro_idx_arr.length; i++) {
			File directory = new File("/plan/weddingQ_product/korea/" + pro_idx_arr[i]);
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					Utils.fileDelete(directory + "/" + file.getName());
				}
			}
		}
		// 기존 파일 지움

		return mav;
	}

	@RequestMapping("/info_jewelry.pnp")
	public ModelAndView info_jewelry(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/info_jewelry");

		String query = "1";

		String searchAddr = "";
		String searchSubway = "";
		String search_val = "";

		if (!"".equals(request.getParameter("searchAddr")) && request.getParameter("searchAddr") != null) {
			searchAddr = request.getParameter("searchAddr");
			query += " and pro_addr1 like '%" + searchAddr + "%'";
			mav.addObject("searchAddr", searchAddr);
		}
		if (!"".equals(request.getParameter("searchSubway")) && request.getParameter("searchSubway") != null) {
			searchSubway = request.getParameter("searchSubway");
			query += " and (pro_subway1 like '%" + searchSubway + "%' or pro_subway2 like '%" + searchSubway
					+ "%' or pro_subway3 like '%" + searchSubway + "%')";
			mav.addObject("searchSubway", searchSubway);
		}
		if (!"".equals(request.getParameter("search_val")) && request.getParameter("search_val") != null) {
			search_val = request.getParameter("search_val");
			query += " and (pro_name like '%" + search_val + "%' or pro_addr1 like '%" + search_val
					+ "%' or pro_com_name like '%" + search_val + "%')";
			mav.addObject("search_val", search_val);
		}

		HttpSession session = request.getSession();
		if (!"root".equals(session.getAttribute("session"))) {
			query += " and pro_com_idx = " + session.getAttribute("com_idx");
		}
		List<Jewelry_vo> list_size = jewelry_dao.selList_jewelry(query);

		int page = 1;
		if (!"".equals(request.getParameter("page")) && request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		int page1 = page * 15 - 15;
		int ten = page - (page % 10);

		if (page % 10 == 0) // 10, 20페이지 눌렀는데 넘어가면 안되니까~ 처리!
		{
			mav.addObject("list_size1", ten - 9);
			mav.addObject("list_size2", ten);
			if (ten < list_size.size() / 15 + 1) {
				mav.addObject("next", "next");
			} else {
				mav.addObject("next", "done");
			}
		} else {
			mav.addObject("list_size1", ten + 1);
			if (ten + 10 > list_size.size() / 15 + 1) {
				mav.addObject("list_size2", list_size.size() / 15 + 1);
				mav.addObject("next", "done");
			} else {
				mav.addObject("list_size2", ten + 10);
				mav.addObject("next", "next");
			}

		}
		mav.addObject("list_size", list_size.size() / 15 + 1);
		mav.addObject("page", page);

		String sort_val = "pro_idx";

		String sort_type = "";
		if (!"".equals(request.getParameter("sort_val")) && request.getParameter("sort_val") != null) {
			sort_type = request.getParameter("sort_type");
			sort_val = request.getParameter("sort_val");
			query += " order by " + sort_val + " " + sort_type;
		}

		query += " limit " + page1 + ",15";

		List<Jewelry_vo> list = jewelry_dao.selList_jewelry(query);

		mav.addObject("list", list);
		mav.addObject("max_page", list_size.size());
		mav.addObject("sort_type", sort_type);
		mav.addObject("sort_val", sort_val);

		return mav;
	}

	@RequestMapping("/insert_jewelry.pnp")
	public ModelAndView insert_jewelry(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insert_jewelry");

		return mav;
	}

	@RequestMapping("/insert_jewelry_output.pnp")
	public ModelAndView insert_jewelry_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insert_jewelry_output");

		try {
			// **************************** idx 번호 가져옴 ************************** //
			List<Jewelry_vo> proIdx = jewelry_dao.selIdx_jewelry();
			int pro_idx;
			if (proIdx.size() == 0) {
				pro_idx = 1;
			} else {
				pro_idx = proIdx.get(0).getPro_idx() + 1;
			}
			// **************************** idx 번호 가져옴 ************************** //

			String savePath = "/plan/weddingQ_product/jewelry/" + pro_idx + "/";
			int sizeLimit = 1024 * 1024 * 1000; // 1000메가..
			File dir = new File(savePath);
			if (!dir.exists()) { // 디렉토리가 존재하지 않으면
				dir.mkdirs(); // 디렉토리 생성.!
			}

			MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "utf-8",
					new DefaultFileRenamePolicy());

			String pro_sort = multi.getParameter("pro_sort");
			String pro_com_idx = multi.getParameter("pro_com_idx");
			String pro_com_name = multi.getParameter("com_name");
			String pro_category = multi.getParameter("pro_category");

			String pro_name = multi.getParameter("pro_name");
			String pro_homepage = multi.getParameter("pro_homepage");
			String pro_tel = multi.getParameter("pro_tel1") + "-" + multi.getParameter("pro_tel2") + "-"
					+ multi.getParameter("pro_tel3");
			String pro_zipcode = multi.getParameter("pro_zipcode");
			String pro_addr1 = multi.getParameter("pro_addr1");
			String pro_addr2 = multi.getParameter("pro_addr2");
			String pro_subway1 = multi.getParameter("pro_subway1") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway1") + "1") + "&&"
					+ multi.getParameter("pro_subway1_3") + "&&" + multi.getParameter("pro_subway1_4");
			String pro_subway2 = multi.getParameter("pro_subway2") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway2") + "2") + "&&"
					+ multi.getParameter("pro_subway2_3") + "&&" + multi.getParameter("pro_subway2_4");
			String pro_subway3 = multi.getParameter("pro_subway3") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway3") + "3") + "&&"
					+ multi.getParameter("pro_subway3_3") + "&&" + multi.getParameter("pro_subway3_4");
			String pro_bus = multi.getParameter("pro_bus").replace("\r\n", "<br>").replace("\"", "＂").replace("\'",
					"’");
			String pro_intro1 = multi.getParameter("pro_intro1").replace("\r\n", "  <br>  ").replace("\"", "＂")
					.replace("\'", "’");
			String pro_intro2 = multi.getParameter("pro_intro2").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");

			String pro_talk_time = multi.getParameter("pro_talk_time1") + ":" + multi.getParameter("pro_talk_time2")
					+ "~" + multi.getParameter("pro_talk_time3") + ":" + multi.getParameter("pro_talk_time4");

			String pro_holiday = multi.getParameter("pro_holiday");
			String pro_parking = multi.getParameter("pro_parking").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");

			int pro_service_cnt = Integer.parseInt(multi.getParameter("pro_service_cnt"));
			String pro_service = "";
			for (int i = 1; i <= pro_service_cnt; i++) {
				pro_service += multi.getParameter("pro_service_" + i) + "&&";
			}
			pro_service = pro_service.substring(0, pro_service.length() - 2);

			int pro_composition_cnt = Integer.parseInt(multi.getParameter("pro_composition_cnt"));
			String pro_composition = "";
			String pro_composition_charge = "";
			String pro_composition_price = "";
			for (int i = 1; i <= pro_composition_cnt; i++) {
				pro_composition += multi.getParameter("pro_composition_" + i) + "&&";
				pro_composition_charge += multi.getParameter("pro_composition_charge_" + i) + "&&";
				pro_composition_price += multi.getParameter("pro_composition_price_" + i) + "&&";
			}
			pro_composition = pro_composition.substring(0, pro_composition.length() - 2);
			pro_composition_charge = pro_composition_charge.substring(0, pro_composition_charge.length() - 2);
			pro_composition_price = pro_composition_price.substring(0, pro_composition_price.length() - 2);

			int pro_add_cnt = Integer.parseInt(multi.getParameter("pro_add_cnt"));
			String pro_add_name = "";
			String pro_add_pay = "";
			for (int i = 1; i <= pro_add_cnt; i++) {
				pro_add_name += multi.getParameter("pro_add_name_" + i) + "&&";
				pro_add_pay += multi.getParameter("pro_add_pay_" + i) + "&&";
			}
			pro_add_name = pro_add_name.substring(0, pro_add_name.length() - 2);
			pro_add_pay = pro_add_pay.substring(0, pro_add_pay.length() - 2);

			int pro_event_cnt = Integer.parseInt(multi.getParameter("pro_event_cnt"));
			String pro_event = "";
			for (int i = 1; i <= pro_event_cnt; i++) {
				if ("on".equals(multi.getParameter("pro_event_bold_" + i))) {
					pro_event += "(bold)";
				}
				pro_event += multi.getParameter("pro_event_" + i) + "&&";
			}
			pro_event = pro_event.substring(0, pro_event.length() - 2);

			String pro_pay_engine = multi.getParameter("pro_pay_engine");
			String pro_pay_number = multi.getParameter("pro_pay_number");
			String pro_pay_name = multi.getParameter("pro_pay_name");

			String pro_cashback = multi.getParameter("pro_cashback");
			jewelry_dao.insJewelry(pro_idx, pro_sort, pro_com_idx, pro_com_name, pro_category, pro_name, pro_homepage,
					pro_tel, pro_zipcode, pro_addr1, pro_addr2, pro_subway1, pro_subway2, pro_subway3, pro_bus,
					pro_intro1, pro_intro2, pro_talk_time, pro_holiday, pro_parking, pro_service, pro_composition,
					pro_composition_charge, pro_composition_price, pro_add_name, pro_add_pay, pro_event, pro_cashback,
					pro_pay_engine, pro_pay_number, pro_pay_name);

			// 상품명 기입
			String query = "com_idx = '" + pro_com_idx + "'";
			List<Company_vo> list = company_dao.selList_company(query);

			String com_pro_name = list.get(0).getCom_pro_name();
			if ("".equals(com_pro_name) || "null".equals(com_pro_name) || com_pro_name == null) {
				com_pro_name = pro_name;
			} else {
				com_pro_name += "&&" + pro_name;
			}
			company_dao.upComProName(pro_com_idx, com_pro_name);
			// 상품명 기입

		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
		}
		return mav;
	}

	@RequestMapping("/delete_jewelry.pnp")
	public ModelAndView delete_jewelry(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/delete_jewelry");

		String query = "1";

		String pro_idx = (request.getParameter("del_idx")).substring(0, (request.getParameter("del_idx")).length() - 1);
		String pro_idx_arr[] = pro_idx.split(",");

		query += " and pro_idx in (" + pro_idx + ")";

		List<Jewelry_vo> list = jewelry_dao.selList_jewelry(query);
		for (int i = 0; i < list.size(); i++) {
			String pro_name = list.get(i).getPro_name();
			String query3 = "1 and com_pro_name like '%" + pro_name + "%'";
			List<Company_vo> list_com = company_dao.selList_company(query3);

			for (int j = 0; j < list_com.size(); j++) {
				String com_pro_name = list_com.get(j).getCom_pro_name();
				if (com_pro_name.indexOf("&&" + pro_name) > -1) {
					com_pro_name = com_pro_name.replace("&&" + pro_name, "");
				} else if (com_pro_name.indexOf(pro_name + "&&") > -1) {
					com_pro_name = com_pro_name.replace(pro_name + "&&", "");
				} else if (com_pro_name.indexOf(pro_name) > -1) {
					com_pro_name = com_pro_name.replace(pro_name, "");
				}
				company_dao.upComProName(Integer.toString(list_com.get(j).getCom_idx()), com_pro_name);
			}

		}

		jewelry_dao.delJewelry(query);

		// 기존 파일 지움
		for (int i = 0; i < pro_idx_arr.length; i++) {
			File directory = new File("/plan/weddingQ_product/jewelry/" + pro_idx_arr[i]);
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					Utils.fileDelete(directory + "/" + file.getName());
				}
			}
		}
		// 기존 파일 지움

		return mav;
	}

	@RequestMapping("/info_pb.pnp")
	public ModelAndView info_pb(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/info_pb");

		String query = "1";

		String searchAddr = "";
		String searchSubway = "";
		String searchEat = "";
		String search_val = "";

		if (!"".equals(request.getParameter("searchAddr")) && request.getParameter("searchAddr") != null) {
			searchAddr = request.getParameter("searchAddr");
			query += " and pro_addr1 like '%" + searchAddr + "%'";
			mav.addObject("searchAddr", searchAddr);
		}
		if (!"".equals(request.getParameter("searchSubway")) && request.getParameter("searchSubway") != null) {
			searchSubway = request.getParameter("searchSubway");
			query += " and (pro_subway1 like '%" + searchSubway + "%' or pro_subway2 like '%" + searchSubway
					+ "%' or pro_subway3 like '%" + searchSubway + "%')";
			mav.addObject("searchSubway", searchSubway);
		}
		if ("on".equals(request.getParameter("searchEat"))) {
			query += " and pro_eat = '시식가능'";
			mav.addObject("searchEat", "on");
		}
		if (!"".equals(request.getParameter("search_val")) && request.getParameter("search_val") != null) {
			search_val = request.getParameter("search_val");
			query += " and (pro_name like '%" + search_val + "%' or pro_addr1 like '%" + search_val
					+ "%' or pro_com_name like '%" + search_val + "%')";
			mav.addObject("search_val", search_val);
		}

		HttpSession session = request.getSession();
		if (!"root".equals(session.getAttribute("session"))) {
			query += " and pro_com_idx = " + session.getAttribute("com_idx");
		}
		List<Pb_vo> list_size = pb_dao.selList_pb(query);

		int page = 1;
		if (!"".equals(request.getParameter("page")) && request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		int page1 = page * 15 - 15;
		int ten = page - (page % 10);

		if (page % 10 == 0) // 10, 20페이지 눌렀는데 넘어가면 안되니까~ 처리!
		{
			mav.addObject("list_size1", ten - 9);
			mav.addObject("list_size2", ten);
			if (ten < list_size.size() / 15 + 1) {
				mav.addObject("next", "next");
			} else {
				mav.addObject("next", "done");
			}
		} else {
			mav.addObject("list_size1", ten + 1);
			if (ten + 10 > list_size.size() / 15 + 1) {
				mav.addObject("list_size2", list_size.size() / 15 + 1);
				mav.addObject("next", "done");
			} else {
				mav.addObject("list_size2", ten + 10);
				mav.addObject("next", "next");
			}

		}
		mav.addObject("list_size", list_size.size() / 15 + 1);
		mav.addObject("page", page);

		String sort_val = "pro_idx";

		String sort_type = "";
		if (!"".equals(request.getParameter("sort_val")) && request.getParameter("sort_val") != null) {
			sort_type = request.getParameter("sort_type");
			sort_val = request.getParameter("sort_val");
			query += " order by " + sort_val + " " + sort_type;
		}

		query += " limit " + page1 + ",15";

		List<Pb_vo> list = pb_dao.selList_pb(query);

		mav.addObject("list", list);
		mav.addObject("max_page", list_size.size());
		mav.addObject("sort_type", sort_type);
		mav.addObject("sort_val", sort_val);

		return mav;
	}

	@RequestMapping("/insert_pb.pnp")
	public ModelAndView insert_pb(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insert_pb");

		return mav;
	}

	@RequestMapping("/insert_pb_output.pnp")
	public ModelAndView insert_pb_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insert_pb_output");

		try {
			// **************************** idx 번호 가져옴 ************************** //
			List<Pb_vo> proIdx = pb_dao.selIdx_pb();
			int pro_idx;
			if (proIdx.size() == 0) {
				pro_idx = 1;
			} else {
				pro_idx = proIdx.get(0).getPro_idx() + 1;
			}
			// **************************** idx 번호 가져옴 ************************** //

			String savePath = "/plan/weddingQ_product/pb/" + pro_idx + "/";
			int sizeLimit = 1024 * 1024 * 1000; // 1000메가..
			File dir = new File(savePath);
			if (!dir.exists()) { // 디렉토리가 존재하지 않으면
				dir.mkdirs(); // 디렉토리 생성.!
			}

			MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "utf-8",
					new DefaultFileRenamePolicy());

			String pro_sort = multi.getParameter("pro_sort");
			String pro_com_idx = multi.getParameter("pro_com_idx");
			String pro_com_name = multi.getParameter("com_name");
			String pro_category = multi.getParameter("pro_category");

			String pro_name = multi.getParameter("pro_name");
			String pro_homepage = multi.getParameter("pro_homepage");
			String pro_tel = multi.getParameter("pro_tel1") + "-" + multi.getParameter("pro_tel2") + "-"
					+ multi.getParameter("pro_tel3");
			String pro_zipcode = multi.getParameter("pro_zipcode");
			String pro_addr1 = multi.getParameter("pro_addr1");
			String pro_addr2 = multi.getParameter("pro_addr2");
			String pro_subway1 = multi.getParameter("pro_subway1") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway1") + "1") + "&&"
					+ multi.getParameter("pro_subway1_3") + "&&" + multi.getParameter("pro_subway1_4");
			String pro_subway2 = multi.getParameter("pro_subway2") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway2") + "2") + "&&"
					+ multi.getParameter("pro_subway2_3") + "&&" + multi.getParameter("pro_subway2_4");
			String pro_subway3 = multi.getParameter("pro_subway3") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway3") + "3") + "&&"
					+ multi.getParameter("pro_subway3_3") + "&&" + multi.getParameter("pro_subway3_4");
			String pro_bus = multi.getParameter("pro_bus").replace("\r\n", "<br>").replace("\"", "＂").replace("\'",
					"’");
			String pro_intro1 = multi.getParameter("pro_intro1").replace("\r\n", "  <br>  ").replace("\"", "＂")
					.replace("\'", "’");
			String pro_intro2 = multi.getParameter("pro_intro2").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");

			String pro_eat = "";

			if ("on".equals(multi.getParameter("시식가능"))) {
				pro_eat = "시식가능";
			}

			String pro_talk_time = multi.getParameter("pro_talk_time1") + ":" + multi.getParameter("pro_talk_time2")
					+ "~" + multi.getParameter("pro_talk_time3") + ":" + multi.getParameter("pro_talk_time4");

			String pro_holiday = multi.getParameter("pro_holiday");
			String pro_parking = multi.getParameter("pro_parking").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");

			int pro_service_cnt = Integer.parseInt(multi.getParameter("pro_service_cnt"));
			String pro_service = "";
			for (int i = 1; i <= pro_service_cnt; i++) {
				pro_service += multi.getParameter("pro_service_" + i) + "&&";
			}
			pro_service = pro_service.substring(0, pro_service.length() - 2);

			int pro_composition_cnt = Integer.parseInt(multi.getParameter("pro_composition_cnt"));
			String pro_composition = "";
			String pro_composition_charge = "";
			String pro_composition_price = "";
			for (int i = 1; i <= pro_composition_cnt; i++) {
				pro_composition += multi.getParameter("pro_composition_" + i) + "&&";
				pro_composition_charge += multi.getParameter("pro_composition_charge_" + i) + "&&";
				pro_composition_price += multi.getParameter("pro_composition_price_" + i) + "&&";
			}
			pro_composition = pro_composition.substring(0, pro_composition.length() - 2);
			pro_composition_charge = pro_composition_charge.substring(0, pro_composition_charge.length() - 2);
			pro_composition_price = pro_composition_price.substring(0, pro_composition_price.length() - 2);

			int pro_add_cnt = Integer.parseInt(multi.getParameter("pro_add_cnt"));
			String pro_add_name = "";
			String pro_add_pay = "";
			for (int i = 1; i <= pro_add_cnt; i++) {
				pro_add_name += multi.getParameter("pro_add_name_" + i) + "&&";
				pro_add_pay += multi.getParameter("pro_add_pay_" + i) + "&&";
			}
			pro_add_name = pro_add_name.substring(0, pro_add_name.length() - 2);
			pro_add_pay = pro_add_pay.substring(0, pro_add_pay.length() - 2);

			String pro_pay_engine = multi.getParameter("pro_pay_engine");
			String pro_pay_number = multi.getParameter("pro_pay_number");
			String pro_pay_name = multi.getParameter("pro_pay_name");

			pb_dao.insPb(pro_idx, pro_sort, pro_com_idx, pro_com_name, pro_category, pro_name, pro_homepage, pro_tel,
					pro_zipcode, pro_addr1, pro_addr2, pro_subway1, pro_subway2, pro_subway3, pro_bus, pro_intro1,
					pro_intro2, pro_eat, pro_talk_time, pro_holiday, pro_parking, pro_service, pro_composition,
					pro_composition_charge, pro_composition_price, pro_add_name, pro_add_pay, pro_pay_engine,
					pro_pay_number, pro_pay_name);

			// 상품명 기입
			String query = "com_idx = '" + pro_com_idx + "'";
			List<Company_vo> list = company_dao.selList_company(query);

			String com_pro_name = list.get(0).getCom_pro_name();
			if ("".equals(com_pro_name) || "null".equals(com_pro_name) || com_pro_name == null) {
				com_pro_name = pro_name;
			} else {
				com_pro_name += "&&" + pro_name;
			}
			company_dao.upComProName(pro_com_idx, com_pro_name);
			// 상품명 기입

		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
		}
		return mav;
	}

	@RequestMapping("/delete_pb.pnp")
	public ModelAndView delete_pb(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/delete_pb");

		String query = "1";

		String pro_idx = (request.getParameter("del_idx")).substring(0, (request.getParameter("del_idx")).length() - 1);
		String pro_idx_arr[] = pro_idx.split(",");

		query += " and pro_idx in (" + pro_idx + ")";

		List<Pb_vo> list = pb_dao.selList_pb(query);
		for (int i = 0; i < list.size(); i++) {
			String pro_name = list.get(i).getPro_name();
			String query3 = "1 and com_pro_name like '%" + pro_name + "%'";
			List<Company_vo> list_com = company_dao.selList_company(query3);

			for (int j = 0; j < list_com.size(); j++) {
				String com_pro_name = list_com.get(j).getCom_pro_name();
				if (com_pro_name.indexOf("&&" + pro_name) > -1) {
					com_pro_name = com_pro_name.replace("&&" + pro_name, "");
				} else if (com_pro_name.indexOf(pro_name + "&&") > -1) {
					com_pro_name = com_pro_name.replace(pro_name + "&&", "");
				} else if (com_pro_name.indexOf(pro_name) > -1) {
					com_pro_name = com_pro_name.replace(pro_name, "");
				}
				company_dao.upComProName(Integer.toString(list_com.get(j).getCom_idx()), com_pro_name);
			}

		}

		pb_dao.delPb(query);

		// 기존 파일 지움
		for (int i = 0; i < pro_idx_arr.length; i++) {
			File directory = new File("/plan/weddingQ_product/pb/" + pro_idx_arr[i]);
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					Utils.fileDelete(directory + "/" + file.getName());
				}
			}
		}
		// 기존 파일 지움

		return mav;
	}

	@RequestMapping("/detail_company.pnp")
	public ModelAndView detail_company(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/detail_company");

		String com_idx = request.getParameter("idx");

		String query = "1 and com_idx = '" + com_idx + "'";
		List<Company_vo> list = company_dao.selList_company(query);

		mav.addObject("com_idx", list.get(0).getCom_idx());
		mav.addObject("com_id", list.get(0).getCom_id());
		mav.addObject("com_pw", list.get(0).getCom_pw());
		mav.addObject("com_persons", list.get(0).getCom_persons());
		mav.addObject("com_persons_tel", list.get(0).getCom_persons_tel());
		mav.addObject("com_category", list.get(0).getCom_category());
		mav.addObject("com_name", list.get(0).getCom_name());
		mav.addObject("com_ceo", list.get(0).getCom_ceo());
		mav.addObject("com_number", list.get(0).getCom_number());
		mav.addObject("com_condition", list.get(0).getCom_condition());
		mav.addObject("com_type", list.get(0).getCom_type());
		mav.addObject("com_tel", list.get(0).getCom_tel());
		mav.addObject("com_fax", list.get(0).getCom_fax());
		mav.addObject("com_email", list.get(0).getCom_email());
		mav.addObject("com_homepage", list.get(0).getCom_homepage());
		mav.addObject("com_zipcode", list.get(0).getCom_zipcode());
		mav.addObject("com_addr1", list.get(0).getCom_addr1());
		mav.addObject("com_addr2", list.get(0).getCom_addr2());
		mav.addObject("com_subway1", list.get(0).getCom_subway1());
		mav.addObject("com_subway2", list.get(0).getCom_subway2());
		mav.addObject("com_subway3", list.get(0).getCom_subway3());
		mav.addObject("com_bus", list.get(0).getCom_bus());
		mav.addObject("com_pay_engine", list.get(0).getCom_pay_engine());
		mav.addObject("com_pay_number", list.get(0).getCom_pay_number());
		mav.addObject("com_pay_name", list.get(0).getCom_pay_name());

		String zipFilePath = "/plan/weddingQ_product/company/" + list.get(0).getCom_idx();
		String zipFileName = "/plan/weddingQ_product/company/" + list.get(0).getCom_idx() + "/company_"
				+ list.get(0).getCom_idx() + ".zip";
		String isFile = "f";
		try {
			// 기존 압축파일 지움
			File directory = new File("/plan/weddingQ_product/company/" + list.get(0).getCom_idx());
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					isFile = "t";
					if (file.isFile() && (file.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory + "/" + file.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile)) {
				Utils.createZip(zipFilePath, zipFileName);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile", isFile);

		return mav;
	}

	@RequestMapping("/detail_hall.pnp")
	public ModelAndView detail_hall(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/detail_hall");

		String pro_idx = request.getParameter("idx");

		String query = "1 and pro_idx = '" + pro_idx + "'";
		List<Hall_vo> list = hall_dao.selList_hall(query);

		mav.addObject("pro_idx", list.get(0).getPro_idx());
		mav.addObject("pro_sort", list.get(0).getPro_sort());
		mav.addObject("pro_com_idx", list.get(0).getPro_com_idx());
		mav.addObject("pro_com_name", list.get(0).getPro_com_name());
		mav.addObject("pro_category", list.get(0).getPro_category());
		mav.addObject("pro_name", list.get(0).getPro_name());
		mav.addObject("pro_homepage", list.get(0).getPro_homepage());
		mav.addObject("pro_tel", list.get(0).getPro_tel());
		mav.addObject("pro_zipcode", list.get(0).getPro_zipcode());
		mav.addObject("pro_addr1", list.get(0).getPro_addr1());
		mav.addObject("pro_addr2", list.get(0).getPro_addr2());
		mav.addObject("pro_subway1", list.get(0).getPro_subway1());
		mav.addObject("pro_subway2", list.get(0).getPro_subway2());
		mav.addObject("pro_subway3", list.get(0).getPro_subway3());
		mav.addObject("pro_bus", list.get(0).getPro_bus());
		mav.addObject("pro_intro1", list.get(0).getPro_intro1());
		mav.addObject("pro_intro2", list.get(0).getPro_intro2());
		mav.addObject("pro_type", list.get(0).getPro_type());
		mav.addObject("pro_wedding_type", list.get(0).getPro_wedding_type());
		mav.addObject("pro_wedding_time", list.get(0).getPro_wedding_time());
		mav.addObject("pro_hall_seat", list.get(0).getPro_hall_seat());
		mav.addObject("pro_party_seat", list.get(0).getPro_party_seat());
		mav.addObject("pro_person", list.get(0).getPro_person());
		mav.addObject("pro_parking", list.get(0).getPro_parking());
		mav.addObject("pro_talk_time", list.get(0).getPro_talk_time());
		mav.addObject("pro_menu", list.get(0).getPro_menu());
		mav.addObject("pro_eat_pay", list.get(0).getPro_eat_pay());
		mav.addObject("pro_other_pay", list.get(0).getPro_other_pay());
		mav.addObject("pro_rent_pay", list.get(0).getPro_rent_pay());
		mav.addObject("pro_basic_option", list.get(0).getPro_basic_option());
		mav.addObject("pro_essential_option", list.get(0).getPro_essential_option());
		mav.addObject("pro_essential_option_pay", list.get(0).getPro_essential_option_pay());
		mav.addObject("pro_menu_type", list.get(0).getPro_menu_type());
		mav.addObject("pro_menu_name", list.get(0).getPro_menu_name());
		mav.addObject("pro_menu_pay", list.get(0).getPro_menu_pay());
		mav.addObject("pro_charge1", list.get(0).getPro_charge1());
		mav.addObject("pro_charge2", list.get(0).getPro_charge2());
		mav.addObject("pro_charge3", list.get(0).getPro_charge3());

		String zipFilePath = "/plan/weddingQ_product/hall/" + list.get(0).getPro_idx();
		String zipFileName = "/plan/weddingQ_product/hall/" + list.get(0).getPro_idx() + "/hall_"
				+ list.get(0).getPro_idx() + ".zip";
		String isFile = "f";
		try {
			// 기존 압축파일 지움
			File directory = new File("/plan/weddingQ_product/hall/" + list.get(0).getPro_idx());
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					isFile = "t";
					if (file.isFile() && (file.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory + "/" + file.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile)) {
				Utils.createZip(zipFilePath, zipFileName);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile", isFile);

		String zipFilePath2 = "/plan/weddingQ_sample/hall/" + list.get(0).getPro_idx();
		String zipFileName2 = "/plan/weddingQ_sample/hall/" + list.get(0).getPro_idx() + "/hall_"
				+ list.get(0).getPro_idx() + ".zip";
		String isFile2 = "f";
		try {
			// 기존 압축파일 지움
			File directory2 = new File("/plan/weddingQ_sample/hall/" + list.get(0).getPro_idx());
			File[] files2 = directory2.listFiles();
			if (files2 != null) {
				for (File file2 : files2) {
					isFile2 = "t";
					if (file2.isFile() && (file2.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory2 + "/" + file2.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile2)) {
				Utils.createZip(zipFilePath2, zipFileName2);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile2", isFile2);

		return mav;
	}

	@RequestMapping("/detail_studio.pnp")
	public ModelAndView detail_studio(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/detail_studio");

		String pro_idx = request.getParameter("idx");

		String query = "1 and pro_idx = '" + pro_idx + "'";
		List<Studio_vo> list = studio_dao.selList_studio(query);

		mav.addObject("pro_idx", list.get(0).getPro_idx());
		mav.addObject("pro_sort", list.get(0).getPro_sort());
		mav.addObject("pro_com_idx", list.get(0).getPro_com_idx());
		mav.addObject("pro_com_name", list.get(0).getPro_com_name());
		mav.addObject("pro_category", list.get(0).getPro_category());
		mav.addObject("pro_name", list.get(0).getPro_name());
		mav.addObject("pro_homepage", list.get(0).getPro_homepage());
		mav.addObject("pro_tel", list.get(0).getPro_tel());
		mav.addObject("pro_zipcode", list.get(0).getPro_zipcode());
		mav.addObject("pro_addr1", list.get(0).getPro_addr1());
		mav.addObject("pro_addr2", list.get(0).getPro_addr2());
		mav.addObject("pro_subway1", list.get(0).getPro_subway1());
		mav.addObject("pro_subway2", list.get(0).getPro_subway2());
		mav.addObject("pro_subway3", list.get(0).getPro_subway3());
		mav.addObject("pro_bus", list.get(0).getPro_bus());
		mav.addObject("pro_intro1", list.get(0).getPro_intro1());
		mav.addObject("pro_intro2", list.get(0).getPro_intro2());
		mav.addObject("pro_type", list.get(0).getPro_type());
		mav.addObject("pro_clothes", list.get(0).getPro_clothes());
		mav.addObject("pro_props", list.get(0).getPro_props());
		mav.addObject("pro_play_time", list.get(0).getPro_play_time());
		mav.addObject("pro_photo_time", list.get(0).getPro_photo_time());
		mav.addObject("pro_talk_time", list.get(0).getPro_talk_time());
		mav.addObject("pro_holiday", list.get(0).getPro_holiday());
		mav.addObject("pro_parking", list.get(0).getPro_parking());
		mav.addObject("pro_concept1", list.get(0).getPro_concept1());
		mav.addObject("pro_concept2", list.get(0).getPro_concept2());
		mav.addObject("pro_composition", list.get(0).getPro_composition());
		mav.addObject("pro_composition_pay", list.get(0).getPro_composition_pay());
		mav.addObject("pro_composition_charge", list.get(0).getPro_composition_charge());
		mav.addObject("pro_composition_price", list.get(0).getPro_composition_price());
		mav.addObject("pro_composition_dc", list.get(0).getPro_composition_dc());
		mav.addObject("pro_sdm_pay", list.get(0).getPro_sdm_pay());
		mav.addObject("pro_add_name", list.get(0).getPro_add_name());
		mav.addObject("pro_add_pay", list.get(0).getPro_add_pay());
		mav.addObject("pro_event", list.get(0).getPro_event());
		mav.addObject("pro_pay_engine", list.get(0).getPro_pay_engine());
		mav.addObject("pro_pay_number", list.get(0).getPro_pay_number());
		mav.addObject("pro_pay_name", list.get(0).getPro_pay_name());
		mav.addObject("pro_change_date", list.get(0).getPro_change_date());
		mav.addObject("pro_sorry_pay", list.get(0).getPro_sorry_pay());

		String zipFilePath = "/plan/weddingQ_product/studio/" + list.get(0).getPro_idx();
		String zipFileName = "/plan/weddingQ_product/studio/" + list.get(0).getPro_idx() + "/studio_"
				+ list.get(0).getPro_idx() + ".zip";
		String isFile = "f";
		try {
			// 기존 압축파일 지움
			File directory = new File("/plan/weddingQ_product/studio/" + list.get(0).getPro_idx());
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					isFile = "t";
					if (file.isFile() && (file.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory + "/" + file.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile)) {
				Utils.createZip(zipFilePath, zipFileName);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile", isFile);

		String zipFilePath2 = "/plan/weddingQ_sample/studio/" + list.get(0).getPro_idx();
		String zipFileName2 = "/plan/weddingQ_sample/studio/" + list.get(0).getPro_idx() + "/studio_"
				+ list.get(0).getPro_idx() + ".zip";
		String isFile2 = "f";
		try {
			// 기존 압축파일 지움
			File directory2 = new File("/plan/weddingQ_sample/studio/" + list.get(0).getPro_idx());
			File[] files2 = directory2.listFiles();
			if (files2 != null) {
				for (File file2 : files2) {
					isFile2 = "t";
					if (file2.isFile() && (file2.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory2 + "/" + file2.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile2)) {
				Utils.createZip(zipFilePath2, zipFileName2);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile2", isFile2);

		return mav;
	}

	@RequestMapping("/detail_dress.pnp")
	public ModelAndView detail_dress(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/detail_dress");

		String pro_idx = request.getParameter("idx");

		String query = "1 and pro_idx = '" + pro_idx + "'";
		List<Dress_vo> list = dress_dao.selList_dress(query);

		mav.addObject("pro_idx", list.get(0).getPro_idx());
		mav.addObject("pro_sort", list.get(0).getPro_sort());
		mav.addObject("pro_com_idx", list.get(0).getPro_com_idx());
		mav.addObject("pro_com_name", list.get(0).getPro_com_name());
		mav.addObject("pro_category", list.get(0).getPro_category());
		mav.addObject("pro_name", list.get(0).getPro_name());
		mav.addObject("pro_homepage", list.get(0).getPro_homepage());
		mav.addObject("pro_tel", list.get(0).getPro_tel());
		mav.addObject("pro_zipcode", list.get(0).getPro_zipcode());
		mav.addObject("pro_addr1", list.get(0).getPro_addr1());
		mav.addObject("pro_addr2", list.get(0).getPro_addr2());
		mav.addObject("pro_subway1", list.get(0).getPro_subway1());
		mav.addObject("pro_subway2", list.get(0).getPro_subway2());
		mav.addObject("pro_subway3", list.get(0).getPro_subway3());
		mav.addObject("pro_bus", list.get(0).getPro_bus());
		mav.addObject("pro_intro1", list.get(0).getPro_intro1());
		mav.addObject("pro_intro2", list.get(0).getPro_intro2());
		mav.addObject("pro_brand", list.get(0).getPro_brand());
		mav.addObject("pro_type", list.get(0).getPro_type());
		mav.addObject("pro_talk_time", list.get(0).getPro_talk_time());
		mav.addObject("pro_holiday", list.get(0).getPro_holiday());
		mav.addObject("pro_parking", list.get(0).getPro_parking());
		mav.addObject("pro_composition", list.get(0).getPro_composition());
		mav.addObject("pro_composition_pay", list.get(0).getPro_composition_pay());
		mav.addObject("pro_composition_charge", list.get(0).getPro_composition_charge());
		mav.addObject("pro_composition_price", list.get(0).getPro_composition_price());
		mav.addObject("pro_composition_dc", list.get(0).getPro_composition_dc());
		mav.addObject("pro_sdm_pay", list.get(0).getPro_sdm_pay());
		mav.addObject("pro_add_name", list.get(0).getPro_add_name());
		mav.addObject("pro_add_pay", list.get(0).getPro_add_pay());
		mav.addObject("pro_event", list.get(0).getPro_event());
		mav.addObject("pro_pay_engine", list.get(0).getPro_pay_engine());
		mav.addObject("pro_pay_number", list.get(0).getPro_pay_number());
		mav.addObject("pro_pay_name", list.get(0).getPro_pay_name());
		mav.addObject("pro_change_date", list.get(0).getPro_change_date());
		mav.addObject("pro_sorry_pay", list.get(0).getPro_sorry_pay());

		String zipFilePath = "/plan/weddingQ_product/dress/" + list.get(0).getPro_idx();
		String zipFileName = "/plan/weddingQ_product/dress/" + list.get(0).getPro_idx() + "/dress_"
				+ list.get(0).getPro_idx() + ".zip";
		String isFile = "f";
		try {
			// 기존 압축파일 지움
			File directory = new File("/plan/weddingQ_product/dress/" + list.get(0).getPro_idx());
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					isFile = "t";
					if (file.isFile() && (file.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory + "/" + file.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile)) {
				Utils.createZip(zipFilePath, zipFileName);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile", isFile);

		String zipFilePath2 = "/plan/weddingQ_sample/dress/" + list.get(0).getPro_idx();
		String zipFileName2 = "/plan/weddingQ_sample/dress/" + list.get(0).getPro_idx() + "/dress_"
				+ list.get(0).getPro_idx() + ".zip";
		String isFile2 = "f";
		try {
			// 기존 압축파일 지움
			File directory2 = new File("/plan/weddingQ_sample/dress/" + list.get(0).getPro_idx());
			File[] files2 = directory2.listFiles();
			if (files2 != null) {
				for (File file2 : files2) {
					isFile2 = "t";
					if (file2.isFile() && (file2.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory2 + "/" + file2.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile2)) {
				Utils.createZip(zipFilePath2, zipFileName2);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile2", isFile2);

		return mav;
	}

	@RequestMapping("/detail_snap.pnp")
	public ModelAndView detail_snap(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/detail_snap");

		String pro_idx = request.getParameter("idx");

		String query = "1 and pro_idx = '" + pro_idx + "'";
		List<Snap_vo> list = snap_dao.selList_snap(query);

		mav.addObject("pro_idx", list.get(0).getPro_idx());
		mav.addObject("pro_sort", list.get(0).getPro_sort());
		mav.addObject("pro_com_idx", list.get(0).getPro_com_idx());
		mav.addObject("pro_com_name", list.get(0).getPro_com_name());
		mav.addObject("pro_category", list.get(0).getPro_category());
		mav.addObject("pro_name", list.get(0).getPro_name());
		mav.addObject("pro_homepage", list.get(0).getPro_homepage());
		mav.addObject("pro_tel", list.get(0).getPro_tel());
		mav.addObject("pro_zipcode", list.get(0).getPro_zipcode());
		mav.addObject("pro_addr1", list.get(0).getPro_addr1());
		mav.addObject("pro_addr2", list.get(0).getPro_addr2());
		mav.addObject("pro_subway1", list.get(0).getPro_subway1());
		mav.addObject("pro_subway2", list.get(0).getPro_subway2());
		mav.addObject("pro_subway3", list.get(0).getPro_subway3());
		mav.addObject("pro_bus", list.get(0).getPro_bus());
		mav.addObject("pro_intro1", list.get(0).getPro_intro1());
		mav.addObject("pro_intro2", list.get(0).getPro_intro2());
		mav.addObject("pro_location", list.get(0).getPro_location());
		mav.addObject("pro_talk_time", list.get(0).getPro_talk_time());
		mav.addObject("pro_holiday", list.get(0).getPro_holiday());
		mav.addObject("pro_composition", list.get(0).getPro_composition());
		mav.addObject("pro_composition_pay", list.get(0).getPro_composition_pay());
		mav.addObject("pro_composition_charge", list.get(0).getPro_composition_charge());
		mav.addObject("pro_composition_price", list.get(0).getPro_composition_price());
		mav.addObject("pro_composition_dc", list.get(0).getPro_composition_dc());
		mav.addObject("pro_add_name", list.get(0).getPro_add_name());
		mav.addObject("pro_add_pay", list.get(0).getPro_add_pay());
		mav.addObject("pro_event", list.get(0).getPro_event());
		mav.addObject("pro_pay_engine", list.get(0).getPro_pay_engine());
		mav.addObject("pro_pay_number", list.get(0).getPro_pay_number());
		mav.addObject("pro_pay_name", list.get(0).getPro_pay_name());

		String zipFilePath = "/plan/weddingQ_product/snap/" + list.get(0).getPro_idx();
		String zipFileName = "/plan/weddingQ_product/snap/" + list.get(0).getPro_idx() + "/snap_"
				+ list.get(0).getPro_idx() + ".zip";
		String isFile = "f";
		try {
			// 기존 압축파일 지움
			File directory = new File("/plan/weddingQ_product/snap/" + list.get(0).getPro_idx());
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					isFile = "t";
					if (file.isFile() && (file.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory + "/" + file.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile)) {
				Utils.createZip(zipFilePath, zipFileName);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile", isFile);

		String zipFilePath2 = "/plan/weddingQ_sample/snap/" + list.get(0).getPro_idx();
		String zipFileName2 = "/plan/weddingQ_sample/snap/" + list.get(0).getPro_idx() + "/snap_"
				+ list.get(0).getPro_idx() + ".zip";
		String isFile2 = "f";
		try {
			// 기존 압축파일 지움
			File directory2 = new File("/plan/weddingQ_sample/snap/" + list.get(0).getPro_idx());
			File[] files2 = directory2.listFiles();
			if (files2 != null) {
				for (File file2 : files2) {
					isFile2 = "t";
					if (file2.isFile() && (file2.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory2 + "/" + file2.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile2)) {
				Utils.createZip(zipFilePath2, zipFileName2);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile2", isFile2);

		return mav;
	}

	@RequestMapping("/detail_makeup.pnp")
	public ModelAndView detail_makeup(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/detail_makeup");

		String pro_idx = request.getParameter("idx");

		String query = "1 and pro_idx = '" + pro_idx + "'";
		List<Makeup_vo> list = makeup_dao.selList_makeup(query);

		mav.addObject("pro_idx", list.get(0).getPro_idx());
		mav.addObject("pro_sort", list.get(0).getPro_sort());
		mav.addObject("pro_com_idx", list.get(0).getPro_com_idx());
		mav.addObject("pro_com_name", list.get(0).getPro_com_name());
		mav.addObject("pro_category", list.get(0).getPro_category());
		mav.addObject("pro_name", list.get(0).getPro_name());
		mav.addObject("pro_homepage", list.get(0).getPro_homepage());
		mav.addObject("pro_tel", list.get(0).getPro_tel());
		mav.addObject("pro_zipcode", list.get(0).getPro_zipcode());
		mav.addObject("pro_addr1", list.get(0).getPro_addr1());
		mav.addObject("pro_addr2", list.get(0).getPro_addr2());
		mav.addObject("pro_subway1", list.get(0).getPro_subway1());
		mav.addObject("pro_subway2", list.get(0).getPro_subway2());
		mav.addObject("pro_subway3", list.get(0).getPro_subway3());
		mav.addObject("pro_bus", list.get(0).getPro_bus());
		mav.addObject("pro_intro1", list.get(0).getPro_intro1());
		mav.addObject("pro_intro2", list.get(0).getPro_intro2());
		mav.addObject("pro_go", list.get(0).getPro_go());
		mav.addObject("pro_concept", list.get(0).getPro_concept());
		mav.addObject("pro_talk_time", list.get(0).getPro_talk_time());
		mav.addObject("pro_holiday", list.get(0).getPro_holiday());
		mav.addObject("pro_parking", list.get(0).getPro_parking());
		mav.addObject("pro_composition", list.get(0).getPro_composition());
		mav.addObject("pro_composition_pay", list.get(0).getPro_composition_pay());
		mav.addObject("pro_composition_charge", list.get(0).getPro_composition_charge());
		mav.addObject("pro_composition_price", list.get(0).getPro_composition_price());
		mav.addObject("pro_composition_dc", list.get(0).getPro_composition_dc());
		mav.addObject("pro_sdm_pay", list.get(0).getPro_sdm_pay());
		mav.addObject("pro_add_name", list.get(0).getPro_add_name());
		mav.addObject("pro_add_pay", list.get(0).getPro_add_pay());
		mav.addObject("pro_event", list.get(0).getPro_event());
		mav.addObject("pro_pay_engine", list.get(0).getPro_pay_engine());
		mav.addObject("pro_pay_number", list.get(0).getPro_pay_number());
		mav.addObject("pro_pay_name", list.get(0).getPro_pay_name());
		mav.addObject("pro_change_date", list.get(0).getPro_change_date());
		mav.addObject("pro_sorry_pay", list.get(0).getPro_sorry_pay());

		String zipFilePath = "/plan/weddingQ_product/makeup/" + list.get(0).getPro_idx();
		String zipFileName = "/plan/weddingQ_product/makeup/" + list.get(0).getPro_idx() + "/makeup_"
				+ list.get(0).getPro_idx() + ".zip";
		String isFile = "f";
		try {
			// 기존 압축파일 지움
			File directory = new File("/plan/weddingQ_product/makeup/" + list.get(0).getPro_idx());
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					isFile = "t";
					if (file.isFile() && (file.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory + "/" + file.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile)) {
				Utils.createZip(zipFilePath, zipFileName);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile", isFile);

		String zipFilePath2 = "/plan/weddingQ_sample/makeup/" + list.get(0).getPro_idx();
		String zipFileName2 = "/plan/weddingQ_sample/makeup/" + list.get(0).getPro_idx() + "/makeup_"
				+ list.get(0).getPro_idx() + ".zip";
		String isFile2 = "f";
		try {
			// 기존 압축파일 지움
			File directory2 = new File("/plan/weddingQ_sample/makeup/" + list.get(0).getPro_idx());
			File[] files2 = directory2.listFiles();
			if (files2 != null) {
				for (File file2 : files2) {
					isFile2 = "t";
					if (file2.isFile() && (file2.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory2 + "/" + file2.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile2)) {
				Utils.createZip(zipFilePath2, zipFileName2);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile2", isFile2);

		return mav;
	}

	@RequestMapping("/detail_suit.pnp")
	public ModelAndView detail_suit(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/detail_suit");

		String pro_idx = request.getParameter("idx");

		String query = "1 and pro_idx = '" + pro_idx + "'";
		List<Suit_vo> list = suit_dao.selList_suit(query);

		mav.addObject("pro_idx", list.get(0).getPro_idx());
		mav.addObject("pro_sort", list.get(0).getPro_sort());
		mav.addObject("pro_com_idx", list.get(0).getPro_com_idx());
		mav.addObject("pro_com_name", list.get(0).getPro_com_name());
		mav.addObject("pro_category", list.get(0).getPro_category());
		mav.addObject("pro_name", list.get(0).getPro_name());
		mav.addObject("pro_homepage", list.get(0).getPro_homepage());
		mav.addObject("pro_tel", list.get(0).getPro_tel());
		mav.addObject("pro_zipcode", list.get(0).getPro_zipcode());
		mav.addObject("pro_addr1", list.get(0).getPro_addr1());
		mav.addObject("pro_addr2", list.get(0).getPro_addr2());
		mav.addObject("pro_subway1", list.get(0).getPro_subway1());
		mav.addObject("pro_subway2", list.get(0).getPro_subway2());
		mav.addObject("pro_subway3", list.get(0).getPro_subway3());
		mav.addObject("pro_bus", list.get(0).getPro_bus());
		mav.addObject("pro_intro1", list.get(0).getPro_intro1());
		mav.addObject("pro_intro2", list.get(0).getPro_intro2());
		mav.addObject("pro_type", list.get(0).getPro_type());
		mav.addObject("pro_talk_time", list.get(0).getPro_talk_time());
		mav.addObject("pro_holiday", list.get(0).getPro_holiday());
		mav.addObject("pro_parking", list.get(0).getPro_parking());
		mav.addObject("pro_service", list.get(0).getPro_service());
		mav.addObject("pro_event", list.get(0).getPro_event());
		mav.addObject("pro_cashback", list.get(0).getPro_cashback());
		mav.addObject("pro_composition", list.get(0).getPro_composition());
		mav.addObject("pro_composition_charge", list.get(0).getPro_composition_charge());
		mav.addObject("pro_composition_price", list.get(0).getPro_composition_price());
		mav.addObject("pro_add_name", list.get(0).getPro_add_name());
		mav.addObject("pro_add_pay", list.get(0).getPro_add_pay());
		mav.addObject("pro_pay_engine", list.get(0).getPro_pay_engine());
		mav.addObject("pro_pay_number", list.get(0).getPro_pay_number());
		mav.addObject("pro_pay_name", list.get(0).getPro_pay_name());

		String zipFilePath = "/plan/weddingQ_product/suit/" + list.get(0).getPro_idx();
		String zipFileName = "/plan/weddingQ_product/suit/" + list.get(0).getPro_idx() + "/suit_"
				+ list.get(0).getPro_idx() + ".zip";
		String isFile = "f";
		try {
			// 기존 압축파일 지움
			File directory = new File("/plan/weddingQ_product/suit/" + list.get(0).getPro_idx());
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					isFile = "t";
					if (file.isFile() && (file.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory + "/" + file.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile)) {
				Utils.createZip(zipFilePath, zipFileName);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile", isFile);

		String zipFilePath2 = "/plan/weddingQ_sample/suit/" + list.get(0).getPro_idx();
		String zipFileName2 = "/plan/weddingQ_sample/suit/" + list.get(0).getPro_idx() + "/suit_"
				+ list.get(0).getPro_idx() + ".zip";
		String isFile2 = "f";
		try {
			// 기존 압축파일 지움
			File directory2 = new File("/plan/weddingQ_sample/suit/" + list.get(0).getPro_idx());
			File[] files2 = directory2.listFiles();
			if (files2 != null) {
				for (File file2 : files2) {
					isFile2 = "t";
					if (file2.isFile() && (file2.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory2 + "/" + file2.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile2)) {
				Utils.createZip(zipFilePath2, zipFileName2);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile2", isFile2);

		return mav;
	}

	@RequestMapping("/detail_korea.pnp")
	public ModelAndView detail_korea(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/detail_korea");

		String pro_idx = request.getParameter("idx");

		String query = "1 and pro_idx = '" + pro_idx + "'";
		List<Korea_vo> list = korea_dao.selList_korea(query);

		mav.addObject("pro_idx", list.get(0).getPro_idx());
		mav.addObject("pro_sort", list.get(0).getPro_sort());
		mav.addObject("pro_com_idx", list.get(0).getPro_com_idx());
		mav.addObject("pro_com_name", list.get(0).getPro_com_name());
		mav.addObject("pro_category", list.get(0).getPro_category());
		mav.addObject("pro_name", list.get(0).getPro_name());
		mav.addObject("pro_homepage", list.get(0).getPro_homepage());
		mav.addObject("pro_tel", list.get(0).getPro_tel());
		mav.addObject("pro_zipcode", list.get(0).getPro_zipcode());
		mav.addObject("pro_addr1", list.get(0).getPro_addr1());
		mav.addObject("pro_addr2", list.get(0).getPro_addr2());
		mav.addObject("pro_subway1", list.get(0).getPro_subway1());
		mav.addObject("pro_subway2", list.get(0).getPro_subway2());
		mav.addObject("pro_subway3", list.get(0).getPro_subway3());
		mav.addObject("pro_bus", list.get(0).getPro_bus());
		mav.addObject("pro_intro1", list.get(0).getPro_intro1());
		mav.addObject("pro_intro2", list.get(0).getPro_intro2());
		mav.addObject("pro_type", list.get(0).getPro_type());
		mav.addObject("pro_talk_time", list.get(0).getPro_talk_time());
		mav.addObject("pro_holiday", list.get(0).getPro_holiday());
		mav.addObject("pro_parking", list.get(0).getPro_parking());
		mav.addObject("pro_service", list.get(0).getPro_service());
		mav.addObject("pro_event", list.get(0).getPro_event());
		mav.addObject("pro_cashback", list.get(0).getPro_cashback());
		mav.addObject("pro_composition", list.get(0).getPro_composition());
		mav.addObject("pro_composition_charge", list.get(0).getPro_composition_charge());
		mav.addObject("pro_composition_price", list.get(0).getPro_composition_price());
		mav.addObject("pro_add_name", list.get(0).getPro_add_name());
		mav.addObject("pro_add_pay", list.get(0).getPro_add_pay());
		mav.addObject("pro_pay_engine", list.get(0).getPro_pay_engine());
		mav.addObject("pro_pay_number", list.get(0).getPro_pay_number());
		mav.addObject("pro_pay_name", list.get(0).getPro_pay_name());

		String zipFilePath = "/plan/weddingQ_product/korea/" + list.get(0).getPro_idx();
		String zipFileName = "/plan/weddingQ_product/korea/" + list.get(0).getPro_idx() + "/korea_"
				+ list.get(0).getPro_idx() + ".zip";
		String isFile = "f";
		try {
			// 기존 압축파일 지움
			File directory = new File("/plan/weddingQ_product/korea/" + list.get(0).getPro_idx());
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					isFile = "t";
					if (file.isFile() && (file.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory + "/" + file.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile)) {
				Utils.createZip(zipFilePath, zipFileName);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile", isFile);

		String zipFilePath2 = "/plan/weddingQ_sample/korea/" + list.get(0).getPro_idx();
		String zipFileName2 = "/plan/weddingQ_sample/korea/" + list.get(0).getPro_idx() + "/korea_"
				+ list.get(0).getPro_idx() + ".zip";
		String isFile2 = "f";
		try {
			// 기존 압축파일 지움
			File directory2 = new File("/plan/weddingQ_sample/korea/" + list.get(0).getPro_idx());
			File[] files2 = directory2.listFiles();
			if (files2 != null) {
				for (File file2 : files2) {
					isFile2 = "t";
					if (file2.isFile() && (file2.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory2 + "/" + file2.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile2)) {
				Utils.createZip(zipFilePath2, zipFileName2);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile2", isFile2);

		return mav;
	}

	@RequestMapping("/detail_jewelry.pnp")
	public ModelAndView detail_jewelry(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/detail_jewelry");

		String pro_idx = request.getParameter("idx");

		String query = "1 and pro_idx = '" + pro_idx + "'";
		List<Jewelry_vo> list = jewelry_dao.selList_jewelry(query);

		mav.addObject("pro_idx", list.get(0).getPro_idx());
		mav.addObject("pro_sort", list.get(0).getPro_sort());
		mav.addObject("pro_com_idx", list.get(0).getPro_com_idx());
		mav.addObject("pro_com_name", list.get(0).getPro_com_name());
		mav.addObject("pro_category", list.get(0).getPro_category());
		mav.addObject("pro_name", list.get(0).getPro_name());
		mav.addObject("pro_homepage", list.get(0).getPro_homepage());
		mav.addObject("pro_tel", list.get(0).getPro_tel());
		mav.addObject("pro_zipcode", list.get(0).getPro_zipcode());
		mav.addObject("pro_addr1", list.get(0).getPro_addr1());
		mav.addObject("pro_addr2", list.get(0).getPro_addr2());
		mav.addObject("pro_subway1", list.get(0).getPro_subway1());
		mav.addObject("pro_subway2", list.get(0).getPro_subway2());
		mav.addObject("pro_subway3", list.get(0).getPro_subway3());
		mav.addObject("pro_bus", list.get(0).getPro_bus());
		mav.addObject("pro_intro1", list.get(0).getPro_intro1());
		mav.addObject("pro_intro2", list.get(0).getPro_intro2());
		mav.addObject("pro_talk_time", list.get(0).getPro_talk_time());
		mav.addObject("pro_holiday", list.get(0).getPro_holiday());
		mav.addObject("pro_parking", list.get(0).getPro_parking());
		mav.addObject("pro_service", list.get(0).getPro_service());
		mav.addObject("pro_event", list.get(0).getPro_event());
		mav.addObject("pro_cashback", list.get(0).getPro_cashback());
		mav.addObject("pro_composition", list.get(0).getPro_composition());
		mav.addObject("pro_composition_charge", list.get(0).getPro_composition_charge());
		mav.addObject("pro_composition_price", list.get(0).getPro_composition_price());
		mav.addObject("pro_add_name", list.get(0).getPro_add_name());
		mav.addObject("pro_add_pay", list.get(0).getPro_add_pay());
		mav.addObject("pro_pay_engine", list.get(0).getPro_pay_engine());
		mav.addObject("pro_pay_number", list.get(0).getPro_pay_number());
		mav.addObject("pro_pay_name", list.get(0).getPro_pay_name());

		String zipFilePath = "/plan/weddingQ_product/jewelry/" + list.get(0).getPro_idx();
		String zipFileName = "/plan/weddingQ_product/jewelry/" + list.get(0).getPro_idx() + "/jewelry_"
				+ list.get(0).getPro_idx() + ".zip";
		String isFile = "f";
		try {
			// 기존 압축파일 지움
			File directory = new File("/plan/weddingQ_product/jewelry/" + list.get(0).getPro_idx());
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					isFile = "t";
					if (file.isFile() && (file.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory + "/" + file.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile)) {
				Utils.createZip(zipFilePath, zipFileName);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile", isFile);

		String zipFilePath2 = "/plan/weddingQ_sample/jewelry/" + list.get(0).getPro_idx();
		String zipFileName2 = "/plan/weddingQ_sample/jewelry/" + list.get(0).getPro_idx() + "/jewelry_"
				+ list.get(0).getPro_idx() + ".zip";
		String isFile2 = "f";
		try {
			// 기존 압축파일 지움
			File directory2 = new File("/plan/weddingQ_sample/jewelry/" + list.get(0).getPro_idx());
			File[] files2 = directory2.listFiles();
			if (files2 != null) {
				for (File file2 : files2) {
					isFile2 = "t";
					if (file2.isFile() && (file2.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory2 + "/" + file2.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile2)) {
				Utils.createZip(zipFilePath2, zipFileName2);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile2", isFile2);

		return mav;
	}

	@RequestMapping("/detail_pb.pnp")
	public ModelAndView detail_pb(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/detail_pb");

		String pro_idx = request.getParameter("idx");

		String query = "1 and pro_idx = '" + pro_idx + "'";
		List<Pb_vo> list = pb_dao.selList_pb(query);

		mav.addObject("pro_idx", list.get(0).getPro_idx());
		mav.addObject("pro_sort", list.get(0).getPro_sort());
		mav.addObject("pro_com_idx", list.get(0).getPro_com_idx());
		mav.addObject("pro_com_name", list.get(0).getPro_com_name());
		mav.addObject("pro_category", list.get(0).getPro_category());
		mav.addObject("pro_name", list.get(0).getPro_name());
		mav.addObject("pro_homepage", list.get(0).getPro_homepage());
		mav.addObject("pro_tel", list.get(0).getPro_tel());
		mav.addObject("pro_zipcode", list.get(0).getPro_zipcode());
		mav.addObject("pro_addr1", list.get(0).getPro_addr1());
		mav.addObject("pro_addr2", list.get(0).getPro_addr2());
		mav.addObject("pro_subway1", list.get(0).getPro_subway1());
		mav.addObject("pro_subway2", list.get(0).getPro_subway2());
		mav.addObject("pro_subway3", list.get(0).getPro_subway3());
		mav.addObject("pro_bus", list.get(0).getPro_bus());
		mav.addObject("pro_intro1", list.get(0).getPro_intro1());
		mav.addObject("pro_intro2", list.get(0).getPro_intro2());
		mav.addObject("pro_eat", list.get(0).getPro_eat());
		mav.addObject("pro_talk_time", list.get(0).getPro_talk_time());
		mav.addObject("pro_holiday", list.get(0).getPro_holiday());
		mav.addObject("pro_parking", list.get(0).getPro_parking());
		mav.addObject("pro_service", list.get(0).getPro_service());
		mav.addObject("pro_composition", list.get(0).getPro_composition());
		mav.addObject("pro_composition_charge", list.get(0).getPro_composition_charge());
		mav.addObject("pro_composition_price", list.get(0).getPro_composition_price());
		mav.addObject("pro_add_name", list.get(0).getPro_add_name());
		mav.addObject("pro_add_pay", list.get(0).getPro_add_pay());
		mav.addObject("pro_pay_engine", list.get(0).getPro_pay_engine());
		mav.addObject("pro_pay_number", list.get(0).getPro_pay_number());
		mav.addObject("pro_pay_name", list.get(0).getPro_pay_name());

		String zipFilePath = "/plan/weddingQ_product/pb/" + list.get(0).getPro_idx();
		String zipFileName = "/plan/weddingQ_product/pb/" + list.get(0).getPro_idx() + "/pb_" + list.get(0).getPro_idx()
				+ ".zip";
		String isFile = "f";
		try {
			// 기존 압축파일 지움
			File directory = new File("/plan/weddingQ_product/pb/" + list.get(0).getPro_idx());
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					isFile = "t";
					if (file.isFile() && (file.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory + "/" + file.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile)) {
				Utils.createZip(zipFilePath, zipFileName);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile", isFile);

		String zipFilePath2 = "/plan/weddingQ_sample/pb/" + list.get(0).getPro_idx();
		String zipFileName2 = "/plan/weddingQ_sample/pb/" + list.get(0).getPro_idx() + "/pb_" + list.get(0).getPro_idx()
				+ ".zip";
		String isFile2 = "f";
		try {
			// 기존 압축파일 지움
			File directory2 = new File("/plan/weddingQ_sample/pb/" + list.get(0).getPro_idx());
			File[] files2 = directory2.listFiles();
			if (files2 != null) {
				for (File file2 : files2) {
					isFile2 = "t";
					if (file2.isFile() && (file2.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory2 + "/" + file2.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile2)) {
				Utils.createZip(zipFilePath2, zipFileName2);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile2", isFile2);

		return mav;
	}

	@RequestMapping("/update_company.pnp")
	public ModelAndView update_company(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/update_company");

		String com_idx = request.getParameter("idx");

		String query = "1 and com_idx = '" + com_idx + "'";
		List<Company_vo> list = company_dao.selList_company(query);

		mav.addObject("com_idx", list.get(0).getCom_idx());
		mav.addObject("com_id", list.get(0).getCom_id());
		mav.addObject("com_pw", list.get(0).getCom_pw());
		mav.addObject("com_persons", list.get(0).getCom_persons());
		mav.addObject("com_persons_tel", list.get(0).getCom_persons_tel());
		mav.addObject("com_category", list.get(0).getCom_category());
		mav.addObject("com_name", list.get(0).getCom_name());
		mav.addObject("com_ceo", list.get(0).getCom_ceo());
		mav.addObject("com_number", list.get(0).getCom_number());
		mav.addObject("com_condition", list.get(0).getCom_condition());
		mav.addObject("com_type", list.get(0).getCom_type());
		mav.addObject("com_tel", list.get(0).getCom_tel());
		mav.addObject("com_fax", list.get(0).getCom_fax());
		mav.addObject("com_email", list.get(0).getCom_email());
		mav.addObject("com_homepage", list.get(0).getCom_homepage());
		mav.addObject("com_zipcode", list.get(0).getCom_zipcode());
		mav.addObject("com_addr1", list.get(0).getCom_addr1());
		mav.addObject("com_addr2", list.get(0).getCom_addr2());
		mav.addObject("com_subway1", list.get(0).getCom_subway1());
		mav.addObject("com_subway2", list.get(0).getCom_subway2());
		mav.addObject("com_subway3", list.get(0).getCom_subway3());
		mav.addObject("com_bus", list.get(0).getCom_bus());
		mav.addObject("com_pay_engine", list.get(0).getCom_pay_engine());
		mav.addObject("com_pay_number", list.get(0).getCom_pay_number());
		mav.addObject("com_pay_name", list.get(0).getCom_pay_name());

		String zipFilePath = "/plan/weddingQ_product/company/" + list.get(0).getCom_idx();
		String zipFileName = "/plan/weddingQ_product/company/" + list.get(0).getCom_idx() + "/company_"
				+ list.get(0).getCom_idx() + ".zip";
		String isFile = "f";
		try {
			// 기존 압축파일 지움
			File directory = new File("/plan/weddingQ_product/company/" + list.get(0).getCom_idx());
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					isFile = "t";
					if (file.isFile() && (file.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory + "/" + file.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile)) {
				Utils.createZip(zipFilePath, zipFileName);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile", isFile);

		return mav;
	}

	@RequestMapping("/update_company_output.pnp")
	public ModelAndView update_company_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/update_company_output");

		try {
			String savePath = "/plan/weddingQ_product/company/";
			int sizeLimit = 1024 * 1024 * 1000; // 1000메가..
			File dir = new File(savePath);
			if (!dir.exists()) { // 디렉토리가 존재하지 않으면
				dir.mkdirs(); // 디렉토리 생성.!
			}

			MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "utf-8",
					new DefaultFileRenamePolicy());

			// **************************** idx 번호 가져옴 ************************** //
			int com_idx = Integer.parseInt(multi.getParameter("com_idx"));
			// **************************** idx 번호 가져옴 ************************** //

			if ("".equals(multi.getParameter("com_img_list")) || multi.getParameter("com_img_list") == null) // 이미지를
																												// 수정하지
																												// 않았다.
			{

			} else // 이미지가 수정되었다면..
			{
				// 기존 이미지를 지움
				File directory = new File("/plan/weddingQ_product/company/" + com_idx);
				File[] files = directory.listFiles();
				if (files != null) {
					for (File file : files) {
						if (file.isFile()) {
							Utils.fileDelete(directory + "/" + file.getName());
						}
					}
				}
				// 기존 이미지를 지움

				// 지금 올라온 이미지를 넘김
				String com_img_list[] = (multi.getParameter("com_img_list")).split("&&");
				for (int i = 0; i < com_img_list.length; i++) {
					Utils.fileMove(savePath + com_img_list[i], directory + "/" + com_img_list[i]);
				}
				// 지금 올라온 이미지를 넘김
			}

			String com_id = multi.getParameter("com_id");
			String com_pw = multi.getParameter("com_pw");
			String com_persons = multi.getParameter("com_persons");
			String com_persons_tel = multi.getParameter("com_persons_tel1") + "-"
					+ multi.getParameter("com_persons_tel2") + "-" + multi.getParameter("com_persons_tel3");
			String com_category = multi.getParameter("com_category");

			String com_name = multi.getParameter("com_name");
			String com_ceo = multi.getParameter("com_ceo");
			String com_number = multi.getParameter("com_number");
			String com_condition = multi.getParameter("com_condition");
			String com_type = multi.getParameter("com_type");
			String com_tel = multi.getParameter("com_tel1") + "-" + multi.getParameter("com_tel2") + "-"
					+ multi.getParameter("com_tel3");
			String com_fax = multi.getParameter("com_fax1") + "-" + multi.getParameter("com_fax2") + "-"
					+ multi.getParameter("com_fax3");
			String com_email = multi.getParameter("com_email1") + "@" + multi.getParameter("com_email2");
			String com_homepage = multi.getParameter("com_homepage");
			String com_zipcode = multi.getParameter("com_zipcode");
			String com_addr1 = multi.getParameter("com_addr1");
			String com_addr2 = multi.getParameter("com_addr2");
			String com_subway1 = multi.getParameter("com_subway1") + "&&"
					+ multi.getParameter(multi.getParameter("com_subway1") + "1") + "&&"
					+ multi.getParameter("com_subway1_3") + "&&" + multi.getParameter("com_subway1_4");
			String com_subway2 = multi.getParameter("com_subway2") + "&&"
					+ multi.getParameter(multi.getParameter("com_subway2") + "2") + "&&"
					+ multi.getParameter("com_subway2_3") + "&&" + multi.getParameter("com_subway2_4");
			String com_subway3 = multi.getParameter("com_subway3") + "&&"
					+ multi.getParameter(multi.getParameter("com_subway3") + "3") + "&&"
					+ multi.getParameter("com_subway3_3") + "&&" + multi.getParameter("com_subway3_4");
			String com_bus = multi.getParameter("com_bus").replace("\r\n", "<br>").replace("\"", "＂").replace("\'",
					"’");
			String com_pay_engine = multi.getParameter("com_pay_engine");
			String com_pay_number = multi.getParameter("com_pay_number");
			String com_pay_name = multi.getParameter("com_pay_name");

			company_dao.upCompany(com_idx, com_id, com_pw, com_persons, com_persons_tel, com_category, com_name,
					com_ceo, com_number, com_condition, com_type, com_tel, com_fax, com_email, com_homepage,
					com_zipcode, com_addr1, com_addr2, com_subway1, com_subway2, com_subway3, com_bus, com_pay_engine,
					com_pay_number, com_pay_name);

		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
		}
		return mav;
	}

	@RequestMapping("/update_hall.pnp")
	public ModelAndView update_hall(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/update_hall");

		String pro_idx = request.getParameter("idx");

		String query = "1 and pro_idx = '" + pro_idx + "'";
		List<Hall_vo> list = hall_dao.selList_hall(query);

		mav.addObject("pro_idx", list.get(0).getPro_idx());
		mav.addObject("pro_sort", list.get(0).getPro_sort());
		mav.addObject("pro_com_idx", list.get(0).getPro_com_idx());
		mav.addObject("pro_com_name", list.get(0).getPro_com_name());
		mav.addObject("pro_category", list.get(0).getPro_category());
		mav.addObject("pro_name", list.get(0).getPro_name());
		mav.addObject("pro_homepage", list.get(0).getPro_homepage());
		mav.addObject("pro_tel", list.get(0).getPro_tel());
		mav.addObject("pro_zipcode", list.get(0).getPro_zipcode());
		mav.addObject("pro_addr1", list.get(0).getPro_addr1());
		mav.addObject("pro_addr2", list.get(0).getPro_addr2());
		mav.addObject("pro_subway1", list.get(0).getPro_subway1());
		mav.addObject("pro_subway2", list.get(0).getPro_subway2());
		mav.addObject("pro_subway3", list.get(0).getPro_subway3());
		mav.addObject("pro_bus", list.get(0).getPro_bus());
		mav.addObject("pro_intro1", list.get(0).getPro_intro1());
		mav.addObject("pro_intro2", list.get(0).getPro_intro2());
		mav.addObject("pro_type", list.get(0).getPro_type());
		mav.addObject("pro_wedding_type", list.get(0).getPro_wedding_type());
		mav.addObject("pro_wedding_time", list.get(0).getPro_wedding_time());
		mav.addObject("pro_hall_seat", list.get(0).getPro_hall_seat());
		mav.addObject("pro_party_seat", list.get(0).getPro_party_seat());
		mav.addObject("pro_person", list.get(0).getPro_person());
		mav.addObject("pro_parking", list.get(0).getPro_parking());
		mav.addObject("pro_talk_time", list.get(0).getPro_talk_time());
		mav.addObject("pro_menu", list.get(0).getPro_menu());
		mav.addObject("pro_eat_pay", list.get(0).getPro_eat_pay());
		mav.addObject("pro_other_pay", list.get(0).getPro_other_pay());
		mav.addObject("pro_rent_pay", list.get(0).getPro_rent_pay());
		mav.addObject("pro_basic_option", list.get(0).getPro_basic_option());
		mav.addObject("pro_essential_option", list.get(0).getPro_essential_option());
		mav.addObject("pro_essential_option_pay", list.get(0).getPro_essential_option_pay());
		mav.addObject("pro_menu_type", list.get(0).getPro_menu_type());
		mav.addObject("pro_menu_name", list.get(0).getPro_menu_name());
		mav.addObject("pro_menu_pay", list.get(0).getPro_menu_pay());
		mav.addObject("pro_charge1", list.get(0).getPro_charge1());
		mav.addObject("pro_charge2", list.get(0).getPro_charge2());
		mav.addObject("pro_charge3", list.get(0).getPro_charge3());

		String zipFilePath = "/plan/weddingQ_product/hall/" + list.get(0).getPro_idx();
		String zipFileName = "/plan/weddingQ_product/hall/" + list.get(0).getPro_idx() + "/hall_"
				+ list.get(0).getPro_idx() + ".zip";
		String isFile = "f";
		try {
			// 기존 압축파일 지움
			File directory = new File("/plan/weddingQ_product/hall/" + list.get(0).getPro_idx());
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					isFile = "t";
					if (file.isFile() && (file.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory + "/" + file.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile)) {
				Utils.createZip(zipFilePath, zipFileName);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile", isFile);

		String zipFilePath2 = "/plan/weddingQ_sample/hall/" + list.get(0).getPro_idx();
		String zipFileName2 = "/plan/weddingQ_sample/hall/" + list.get(0).getPro_idx() + "/hall_"
				+ list.get(0).getPro_idx() + ".zip";
		String isFile2 = "f";
		try {
			// 기존 압축파일 지움
			File directory2 = new File("/plan/weddingQ_sample/hall/" + list.get(0).getPro_idx());
			File[] files2 = directory2.listFiles();
			if (files2 != null) {
				for (File file2 : files2) {
					isFile2 = "t";
					if (file2.isFile() && (file2.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory2 + "/" + file2.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile2)) {
				Utils.createZip(zipFilePath2, zipFileName2);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile2", isFile2);

		return mav;
	}

	@RequestMapping("/update_hall_output.pnp")
	public ModelAndView update_hall_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/update_hall_output");

		try {
			String savePath = "/plan/weddingQ_product/hall/";
			int sizeLimit = 1024 * 1024 * 1000; // 1000메가..
			File dir = new File(savePath);
			if (!dir.exists()) { // 디렉토리가 존재하지 않으면
				dir.mkdirs(); // 디렉토리 생성.!
			}

			MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "utf-8",
					new DefaultFileRenamePolicy());

			// **************************** idx 번호 가져옴 ************************** //
			int pro_idx = Integer.parseInt(multi.getParameter("pro_idx"));
			// **************************** idx 번호 가져옴 ************************** //

			if ("".equals(multi.getParameter("pro_img_list")) || multi.getParameter("pro_img_list") == null) // 이미지를
																												// 수정하지
																												// 않았다.
			{

			} else // 이미지가 수정되었다면..
			{
				// 기존 이미지를 지움
				File directory = new File("/plan/weddingQ_product/hall/" + pro_idx);
				File[] files = directory.listFiles();
				if (files != null) {
					for (File file : files) {
						if (file.isFile()) {
							Utils.fileDelete(directory + "/" + file.getName());
						}
					}
				}
				// 기존 이미지를 지움

				// 지금 올라온 이미지를 넘김
				String pro_img_list[] = (multi.getParameter("pro_img_list")).split("&&");
				for (int i = 0; i < pro_img_list.length; i++) {
					Utils.fileMove(savePath + pro_img_list[i], directory + "/" + pro_img_list[i]);
				}
				// 지금 올라온 이미지를 넘김
			}

			String pro_sort = multi.getParameter("pro_sort");
			String pro_com_idx = multi.getParameter("pro_com_idx");
			String pro_com_name = multi.getParameter("com_name");
			String pro_category = multi.getParameter("pro_category");

			String pro_name = multi.getParameter("pro_name");
			String pro_homepage = multi.getParameter("pro_homepage");
			String pro_tel = multi.getParameter("pro_tel1") + "-" + multi.getParameter("pro_tel2") + "-"
					+ multi.getParameter("pro_tel3");
			String pro_zipcode = multi.getParameter("pro_zipcode");
			String pro_addr1 = multi.getParameter("pro_addr1");
			String pro_addr2 = multi.getParameter("pro_addr2");
			String pro_subway1 = multi.getParameter("pro_subway1") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway1") + "1") + "&&"
					+ multi.getParameter("pro_subway1_3") + "&&" + multi.getParameter("pro_subway1_4");
			String pro_subway2 = multi.getParameter("pro_subway2") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway2") + "2") + "&&"
					+ multi.getParameter("pro_subway2_3") + "&&" + multi.getParameter("pro_subway2_4");
			String pro_subway3 = multi.getParameter("pro_subway3") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway3") + "3") + "&&"
					+ multi.getParameter("pro_subway3_3") + "&&" + multi.getParameter("pro_subway3_4");
			String pro_bus = multi.getParameter("pro_bus").replace("\r\n", "<br>").replace("\"", "＂").replace("\'",
					"’");
			String pro_intro1 = multi.getParameter("pro_intro1").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");
			String pro_intro2 = multi.getParameter("pro_intro2").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");

			String pro_type = "";

			if ("on".equals(multi.getParameter("일반웨딩홀"))) {
				pro_type += "&&일반웨딩홀";
			}
			if ("on".equals(multi.getParameter("컨벤션웨딩홀"))) {
				pro_type += "&&컨벤션웨딩홀";
			}
			if ("on".equals(multi.getParameter("호텔웨딩홀"))) {
				pro_type += "&&호텔웨딩홀";
			}
			if ("on".equals(multi.getParameter("하우스웨딩"))) {
				pro_type += "&&하우스웨딩";
			}
			if ("on".equals(multi.getParameter("야외예식"))) {
				pro_type += "&&야외예식";
			}
			if ("on".equals(multi.getParameter("전통혼례"))) {
				pro_type += "&&전통혼례";
			}
			if ("on".equals(multi.getParameter("채플웨딩"))) {
				pro_type += "&&채플웨딩";
			}
			if ("on".equals(multi.getParameter("공공기관"))) {
				pro_type += "&&공공기관";
			}
			if ("on".equals(multi.getParameter("강당"))) {
				pro_type += "&&강당";
			}

			if (pro_type.length() > 2) {
				pro_type = pro_type.substring(2, pro_type.length());
			}

			String pro_wedding_type = "";

			if ("on".equals(multi.getParameter("동시예식"))) {
				pro_wedding_type += "&&동시예식";
			}
			if ("on".equals(multi.getParameter("분리예식"))) {
				pro_wedding_type += "&&분리예식";
			}

			if (pro_wedding_type.length() > 2) {
				pro_wedding_type = pro_wedding_type.substring(2, pro_wedding_type.length());
			}

			String pro_wedding_time = multi.getParameter("pro_wedding_time");
			String pro_hall_seat = multi.getParameter("pro_hall_seat");
			String pro_party_seat = multi.getParameter("pro_party_seat");
			String pro_person = multi.getParameter("pro_person");
			String pro_parking = multi.getParameter("pro_parking").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");
			String pro_talk_time = multi.getParameter("pro_talk_time1") + ":" + multi.getParameter("pro_talk_time2")
					+ "~" + multi.getParameter("pro_talk_time3") + ":" + multi.getParameter("pro_talk_time4");
			String pro_menu = "";

			if ("on".equals(multi.getParameter("뷔페"))) {
				pro_menu += "&&뷔페";
			}
			if ("on".equals(multi.getParameter("한식"))) {
				pro_menu += "&&한식";
			}
			if ("on".equals(multi.getParameter("양식"))) {
				pro_menu += "&&양식";
			}
			if ("on".equals(multi.getParameter("중식"))) {
				pro_menu += "&&중식";
			}
			if ("on".equals(multi.getParameter("일식"))) {
				pro_menu += "&&일식";
			}
			if ("on".equals(multi.getParameter("기타"))) {
				pro_menu += "&&기타";
			}

			if (pro_menu.length() > 2) {
				pro_menu = pro_menu.substring(2, pro_menu.length());
			}

			String pro_eat_pay = multi.getParameter("pro_eat_pay1") + "~" + multi.getParameter("pro_eat_pay2");
			String pro_other_pay = multi.getParameter("pro_other_pay");
			String pro_rent_pay = multi.getParameter("pro_rent_pay");

			int pro_basic_option_cnt = Integer.parseInt(multi.getParameter("pro_basic_option_cnt"));
			String pro_basic_option = "";
			for (int i = 1; i <= pro_basic_option_cnt; i++) {
				pro_basic_option += multi.getParameter("pro_basic_option_" + i) + "&&";
			}
			pro_basic_option = pro_basic_option.substring(0, pro_basic_option.length() - 2);

			int pro_essential_option_cnt = Integer.parseInt(multi.getParameter("pro_essential_option_cnt"));
			String pro_essential_option = "";
			String pro_essential_option_pay = "";
			for (int i = 1; i <= pro_essential_option_cnt; i++) {
				pro_essential_option += multi.getParameter("pro_essential_option_" + i) + "&&";
				pro_essential_option_pay += multi.getParameter("pro_essential_option_pay_" + i) + "&&";
			}
			pro_essential_option = pro_essential_option.substring(0, pro_essential_option.length() - 2);
			pro_essential_option_pay = pro_essential_option_pay.substring(0, pro_essential_option_pay.length() - 2);

			int pro_menu_cnt = Integer.parseInt(multi.getParameter("pro_menu_cnt"));
			String pro_menu_name = "";
			String pro_menu_pay = "";
			String pro_menu_type = "";

			for (int i = 1; i <= pro_menu_cnt; i++) {
				pro_menu_name += multi.getParameter("pro_menu_name_" + i) + "&&";
				pro_menu_pay += multi.getParameter("pro_menu_pay_" + i) + "&&";

				String menu_result = "";
				if ("on".equals(multi.getParameter("뷔페_" + i))) {
					menu_result += ",뷔페";
				}
				if ("on".equals(multi.getParameter("한식_" + i))) {
					menu_result += ",한식";
				}
				if ("on".equals(multi.getParameter("양식_" + i))) {
					menu_result += ",양식";
				}
				if ("on".equals(multi.getParameter("중식_" + i))) {
					menu_result += ",중식";
				}
				if ("on".equals(multi.getParameter("일식_" + i))) {
					menu_result += ",일식";
				}
				if ("on".equals(multi.getParameter("기타_" + i))) {
					menu_result += ",기타";
				}
				if (menu_result.length() > 1) {
					menu_result = menu_result.substring(1, menu_result.length());
				}

				pro_menu_type += menu_result + "&&";

			}
			pro_menu_name = pro_menu_name.substring(0, pro_menu_name.length() - 2);
			pro_menu_pay = pro_menu_pay.substring(0, pro_menu_pay.length() - 2);
			pro_menu_type = pro_menu_type.substring(0, pro_menu_type.length() - 2);

			String pro_charge1 = multi.getParameter("pro_charge1");
			String pro_charge2 = multi.getParameter("pro_charge2");
			String pro_charge3 = multi.getParameter("pro_charge3");

			hall_dao.upHall(pro_idx, pro_sort, pro_com_idx, pro_com_name, pro_category, pro_name, pro_homepage, pro_tel,
					pro_zipcode, pro_addr1, pro_addr2, pro_subway1, pro_subway2, pro_subway3, pro_bus, pro_intro1,
					pro_intro2, pro_type, pro_wedding_type, pro_wedding_time, pro_hall_seat, pro_party_seat, pro_person,
					pro_parking, pro_talk_time, pro_menu, pro_eat_pay, pro_other_pay, pro_rent_pay, pro_basic_option,
					pro_essential_option, pro_essential_option_pay, pro_menu_name, pro_menu_pay, pro_menu_type,
					pro_charge1, pro_charge2, pro_charge3);

			// 상품명 기입
			if (pro_name.equals(multi.getParameter("pro_name_yet"))) // 상품명을 수정하지않음.
			{

			} else {
				String query = "com_idx = '" + pro_com_idx + "'";
				List<Company_vo> list = company_dao.selList_company(query);

				String com_pro_name = list.get(0).getCom_pro_name();
				com_pro_name = com_pro_name.replaceAll(multi.getParameter("pro_name_yet"), pro_name); // 기존 파일명을 지운다.
				company_dao.upComProName(pro_com_idx, com_pro_name);
			}
			// 상품명 기입

		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
		}
		return mav;
	}

	@RequestMapping("/update_studio.pnp")
	public ModelAndView update_studio(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/update_studio");

		String pro_idx = request.getParameter("idx");

		String query = "1 and pro_idx = '" + pro_idx + "'";
		List<Studio_vo> list = studio_dao.selList_studio(query);

		mav.addObject("pro_idx", list.get(0).getPro_idx());
		mav.addObject("pro_sort", list.get(0).getPro_sort());
		mav.addObject("pro_com_idx", list.get(0).getPro_com_idx());
		mav.addObject("pro_com_name", list.get(0).getPro_com_name());
		mav.addObject("pro_category", list.get(0).getPro_category());
		mav.addObject("pro_name", list.get(0).getPro_name());
		mav.addObject("pro_homepage", list.get(0).getPro_homepage());
		mav.addObject("pro_tel", list.get(0).getPro_tel());
		mav.addObject("pro_zipcode", list.get(0).getPro_zipcode());
		mav.addObject("pro_addr1", list.get(0).getPro_addr1());
		mav.addObject("pro_addr2", list.get(0).getPro_addr2());
		mav.addObject("pro_subway1", list.get(0).getPro_subway1());
		mav.addObject("pro_subway2", list.get(0).getPro_subway2());
		mav.addObject("pro_subway3", list.get(0).getPro_subway3());
		mav.addObject("pro_bus", list.get(0).getPro_bus());
		mav.addObject("pro_intro1", list.get(0).getPro_intro1());
		mav.addObject("pro_intro2", list.get(0).getPro_intro2());
		mav.addObject("pro_type", list.get(0).getPro_type());
		mav.addObject("pro_clothes", list.get(0).getPro_clothes());
		mav.addObject("pro_props", list.get(0).getPro_props());
		mav.addObject("pro_play_time", list.get(0).getPro_play_time());
		mav.addObject("pro_photo_time", list.get(0).getPro_photo_time());
		mav.addObject("pro_talk_time", list.get(0).getPro_talk_time());
		mav.addObject("pro_holiday", list.get(0).getPro_holiday());
		mav.addObject("pro_parking", list.get(0).getPro_parking());
		mav.addObject("pro_concept1", list.get(0).getPro_concept1());
		mav.addObject("pro_concept2", list.get(0).getPro_concept2());
		mav.addObject("pro_composition", list.get(0).getPro_composition());
		mav.addObject("pro_composition_pay", list.get(0).getPro_composition_pay());
		mav.addObject("pro_composition_charge", list.get(0).getPro_composition_charge());
		mav.addObject("pro_composition_price", list.get(0).getPro_composition_price());
		mav.addObject("pro_composition_dc", list.get(0).getPro_composition_dc());
		mav.addObject("pro_sdm_pay", list.get(0).getPro_sdm_pay());
		mav.addObject("pro_add_name", list.get(0).getPro_add_name());
		mav.addObject("pro_add_pay", list.get(0).getPro_add_pay());
		mav.addObject("pro_event", list.get(0).getPro_event());
		mav.addObject("pro_pay_engine", list.get(0).getPro_pay_engine());
		mav.addObject("pro_pay_number", list.get(0).getPro_pay_number());
		mav.addObject("pro_pay_name", list.get(0).getPro_pay_name());
		mav.addObject("pro_change_date", list.get(0).getPro_change_date());
		mav.addObject("pro_sorry_pay", list.get(0).getPro_sorry_pay());

		String zipFilePath = "/plan/weddingQ_product/studio/" + list.get(0).getPro_idx();
		String zipFileName = "/plan/weddingQ_product/studio/" + list.get(0).getPro_idx() + "/studio_"
				+ list.get(0).getPro_idx() + ".zip";
		String isFile = "f";
		try {
			// 기존 압축파일 지움
			File directory = new File("/plan/weddingQ_product/studio/" + list.get(0).getPro_idx());
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					isFile = "t";
					if (file.isFile() && (file.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory + "/" + file.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile)) {
				Utils.createZip(zipFilePath, zipFileName);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile", isFile);

		String zipFilePath2 = "/plan/weddingQ_sample/studio/" + list.get(0).getPro_idx();
		String zipFileName2 = "/plan/weddingQ_sample/studio/" + list.get(0).getPro_idx() + "/studio_"
				+ list.get(0).getPro_idx() + ".zip";
		String isFile2 = "f";
		try {
			// 기존 압축파일 지움
			File directory2 = new File("/plan/weddingQ_sample/studio/" + list.get(0).getPro_idx());
			File[] files2 = directory2.listFiles();
			if (files2 != null) {
				for (File file2 : files2) {
					isFile2 = "t";
					if (file2.isFile() && (file2.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory2 + "/" + file2.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile2)) {
				Utils.createZip(zipFilePath2, zipFileName2);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile2", isFile2);

		return mav;
	}

	@RequestMapping("/update_studio_output.pnp")
	public ModelAndView update_studio_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/update_studio_output");

		try {
			String savePath = "/plan/weddingQ_product/studio/";
			int sizeLimit = 1024 * 1024 * 1000; // 1000메가..
			File dir = new File(savePath);
			if (!dir.exists()) { // 디렉토리가 존재하지 않으면
				dir.mkdirs(); // 디렉토리 생성.!
			}

			MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "utf-8",
					new DefaultFileRenamePolicy());

			// **************************** idx 번호 가져옴 ************************** //
			int pro_idx = Integer.parseInt(multi.getParameter("pro_idx"));
			// **************************** idx 번호 가져옴 ************************** //

			if ("".equals(multi.getParameter("pro_img_list")) || multi.getParameter("pro_img_list") == null) // 이미지를
																												// 수정하지
																												// 않았다.
			{

			} else // 이미지가 수정되었다면..
			{
				// 기존 이미지를 지움
				File directory = new File("/plan/weddingQ_product/studio/" + pro_idx);
				File[] files = directory.listFiles();
				if (files != null) {
					for (File file : files) {
						if (file.isFile()) {
							Utils.fileDelete(directory + "/" + file.getName());
						}
					}
				}
				// 기존 이미지를 지움

				// 지금 올라온 이미지를 넘김
				String pro_img_list[] = (multi.getParameter("pro_img_list")).split("&&");
				for (int i = 0; i < pro_img_list.length; i++) {
					Utils.fileMove(savePath + pro_img_list[i], directory + "/" + pro_img_list[i]);
				}
				// 지금 올라온 이미지를 넘김
			}

			String pro_sort = multi.getParameter("pro_sort");
			String pro_com_idx = multi.getParameter("pro_com_idx");
			String pro_com_name = multi.getParameter("com_name");
			String pro_category = multi.getParameter("pro_category");

			String pro_name = multi.getParameter("pro_name");
			String pro_homepage = multi.getParameter("pro_homepage");
			String pro_tel = multi.getParameter("pro_tel1") + "-" + multi.getParameter("pro_tel2") + "-"
					+ multi.getParameter("pro_tel3");
			String pro_zipcode = multi.getParameter("pro_zipcode");
			String pro_addr1 = multi.getParameter("pro_addr1");
			String pro_addr2 = multi.getParameter("pro_addr2");
			String pro_subway1 = multi.getParameter("pro_subway1") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway1") + "1") + "&&"
					+ multi.getParameter("pro_subway1_3") + "&&" + multi.getParameter("pro_subway1_4");
			String pro_subway2 = multi.getParameter("pro_subway2") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway2") + "2") + "&&"
					+ multi.getParameter("pro_subway2_3") + "&&" + multi.getParameter("pro_subway2_4");
			String pro_subway3 = multi.getParameter("pro_subway3") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway3") + "3") + "&&"
					+ multi.getParameter("pro_subway3_3") + "&&" + multi.getParameter("pro_subway3_4");
			String pro_bus = multi.getParameter("pro_bus").replace("\r\n", "<br>").replace("\"", "＂").replace("\'",
					"’");
			String pro_intro1 = multi.getParameter("pro_intro1").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");
			String pro_intro2 = multi.getParameter("pro_intro2").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");

			String pro_type = "";

			if ("on".equals(multi.getParameter("웨딩스튜디오"))) {
				pro_type += "&&웨딩스튜디오";
			}
			if ("on".equals(multi.getParameter("세미촬영"))) {
				pro_type += "&&세미촬영";
			}
			if ("on".equals(multi.getParameter("데이트스냅"))) {
				pro_type += "&&데이트스냅";
			}
			if ("on".equals(multi.getParameter("허니문스냅"))) {
				pro_type += "&&허니문스냅";
			}
			if ("on".equals(multi.getParameter("셀프웨딩촬영"))) {
				pro_type += "&&셀프웨딩촬영";
			}

			if (pro_type.length() > 2) {
				pro_type = pro_type.substring(2, pro_type.length());
			}

			String pro_clothes = multi.getParameter("pro_clothes");
			String pro_props = multi.getParameter("pro_props");
			String pro_play_time = multi.getParameter("pro_play_time");
			String pro_photo_time = multi.getParameter("pro_photo_time1") + ":" + multi.getParameter("pro_photo_time2")
					+ "~" + multi.getParameter("pro_photo_time3") + ":" + multi.getParameter("pro_photo_time4");
			String pro_talk_time = multi.getParameter("pro_talk_time1") + ":" + multi.getParameter("pro_talk_time2")
					+ "~" + multi.getParameter("pro_talk_time3") + ":" + multi.getParameter("pro_talk_time4");

			String pro_holiday = multi.getParameter("pro_holiday");
			String pro_parking = multi.getParameter("pro_parking").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");

			String pro_concept1 = "";

			if ("on".equals(multi.getParameter("심플 모던"))) {
				pro_concept1 += "&&심플 모던";
			}
			if ("on".equals(multi.getParameter("럭셔리 클래식"))) {
				pro_concept1 += "&&럭셔리 클래식";
			}
			if ("on".equals(multi.getParameter("러블리"))) {
				pro_concept1 += "&&러블리";
			}
			if ("on".equals(multi.getParameter("컬러풀"))) {
				pro_concept1 += "&&컬러풀";
			}
			if ("on".equals(multi.getParameter("내추럴 빈티지"))) {
				pro_concept1 += "&&내추럴 빈티지";
			}

			if (pro_concept1.length() > 2) {
				pro_concept1 = pro_concept1.substring(2, pro_concept1.length());
			}

			String pro_concept2 = "";

			if ("on".equals(multi.getParameter("인물중심"))) {
				pro_concept2 += "&&인물중심";
			}
			if ("on".equals(multi.getParameter("배경중심"))) {
				pro_concept2 += "&&배경중심";
			}

			if (pro_concept2.length() > 2) {
				pro_concept2 = pro_concept2.substring(2, pro_concept2.length());
			}

			int pro_composition_cnt = Integer.parseInt(multi.getParameter("pro_composition_cnt"));
			String pro_composition = "";
			String pro_composition_pay = "";
			String pro_composition_charge = "";
			String pro_composition_price = "";
			String pro_composition_dc = "";
			for (int i = 1; i <= pro_composition_cnt; i++) {
				pro_composition += multi.getParameter("pro_composition_" + i) + "&&";
				pro_composition_pay += multi.getParameter("pro_composition_pay_" + i) + "&&";
				pro_composition_charge += multi.getParameter("pro_composition_charge_" + i) + "&&";
				pro_composition_price += multi.getParameter("pro_composition_price_" + i) + "&&";
				pro_composition_dc += multi.getParameter("pro_composition_dc_" + i) + "&&";
			}
			pro_composition = pro_composition.substring(0, pro_composition.length() - 2);
			pro_composition_pay = pro_composition_pay.substring(0, pro_composition_pay.length() - 2);
			pro_composition_charge = pro_composition_charge.substring(0, pro_composition_charge.length() - 2);
			pro_composition_price = pro_composition_price.substring(0, pro_composition_price.length() - 2);
			pro_composition_dc = pro_composition_dc.substring(0, pro_composition_dc.length() - 2);

			int pro_add_cnt = Integer.parseInt(multi.getParameter("pro_add_cnt"));
			String pro_add_name = "";
			String pro_add_pay = "";
			for (int i = 1; i <= pro_add_cnt; i++) {
				pro_add_name += multi.getParameter("pro_add_name_" + i) + "&&";
				pro_add_pay += multi.getParameter("pro_add_pay_" + i) + "&&";
			}
			pro_add_name = pro_add_name.substring(0, pro_add_name.length() - 2);
			pro_add_pay = pro_add_pay.substring(0, pro_add_pay.length() - 2);

			String pro_pay_engine = multi.getParameter("pro_pay_engine");
			String pro_pay_number = multi.getParameter("pro_pay_number");
			String pro_pay_name = multi.getParameter("pro_pay_name");

			String pro_change_date = multi.getParameter("pro_change_date").replace("\r\n", "  <br>  ")
					.replace("\"", "＂").replace("\'", "’");
			String pro_sorry_pay = multi.getParameter("pro_sorry_pay").replace("\r\n", "  <br>  ").replace("\"", "＂")
					.replace("\'", "’");

			String pro_sdm_pay = "";
			if ("on".equals(multi.getParameter("100만원미만"))) {
				pro_sdm_pay += "&&100만원미만";
			}
			if ("on".equals(multi.getParameter("100만원~150만원"))) {
				pro_sdm_pay += "&&100만원~150만원";
			}
			if ("on".equals(multi.getParameter("150만원~200만원"))) {
				pro_sdm_pay += "&&150만원~200만원";
			}
			if ("on".equals(multi.getParameter("200만원~250만원"))) {
				pro_sdm_pay += "&&200만원~250만원";
			}
			if ("on".equals(multi.getParameter("250만원~300만원"))) {
				pro_sdm_pay += "&&250만원~300만원";
			}
			if ("on".equals(multi.getParameter("300만원~350만원"))) {
				pro_sdm_pay += "&&300만원~350만원";
			}
			if ("on".equals(multi.getParameter("350만원~400만원"))) {
				pro_sdm_pay += "&&350만원~400만원";
			}
			if ("on".equals(multi.getParameter("400만원~450만원"))) {
				pro_sdm_pay += "&&400만원~450만원";
			}
			if ("on".equals(multi.getParameter("450만원~500만원"))) {
				pro_sdm_pay += "&&450만원~500만원";
			}
			if ("on".equals(multi.getParameter("500만원 이상"))) {
				pro_sdm_pay += "&&500만원 이상";
			}

			if (pro_sdm_pay.length() > 2) {
				pro_sdm_pay = pro_sdm_pay.substring(2, pro_sdm_pay.length());
			}

			int pro_event_cnt = Integer.parseInt(multi.getParameter("pro_event_cnt"));
			String pro_event = "";
			for (int i = 1; i <= pro_event_cnt; i++) {
				if ("on".equals(multi.getParameter("pro_event_bold_" + i))) {
					pro_event += "(bold)";
				}
				pro_event += multi.getParameter("pro_event_" + i) + "&&";
			}
			pro_event = pro_event.substring(0, pro_event.length() - 2);

			studio_dao.upStudio(pro_idx, pro_sort, pro_com_idx, pro_com_name, pro_category, pro_name, pro_homepage,
					pro_tel, pro_zipcode, pro_addr1, pro_addr2, pro_subway1, pro_subway2, pro_subway3, pro_bus,
					pro_intro1, pro_intro2, pro_type, pro_clothes, pro_props, pro_play_time, pro_photo_time,
					pro_talk_time, pro_holiday, pro_parking, pro_concept1, pro_concept2, pro_composition,
					pro_composition_pay, pro_composition_charge, pro_composition_price, pro_composition_dc, pro_sdm_pay,
					pro_add_name, pro_add_pay, pro_event, pro_pay_engine, pro_pay_number, pro_pay_name, pro_change_date,
					pro_sorry_pay);

			// 상품명 기입
			if (pro_name.equals(multi.getParameter("pro_name_yet"))) // 상품명을 수정하지않음.
			{

			} else {
				String query = "com_idx = '" + pro_com_idx + "'";
				List<Company_vo> list = company_dao.selList_company(query);

				String com_pro_name = list.get(0).getCom_pro_name();
				com_pro_name = com_pro_name.replaceAll(multi.getParameter("pro_name_yet"), pro_name); // 기존 파일명을 지운다.
				company_dao.upComProName(pro_com_idx, com_pro_name);
			}
			// 상품명 기입

		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
		}
		return mav;
	}

	@RequestMapping("/update_dress.pnp")
	public ModelAndView update_dress(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/update_dress");

		String pro_idx = request.getParameter("idx");

		String query = "1 and pro_idx = '" + pro_idx + "'";
		List<Dress_vo> list = dress_dao.selList_dress(query);

		mav.addObject("pro_idx", list.get(0).getPro_idx());
		mav.addObject("pro_sort", list.get(0).getPro_sort());
		mav.addObject("pro_com_idx", list.get(0).getPro_com_idx());
		mav.addObject("pro_com_name", list.get(0).getPro_com_name());
		mav.addObject("pro_category", list.get(0).getPro_category());
		mav.addObject("pro_name", list.get(0).getPro_name());
		mav.addObject("pro_homepage", list.get(0).getPro_homepage());
		mav.addObject("pro_tel", list.get(0).getPro_tel());
		mav.addObject("pro_zipcode", list.get(0).getPro_zipcode());
		mav.addObject("pro_addr1", list.get(0).getPro_addr1());
		mav.addObject("pro_addr2", list.get(0).getPro_addr2());
		mav.addObject("pro_subway1", list.get(0).getPro_subway1());
		mav.addObject("pro_subway2", list.get(0).getPro_subway2());
		mav.addObject("pro_subway3", list.get(0).getPro_subway3());
		mav.addObject("pro_bus", list.get(0).getPro_bus());
		mav.addObject("pro_intro1", list.get(0).getPro_intro1());
		mav.addObject("pro_intro2", list.get(0).getPro_intro2());
		mav.addObject("pro_brand", list.get(0).getPro_brand());
		mav.addObject("pro_type", list.get(0).getPro_type());
		mav.addObject("pro_talk_time", list.get(0).getPro_talk_time());
		mav.addObject("pro_holiday", list.get(0).getPro_holiday());
		mav.addObject("pro_parking", list.get(0).getPro_parking());
		mav.addObject("pro_composition", list.get(0).getPro_composition());
		mav.addObject("pro_composition_pay", list.get(0).getPro_composition_pay());
		mav.addObject("pro_composition_charge", list.get(0).getPro_composition_charge());
		mav.addObject("pro_composition_price", list.get(0).getPro_composition_price());
		mav.addObject("pro_composition_dc", list.get(0).getPro_composition_dc());
		mav.addObject("pro_sdm_pay", list.get(0).getPro_sdm_pay());
		mav.addObject("pro_add_name", list.get(0).getPro_add_name());
		mav.addObject("pro_add_pay", list.get(0).getPro_add_pay());
		mav.addObject("pro_event", list.get(0).getPro_event());
		mav.addObject("pro_pay_engine", list.get(0).getPro_pay_engine());
		mav.addObject("pro_pay_number", list.get(0).getPro_pay_number());
		mav.addObject("pro_pay_name", list.get(0).getPro_pay_name());
		mav.addObject("pro_change_date", list.get(0).getPro_change_date());
		mav.addObject("pro_sorry_pay", list.get(0).getPro_sorry_pay());

		String zipFilePath = "/plan/weddingQ_product/dress/" + list.get(0).getPro_idx();
		String zipFileName = "/plan/weddingQ_product/dress/" + list.get(0).getPro_idx() + "/dress_"
				+ list.get(0).getPro_idx() + ".zip";
		String isFile = "f";
		try {
			// 기존 압축파일 지움
			File directory = new File("/plan/weddingQ_product/dress/" + list.get(0).getPro_idx());
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					isFile = "t";
					if (file.isFile() && (file.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory + "/" + file.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile)) {
				Utils.createZip(zipFilePath, zipFileName);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile", isFile);

		String zipFilePath2 = "/plan/weddingQ_sample/dress/" + list.get(0).getPro_idx();
		String zipFileName2 = "/plan/weddingQ_sample/dress/" + list.get(0).getPro_idx() + "/dress_"
				+ list.get(0).getPro_idx() + ".zip";
		String isFile2 = "f";
		try {
			// 기존 압축파일 지움
			File directory2 = new File("/plan/weddingQ_sample/dress/" + list.get(0).getPro_idx());
			File[] files2 = directory2.listFiles();
			if (files2 != null) {
				for (File file2 : files2) {
					isFile2 = "t";
					if (file2.isFile() && (file2.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory2 + "/" + file2.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile2)) {
				Utils.createZip(zipFilePath2, zipFileName2);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile2", isFile2);

		return mav;
	}

	@RequestMapping("/update_snap.pnp")
	public ModelAndView update_snap(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/update_snap");

		String pro_idx = request.getParameter("idx");

		String query = "1 and pro_idx = '" + pro_idx + "'";
		List<Snap_vo> list = snap_dao.selList_snap(query);

		mav.addObject("pro_idx", list.get(0).getPro_idx());
		mav.addObject("pro_sort", list.get(0).getPro_sort());
		mav.addObject("pro_com_idx", list.get(0).getPro_com_idx());
		mav.addObject("pro_com_name", list.get(0).getPro_com_name());
		mav.addObject("pro_category", list.get(0).getPro_category());
		mav.addObject("pro_name", list.get(0).getPro_name());
		mav.addObject("pro_homepage", list.get(0).getPro_homepage());
		mav.addObject("pro_tel", list.get(0).getPro_tel());
		mav.addObject("pro_zipcode", list.get(0).getPro_zipcode());
		mav.addObject("pro_addr1", list.get(0).getPro_addr1());
		mav.addObject("pro_addr2", list.get(0).getPro_addr2());
		mav.addObject("pro_subway1", list.get(0).getPro_subway1());
		mav.addObject("pro_subway2", list.get(0).getPro_subway2());
		mav.addObject("pro_subway3", list.get(0).getPro_subway3());
		mav.addObject("pro_bus", list.get(0).getPro_bus());
		mav.addObject("pro_intro1", list.get(0).getPro_intro1());
		mav.addObject("pro_intro2", list.get(0).getPro_intro2());
		mav.addObject("pro_location", list.get(0).getPro_location());
		mav.addObject("pro_talk_time", list.get(0).getPro_talk_time());
		mav.addObject("pro_holiday", list.get(0).getPro_holiday());
		mav.addObject("pro_composition", list.get(0).getPro_composition());
		mav.addObject("pro_composition_pay", list.get(0).getPro_composition_pay());
		mav.addObject("pro_composition_charge", list.get(0).getPro_composition_charge());
		mav.addObject("pro_composition_price", list.get(0).getPro_composition_price());
		mav.addObject("pro_composition_dc", list.get(0).getPro_composition_dc());
		mav.addObject("pro_add_name", list.get(0).getPro_add_name());
		mav.addObject("pro_add_pay", list.get(0).getPro_add_pay());
		mav.addObject("pro_event", list.get(0).getPro_event());
		mav.addObject("pro_pay_engine", list.get(0).getPro_pay_engine());
		mav.addObject("pro_pay_number", list.get(0).getPro_pay_number());
		mav.addObject("pro_pay_name", list.get(0).getPro_pay_name());

		String zipFilePath = "/plan/weddingQ_product/snap/" + list.get(0).getPro_idx();
		String zipFileName = "/plan/weddingQ_product/snap/" + list.get(0).getPro_idx() + "/snap_"
				+ list.get(0).getPro_idx() + ".zip";
		String isFile = "f";
		try {
			// 기존 압축파일 지움
			File directory = new File("/plan/weddingQ_product/snap/" + list.get(0).getPro_idx());
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					isFile = "t";
					if (file.isFile() && (file.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory + "/" + file.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile)) {
				Utils.createZip(zipFilePath, zipFileName);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile", isFile);

		String zipFilePath2 = "/plan/weddingQ_sample/snap/" + list.get(0).getPro_idx();
		String zipFileName2 = "/plan/weddingQ_sample/snap/" + list.get(0).getPro_idx() + "/snap_"
				+ list.get(0).getPro_idx() + ".zip";
		String isFile2 = "f";
		try {
			// 기존 압축파일 지움
			File directory2 = new File("/plan/weddingQ_sample/snap/" + list.get(0).getPro_idx());
			File[] files2 = directory2.listFiles();
			if (files2 != null) {
				for (File file2 : files2) {
					isFile2 = "t";
					if (file2.isFile() && (file2.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory2 + "/" + file2.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile2)) {
				Utils.createZip(zipFilePath2, zipFileName2);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile2", isFile2);

		return mav;
	}

	@RequestMapping("/update_dress_output.pnp")
	public ModelAndView update_dress_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/update_dress_output");

		try {
			String savePath = "/plan/weddingQ_product/dress/";
			int sizeLimit = 1024 * 1024 * 1000; // 1000메가..
			File dir = new File(savePath);
			if (!dir.exists()) { // 디렉토리가 존재하지 않으면
				dir.mkdirs(); // 디렉토리 생성.!
			}

			MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "utf-8",
					new DefaultFileRenamePolicy());

			// **************************** idx 번호 가져옴 ************************** //
			int pro_idx = Integer.parseInt(multi.getParameter("pro_idx"));
			// **************************** idx 번호 가져옴 ************************** //

			if ("".equals(multi.getParameter("pro_img_list")) || multi.getParameter("pro_img_list") == null) // 이미지를
																												// 수정하지
																												// 않았다.
			{

			} else // 이미지가 수정되었다면..
			{
				// 기존 이미지를 지움
				File directory = new File("/plan/weddingQ_product/dress/" + pro_idx);
				File[] files = directory.listFiles();
				if (files != null) {
					for (File file : files) {
						if (file.isFile()) {
							Utils.fileDelete(directory + "/" + file.getName());
						}
					}
				}
				// 기존 이미지를 지움

				// 지금 올라온 이미지를 넘김
				String pro_img_list[] = (multi.getParameter("pro_img_list")).split("&&");
				for (int i = 0; i < pro_img_list.length; i++) {
					Utils.fileMove(savePath + pro_img_list[i], directory + "/" + pro_img_list[i]);
				}
				// 지금 올라온 이미지를 넘김
			}

			String pro_sort = multi.getParameter("pro_sort");
			String pro_com_idx = multi.getParameter("pro_com_idx");
			String pro_com_name = multi.getParameter("com_name");
			String pro_category = multi.getParameter("pro_category");

			String pro_name = multi.getParameter("pro_name");
			String pro_homepage = multi.getParameter("pro_homepage");
			String pro_tel = multi.getParameter("pro_tel1") + "-" + multi.getParameter("pro_tel2") + "-"
					+ multi.getParameter("pro_tel3");
			String pro_zipcode = multi.getParameter("pro_zipcode");
			String pro_addr1 = multi.getParameter("pro_addr1");
			String pro_addr2 = multi.getParameter("pro_addr2");
			String pro_subway1 = multi.getParameter("pro_subway1") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway1") + "1") + "&&"
					+ multi.getParameter("pro_subway1_3") + "&&" + multi.getParameter("pro_subway1_4");
			String pro_subway2 = multi.getParameter("pro_subway2") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway2") + "2") + "&&"
					+ multi.getParameter("pro_subway2_3") + "&&" + multi.getParameter("pro_subway2_4");
			String pro_subway3 = multi.getParameter("pro_subway3") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway3") + "3") + "&&"
					+ multi.getParameter("pro_subway3_3") + "&&" + multi.getParameter("pro_subway3_4");
			String pro_bus = multi.getParameter("pro_bus").replace("\r\n", "<br>").replace("\"", "＂").replace("\'",
					"’");
			String pro_intro1 = multi.getParameter("pro_intro1").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");
			String pro_intro2 = multi.getParameter("pro_intro2").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");

			String pro_type = "";

			if ("on".equals(multi.getParameter("대여"))) {
				pro_type += "&&대여";
			}
			if ("on".equals(multi.getParameter("판매"))) {
				pro_type += "&&판매";
			}

			if (pro_type.length() > 2) {
				pro_type = pro_type.substring(2, pro_type.length());
			}

			String pro_brand = "";

			if ("on".equals(multi.getParameter("수입드레스"))) {
				pro_brand += "&&수입드레스";
			}
			if ("on".equals(multi.getParameter("멀티샵"))) {
				pro_brand += "&&멀티샵";
			}
			if (pro_brand.length() > 2) {
				pro_brand = pro_brand.substring(2, pro_brand.length());
			}

			String pro_talk_time = multi.getParameter("pro_talk_time1") + ":" + multi.getParameter("pro_talk_time2")
					+ "~" + multi.getParameter("pro_talk_time3") + ":" + multi.getParameter("pro_talk_time4");

			String pro_holiday = multi.getParameter("pro_holiday");
			String pro_parking = multi.getParameter("pro_parking").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");

			int pro_composition_cnt = Integer.parseInt(multi.getParameter("pro_composition_cnt"));
			String pro_composition = "";
			String pro_composition_pay = "";
			String pro_composition_charge = "";
			String pro_composition_price = "";
			String pro_composition_dc = "";
			for (int i = 1; i <= pro_composition_cnt; i++) {
				pro_composition += multi.getParameter("pro_composition_" + i) + "&&";
				pro_composition_pay += multi.getParameter("pro_composition_pay_" + i) + "&&";
				pro_composition_charge += multi.getParameter("pro_composition_charge_" + i) + "&&";
				pro_composition_price += multi.getParameter("pro_composition_price_" + i) + "&&";
				pro_composition_dc += multi.getParameter("pro_composition_dc_" + i) + "&&";
			}
			pro_composition = pro_composition.substring(0, pro_composition.length() - 2);
			pro_composition_pay = pro_composition_pay.substring(0, pro_composition_pay.length() - 2);
			pro_composition_charge = pro_composition_charge.substring(0, pro_composition_charge.length() - 2);
			pro_composition_price = pro_composition_price.substring(0, pro_composition_price.length() - 2);
			pro_composition_dc = pro_composition_dc.substring(0, pro_composition_dc.length() - 2);

			int pro_add_cnt = Integer.parseInt(multi.getParameter("pro_add_cnt"));
			String pro_add_name = "";
			String pro_add_pay = "";
			for (int i = 1; i <= pro_add_cnt; i++) {
				pro_add_name += multi.getParameter("pro_add_name_" + i) + "&&";
				pro_add_pay += multi.getParameter("pro_add_pay_" + i) + "&&";
			}
			pro_add_name = pro_add_name.substring(0, pro_add_name.length() - 2);
			pro_add_pay = pro_add_pay.substring(0, pro_add_pay.length() - 2);

			String pro_pay_engine = multi.getParameter("pro_pay_engine");
			String pro_pay_number = multi.getParameter("pro_pay_number");
			String pro_pay_name = multi.getParameter("pro_pay_name");

			String pro_change_date = multi.getParameter("pro_change_date").replace("\r\n", "  <br>  ")
					.replace("\"", "＂").replace("\'", "’");
			String pro_sorry_pay = multi.getParameter("pro_sorry_pay").replace("\r\n", "  <br>  ").replace("\"", "＂")
					.replace("\'", "’");

			String pro_sdm_pay = "";
			if ("on".equals(multi.getParameter("100만원미만"))) {
				pro_sdm_pay += "&&100만원미만";
			}
			if ("on".equals(multi.getParameter("100만원~150만원"))) {
				pro_sdm_pay += "&&100만원~150만원";
			}
			if ("on".equals(multi.getParameter("150만원~200만원"))) {
				pro_sdm_pay += "&&150만원~200만원";
			}
			if ("on".equals(multi.getParameter("200만원~250만원"))) {
				pro_sdm_pay += "&&200만원~250만원";
			}
			if ("on".equals(multi.getParameter("250만원~300만원"))) {
				pro_sdm_pay += "&&250만원~300만원";
			}
			if ("on".equals(multi.getParameter("300만원~350만원"))) {
				pro_sdm_pay += "&&300만원~350만원";
			}
			if ("on".equals(multi.getParameter("350만원~400만원"))) {
				pro_sdm_pay += "&&350만원~400만원";
			}
			if ("on".equals(multi.getParameter("400만원~450만원"))) {
				pro_sdm_pay += "&&400만원~450만원";
			}
			if ("on".equals(multi.getParameter("450만원~500만원"))) {
				pro_sdm_pay += "&&450만원~500만원";
			}
			if ("on".equals(multi.getParameter("500만원 이상"))) {
				pro_sdm_pay += "&&500만원 이상";
			}

			if (pro_sdm_pay.length() > 2) {
				pro_sdm_pay = pro_sdm_pay.substring(2, pro_sdm_pay.length());
			}

			int pro_event_cnt = Integer.parseInt(multi.getParameter("pro_event_cnt"));
			String pro_event = "";
			for (int i = 1; i <= pro_event_cnt; i++) {
				if ("on".equals(multi.getParameter("pro_event_bold_" + i))) {
					pro_event += "(bold)";
				}
				pro_event += multi.getParameter("pro_event_" + i) + "&&";
			}
			pro_event = pro_event.substring(0, pro_event.length() - 2);

			dress_dao.upDress(pro_idx, pro_sort, pro_com_idx, pro_com_name, pro_category, pro_name, pro_homepage,
					pro_tel, pro_zipcode, pro_addr1, pro_addr2, pro_subway1, pro_subway2, pro_subway3, pro_bus,
					pro_intro1, pro_intro2, pro_type, pro_brand, pro_talk_time, pro_holiday, pro_parking,
					pro_composition, pro_composition_pay, pro_composition_charge, pro_composition_price,
					pro_composition_dc, pro_sdm_pay, pro_add_name, pro_add_pay, pro_event, pro_pay_engine,
					pro_pay_number, pro_pay_name, pro_change_date, pro_sorry_pay);

			// 상품명 기입
			if (pro_name.equals(multi.getParameter("pro_name_yet"))) // 상품명을 수정하지않음.
			{

			} else {
				String query = "com_idx = '" + pro_com_idx + "'";
				List<Company_vo> list = company_dao.selList_company(query);

				String com_pro_name = list.get(0).getCom_pro_name();
				com_pro_name = com_pro_name.replaceAll(multi.getParameter("pro_name_yet"), pro_name); // 기존 파일명을 지운다.
				company_dao.upComProName(pro_com_idx, com_pro_name);
			}
			// 상품명 기입

		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
		}
		return mav;
	}

	@RequestMapping("/update_snap_output.pnp")
	public ModelAndView update_snap_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/update_snap_output");

		try {
			String savePath = "/plan/weddingQ_product/snap/";
			int sizeLimit = 1024 * 1024 * 1000; // 1000메가..
			File dir = new File(savePath);
			if (!dir.exists()) { // 디렉토리가 존재하지 않으면
				dir.mkdirs(); // 디렉토리 생성.!
			}

			MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "utf-8",
					new DefaultFileRenamePolicy());

			// **************************** idx 번호 가져옴 ************************** //
			int pro_idx = Integer.parseInt(multi.getParameter("pro_idx"));
			// **************************** idx 번호 가져옴 ************************** //

			if ("".equals(multi.getParameter("pro_img_list")) || multi.getParameter("pro_img_list") == null) // 이미지를
																												// 수정하지
																												// 않았다.
			{

			} else // 이미지가 수정되었다면..
			{
				// 기존 이미지를 지움
				File directory = new File("/plan/weddingQ_product/snap/" + pro_idx);
				File[] files = directory.listFiles();
				if (files != null) {
					for (File file : files) {
						if (file.isFile()) {
							Utils.fileDelete(directory + "/" + file.getName());
						}
					}
				}
				// 기존 이미지를 지움

				// 지금 올라온 이미지를 넘김
				String pro_img_list[] = (multi.getParameter("pro_img_list")).split("&&");
				for (int i = 0; i < pro_img_list.length; i++) {
					Utils.fileMove(savePath + pro_img_list[i], directory + "/" + pro_img_list[i]);
				}
				// 지금 올라온 이미지를 넘김
			}

			String pro_sort = multi.getParameter("pro_sort");
			String pro_com_idx = multi.getParameter("pro_com_idx");
			String pro_com_name = multi.getParameter("com_name");
			String pro_category = multi.getParameter("pro_category");

			String pro_name = multi.getParameter("pro_name");
			String pro_homepage = multi.getParameter("pro_homepage");
			String pro_tel = multi.getParameter("pro_tel1") + "-" + multi.getParameter("pro_tel2") + "-"
					+ multi.getParameter("pro_tel3");
			String pro_zipcode = multi.getParameter("pro_zipcode");
			String pro_addr1 = multi.getParameter("pro_addr1");
			String pro_addr2 = multi.getParameter("pro_addr2");
			String pro_subway1 = multi.getParameter("pro_subway1") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway1") + "1") + "&&"
					+ multi.getParameter("pro_subway1_3") + "&&" + multi.getParameter("pro_subway1_4");
			String pro_subway2 = multi.getParameter("pro_subway2") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway2") + "2") + "&&"
					+ multi.getParameter("pro_subway2_3") + "&&" + multi.getParameter("pro_subway2_4");
			String pro_subway3 = multi.getParameter("pro_subway3") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway3") + "3") + "&&"
					+ multi.getParameter("pro_subway3_3") + "&&" + multi.getParameter("pro_subway3_4");
			String pro_bus = multi.getParameter("pro_bus").replace("\r\n", "<br>").replace("\"", "＂").replace("\'",
					"’");
			String pro_intro1 = multi.getParameter("pro_intro1").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");
			String pro_intro2 = multi.getParameter("pro_intro2").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");

			String pro_location = "";

			if ("on".equals(multi.getParameter("전국"))) {
				pro_location += "&&전국";
			}
			if ("on".equals(multi.getParameter("서울"))) {
				pro_location += "&&서울";
			}
			if ("on".equals(multi.getParameter("경기"))) {
				pro_location += "&&경기";
			}
			if ("on".equals(multi.getParameter("인천"))) {
				pro_location += "&&인천";
			}
			if ("on".equals(multi.getParameter("강원도"))) {
				pro_location += "&&강원도";
			}
			if ("on".equals(multi.getParameter("경상도"))) {
				pro_location += "&&경상도";
			}
			if ("on".equals(multi.getParameter("경상남도"))) {
				pro_location += "&&경상남도";
			}
			if ("on".equals(multi.getParameter("경상북도"))) {
				pro_location += "&&경상북도";
			}
			if ("on".equals(multi.getParameter("광주"))) {
				pro_location += "&&광주";
			}
			if ("on".equals(multi.getParameter("대구"))) {
				pro_location += "&&대구";
			}
			if ("on".equals(multi.getParameter("대전"))) {
				pro_location += "&&대전";
			}
			if ("on".equals(multi.getParameter("부산"))) {
				pro_location += "&&부산";
			}
			if ("on".equals(multi.getParameter("울산"))) {
				pro_location += "&&울산";
			}
			if ("on".equals(multi.getParameter("전라도"))) {
				pro_location += "&&전라도";
			}
			if ("on".equals(multi.getParameter("전남"))) {
				pro_location += "&&전남";
			}
			if ("on".equals(multi.getParameter("전북"))) {
				pro_location += "&&전북";
			}
			if ("on".equals(multi.getParameter("제주도"))) {
				pro_location += "&&제주도";
			}
			if ("on".equals(multi.getParameter("충청도"))) {
				pro_location += "&&충청도";
			}
			if ("on".equals(multi.getParameter("충남"))) {
				pro_location += "&&충남";
			}
			if ("on".equals(multi.getParameter("충북"))) {
				pro_location += "&&충북";
			}
			if ("on".equals(multi.getParameter("세종"))) {
				pro_location += "&&세종";
			}

			if (pro_location.length() > 2) {
				pro_location = pro_location.substring(2, pro_location.length());
			}

			String pro_talk_time = multi.getParameter("pro_talk_time1") + ":" + multi.getParameter("pro_talk_time2")
					+ "~" + multi.getParameter("pro_talk_time3") + ":" + multi.getParameter("pro_talk_time4");

			String pro_holiday = multi.getParameter("pro_holiday");

			int pro_composition_cnt = Integer.parseInt(multi.getParameter("pro_composition_cnt"));
			String pro_composition = "";
			String pro_composition_pay = "";
			String pro_composition_charge = "";
			String pro_composition_price = "";
			String pro_composition_dc = "";
			for (int i = 1; i <= pro_composition_cnt; i++) {
				pro_composition += multi.getParameter("pro_composition_" + i) + "&&";
				pro_composition_pay += multi.getParameter("pro_composition_pay_" + i) + "&&";
				pro_composition_charge += multi.getParameter("pro_composition_charge_" + i) + "&&";
				pro_composition_price += multi.getParameter("pro_composition_price_" + i) + "&&";
				pro_composition_dc += multi.getParameter("pro_composition_dc_" + i) + "&&";
			}
			pro_composition = pro_composition.substring(0, pro_composition.length() - 2);
			pro_composition_pay = pro_composition_pay.substring(0, pro_composition_pay.length() - 2);
			pro_composition_charge = pro_composition_charge.substring(0, pro_composition_charge.length() - 2);
			pro_composition_price = pro_composition_price.substring(0, pro_composition_price.length() - 2);
			pro_composition_dc = pro_composition_dc.substring(0, pro_composition_dc.length() - 2);

			int pro_add_cnt = Integer.parseInt(multi.getParameter("pro_add_cnt"));
			String pro_add_name = "";
			String pro_add_pay = "";
			for (int i = 1; i <= pro_add_cnt; i++) {
				pro_add_name += multi.getParameter("pro_add_name_" + i) + "&&";
				pro_add_pay += multi.getParameter("pro_add_pay_" + i) + "&&";
			}
			pro_add_name = pro_add_name.substring(0, pro_add_name.length() - 2);
			pro_add_pay = pro_add_pay.substring(0, pro_add_pay.length() - 2);

			String pro_pay_engine = multi.getParameter("pro_pay_engine");
			String pro_pay_number = multi.getParameter("pro_pay_number");
			String pro_pay_name = multi.getParameter("pro_pay_name");

			int pro_event_cnt = Integer.parseInt(multi.getParameter("pro_event_cnt"));
			String pro_event = "";
			for (int i = 1; i <= pro_event_cnt; i++) {
				if ("on".equals(multi.getParameter("pro_event_bold_" + i))) {
					pro_event += "(bold)";
				}
				pro_event += multi.getParameter("pro_event_" + i) + "&&";
			}
			pro_event = pro_event.substring(0, pro_event.length() - 2);

			snap_dao.upSnap(pro_idx, pro_sort, pro_com_idx, pro_com_name, pro_category, pro_name, pro_homepage, pro_tel,
					pro_zipcode, pro_addr1, pro_addr2, pro_subway1, pro_subway2, pro_subway3, pro_bus, pro_intro1,
					pro_intro2, pro_location, pro_talk_time, pro_holiday, pro_composition, pro_composition_pay,
					pro_composition_charge, pro_composition_price, pro_composition_dc, pro_add_name, pro_add_pay,
					pro_event, pro_pay_engine, pro_pay_number, pro_pay_name);

			// 상품명 기입
			if (pro_name.equals(multi.getParameter("pro_name_yet"))) // 상품명을 수정하지않음.
			{

			} else {
				String query = "com_idx = '" + pro_com_idx + "'";
				List<Company_vo> list = company_dao.selList_company(query);

				String com_pro_name = list.get(0).getCom_pro_name();
				com_pro_name = com_pro_name.replaceAll(multi.getParameter("pro_name_yet"), pro_name); // 기존 파일명을 지운다.
				company_dao.upComProName(pro_com_idx, com_pro_name);
			}
			// 상품명 기입

		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
		}
		return mav;
	}

	@RequestMapping("/update_makeup.pnp")
	public ModelAndView update_makeup(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/update_makeup");

		String pro_idx = request.getParameter("idx");

		String query = "1 and pro_idx = '" + pro_idx + "'";
		List<Makeup_vo> list = makeup_dao.selList_makeup(query);

		mav.addObject("pro_idx", list.get(0).getPro_idx());
		mav.addObject("pro_sort", list.get(0).getPro_sort());
		mav.addObject("pro_com_idx", list.get(0).getPro_com_idx());
		mav.addObject("pro_com_name", list.get(0).getPro_com_name());
		mav.addObject("pro_category", list.get(0).getPro_category());
		mav.addObject("pro_name", list.get(0).getPro_name());
		mav.addObject("pro_homepage", list.get(0).getPro_homepage());
		mav.addObject("pro_tel", list.get(0).getPro_tel());
		mav.addObject("pro_zipcode", list.get(0).getPro_zipcode());
		mav.addObject("pro_addr1", list.get(0).getPro_addr1());
		mav.addObject("pro_addr2", list.get(0).getPro_addr2());
		mav.addObject("pro_subway1", list.get(0).getPro_subway1());
		mav.addObject("pro_subway2", list.get(0).getPro_subway2());
		mav.addObject("pro_subway3", list.get(0).getPro_subway3());
		mav.addObject("pro_bus", list.get(0).getPro_bus());
		mav.addObject("pro_intro1", list.get(0).getPro_intro1());
		mav.addObject("pro_intro2", list.get(0).getPro_intro2());
		mav.addObject("pro_go", list.get(0).getPro_go());
		mav.addObject("pro_concept", list.get(0).getPro_concept());
		mav.addObject("pro_talk_time", list.get(0).getPro_talk_time());
		mav.addObject("pro_holiday", list.get(0).getPro_holiday());
		mav.addObject("pro_parking", list.get(0).getPro_parking());
		mav.addObject("pro_composition", list.get(0).getPro_composition());
		mav.addObject("pro_composition_pay", list.get(0).getPro_composition_pay());
		mav.addObject("pro_composition_charge", list.get(0).getPro_composition_charge());
		mav.addObject("pro_composition_price", list.get(0).getPro_composition_price());
		mav.addObject("pro_composition_dc", list.get(0).getPro_composition_dc());
		mav.addObject("pro_sdm_pay", list.get(0).getPro_sdm_pay());
		mav.addObject("pro_add_name", list.get(0).getPro_add_name());
		mav.addObject("pro_add_pay", list.get(0).getPro_add_pay());
		mav.addObject("pro_event", list.get(0).getPro_event());
		mav.addObject("pro_pay_engine", list.get(0).getPro_pay_engine());
		mav.addObject("pro_pay_number", list.get(0).getPro_pay_number());
		mav.addObject("pro_pay_name", list.get(0).getPro_pay_name());
		mav.addObject("pro_change_date", list.get(0).getPro_change_date());
		mav.addObject("pro_sorry_pay", list.get(0).getPro_sorry_pay());

		String zipFilePath = "/plan/weddingQ_product/makeup/" + list.get(0).getPro_idx();
		String zipFileName = "/plan/weddingQ_product/makeup/" + list.get(0).getPro_idx() + "/makeup_"
				+ list.get(0).getPro_idx() + ".zip";
		String isFile = "f";
		try {
			// 기존 압축파일 지움
			File directory = new File("/plan/weddingQ_product/makeup/" + list.get(0).getPro_idx());
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					isFile = "t";
					if (file.isFile() && (file.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory + "/" + file.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile)) {
				Utils.createZip(zipFilePath, zipFileName);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile", isFile);

		String zipFilePath2 = "/plan/weddingQ_sample/makeup/" + list.get(0).getPro_idx();
		String zipFileName2 = "/plan/weddingQ_sample/makeup/" + list.get(0).getPro_idx() + "/makeup_"
				+ list.get(0).getPro_idx() + ".zip";
		String isFile2 = "f";
		try {
			// 기존 압축파일 지움
			File directory2 = new File("/plan/weddingQ_sample/makeup/" + list.get(0).getPro_idx());
			File[] files2 = directory2.listFiles();
			if (files2 != null) {
				for (File file2 : files2) {
					isFile2 = "t";
					if (file2.isFile() && (file2.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory2 + "/" + file2.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile2)) {
				Utils.createZip(zipFilePath2, zipFileName2);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile2", isFile2);

		return mav;
	}

	@RequestMapping("/update_makeup_output.pnp")
	public ModelAndView update_makeup_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/update_makeup_output");

		try {
			String savePath = "/plan/weddingQ_product/makeup/";
			int sizeLimit = 1024 * 1024 * 1000; // 1000메가..
			File dir = new File(savePath);
			if (!dir.exists()) { // 디렉토리가 존재하지 않으면
				dir.mkdirs(); // 디렉토리 생성.!
			}

			MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "utf-8",
					new DefaultFileRenamePolicy());

			// **************************** idx 번호 가져옴 ************************** //
			int pro_idx = Integer.parseInt(multi.getParameter("pro_idx"));
			// **************************** idx 번호 가져옴 ************************** //

			if ("".equals(multi.getParameter("pro_img_list")) || multi.getParameter("pro_img_list") == null) // 이미지를
																												// 수정하지
																												// 않았다.
			{

			} else // 이미지가 수정되었다면..
			{
				// 기존 이미지를 지움
				File directory = new File("/plan/weddingQ_product/makeup/" + pro_idx);
				File[] files = directory.listFiles();
				if (files != null) {
					for (File file : files) {
						if (file.isFile()) {
							Utils.fileDelete(directory + "/" + file.getName());
						}
					}
				}
				// 기존 이미지를 지움

				// 지금 올라온 이미지를 넘김
				String pro_img_list[] = (multi.getParameter("pro_img_list")).split("&&");
				for (int i = 0; i < pro_img_list.length; i++) {
					Utils.fileMove(savePath + pro_img_list[i], directory + "/" + pro_img_list[i]);
				}
				// 지금 올라온 이미지를 넘김
			}

			String pro_sort = multi.getParameter("pro_sort");
			String pro_com_idx = multi.getParameter("pro_com_idx");
			String pro_com_name = multi.getParameter("com_name");
			String pro_category = multi.getParameter("pro_category");

			String pro_name = multi.getParameter("pro_name");
			String pro_homepage = multi.getParameter("pro_homepage");
			String pro_tel = multi.getParameter("pro_tel1") + "-" + multi.getParameter("pro_tel2") + "-"
					+ multi.getParameter("pro_tel3");
			String pro_zipcode = multi.getParameter("pro_zipcode");
			String pro_addr1 = multi.getParameter("pro_addr1");
			String pro_addr2 = multi.getParameter("pro_addr2");
			String pro_subway1 = multi.getParameter("pro_subway1") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway1") + "1") + "&&"
					+ multi.getParameter("pro_subway1_3") + "&&" + multi.getParameter("pro_subway1_4");
			String pro_subway2 = multi.getParameter("pro_subway2") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway2") + "2") + "&&"
					+ multi.getParameter("pro_subway2_3") + "&&" + multi.getParameter("pro_subway2_4");
			String pro_subway3 = multi.getParameter("pro_subway3") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway3") + "3") + "&&"
					+ multi.getParameter("pro_subway3_3") + "&&" + multi.getParameter("pro_subway3_4");
			String pro_bus = multi.getParameter("pro_bus").replace("\r\n", "<br>").replace("\"", "＂").replace("\'",
					"’");
			String pro_intro1 = multi.getParameter("pro_intro1").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");
			String pro_intro2 = multi.getParameter("pro_intro2").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");

			String pro_go = "";

			if ("on".equals(multi.getParameter("출장가능"))) {
				pro_go = "출장가능";
			}

			String pro_talk_time = multi.getParameter("pro_talk_time1") + ":" + multi.getParameter("pro_talk_time2")
					+ "~" + multi.getParameter("pro_talk_time3") + ":" + multi.getParameter("pro_talk_time4");

			String pro_holiday = multi.getParameter("pro_holiday");
			String pro_parking = multi.getParameter("pro_parking").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");

			String pro_concept = "";

			if ("on".equals(multi.getParameter("내추럴"))) {
				pro_concept += "&&내추럴";
			}
			if ("on".equals(multi.getParameter("스모키"))) {
				pro_concept += "&&스모키";
			}
			if ("on".equals(multi.getParameter("세미스모키"))) {
				pro_concept += "&&세미스모키";
			}
			if ("on".equals(multi.getParameter("포인트"))) {
				pro_concept += "&&포인트";
			}
			if ("on".equals(multi.getParameter("로맨틱"))) {
				pro_concept += "&&로맨틱";
			}
			if ("on".equals(multi.getParameter("큐트"))) {
				pro_concept += "&&큐트";
			}

			if (pro_concept.length() > 2) {
				pro_concept = pro_concept.substring(2, pro_concept.length());
			}

			int pro_composition_cnt = Integer.parseInt(multi.getParameter("pro_composition_cnt"));
			String pro_composition = "";
			String pro_composition_pay = "";
			String pro_composition_charge = "";
			String pro_composition_price = "";
			String pro_composition_dc = "";
			for (int i = 1; i <= pro_composition_cnt; i++) {
				pro_composition += multi.getParameter("pro_composition_" + i) + "&&";
				pro_composition_pay += multi.getParameter("pro_composition_pay_" + i) + "&&";
				pro_composition_charge += multi.getParameter("pro_composition_charge_" + i) + "&&";
				pro_composition_price += multi.getParameter("pro_composition_price_" + i) + "&&";
				pro_composition_dc += multi.getParameter("pro_composition_dc_" + i) + "&&";
			}
			pro_composition = pro_composition.substring(0, pro_composition.length() - 2);
			pro_composition_pay = pro_composition_pay.substring(0, pro_composition_pay.length() - 2);
			pro_composition_charge = pro_composition_charge.substring(0, pro_composition_charge.length() - 2);
			pro_composition_price = pro_composition_price.substring(0, pro_composition_price.length() - 2);
			pro_composition_dc = pro_composition_dc.substring(0, pro_composition_dc.length() - 2);

			int pro_add_cnt = Integer.parseInt(multi.getParameter("pro_add_cnt"));
			String pro_add_name = "";
			String pro_add_pay = "";
			for (int i = 1; i <= pro_add_cnt; i++) {
				pro_add_name += multi.getParameter("pro_add_name_" + i) + "&&";
				pro_add_pay += multi.getParameter("pro_add_pay_" + i) + "&&";
			}
			pro_add_name = pro_add_name.substring(0, pro_add_name.length() - 2);
			pro_add_pay = pro_add_pay.substring(0, pro_add_pay.length() - 2);

			String pro_pay_engine = multi.getParameter("pro_pay_engine");
			String pro_pay_number = multi.getParameter("pro_pay_number");
			String pro_pay_name = multi.getParameter("pro_pay_name");

			String pro_change_date = multi.getParameter("pro_change_date").replace("\r\n", "  <br>  ")
					.replace("\"", "＂").replace("\'", "’");
			String pro_sorry_pay = multi.getParameter("pro_sorry_pay").replace("\r\n", "  <br>  ").replace("\"", "＂")
					.replace("\'", "’");

			String pro_sdm_pay = "";
			if ("on".equals(multi.getParameter("100만원미만"))) {
				pro_sdm_pay += "&&100만원미만";
			}
			if ("on".equals(multi.getParameter("100만원~150만원"))) {
				pro_sdm_pay += "&&100만원~150만원";
			}
			if ("on".equals(multi.getParameter("150만원~200만원"))) {
				pro_sdm_pay += "&&150만원~200만원";
			}
			if ("on".equals(multi.getParameter("200만원~250만원"))) {
				pro_sdm_pay += "&&200만원~250만원";
			}
			if ("on".equals(multi.getParameter("250만원~300만원"))) {
				pro_sdm_pay += "&&250만원~300만원";
			}
			if ("on".equals(multi.getParameter("300만원~350만원"))) {
				pro_sdm_pay += "&&300만원~350만원";
			}
			if ("on".equals(multi.getParameter("350만원~400만원"))) {
				pro_sdm_pay += "&&350만원~400만원";
			}
			if ("on".equals(multi.getParameter("400만원~450만원"))) {
				pro_sdm_pay += "&&400만원~450만원";
			}
			if ("on".equals(multi.getParameter("450만원~500만원"))) {
				pro_sdm_pay += "&&450만원~500만원";
			}
			if ("on".equals(multi.getParameter("500만원 이상"))) {
				pro_sdm_pay += "&&500만원 이상";
			}

			if (pro_sdm_pay.length() > 2) {
				pro_sdm_pay = pro_sdm_pay.substring(2, pro_sdm_pay.length());
			}

			int pro_event_cnt = Integer.parseInt(multi.getParameter("pro_event_cnt"));
			String pro_event = "";
			for (int i = 1; i <= pro_event_cnt; i++) {
				if ("on".equals(multi.getParameter("pro_event_bold_" + i))) {
					pro_event += "(bold)";
				}
				pro_event += multi.getParameter("pro_event_" + i) + "&&";
			}
			pro_event = pro_event.substring(0, pro_event.length() - 2);

			makeup_dao.upMakeup(pro_idx, pro_sort, pro_com_idx, pro_com_name, pro_category, pro_name, pro_homepage,
					pro_tel, pro_zipcode, pro_addr1, pro_addr2, pro_subway1, pro_subway2, pro_subway3, pro_bus,
					pro_intro1, pro_intro2, pro_go, pro_talk_time, pro_holiday, pro_parking, pro_concept,
					pro_composition, pro_composition_pay, pro_composition_charge, pro_composition_price,
					pro_composition_dc, pro_sdm_pay, pro_add_name, pro_add_pay, pro_event, pro_pay_engine,
					pro_pay_number, pro_pay_name, pro_change_date, pro_sorry_pay);

			// 상품명 기입
			if (pro_name.equals(multi.getParameter("pro_name_yet"))) // 상품명을 수정하지않음.
			{

			} else {
				String query = "com_idx = '" + pro_com_idx + "'";
				List<Company_vo> list = company_dao.selList_company(query);

				String com_pro_name = list.get(0).getCom_pro_name();
				com_pro_name = com_pro_name.replaceAll(multi.getParameter("pro_name_yet"), pro_name); // 기존 파일명을 지운다.
				company_dao.upComProName(pro_com_idx, com_pro_name);
			}
			// 상품명 기입

		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
		}
		return mav;
	}

	@RequestMapping("/update_suit.pnp")
	public ModelAndView update_suit(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/update_suit");

		String pro_idx = request.getParameter("idx");

		String query = "1 and pro_idx = '" + pro_idx + "'";
		List<Suit_vo> list = suit_dao.selList_suit(query);

		mav.addObject("pro_idx", list.get(0).getPro_idx());
		mav.addObject("pro_sort", list.get(0).getPro_sort());
		mav.addObject("pro_com_idx", list.get(0).getPro_com_idx());
		mav.addObject("pro_com_name", list.get(0).getPro_com_name());
		mav.addObject("pro_category", list.get(0).getPro_category());
		mav.addObject("pro_name", list.get(0).getPro_name());
		mav.addObject("pro_homepage", list.get(0).getPro_homepage());
		mav.addObject("pro_tel", list.get(0).getPro_tel());
		mav.addObject("pro_zipcode", list.get(0).getPro_zipcode());
		mav.addObject("pro_addr1", list.get(0).getPro_addr1());
		mav.addObject("pro_addr2", list.get(0).getPro_addr2());
		mav.addObject("pro_subway1", list.get(0).getPro_subway1());
		mav.addObject("pro_subway2", list.get(0).getPro_subway2());
		mav.addObject("pro_subway3", list.get(0).getPro_subway3());
		mav.addObject("pro_bus", list.get(0).getPro_bus());
		mav.addObject("pro_intro1", list.get(0).getPro_intro1());
		mav.addObject("pro_intro2", list.get(0).getPro_intro2());
		mav.addObject("pro_type", list.get(0).getPro_type());
		mav.addObject("pro_talk_time", list.get(0).getPro_talk_time());
		mav.addObject("pro_holiday", list.get(0).getPro_holiday());
		mav.addObject("pro_parking", list.get(0).getPro_parking());
		mav.addObject("pro_service", list.get(0).getPro_service());
		mav.addObject("pro_event", list.get(0).getPro_event());
		mav.addObject("pro_cashback", list.get(0).getPro_cashback());
		mav.addObject("pro_composition", list.get(0).getPro_composition());
		mav.addObject("pro_composition_charge", list.get(0).getPro_composition_charge());
		mav.addObject("pro_composition_price", list.get(0).getPro_composition_price());
		mav.addObject("pro_add_name", list.get(0).getPro_add_name());
		mav.addObject("pro_add_pay", list.get(0).getPro_add_pay());
		mav.addObject("pro_pay_engine", list.get(0).getPro_pay_engine());
		mav.addObject("pro_pay_number", list.get(0).getPro_pay_number());
		mav.addObject("pro_pay_name", list.get(0).getPro_pay_name());

		String zipFilePath = "/plan/weddingQ_product/suit/" + list.get(0).getPro_idx();
		String zipFileName = "/plan/weddingQ_product/suit/" + list.get(0).getPro_idx() + "/suit_"
				+ list.get(0).getPro_idx() + ".zip";
		String isFile = "f";
		try {
			// 기존 압축파일 지움
			File directory = new File("/plan/weddingQ_product/suit/" + list.get(0).getPro_idx());
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					isFile = "t";
					if (file.isFile() && (file.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory + "/" + file.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile)) {
				Utils.createZip(zipFilePath, zipFileName);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile", isFile);

		String zipFilePath2 = "/plan/weddingQ_sample/suit/" + list.get(0).getPro_idx();
		String zipFileName2 = "/plan/weddingQ_sample/suit/" + list.get(0).getPro_idx() + "/suit_"
				+ list.get(0).getPro_idx() + ".zip";
		String isFile2 = "f";
		try {
			// 기존 압축파일 지움
			File directory2 = new File("/plan/weddingQ_sample/suit/" + list.get(0).getPro_idx());
			File[] files2 = directory2.listFiles();
			if (files2 != null) {
				for (File file2 : files2) {
					isFile2 = "t";
					if (file2.isFile() && (file2.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory2 + "/" + file2.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile2)) {
				Utils.createZip(zipFilePath2, zipFileName2);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile2", isFile2);

		return mav;
	}

	@RequestMapping("/update_suit_output.pnp")
	public ModelAndView update_suit_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/update_suit_output");

		try {
			String savePath = "/plan/weddingQ_product/suit/";
			int sizeLimit = 1024 * 1024 * 1000; // 1000메가..
			File dir = new File(savePath);
			if (!dir.exists()) { // 디렉토리가 존재하지 않으면
				dir.mkdirs(); // 디렉토리 생성.!
			}

			MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "utf-8",
					new DefaultFileRenamePolicy());

			// **************************** idx 번호 가져옴 ************************** //
			int pro_idx = Integer.parseInt(multi.getParameter("pro_idx"));
			// **************************** idx 번호 가져옴 ************************** //

			if ("".equals(multi.getParameter("pro_img_list")) || multi.getParameter("pro_img_list") == null) // 이미지를
																												// 수정하지
																												// 않았다.
			{

			} else // 이미지가 수정되었다면..
			{
				// 기존 이미지를 지움
				File directory = new File("/plan/weddingQ_product/suit/" + pro_idx);
				File[] files = directory.listFiles();
				if (files != null) {
					for (File file : files) {
						if (file.isFile()) {
							Utils.fileDelete(directory + "/" + file.getName());
						}
					}
				}
				// 기존 이미지를 지움

				// 지금 올라온 이미지를 넘김
				String pro_img_list[] = (multi.getParameter("pro_img_list")).split("&&");
				for (int i = 0; i < pro_img_list.length; i++) {
					Utils.fileMove(savePath + pro_img_list[i], directory + "/" + pro_img_list[i]);
				}
				// 지금 올라온 이미지를 넘김
			}
			String pro_sort = multi.getParameter("pro_sort");
			String pro_com_idx = multi.getParameter("pro_com_idx");
			String pro_com_name = multi.getParameter("com_name");
			String pro_category = multi.getParameter("pro_category");

			String pro_name = multi.getParameter("pro_name");
			String pro_homepage = multi.getParameter("pro_homepage");
			String pro_tel = multi.getParameter("pro_tel1") + "-" + multi.getParameter("pro_tel2") + "-"
					+ multi.getParameter("pro_tel3");
			String pro_zipcode = multi.getParameter("pro_zipcode");
			String pro_addr1 = multi.getParameter("pro_addr1");
			String pro_addr2 = multi.getParameter("pro_addr2");
			String pro_subway1 = multi.getParameter("pro_subway1") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway1") + "1") + "&&"
					+ multi.getParameter("pro_subway1_3") + "&&" + multi.getParameter("pro_subway1_4");
			String pro_subway2 = multi.getParameter("pro_subway2") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway2") + "2") + "&&"
					+ multi.getParameter("pro_subway2_3") + "&&" + multi.getParameter("pro_subway2_4");
			String pro_subway3 = multi.getParameter("pro_subway3") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway3") + "3") + "&&"
					+ multi.getParameter("pro_subway3_3") + "&&" + multi.getParameter("pro_subway3_4");
			String pro_bus = multi.getParameter("pro_bus").replace("\r\n", "<br>").replace("\"", "＂").replace("\'",
					"’");
			String pro_intro1 = multi.getParameter("pro_intro1").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");
			String pro_intro2 = multi.getParameter("pro_intro2").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");

			String pro_type = "";

			if ("on".equals(multi.getParameter("맞춤"))) {
				pro_type += "&&맞춤";
			}
			if ("on".equals(multi.getParameter("대여"))) {
				pro_type += "&&대여";
			}
			if ("on".equals(multi.getParameter("맞춤시 대여서비스"))) {
				pro_type += "&&맞춤시 대여서비스";
			}
			if ("on".equals(multi.getParameter("맞춤시 턱시도 리폼"))) {
				pro_type += "&&맞춤시 턱시도 리폼";
			}

			if (pro_type.length() > 2) {
				pro_type = pro_type.substring(2, pro_type.length());
			}

			String pro_talk_time = multi.getParameter("pro_talk_time1") + ":" + multi.getParameter("pro_talk_time2")
					+ "~" + multi.getParameter("pro_talk_time3") + ":" + multi.getParameter("pro_talk_time4");

			String pro_holiday = multi.getParameter("pro_holiday");
			String pro_parking = multi.getParameter("pro_parking").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");

			int pro_service_cnt = Integer.parseInt(multi.getParameter("pro_service_cnt"));
			String pro_service = "";
			for (int i = 1; i <= pro_service_cnt; i++) {
				pro_service += multi.getParameter("pro_service_" + i) + "&&";
			}
			pro_service = pro_service.substring(0, pro_service.length() - 2);

			int pro_composition_cnt = Integer.parseInt(multi.getParameter("pro_composition_cnt"));
			String pro_composition = "";
			String pro_composition_charge = "";
			String pro_composition_price = "";
			for (int i = 1; i <= pro_composition_cnt; i++) {
				pro_composition += multi.getParameter("pro_composition_" + i) + "&&";
				pro_composition_charge += multi.getParameter("pro_composition_charge_" + i) + "&&";
				pro_composition_price += multi.getParameter("pro_composition_price_" + i) + "&&";
			}
			pro_composition = pro_composition.substring(0, pro_composition.length() - 2);
			pro_composition_charge = pro_composition_charge.substring(0, pro_composition_charge.length() - 2);
			pro_composition_price = pro_composition_price.substring(0, pro_composition_price.length() - 2);

			int pro_add_cnt = Integer.parseInt(multi.getParameter("pro_add_cnt"));
			String pro_add_name = "";
			String pro_add_pay = "";
			for (int i = 1; i <= pro_add_cnt; i++) {
				pro_add_name += multi.getParameter("pro_add_name_" + i) + "&&";
				pro_add_pay += multi.getParameter("pro_add_pay_" + i) + "&&";
			}
			pro_add_name = pro_add_name.substring(0, pro_add_name.length() - 2);
			pro_add_pay = pro_add_pay.substring(0, pro_add_pay.length() - 2);

			int pro_event_cnt = Integer.parseInt(multi.getParameter("pro_event_cnt"));
			String pro_event = "";
			for (int i = 1; i <= pro_event_cnt; i++) {
				if ("on".equals(multi.getParameter("pro_event_bold_" + i))) {
					pro_event += "(bold)";
				}
				pro_event += multi.getParameter("pro_event_" + i) + "&&";
			}
			pro_event = pro_event.substring(0, pro_event.length() - 2);

			String pro_pay_engine = multi.getParameter("pro_pay_engine");
			String pro_pay_number = multi.getParameter("pro_pay_number");
			String pro_pay_name = multi.getParameter("pro_pay_name");

			String pro_cashback = multi.getParameter("pro_cashback");
			suit_dao.upSuit(pro_idx, pro_sort, pro_com_idx, pro_com_name, pro_category, pro_name, pro_homepage, pro_tel,
					pro_zipcode, pro_addr1, pro_addr2, pro_subway1, pro_subway2, pro_subway3, pro_bus, pro_intro1,
					pro_intro2, pro_type, pro_talk_time, pro_holiday, pro_parking, pro_service, pro_composition,
					pro_composition_charge, pro_composition_price, pro_add_name, pro_add_pay, pro_event, pro_cashback,
					pro_pay_engine, pro_pay_number, pro_pay_name);

			// 상품명 기입
			if (pro_name.equals(multi.getParameter("pro_name_yet"))) // 상품명을 수정하지않음.
			{

			} else {
				String query = "com_idx = '" + pro_com_idx + "'";
				List<Company_vo> list = company_dao.selList_company(query);

				String com_pro_name = list.get(0).getCom_pro_name();
				com_pro_name = com_pro_name.replaceAll(multi.getParameter("pro_name_yet"), pro_name); // 기존 파일명을 지운다.
				company_dao.upComProName(pro_com_idx, com_pro_name);
			}
			// 상품명 기입

		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
		}
		return mav;
	}

	@RequestMapping("/update_korea.pnp")
	public ModelAndView update_korea(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/update_korea");

		String pro_idx = request.getParameter("idx");

		String query = "1 and pro_idx = '" + pro_idx + "'";
		List<Korea_vo> list = korea_dao.selList_korea(query);

		mav.addObject("pro_idx", list.get(0).getPro_idx());
		mav.addObject("pro_sort", list.get(0).getPro_sort());
		mav.addObject("pro_com_idx", list.get(0).getPro_com_idx());
		mav.addObject("pro_com_name", list.get(0).getPro_com_name());
		mav.addObject("pro_category", list.get(0).getPro_category());
		mav.addObject("pro_name", list.get(0).getPro_name());
		mav.addObject("pro_homepage", list.get(0).getPro_homepage());
		mav.addObject("pro_tel", list.get(0).getPro_tel());
		mav.addObject("pro_zipcode", list.get(0).getPro_zipcode());
		mav.addObject("pro_addr1", list.get(0).getPro_addr1());
		mav.addObject("pro_addr2", list.get(0).getPro_addr2());
		mav.addObject("pro_subway1", list.get(0).getPro_subway1());
		mav.addObject("pro_subway2", list.get(0).getPro_subway2());
		mav.addObject("pro_subway3", list.get(0).getPro_subway3());
		mav.addObject("pro_bus", list.get(0).getPro_bus());
		mav.addObject("pro_intro1", list.get(0).getPro_intro1());
		mav.addObject("pro_intro2", list.get(0).getPro_intro2());
		mav.addObject("pro_type", list.get(0).getPro_type());
		mav.addObject("pro_talk_time", list.get(0).getPro_talk_time());
		mav.addObject("pro_holiday", list.get(0).getPro_holiday());
		mav.addObject("pro_parking", list.get(0).getPro_parking());
		mav.addObject("pro_service", list.get(0).getPro_service());
		mav.addObject("pro_event", list.get(0).getPro_event());
		mav.addObject("pro_cashback", list.get(0).getPro_cashback());
		mav.addObject("pro_composition", list.get(0).getPro_composition());
		mav.addObject("pro_composition_charge", list.get(0).getPro_composition_charge());
		mav.addObject("pro_composition_price", list.get(0).getPro_composition_price());
		mav.addObject("pro_add_name", list.get(0).getPro_add_name());
		mav.addObject("pro_add_pay", list.get(0).getPro_add_pay());
		mav.addObject("pro_pay_engine", list.get(0).getPro_pay_engine());
		mav.addObject("pro_pay_number", list.get(0).getPro_pay_number());
		mav.addObject("pro_pay_name", list.get(0).getPro_pay_name());

		String zipFilePath = "/plan/weddingQ_product/korea/" + list.get(0).getPro_idx();
		String zipFileName = "/plan/weddingQ_product/korea/" + list.get(0).getPro_idx() + "/korea_"
				+ list.get(0).getPro_idx() + ".zip";
		String isFile = "f";
		try {
			// 기존 압축파일 지움
			File directory = new File("/plan/weddingQ_product/korea/" + list.get(0).getPro_idx());
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					isFile = "t";
					if (file.isFile() && (file.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory + "/" + file.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile)) {
				Utils.createZip(zipFilePath, zipFileName);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile", isFile);

		String zipFilePath2 = "/plan/weddingQ_sample/korea/" + list.get(0).getPro_idx();
		String zipFileName2 = "/plan/weddingQ_sample/korea/" + list.get(0).getPro_idx() + "/korea_"
				+ list.get(0).getPro_idx() + ".zip";
		String isFile2 = "f";
		try {
			// 기존 압축파일 지움
			File directory2 = new File("/plan/weddingQ_sample/korea/" + list.get(0).getPro_idx());
			File[] files2 = directory2.listFiles();
			if (files2 != null) {
				for (File file2 : files2) {
					isFile2 = "t";
					if (file2.isFile() && (file2.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory2 + "/" + file2.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile2)) {
				Utils.createZip(zipFilePath2, zipFileName2);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile2", isFile2);

		return mav;
	}

	@RequestMapping("/update_korea_output.pnp")
	public ModelAndView update_korea_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/update_korea_output");

		try {
			String savePath = "/plan/weddingQ_product/korea/";
			int sizeLimit = 1024 * 1024 * 1000; // 1000메가..
			File dir = new File(savePath);
			if (!dir.exists()) { // 디렉토리가 존재하지 않으면
				dir.mkdirs(); // 디렉토리 생성.!
			}

			MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "utf-8",
					new DefaultFileRenamePolicy());

			// **************************** idx 번호 가져옴 ************************** //
			int pro_idx = Integer.parseInt(multi.getParameter("pro_idx"));
			// **************************** idx 번호 가져옴 ************************** //

			if ("".equals(multi.getParameter("pro_img_list")) || multi.getParameter("pro_img_list") == null) // 이미지를
																												// 수정하지
																												// 않았다.
			{

			} else // 이미지가 수정되었다면..
			{
				// 기존 이미지를 지움
				File directory = new File("/plan/weddingQ_product/korea/" + pro_idx);
				File[] files = directory.listFiles();
				if (files != null) {
					for (File file : files) {
						if (file.isFile()) {
							Utils.fileDelete(directory + "/" + file.getName());
						}
					}
				}
				// 기존 이미지를 지움

				// 지금 올라온 이미지를 넘김
				String pro_img_list[] = (multi.getParameter("pro_img_list")).split("&&");
				for (int i = 0; i < pro_img_list.length; i++) {
					Utils.fileMove(savePath + pro_img_list[i], directory + "/" + pro_img_list[i]);
				}
				// 지금 올라온 이미지를 넘김
			}
			String pro_sort = multi.getParameter("pro_sort");
			String pro_com_idx = multi.getParameter("pro_com_idx");
			String pro_com_name = multi.getParameter("com_name");
			String pro_category = multi.getParameter("pro_category");

			String pro_name = multi.getParameter("pro_name");
			String pro_homepage = multi.getParameter("pro_homepage");
			String pro_tel = multi.getParameter("pro_tel1") + "-" + multi.getParameter("pro_tel2") + "-"
					+ multi.getParameter("pro_tel3");
			String pro_zipcode = multi.getParameter("pro_zipcode");
			String pro_addr1 = multi.getParameter("pro_addr1");
			String pro_addr2 = multi.getParameter("pro_addr2");
			String pro_subway1 = multi.getParameter("pro_subway1") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway1") + "1") + "&&"
					+ multi.getParameter("pro_subway1_3") + "&&" + multi.getParameter("pro_subway1_4");
			String pro_subway2 = multi.getParameter("pro_subway2") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway2") + "2") + "&&"
					+ multi.getParameter("pro_subway2_3") + "&&" + multi.getParameter("pro_subway2_4");
			String pro_subway3 = multi.getParameter("pro_subway3") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway3") + "3") + "&&"
					+ multi.getParameter("pro_subway3_3") + "&&" + multi.getParameter("pro_subway3_4");
			String pro_bus = multi.getParameter("pro_bus").replace("\r\n", "<br>").replace("\"", "＂").replace("\'",
					"’");
			String pro_intro1 = multi.getParameter("pro_intro1").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");
			String pro_intro2 = multi.getParameter("pro_intro2").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");

			String pro_type = "";

			if ("on".equals(multi.getParameter("맞춤"))) {
				pro_type += "&&맞춤";
			}
			if ("on".equals(multi.getParameter("대여"))) {
				pro_type += "&&대여";
			}

			if (pro_type.length() > 2) {
				pro_type = pro_type.substring(2, pro_type.length());
			}

			String pro_talk_time = multi.getParameter("pro_talk_time1") + ":" + multi.getParameter("pro_talk_time2")
					+ "~" + multi.getParameter("pro_talk_time3") + ":" + multi.getParameter("pro_talk_time4");

			String pro_holiday = multi.getParameter("pro_holiday");
			String pro_parking = multi.getParameter("pro_parking").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");

			int pro_service_cnt = Integer.parseInt(multi.getParameter("pro_service_cnt"));
			String pro_service = "";
			for (int i = 1; i <= pro_service_cnt; i++) {
				pro_service += multi.getParameter("pro_service_" + i) + "&&";
			}
			pro_service = pro_service.substring(0, pro_service.length() - 2);

			int pro_composition_cnt = Integer.parseInt(multi.getParameter("pro_composition_cnt"));
			String pro_composition = "";
			String pro_composition_charge = "";
			String pro_composition_price = "";
			for (int i = 1; i <= pro_composition_cnt; i++) {
				pro_composition += multi.getParameter("pro_composition_" + i) + "&&";
				pro_composition_charge += multi.getParameter("pro_composition_charge_" + i) + "&&";
				pro_composition_price += multi.getParameter("pro_composition_price_" + i) + "&&";
			}
			pro_composition = pro_composition.substring(0, pro_composition.length() - 2);
			pro_composition_charge = pro_composition_charge.substring(0, pro_composition_charge.length() - 2);
			pro_composition_price = pro_composition_price.substring(0, pro_composition_price.length() - 2);

			int pro_add_cnt = Integer.parseInt(multi.getParameter("pro_add_cnt"));
			String pro_add_name = "";
			String pro_add_pay = "";
			for (int i = 1; i <= pro_add_cnt; i++) {
				pro_add_name += multi.getParameter("pro_add_name_" + i) + "&&";
				pro_add_pay += multi.getParameter("pro_add_pay_" + i) + "&&";
			}
			pro_add_name = pro_add_name.substring(0, pro_add_name.length() - 2);
			pro_add_pay = pro_add_pay.substring(0, pro_add_pay.length() - 2);

			int pro_event_cnt = Integer.parseInt(multi.getParameter("pro_event_cnt"));
			String pro_event = "";
			for (int i = 1; i <= pro_event_cnt; i++) {
				if ("on".equals(multi.getParameter("pro_event_bold_" + i))) {
					pro_event += "(bold)";
				}
				pro_event += multi.getParameter("pro_event_" + i) + "&&";
			}
			pro_event = pro_event.substring(0, pro_event.length() - 2);

			String pro_pay_engine = multi.getParameter("pro_pay_engine");
			String pro_pay_number = multi.getParameter("pro_pay_number");
			String pro_pay_name = multi.getParameter("pro_pay_name");

			String pro_cashback = multi.getParameter("pro_cashback");
			korea_dao.upKorea(pro_idx, pro_sort, pro_com_idx, pro_com_name, pro_category, pro_name, pro_homepage,
					pro_tel, pro_zipcode, pro_addr1, pro_addr2, pro_subway1, pro_subway2, pro_subway3, pro_bus,
					pro_intro1, pro_intro2, pro_type, pro_talk_time, pro_holiday, pro_parking, pro_service,
					pro_composition, pro_composition_charge, pro_composition_price, pro_add_name, pro_add_pay,
					pro_event, pro_cashback, pro_pay_engine, pro_pay_number, pro_pay_name);

			// 상품명 기입
			if (pro_name.equals(multi.getParameter("pro_name_yet"))) // 상품명을 수정하지않음.
			{

			} else {
				String query = "com_idx = '" + pro_com_idx + "'";
				List<Company_vo> list = company_dao.selList_company(query);

				String com_pro_name = list.get(0).getCom_pro_name();
				com_pro_name = com_pro_name.replaceAll(multi.getParameter("pro_name_yet"), pro_name); // 기존 파일명을 지운다.
				company_dao.upComProName(pro_com_idx, com_pro_name);
			}
			// 상품명 기입

		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
		}
		return mav;
	}

	@RequestMapping("/update_jewelry.pnp")
	public ModelAndView update_jewelry(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/update_jewelry");

		String pro_idx = request.getParameter("idx");

		String query = "1 and pro_idx = '" + pro_idx + "'";
		List<Jewelry_vo> list = jewelry_dao.selList_jewelry(query);

		mav.addObject("pro_idx", list.get(0).getPro_idx());
		mav.addObject("pro_sort", list.get(0).getPro_sort());
		mav.addObject("pro_com_idx", list.get(0).getPro_com_idx());
		mav.addObject("pro_com_name", list.get(0).getPro_com_name());
		mav.addObject("pro_category", list.get(0).getPro_category());
		mav.addObject("pro_name", list.get(0).getPro_name());
		mav.addObject("pro_homepage", list.get(0).getPro_homepage());
		mav.addObject("pro_tel", list.get(0).getPro_tel());
		mav.addObject("pro_zipcode", list.get(0).getPro_zipcode());
		mav.addObject("pro_addr1", list.get(0).getPro_addr1());
		mav.addObject("pro_addr2", list.get(0).getPro_addr2());
		mav.addObject("pro_subway1", list.get(0).getPro_subway1());
		mav.addObject("pro_subway2", list.get(0).getPro_subway2());
		mav.addObject("pro_subway3", list.get(0).getPro_subway3());
		mav.addObject("pro_bus", list.get(0).getPro_bus());
		mav.addObject("pro_intro1", list.get(0).getPro_intro1());
		mav.addObject("pro_intro2", list.get(0).getPro_intro2());
		mav.addObject("pro_talk_time", list.get(0).getPro_talk_time());
		mav.addObject("pro_holiday", list.get(0).getPro_holiday());
		mav.addObject("pro_parking", list.get(0).getPro_parking());
		mav.addObject("pro_service", list.get(0).getPro_service());
		mav.addObject("pro_event", list.get(0).getPro_event());
		mav.addObject("pro_cashback", list.get(0).getPro_cashback());
		mav.addObject("pro_composition", list.get(0).getPro_composition());
		mav.addObject("pro_composition_charge", list.get(0).getPro_composition_charge());
		mav.addObject("pro_composition_price", list.get(0).getPro_composition_price());
		mav.addObject("pro_add_name", list.get(0).getPro_add_name());
		mav.addObject("pro_add_pay", list.get(0).getPro_add_pay());
		mav.addObject("pro_pay_engine", list.get(0).getPro_pay_engine());
		mav.addObject("pro_pay_number", list.get(0).getPro_pay_number());
		mav.addObject("pro_pay_name", list.get(0).getPro_pay_name());

		String zipFilePath = "/plan/weddingQ_product/jewelry/" + list.get(0).getPro_idx();
		String zipFileName = "/plan/weddingQ_product/jewelry/" + list.get(0).getPro_idx() + "/jewelry_"
				+ list.get(0).getPro_idx() + ".zip";
		String isFile = "f";
		try {
			// 기존 압축파일 지움
			File directory = new File("/plan/weddingQ_product/jewelry/" + list.get(0).getPro_idx());
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					isFile = "t";
					if (file.isFile() && (file.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory + "/" + file.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile)) {
				Utils.createZip(zipFilePath, zipFileName);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile", isFile);

		String zipFilePath2 = "/plan/weddingQ_sample/jewelry/" + list.get(0).getPro_idx();
		String zipFileName2 = "/plan/weddingQ_sample/jewelry/" + list.get(0).getPro_idx() + "/jewelry_"
				+ list.get(0).getPro_idx() + ".zip";
		String isFile2 = "f";
		try {
			// 기존 압축파일 지움
			File directory2 = new File("/plan/weddingQ_sample/jewelry/" + list.get(0).getPro_idx());
			File[] files2 = directory2.listFiles();
			if (files2 != null) {
				for (File file2 : files2) {
					isFile2 = "t";
					if (file2.isFile() && (file2.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory2 + "/" + file2.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile2)) {
				Utils.createZip(zipFilePath2, zipFileName2);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile2", isFile2);

		return mav;
	}

	@RequestMapping("/update_jewelry_output.pnp")
	public ModelAndView update_jewelry_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/update_jewelry_output");

		try {
			String savePath = "/plan/weddingQ_product/jewelry/";
			int sizeLimit = 1024 * 1024 * 1000; // 1000메가..
			File dir = new File(savePath);
			if (!dir.exists()) { // 디렉토리가 존재하지 않으면
				dir.mkdirs(); // 디렉토리 생성.!
			}

			MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "utf-8",
					new DefaultFileRenamePolicy());

			// **************************** idx 번호 가져옴 ************************** //
			int pro_idx = Integer.parseInt(multi.getParameter("pro_idx"));
			// **************************** idx 번호 가져옴 ************************** //

			if ("".equals(multi.getParameter("pro_img_list")) || multi.getParameter("pro_img_list") == null) // 이미지를
																												// 수정하지
																												// 않았다.
			{

			} else // 이미지가 수정되었다면..
			{
				// 기존 이미지를 지움
				File directory = new File("/plan/weddingQ_product/jewelry/" + pro_idx);
				File[] files = directory.listFiles();
				if (files != null) {
					for (File file : files) {
						if (file.isFile()) {
							Utils.fileDelete(directory + "/" + file.getName());
						}
					}
				}
				// 기존 이미지를 지움

				// 지금 올라온 이미지를 넘김
				String pro_img_list[] = (multi.getParameter("pro_img_list")).split("&&");
				for (int i = 0; i < pro_img_list.length; i++) {
					Utils.fileMove(savePath + pro_img_list[i], directory + "/" + pro_img_list[i]);
				}
				// 지금 올라온 이미지를 넘김
			}
			String pro_sort = multi.getParameter("pro_sort");
			String pro_com_idx = multi.getParameter("pro_com_idx");
			String pro_com_name = multi.getParameter("com_name");
			String pro_category = multi.getParameter("pro_category");

			String pro_name = multi.getParameter("pro_name");
			String pro_homepage = multi.getParameter("pro_homepage");
			String pro_tel = multi.getParameter("pro_tel1") + "-" + multi.getParameter("pro_tel2") + "-"
					+ multi.getParameter("pro_tel3");
			String pro_zipcode = multi.getParameter("pro_zipcode");
			String pro_addr1 = multi.getParameter("pro_addr1");
			String pro_addr2 = multi.getParameter("pro_addr2");
			String pro_subway1 = multi.getParameter("pro_subway1") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway1") + "1") + "&&"
					+ multi.getParameter("pro_subway1_3") + "&&" + multi.getParameter("pro_subway1_4");
			String pro_subway2 = multi.getParameter("pro_subway2") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway2") + "2") + "&&"
					+ multi.getParameter("pro_subway2_3") + "&&" + multi.getParameter("pro_subway2_4");
			String pro_subway3 = multi.getParameter("pro_subway3") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway3") + "3") + "&&"
					+ multi.getParameter("pro_subway3_3") + "&&" + multi.getParameter("pro_subway3_4");
			String pro_bus = multi.getParameter("pro_bus").replace("\r\n", "<br>").replace("\"", "＂").replace("\'",
					"’");
			String pro_intro1 = multi.getParameter("pro_intro1").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");
			String pro_intro2 = multi.getParameter("pro_intro2").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");

			String pro_talk_time = multi.getParameter("pro_talk_time1") + ":" + multi.getParameter("pro_talk_time2")
					+ "~" + multi.getParameter("pro_talk_time3") + ":" + multi.getParameter("pro_talk_time4");

			String pro_holiday = multi.getParameter("pro_holiday");
			String pro_parking = multi.getParameter("pro_parking").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");

			int pro_service_cnt = Integer.parseInt(multi.getParameter("pro_service_cnt"));
			String pro_service = "";
			for (int i = 1; i <= pro_service_cnt; i++) {
				pro_service += multi.getParameter("pro_service_" + i) + "&&";
			}
			pro_service = pro_service.substring(0, pro_service.length() - 2);

			int pro_composition_cnt = Integer.parseInt(multi.getParameter("pro_composition_cnt"));
			String pro_composition = "";
			String pro_composition_charge = "";
			String pro_composition_price = "";
			for (int i = 1; i <= pro_composition_cnt; i++) {
				pro_composition += multi.getParameter("pro_composition_" + i) + "&&";
				pro_composition_charge += multi.getParameter("pro_composition_charge_" + i) + "&&";
				pro_composition_price += multi.getParameter("pro_composition_price_" + i) + "&&";
			}
			pro_composition = pro_composition.substring(0, pro_composition.length() - 2);
			pro_composition_charge = pro_composition_charge.substring(0, pro_composition_charge.length() - 2);
			pro_composition_price = pro_composition_price.substring(0, pro_composition_price.length() - 2);

			int pro_add_cnt = Integer.parseInt(multi.getParameter("pro_add_cnt"));
			String pro_add_name = "";
			String pro_add_pay = "";
			for (int i = 1; i <= pro_add_cnt; i++) {
				pro_add_name += multi.getParameter("pro_add_name_" + i) + "&&";
				pro_add_pay += multi.getParameter("pro_add_pay_" + i) + "&&";
			}
			pro_add_name = pro_add_name.substring(0, pro_add_name.length() - 2);
			pro_add_pay = pro_add_pay.substring(0, pro_add_pay.length() - 2);

			int pro_event_cnt = Integer.parseInt(multi.getParameter("pro_event_cnt"));
			String pro_event = "";
			for (int i = 1; i <= pro_event_cnt; i++) {
				if ("on".equals(multi.getParameter("pro_event_bold_" + i))) {
					pro_event += "(bold)";
				}
				pro_event += multi.getParameter("pro_event_" + i) + "&&";
			}
			pro_event = pro_event.substring(0, pro_event.length() - 2);

			String pro_pay_engine = multi.getParameter("pro_pay_engine");
			String pro_pay_number = multi.getParameter("pro_pay_number");
			String pro_pay_name = multi.getParameter("pro_pay_name");

			String pro_cashback = multi.getParameter("pro_cashback");
			jewelry_dao.upJewelry(pro_idx, pro_sort, pro_com_idx, pro_com_name, pro_category, pro_name, pro_homepage,
					pro_tel, pro_zipcode, pro_addr1, pro_addr2, pro_subway1, pro_subway2, pro_subway3, pro_bus,
					pro_intro1, pro_intro2, pro_talk_time, pro_holiday, pro_parking, pro_service, pro_composition,
					pro_composition_charge, pro_composition_price, pro_add_name, pro_add_pay, pro_event, pro_cashback,
					pro_pay_engine, pro_pay_number, pro_pay_name);

			// 상품명 기입
			if (pro_name.equals(multi.getParameter("pro_name_yet"))) // 상품명을 수정하지않음.
			{

			} else {
				String query = "com_idx = '" + pro_com_idx + "'";
				List<Company_vo> list = company_dao.selList_company(query);

				String com_pro_name = list.get(0).getCom_pro_name();
				com_pro_name = com_pro_name.replaceAll(multi.getParameter("pro_name_yet"), pro_name); // 기존 파일명을 지운다.
				company_dao.upComProName(pro_com_idx, com_pro_name);
			}
			// 상품명 기입

		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
		}
		return mav;
	}

	@RequestMapping("/update_pb.pnp")
	public ModelAndView update_pb(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/update_pb");

		String pro_idx = request.getParameter("idx");

		String query = "1 and pro_idx = '" + pro_idx + "'";
		List<Pb_vo> list = pb_dao.selList_pb(query);

		mav.addObject("pro_idx", list.get(0).getPro_idx());
		mav.addObject("pro_sort", list.get(0).getPro_sort());
		mav.addObject("pro_com_idx", list.get(0).getPro_com_idx());
		mav.addObject("pro_com_name", list.get(0).getPro_com_name());
		mav.addObject("pro_category", list.get(0).getPro_category());
		mav.addObject("pro_name", list.get(0).getPro_name());
		mav.addObject("pro_homepage", list.get(0).getPro_homepage());
		mav.addObject("pro_tel", list.get(0).getPro_tel());
		mav.addObject("pro_zipcode", list.get(0).getPro_zipcode());
		mav.addObject("pro_addr1", list.get(0).getPro_addr1());
		mav.addObject("pro_addr2", list.get(0).getPro_addr2());
		mav.addObject("pro_subway1", list.get(0).getPro_subway1());
		mav.addObject("pro_subway2", list.get(0).getPro_subway2());
		mav.addObject("pro_subway3", list.get(0).getPro_subway3());
		mav.addObject("pro_bus", list.get(0).getPro_bus());
		mav.addObject("pro_intro1", list.get(0).getPro_intro1());
		mav.addObject("pro_intro2", list.get(0).getPro_intro2());
		mav.addObject("pro_eat", list.get(0).getPro_eat());
		mav.addObject("pro_talk_time", list.get(0).getPro_talk_time());
		mav.addObject("pro_holiday", list.get(0).getPro_holiday());
		mav.addObject("pro_parking", list.get(0).getPro_parking());
		mav.addObject("pro_service", list.get(0).getPro_service());
		mav.addObject("pro_composition", list.get(0).getPro_composition());
		mav.addObject("pro_composition_charge", list.get(0).getPro_composition_charge());
		mav.addObject("pro_composition_price", list.get(0).getPro_composition_price());
		mav.addObject("pro_add_name", list.get(0).getPro_add_name());
		mav.addObject("pro_add_pay", list.get(0).getPro_add_pay());
		mav.addObject("pro_pay_engine", list.get(0).getPro_pay_engine());
		mav.addObject("pro_pay_number", list.get(0).getPro_pay_number());
		mav.addObject("pro_pay_name", list.get(0).getPro_pay_name());

		String zipFilePath = "/plan/weddingQ_product/pb/" + list.get(0).getPro_idx();
		String zipFileName = "/plan/weddingQ_product/pb/" + list.get(0).getPro_idx() + "/pb_" + list.get(0).getPro_idx()
				+ ".zip";
		String isFile = "f";
		try {
			// 기존 압축파일 지움
			File directory = new File("/plan/weddingQ_product/pb/" + list.get(0).getPro_idx());
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					isFile = "t";
					if (file.isFile() && (file.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory + "/" + file.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile)) {
				Utils.createZip(zipFilePath, zipFileName);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile", isFile);

		String zipFilePath2 = "/plan/weddingQ_sample/pb/" + list.get(0).getPro_idx();
		String zipFileName2 = "/plan/weddingQ_sample/pb/" + list.get(0).getPro_idx() + "/pb_" + list.get(0).getPro_idx()
				+ ".zip";
		String isFile2 = "f";
		try {
			// 기존 압축파일 지움
			File directory2 = new File("/plan/weddingQ_sample/pb/" + list.get(0).getPro_idx());
			File[] files2 = directory2.listFiles();
			if (files2 != null) {
				for (File file2 : files2) {
					isFile2 = "t";
					if (file2.isFile() && (file2.getName()).indexOf(".zip") > -1) {
						Utils.fileDelete(directory2 + "/" + file2.getName());
					}
				}
			}
			// 기존 압축파일 지움
			if ("t".equals(isFile2)) {
				Utils.createZip(zipFilePath2, zipFileName2);// 압축하기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.addObject("isFile2", isFile2);

		return mav;
	}

	@RequestMapping("/update_pb_output.pnp")
	public ModelAndView update_pb_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/update_pb_output");

		try {
			String savePath = "/plan/weddingQ_product/pb/";
			int sizeLimit = 1024 * 1024 * 1000; // 1000메가..
			File dir = new File(savePath);
			if (!dir.exists()) { // 디렉토리가 존재하지 않으면
				dir.mkdirs(); // 디렉토리 생성.!
			}

			MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "utf-8",
					new DefaultFileRenamePolicy());

			// **************************** idx 번호 가져옴 ************************** //
			int pro_idx = Integer.parseInt(multi.getParameter("pro_idx"));
			// **************************** idx 번호 가져옴 ************************** //

			if ("".equals(multi.getParameter("pro_img_list")) || multi.getParameter("pro_img_list") == null) // 이미지를
																												// 수정하지
																												// 않았다.
			{

			} else // 이미지가 수정되었다면..
			{
				// 기존 이미지를 지움
				File directory = new File("/plan/weddingQ_product/pb/" + pro_idx);
				File[] files = directory.listFiles();
				if (files != null) {
					for (File file : files) {
						if (file.isFile()) {
							Utils.fileDelete(directory + "/" + file.getName());
						}
					}
				}
				// 기존 이미지를 지움

				// 지금 올라온 이미지를 넘김
				String pro_img_list[] = (multi.getParameter("pro_img_list")).split("&&");
				for (int i = 0; i < pro_img_list.length; i++) {
					Utils.fileMove(savePath + pro_img_list[i], directory + "/" + pro_img_list[i]);
				}
				// 지금 올라온 이미지를 넘김
			}
			String pro_sort = multi.getParameter("pro_sort");
			String pro_com_idx = multi.getParameter("pro_com_idx");
			String pro_com_name = multi.getParameter("com_name");
			String pro_category = multi.getParameter("pro_category");

			String pro_name = multi.getParameter("pro_name");
			String pro_homepage = multi.getParameter("pro_homepage");
			String pro_tel = multi.getParameter("pro_tel1") + "-" + multi.getParameter("pro_tel2") + "-"
					+ multi.getParameter("pro_tel3");
			String pro_zipcode = multi.getParameter("pro_zipcode");
			String pro_addr1 = multi.getParameter("pro_addr1");
			String pro_addr2 = multi.getParameter("pro_addr2");
			String pro_subway1 = multi.getParameter("pro_subway1") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway1") + "1") + "&&"
					+ multi.getParameter("pro_subway1_3") + "&&" + multi.getParameter("pro_subway1_4");
			String pro_subway2 = multi.getParameter("pro_subway2") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway2") + "2") + "&&"
					+ multi.getParameter("pro_subway2_3") + "&&" + multi.getParameter("pro_subway2_4");
			String pro_subway3 = multi.getParameter("pro_subway3") + "&&"
					+ multi.getParameter(multi.getParameter("pro_subway3") + "3") + "&&"
					+ multi.getParameter("pro_subway3_3") + "&&" + multi.getParameter("pro_subway3_4");
			String pro_bus = multi.getParameter("pro_bus").replace("\r\n", "<br>").replace("\"", "＂").replace("\'",
					"’");
			String pro_intro1 = multi.getParameter("pro_intro1").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");
			String pro_intro2 = multi.getParameter("pro_intro2").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");

			String pro_eat = "";

			if ("on".equals(multi.getParameter("시식가능"))) {
				pro_eat = "시식가능";
			}

			String pro_talk_time = multi.getParameter("pro_talk_time1") + ":" + multi.getParameter("pro_talk_time2")
					+ "~" + multi.getParameter("pro_talk_time3") + ":" + multi.getParameter("pro_talk_time4");

			String pro_holiday = multi.getParameter("pro_holiday");
			String pro_parking = multi.getParameter("pro_parking").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "’");

			int pro_service_cnt = Integer.parseInt(multi.getParameter("pro_service_cnt"));
			String pro_service = "";
			for (int i = 1; i <= pro_service_cnt; i++) {
				pro_service += multi.getParameter("pro_service_" + i) + "&&";
			}
			pro_service = pro_service.substring(0, pro_service.length() - 2);

			int pro_composition_cnt = Integer.parseInt(multi.getParameter("pro_composition_cnt"));
			String pro_composition = "";
			String pro_composition_charge = "";
			String pro_composition_price = "";
			for (int i = 1; i <= pro_composition_cnt; i++) {
				pro_composition += multi.getParameter("pro_composition_" + i) + "&&";
				pro_composition_charge += multi.getParameter("pro_composition_charge_" + i) + "&&";
				pro_composition_price += multi.getParameter("pro_composition_price_" + i) + "&&";
			}
			pro_composition = pro_composition.substring(0, pro_composition.length() - 2);
			pro_composition_charge = pro_composition_charge.substring(0, pro_composition_charge.length() - 2);
			pro_composition_price = pro_composition_price.substring(0, pro_composition_price.length() - 2);

			int pro_add_cnt = Integer.parseInt(multi.getParameter("pro_add_cnt"));
			String pro_add_name = "";
			String pro_add_pay = "";
			for (int i = 1; i <= pro_add_cnt; i++) {
				pro_add_name += multi.getParameter("pro_add_name_" + i) + "&&";
				pro_add_pay += multi.getParameter("pro_add_pay_" + i) + "&&";
			}
			pro_add_name = pro_add_name.substring(0, pro_add_name.length() - 2);
			pro_add_pay = pro_add_pay.substring(0, pro_add_pay.length() - 2);

			String pro_pay_engine = multi.getParameter("pro_pay_engine");
			String pro_pay_number = multi.getParameter("pro_pay_number");
			String pro_pay_name = multi.getParameter("pro_pay_name");

			pb_dao.upPb(pro_idx, pro_sort, pro_com_idx, pro_com_name, pro_category, pro_name, pro_homepage, pro_tel,
					pro_zipcode, pro_addr1, pro_addr2, pro_subway1, pro_subway2, pro_subway3, pro_bus, pro_intro1,
					pro_intro2, pro_eat, pro_talk_time, pro_holiday, pro_parking, pro_service, pro_composition,
					pro_composition_charge, pro_composition_price, pro_add_name, pro_add_pay, pro_pay_engine,
					pro_pay_number, pro_pay_name);

			// 상품명 기입
			if (pro_name.equals(multi.getParameter("pro_name_yet"))) // 상품명을 수정하지않음.
			{

			} else {
				String query = "com_idx = '" + pro_com_idx + "'";
				List<Company_vo> list = company_dao.selList_company(query);

				String com_pro_name = list.get(0).getCom_pro_name();
				com_pro_name = com_pro_name.replaceAll(multi.getParameter("pro_name_yet"), pro_name); // 기존 파일명을 지운다.
				company_dao.upComProName(pro_com_idx, com_pro_name);
			}
			// 상품명 기입

		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
		}
		return mav;
	}

	@RequestMapping("/info_user.pnp")
	public ModelAndView info_user(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/info_user");

		String query = "1";

		String searchDate1 = "";
		String searchDate2 = "";
		String searchSchedule1 = "";
		String searchSchedule2 = "";
		String search_val = "";
		String notSchedule = "";
		String cancleUser = "";

		mav.addObject("selMonth", request.getParameter("selMonth"));
		mav.addObject("selMonth2", request.getParameter("selMonth2"));

		if (!"".equals(request.getParameter("searchDate1")) && request.getParameter("searchDate1") != null) {
			searchDate1 = request.getParameter("searchDate1") + "000000";
			query += " and user_submit_date >= " + searchDate1;
			mav.addObject("searchDate1", searchDate1.substring(0, 8));
		}
		if (!"".equals(request.getParameter("searchDate2")) && request.getParameter("searchDate2") != null) {
			searchDate2 = request.getParameter("searchDate2") + "999999";
			query += " and user_submit_date <=" + searchDate2;
			mav.addObject("searchDate2", searchDate2.substring(0, 8));
		}
		if ("on".equals(request.getParameter("notSchedule"))) {
			notSchedule = request.getParameter("notSchedule");
			mav.addObject("notSchedule", request.getParameter("notSchedule"));
		} else {
			if (!"".equals(request.getParameter("searchSchedule1"))
					&& request.getParameter("searchSchedule1") != null) {
				searchSchedule1 = request.getParameter("searchSchedule1");
				query += " and replace(substring(user_schedule, -10), '-', '') >= " + searchSchedule1;
				mav.addObject("searchSchedule1", searchSchedule1);
			}
			if (!"".equals(request.getParameter("searchSchedule2"))
					&& request.getParameter("searchSchedule2") != null) {
				searchSchedule2 = request.getParameter("searchSchedule2");
				query += " and replace(substring(user_schedule, -10), '-', '') <= " + searchSchedule2;
				mav.addObject("searchSchedule2", searchSchedule2);
			}
		}
		if ("on".equals(request.getParameter("cancleUser"))) {
			cancleUser = request.getParameter("cancleUser");
			query += " and user_status = 'N'";
			mav.addObject("cancleUser", cancleUser);
		} else {
			query += " and user_status = 'Y'";
		}

		Utils utils = new Utils();

		if (!"".equals(request.getParameter("search_val")) && request.getParameter("search_val") != null) {
			search_val = request.getParameter("search_val");
			query += " and (user_name like '%" + utils.encode(search_val) + "%' or user_name like '%"
					+ utils.encode(search_val) + "%' or user_phone like '%" + utils.encode(search_val) + "%')";
			mav.addObject("search_val", search_val);
		}
		List<User2_vo> list_size = user2_dao.selList_user(query);

		int page = 1;
		if (!"".equals(request.getParameter("page")) && request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		int page1 = page * 15 - 15;
		int ten = page - (page % 10);

		if (page % 10 == 0) // 10, 20페이지 눌렀는데 넘어가면 안되니까~ 처리!
		{
			mav.addObject("list_size1", ten - 9);
			mav.addObject("list_size2", ten);
			if (ten < list_size.size() / 15 + 1) {
				mav.addObject("next", "next");
			} else {
				mav.addObject("next", "done");
			}
		} else {
			mav.addObject("list_size1", ten + 1);
			if (ten + 10 > list_size.size() / 15 + 1) {
				mav.addObject("list_size2", list_size.size() / 15 + 1);
				mav.addObject("next", "done");
			} else {
				mav.addObject("list_size2", ten + 10);
				mav.addObject("next", "next");
			}

		}
		mav.addObject("list_size", list_size.size() / 15 + 1);
		mav.addObject("page", page);

		String sort_val = "user_idx";

		String sort_type = "";
		if (!"".equals(request.getParameter("sort_val")) && request.getParameter("sort_val") != null) {
			sort_type = request.getParameter("sort_type");
			sort_val = request.getParameter("sort_val");
			query += " order by " + sort_val + " " + sort_type;
		} else {
			query += " order by user_idx desc";
			sort_type = "desc";
			sort_val = "user_idx";
		}

		query += " limit " + page1 + ",15";

		List<User2_vo> list = user2_dao.selList_user(query);

		mav.addObject("list", list);
		mav.addObject("max_page", list_size.size());
		mav.addObject("sort_type", sort_type);
		mav.addObject("sort_val", sort_val);
		return mav;
	}

	@RequestMapping("/stats_landing.pnp")
	public ModelAndView stats_landing(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/stats_landing");

		String site = request.getParameter("site");
		mav.addObject("site", site);

		String query = "1 and lan_site = '" + site + "'";

		String searchDate1 = "";
		String searchDate2 = "";
		String search_val = "";

		mav.addObject("selMonth", request.getParameter("selMonth"));

		if (!"".equals(request.getParameter("searchDate1")) && request.getParameter("searchDate1") != null) {
			searchDate1 = request.getParameter("searchDate1") + "000000";
			query += " and lan_submit_date >= " + searchDate1;
			mav.addObject("searchDate1", searchDate1.substring(0, 8));
		}
		if (!"".equals(request.getParameter("searchDate2")) && request.getParameter("searchDate2") != null) {
			searchDate2 = request.getParameter("searchDate2") + "999999";
			query += " and lan_submit_date <=" + searchDate2;
			mav.addObject("searchDate2", searchDate2.substring(0, 8));
		}

		if (!"".equals(request.getParameter("search_val")) && request.getParameter("search_val") != null) {
			search_val = request.getParameter("search_val");
			query += " and (lan_name like '%" + search_val + "%' or lan_phone like '%" + search_val + "%')";
			mav.addObject("search_val", search_val);
		}
		List<Landing_vo> list_size = landing_dao.selLanding(query);

		int page = 1;
		if (!"".equals(request.getParameter("page")) && request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		int page1 = page * 15 - 15;
		int ten = page - (page % 10);

		if (page % 10 == 0) // 10, 20페이지 눌렀는데 넘어가면 안되니까~ 처리!
		{
			mav.addObject("list_size1", ten - 9);
			mav.addObject("list_size2", ten);
			if (ten < list_size.size() / 15 + 1) {
				mav.addObject("next", "next");
			} else {
				mav.addObject("next", "done");
			}
		} else {
			mav.addObject("list_size1", ten + 1);
			if (ten + 10 > list_size.size() / 15 + 1) {
				mav.addObject("list_size2", list_size.size() / 15 + 1);
				mav.addObject("next", "done");
			} else {
				mav.addObject("list_size2", ten + 10);
				mav.addObject("next", "next");
			}

		}
		mav.addObject("list_size", list_size.size() / 15 + 1);
		mav.addObject("page", page);

		String sort_val = "lan_idx";

		String sort_type = "";
		if (!"".equals(request.getParameter("sort_val")) && request.getParameter("sort_val") != null) {
			sort_type = request.getParameter("sort_type");
			sort_val = request.getParameter("sort_val");
			query += " order by " + sort_val + " " + sort_type;
		} else {
			query += " order by lan_idx desc";
			sort_type = "desc";
			sort_val = "lan_idx";
		}

		query += " limit " + page1 + ",15";

		List<Landing_vo> list = landing_dao.selLanding(query);

		mav.addObject("list", list);
		mav.addObject("max_page", list_size.size());
		mav.addObject("sort_type", sort_type);
		mav.addObject("sort_val", sort_val);
		return mav;
	}

	@RequestMapping("/info_voc2.pnp")
	public ModelAndView info_voc2(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/info_voc2");

		String query = "1";

		String searchDate1 = "";
		String searchDate2 = "";
		String search_val = "";

		mav.addObject("selMonth", request.getParameter("selMonth"));

		if (!"".equals(request.getParameter("searchDate1")) && request.getParameter("searchDate1") != null) {
			searchDate1 = request.getParameter("searchDate1") + "000000";
			query += " and voc_submit_date >= " + searchDate1;
			mav.addObject("searchDate1", searchDate1.substring(0, 8));
		}
		if (!"".equals(request.getParameter("searchDate2")) && request.getParameter("searchDate2") != null) {
			searchDate2 = request.getParameter("searchDate2") + "999999";
			query += " and voc_submit_date <=" + searchDate2;
			mav.addObject("searchDate2", searchDate2.substring(0, 8));
		}

		if (!"".equals(request.getParameter("search_val")) && request.getParameter("search_val") != null) {
			search_val = request.getParameter("search_val");
			query += " and (voc_name like '%" + search_val + "%' or voc_content like '%" + search_val + "%')";
			mav.addObject("search_val", search_val);
		}
		List<Voc2_vo> list_size = voc2_dao.selVoc2(query);

		int page = 1;
		if (!"".equals(request.getParameter("page")) && request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		int page1 = page * 15 - 15;
		int ten = page - (page % 10);

		if (page % 10 == 0) // 10, 20페이지 눌렀는데 넘어가면 안되니까~ 처리!
		{
			mav.addObject("list_size1", ten - 9);
			mav.addObject("list_size2", ten);
			if (ten < list_size.size() / 15 + 1) {
				mav.addObject("next", "next");
			} else {
				mav.addObject("next", "done");
			}
		} else {
			mav.addObject("list_size1", ten + 1);
			if (ten + 10 > list_size.size() / 15 + 1) {
				mav.addObject("list_size2", list_size.size() / 15 + 1);
				mav.addObject("next", "done");
			} else {
				mav.addObject("list_size2", ten + 10);
				mav.addObject("next", "next");
			}

		}
		mav.addObject("list_size", list_size.size() / 15 + 1);
		mav.addObject("page", page);

		String sort_val = "voc_idx";

		String sort_type = "";
		if (!"".equals(request.getParameter("sort_val")) && request.getParameter("sort_val") != null) {
			sort_type = request.getParameter("sort_type");
			sort_val = request.getParameter("sort_val");
			query += " order by " + sort_val + " " + sort_type;
		} else {
			query += " order by voc_idx desc";
			sort_type = "desc";
			sort_val = "voc_idx";
		}

		query += " limit " + page1 + ",15";

		List<Voc2_vo> list = voc2_dao.selVoc2(query);

		mav.addObject("list", list);
		mav.addObject("max_page", list_size.size());
		mav.addObject("sort_type", sort_type);
		mav.addObject("sort_val", sort_val);
		return mav;
	}

	@RequestMapping("/info_pack.pnp")
	public ModelAndView info_pack(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/info_pack");

		String query = "1";

		String searchDate1 = "";
		String searchDate2 = "";
		String search_val = "";

		mav.addObject("selMonth", request.getParameter("selMonth"));

		if (!"".equals(request.getParameter("searchDate1")) && request.getParameter("searchDate1") != null) {
			searchDate1 = request.getParameter("searchDate1") + "000000";
			query += " and pack_submit_date >= " + searchDate1;
			mav.addObject("searchDate1", searchDate1.substring(0, 8));
		}
		if (!"".equals(request.getParameter("searchDate2")) && request.getParameter("searchDate2") != null) {
			searchDate2 = request.getParameter("searchDate2") + "999999";
			query += " and pack_submit_date <=" + searchDate2;
			mav.addObject("searchDate2", searchDate2.substring(0, 8));
		}

		if (!"".equals(request.getParameter("search_val")) && request.getParameter("search_val") != null) {
			search_val = request.getParameter("search_val");
			query += " and (pack_name like '%" + search_val + "%' or pack_pro_name like '%" + search_val + "%')";
			mav.addObject("search_val", search_val);
		}
		List<Pro_package_vo> list_size = pro_package_dao.selPro_package(query);

		int page = 1;
		if (!"".equals(request.getParameter("page")) && request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		int page1 = page * 15 - 15;
		int ten = page - (page % 10);

		if (page % 10 == 0) // 10, 20페이지 눌렀는데 넘어가면 안되니까~ 처리!
		{
			mav.addObject("list_size1", ten - 9);
			mav.addObject("list_size2", ten);
			if (ten < list_size.size() / 15 + 1) {
				mav.addObject("next", "next");
			} else {
				mav.addObject("next", "done");
			}
		} else {
			mav.addObject("list_size1", ten + 1);
			if (ten + 10 > list_size.size() / 15 + 1) {
				mav.addObject("list_size2", list_size.size() / 15 + 1);
				mav.addObject("next", "done");
			} else {
				mav.addObject("list_size2", ten + 10);
				mav.addObject("next", "next");
			}

		}
		mav.addObject("list_size", list_size.size() / 15 + 1);
		mav.addObject("page", page);

		String sort_val = "pack_idx";

		String sort_type = "";
		if (!"".equals(request.getParameter("sort_val")) && request.getParameter("sort_val") != null) {
			sort_type = request.getParameter("sort_type");
			sort_val = request.getParameter("sort_val");
			query += " order by " + sort_val + " " + sort_type;
		} else {
			query += " order by pack_idx desc";
			sort_type = "desc";
			sort_val = "pack_idx";
		}

		query += " limit " + page1 + ",15";

		List<Pro_package_vo> list = pro_package_dao.selPro_package(query);

		mav.addObject("list", list);
		mav.addObject("max_page", list_size.size());
		mav.addObject("sort_type", sort_type);
		mav.addObject("sort_val", sort_val);
		return mav;
	}

	@RequestMapping("/info_pack2.pnp")
	public ModelAndView info_pack2(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/info_pack2");

		String query = "1";

		String searchDate1 = "";
		String searchDate2 = "";
		String search_val = "";

		mav.addObject("selMonth", request.getParameter("selMonth"));

		if (!"".equals(request.getParameter("searchDate1")) && request.getParameter("searchDate1") != null) {
			searchDate1 = request.getParameter("searchDate1") + "000000";
			query += " and pack_submit_date >= " + searchDate1;
			mav.addObject("searchDate1", searchDate1.substring(0, 8));
		}
		if (!"".equals(request.getParameter("searchDate2")) && request.getParameter("searchDate2") != null) {
			searchDate2 = request.getParameter("searchDate2") + "999999";
			query += " and pack_submit_date <=" + searchDate2;
			mav.addObject("searchDate2", searchDate2.substring(0, 8));
		}

		if (!"".equals(request.getParameter("search_val")) && request.getParameter("search_val") != null) {
			search_val = request.getParameter("search_val");
			query += " and (pack_name like '%" + search_val + "%' or pack_pro_name like '%" + search_val + "%')";
			mav.addObject("search_val", search_val);
		}
		List<Pro_package2_vo> list_size = pro_package2_dao.selPro_package2(query);

		int page = 1;
		if (!"".equals(request.getParameter("page")) && request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		int page1 = page * 15 - 15;
		int ten = page - (page % 10);

		if (page % 10 == 0) // 10, 20페이지 눌렀는데 넘어가면 안되니까~ 처리!
		{
			mav.addObject("list_size1", ten - 9);
			mav.addObject("list_size2", ten);
			if (ten < list_size.size() / 15 + 1) {
				mav.addObject("next", "next");
			} else {
				mav.addObject("next", "done");
			}
		} else {
			mav.addObject("list_size1", ten + 1);
			if (ten + 10 > list_size.size() / 15 + 1) {
				mav.addObject("list_size2", list_size.size() / 15 + 1);
				mav.addObject("next", "done");
			} else {
				mav.addObject("list_size2", ten + 10);
				mav.addObject("next", "next");
			}

		}
		mav.addObject("list_size", list_size.size() / 15 + 1);
		mav.addObject("page", page);

		String sort_val = "pack_idx";

		String sort_type = "";
		if (!"".equals(request.getParameter("sort_val")) && request.getParameter("sort_val") != null) {
			sort_type = request.getParameter("sort_type");
			sort_val = request.getParameter("sort_val");
			query += " order by " + sort_val + " " + sort_type;
		} else {
			query += " order by pack_idx desc";
			sort_type = "desc";
			sort_val = "pack_idx";
		}

		query += " limit " + page1 + ",15";

		List<Pro_package2_vo> list = pro_package2_dao.selPro_package2(query);

		mav.addObject("list", list);
		mav.addObject("max_page", list_size.size());
		mav.addObject("sort_type", sort_type);
		mav.addObject("sort_val", sort_val);
		return mav;
	}

	@RequestMapping("/stats_pro_package.pnp")
	public ModelAndView stats_pro_package(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/stats_pro_package");

		String query = "1";

		String searchDate1 = "";
		String searchDate2 = "";
		String search_val = "";

		mav.addObject("selMonth", request.getParameter("selMonth"));

		if (!"".equals(request.getParameter("searchDate1")) && request.getParameter("searchDate1") != null) {
			searchDate1 = request.getParameter("searchDate1") + "000000";
			query += " and pack_submit_date >= " + searchDate1;
			mav.addObject("searchDate1", searchDate1.substring(0, 8));
		}
		if (!"".equals(request.getParameter("searchDate2")) && request.getParameter("searchDate2") != null) {
			searchDate2 = request.getParameter("searchDate2") + "999999";
			query += " and pack_submit_date <=" + searchDate2;
			mav.addObject("searchDate2", searchDate2.substring(0, 8));
		}

		if (!"".equals(request.getParameter("search_val")) && request.getParameter("search_val") != null) {
			search_val = request.getParameter("search_val");
			query += " and (pack_name like '%" + search_val + "%' or pack_pro_name like '%" + search_val + "%')";
			mav.addObject("search_val", search_val);
		}
		List<Pro_package_vo> list_size = pro_package_dao.selPro_package(query);

		int page = 1;
		if (!"".equals(request.getParameter("page")) && request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		int page1 = page * 15 - 15;
		int ten = page - (page % 10);

		if (page % 10 == 0) // 10, 20페이지 눌렀는데 넘어가면 안되니까~ 처리!
		{
			mav.addObject("list_size1", ten - 9);
			mav.addObject("list_size2", ten);
			if (ten < list_size.size() / 15 + 1) {
				mav.addObject("next", "next");
			} else {
				mav.addObject("next", "done");
			}
		} else {
			mav.addObject("list_size1", ten + 1);
			if (ten + 10 > list_size.size() / 15 + 1) {
				mav.addObject("list_size2", list_size.size() / 15 + 1);
				mav.addObject("next", "done");
			} else {
				mav.addObject("list_size2", ten + 10);
				mav.addObject("next", "next");
			}

		}
		mav.addObject("list_size", list_size.size() / 15 + 1);
		mav.addObject("page", page);

		String sort_val = "pack_idx";

		String sort_type = "";
		if (!"".equals(request.getParameter("sort_val")) && request.getParameter("sort_val") != null) {
			sort_type = request.getParameter("sort_type");
			sort_val = request.getParameter("sort_val");
			query += " order by " + sort_val + " " + sort_type;
		} else {
			query += " order by pack_idx desc";
			sort_type = "desc";
			sort_val = "pack_idx";
		}

		query += " limit " + page1 + ",15";

		List<Pro_package_vo> list = pro_package_dao.selPro_package(query);

		mav.addObject("list", list);
		mav.addObject("max_page", list_size.size());
		mav.addObject("sort_type", sort_type);
		mav.addObject("sort_val", sort_val);

		String cnt = "";
		for (int i = 0; i < list.size(); i++) {
			List<Cont_package_vo> list_cont = cont_package_dao.selCont_package(
					"1 and cont_pack_idx = '" + list.get(i).getPack_idx() + "' and cont_status = '계약완료'");
			cnt += "&&" + list_cont.size();
		}
		if (cnt.length() > 1) {
			cnt = cnt.substring(2, cnt.length());
		}

		mav.addObject("cnt", cnt);
		return mav;
	}

	@RequestMapping("/stats_pro_package2.pnp")
	public ModelAndView stats_pro_package2(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/stats_pro_package2");

		String query = "1";

		String searchDate1 = "";
		String searchDate2 = "";
		String search_val = "";

		mav.addObject("selMonth", request.getParameter("selMonth"));

		if (!"".equals(request.getParameter("searchDate1")) && request.getParameter("searchDate1") != null) {
			searchDate1 = request.getParameter("searchDate1") + "000000";
			query += " and stats_submit_date >= " + searchDate1;
			mav.addObject("searchDate1", searchDate1.substring(0, 8));
		}
		if (!"".equals(request.getParameter("searchDate2")) && request.getParameter("searchDate2") != null) {
			searchDate2 = request.getParameter("searchDate2") + "999999";
			query += " and stats_submit_date <=" + searchDate2;
			mav.addObject("searchDate2", searchDate2.substring(0, 8));
		}
		if ("on".equals(request.getParameter("delBeLogin"))) {
			query += " and stats_user_idx != '0'";
			mav.addObject("delBeLogin", request.getParameter("delBeLogin"));
		}

		if ("on".equals(request.getParameter("delSame"))) {
			query += " group by stats_pack_name, stats_mac, left(stats_submit_date, 8)";
			mav.addObject("delSame", request.getParameter("delSame"));
		}

		List<Stats_pack_vo> list = stats_pack_dao.selStats_pack(query);
		List<Pro_package_vo> list_pack = pro_package_dao.selPro_package("1");

		String pack_name = "";
		String pro_name = "";
		String detail = "";
		String submit = "";
		String comple = "";
		String cont = "";
		for (int i = 0; i < list_pack.size(); i++) {
			pack_name += "&&" + list_pack.get(i).getPack_name();
			pro_name += "&&" + list_pack.get(i).getPack_pro_name();
		}
		if (pack_name.length() > 1) {
			pack_name = pack_name.substring(2, pack_name.length());
		}
		if (pro_name.length() > 1) {
			pro_name = pro_name.substring(2, pro_name.length());
		}

		for (int i = 0; i < pack_name.split("&&").length; i++) {
			String pack_name_result = pack_name.split("&&")[i];
			int detail_i = 0;
			int submit_i = 0;
			int comple_i = 0;
			for (int j = 0; j < list.size(); j++) {
				if (pack_name_result.equals(list.get(j).getStats_pack_name())) {
					if ("상세페이지".equals(list.get(j).getStats_cate())) {
						detail_i++;
					}
					if ("신청하기".equals(list.get(j).getStats_cate())) {
						submit_i++;
					}
					if ("신청완료".equals(list.get(j).getStats_cate())) {
						comple_i++;
					}
				}
			}
			detail += "&&" + detail_i;
			submit += "&&" + submit_i;
			comple += "&&" + comple_i;
		}

		for (int i = 0; i < list_pack.size(); i++) {
			List<Cont_package_vo> list_cont = cont_package_dao.selCont_package(
					"1 and cont_pack_name = '" + list_pack.get(i).getPack_name() + "' and cont_status = '계약완료'");
			cont += "&&" + list_cont.size();
		}
		if (detail.length() > 1) {
			detail = detail.substring(2, detail.length());
		}
		if (submit.length() > 1) {
			submit = submit.substring(2, submit.length());
		}
		if (comple.length() > 1) {
			comple = comple.substring(2, comple.length());
		}
		if (cont.length() > 1) {
			cont = cont.substring(2, cont.length());
		}

		mav.addObject("pack_name", pack_name.replaceAll("&&", "@@")); // & 들어가는 상품명때문에 오류가 나서 얘만 임시로 수정(메이든&이명순 엘레강스
																		// 패키지)
		mav.addObject("pro_name", pro_name);
		mav.addObject("detail", detail);
		mav.addObject("submit", submit);
		mav.addObject("comple", comple);
		mav.addObject("cont", cont);

		return mav;
	}

	@RequestMapping("/info_cont_pack.pnp")
	public ModelAndView info_cont_pack(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/info_cont_pack");

		String query = "1";

		String searchDate1 = "";
		String searchDate2 = "";
		String search_val = "";

		mav.addObject("selMonth", request.getParameter("selMonth"));

		if (!"".equals(request.getParameter("searchDate1")) && request.getParameter("searchDate1") != null) {
			searchDate1 = request.getParameter("searchDate1") + "000000";
			query += " and cont_submit_date >= " + searchDate1;
			mav.addObject("searchDate1", searchDate1.substring(0, 8));
		}
		if (!"".equals(request.getParameter("searchDate2")) && request.getParameter("searchDate2") != null) {
			searchDate2 = request.getParameter("searchDate2") + "999999";
			query += " and cont_submit_date <=" + searchDate2;
			mav.addObject("searchDate2", searchDate2.substring(0, 8));
		}

		if (!"".equals(request.getParameter("search_val")) && request.getParameter("search_val") != null) {
			search_val = request.getParameter("search_val");
			query += " and (cont_pack_name like '%" + search_val + "%' or cont_content like '%" + search_val + "%')";
			mav.addObject("search_val", search_val);
		}
		List<Cont_package_vo> list_size = cont_package_dao.selCont_package(query);

		int page = 1;
		if (!"".equals(request.getParameter("page")) && request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		int page1 = page * 15 - 15;
		int ten = page - (page % 10);

		if (page % 10 == 0) // 10, 20페이지 눌렀는데 넘어가면 안되니까~ 처리!
		{
			mav.addObject("list_size1", ten - 9);
			mav.addObject("list_size2", ten);
			if (ten < list_size.size() / 15 + 1) {
				mav.addObject("next", "next");
			} else {
				mav.addObject("next", "done");
			}
		} else {
			mav.addObject("list_size1", ten + 1);
			if (ten + 10 > list_size.size() / 15 + 1) {
				mav.addObject("list_size2", list_size.size() / 15 + 1);
				mav.addObject("next", "done");
			} else {
				mav.addObject("list_size2", ten + 10);
				mav.addObject("next", "next");
			}

		}
		mav.addObject("list_size", list_size.size() / 15 + 1);
		mav.addObject("page", page);

		String sort_val = "cont_idx";

		String sort_type = "";
		if (!"".equals(request.getParameter("sort_val")) && request.getParameter("sort_val") != null) {
			sort_type = request.getParameter("sort_type");
			sort_val = request.getParameter("sort_val");
			query += " order by " + sort_val + " " + sort_type;
		} else {
			query += " order by cont_idx desc";
			sort_type = "desc";
			sort_val = "cont_idx";
		}

		query += " limit " + page1 + ",15";

		List<Cont_package_vo> list = cont_package_dao.selCont_package(query);

		mav.addObject("list", list);
		mav.addObject("max_page", list_size.size());
		mav.addObject("sort_type", sort_type);
		mav.addObject("sort_val", sort_val);
		return mav;
	}

	@RequestMapping("/info_cont_drawer.pnp")
	public ModelAndView info_cont_drawer(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/info_cont_drawer");

		String query = "1";

		String searchDate1 = "";
		String searchDate2 = "";
		String search_val = "";

		mav.addObject("selMonth", request.getParameter("selMonth"));

		if (!"".equals(request.getParameter("searchDate1")) && request.getParameter("searchDate1") != null) {
			searchDate1 = request.getParameter("searchDate1") + "000000";
			query += " and cont_submit_date >= " + searchDate1;
			mav.addObject("searchDate1", searchDate1.substring(0, 8));
		}
		if (!"".equals(request.getParameter("searchDate2")) && request.getParameter("searchDate2") != null) {
			searchDate2 = request.getParameter("searchDate2") + "999999";
			query += " and cont_submit_date <=" + searchDate2;
			mav.addObject("searchDate2", searchDate2.substring(0, 8));
		}

		if (!"".equals(request.getParameter("search_val")) && request.getParameter("search_val") != null) {
			search_val = request.getParameter("search_val");
			query += " and (cont_name like '%" + search_val + "%' or cont_content like '%" + search_val + "%')";
			mav.addObject("search_val", search_val);
		}
		List<Cont_drawer_vo> list_size = cont_drawer_dao.selCont_drawer(query);

		int page = 1;
		if (!"".equals(request.getParameter("page")) && request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		int page1 = page * 15 - 15;
		int ten = page - (page % 10);

		if (page % 10 == 0) // 10, 20페이지 눌렀는데 넘어가면 안되니까~ 처리!
		{
			mav.addObject("list_size1", ten - 9);
			mav.addObject("list_size2", ten);
			if (ten < list_size.size() / 15 + 1) {
				mav.addObject("next", "next");
			} else {
				mav.addObject("next", "done");
			}
		} else {
			mav.addObject("list_size1", ten + 1);
			if (ten + 10 > list_size.size() / 15 + 1) {
				mav.addObject("list_size2", list_size.size() / 15 + 1);
				mav.addObject("next", "done");
			} else {
				mav.addObject("list_size2", ten + 10);
				mav.addObject("next", "next");
			}

		}
		mav.addObject("list_size", list_size.size() / 15 + 1);
		mav.addObject("page", page);

		String sort_val = "cont_idx";

		String sort_type = "";
		if (!"".equals(request.getParameter("sort_val")) && request.getParameter("sort_val") != null) {
			sort_type = request.getParameter("sort_type");
			sort_val = request.getParameter("sort_val");
			query += " order by " + sort_val + " " + sort_type;
		} else {
			query += " order by cont_idx desc";
			sort_type = "desc";
			sort_val = "cont_idx";
		}

		query += " limit " + page1 + ",15";

		List<Cont_drawer_vo> list = cont_drawer_dao.selCont_drawer(query);

		mav.addObject("list", list);
		mav.addObject("max_page", list_size.size());
		mav.addObject("sort_type", sort_type);
		mav.addObject("sort_val", sort_val);
		return mav;
	}

	@RequestMapping("/info_cont_self.pnp")
	public ModelAndView info_cont_self(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/info_cont_self");

		String query = "1";

		String searchDate1 = "";
		String searchDate2 = "";
		String search_val = "";

		mav.addObject("selMonth", request.getParameter("selMonth"));

		if (!"".equals(request.getParameter("searchDate1")) && request.getParameter("searchDate1") != null) {
			searchDate1 = request.getParameter("searchDate1") + "000000";
			query += " and cont_submit_date >= " + searchDate1;
			mav.addObject("searchDate1", searchDate1.substring(0, 8));
		}
		if (!"".equals(request.getParameter("searchDate2")) && request.getParameter("searchDate2") != null) {
			searchDate2 = request.getParameter("searchDate2") + "999999";
			query += " and cont_submit_date <=" + searchDate2;
			mav.addObject("searchDate2", searchDate2.substring(0, 8));
		}

		if (!"".equals(request.getParameter("search_val")) && request.getParameter("search_val") != null) {
			search_val = request.getParameter("search_val");
			query += " and (cont_name like '%" + search_val + "%' or cont_content like '%" + search_val + "%')";
			mav.addObject("search_val", search_val);
		}
		List<Cont_self_vo> list_size = cont_self_dao.selCont_self(query);

		int page = 1;
		if (!"".equals(request.getParameter("page")) && request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		int page1 = page * 15 - 15;
		int ten = page - (page % 10);

		if (page % 10 == 0) // 10, 20페이지 눌렀는데 넘어가면 안되니까~ 처리!
		{
			mav.addObject("list_size1", ten - 9);
			mav.addObject("list_size2", ten);
			if (ten < list_size.size() / 15 + 1) {
				mav.addObject("next", "next");
			} else {
				mav.addObject("next", "done");
			}
		} else {
			mav.addObject("list_size1", ten + 1);
			if (ten + 10 > list_size.size() / 15 + 1) {
				mav.addObject("list_size2", list_size.size() / 15 + 1);
				mav.addObject("next", "done");
			} else {
				mav.addObject("list_size2", ten + 10);
				mav.addObject("next", "next");
			}

		}
		mav.addObject("list_size", list_size.size() / 15 + 1);
		mav.addObject("page", page);

		String sort_val = "cont_idx";

		String sort_type = "";
		if (!"".equals(request.getParameter("sort_val")) && request.getParameter("sort_val") != null) {
			sort_type = request.getParameter("sort_type");
			sort_val = request.getParameter("sort_val");
			query += " order by " + sort_val + " " + sort_type;
		} else {
			query += " order by cont_idx desc";
			sort_type = "desc";
			sort_val = "cont_idx";
		}

		query += " limit " + page1 + ",15";

		List<Cont_self_vo> list = cont_self_dao.selCont_self(query);

		mav.addObject("list", list);
		mav.addObject("max_page", list_size.size());
		mav.addObject("sort_type", sort_type);
		mav.addObject("sort_val", sort_val);
		return mav;
	}

	@RequestMapping("/detail_user.pnp")
	public ModelAndView detail_user(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/detail_user");

		String user_idx = request.getParameter("idx");

		String query = "1 and user_idx = '" + user_idx + "'";
		List<User2_vo> list = user2_dao.selList_user(query);

		mav.addObject("user_idx", list.get(0).getUser_idx());
		mav.addObject("user_email", list.get(0).getUser_email());
		mav.addObject("user_name", list.get(0).getUser_name());
		mav.addObject("user_password", list.get(0).getUser_password());
		mav.addObject("user_phone", list.get(0).getUser_phone());
		mav.addObject("user_gender", list.get(0).getUser_gender());
		mav.addObject("user_nickname", list.get(0).getUser_nickname());
		mav.addObject("user_addr", list.get(0).getUser_addr());
		mav.addObject("user_schedule", list.get(0).getUser_schedule());
		mav.addObject("user_type", list.get(0).getUser_type());
		mav.addObject("user_submit_date", list.get(0).getUser_submit_date());

		String query2 = "1 and stats_user_idx = '" + user_idx + "' order by stats_idx desc";

		List<Stats_vo> list2 = stats_dao.getStats(query2);

		mav.addObject("join_cnt", list2.size());
		if (list2.size() > 0) {
			mav.addObject("last_join", list2.get(0).getStats_date());
		}

		// 웨딩홀 견적정보
		try {
			List<Est_hall_vo> list_hall = est_hall_dao.selEst_hall("1 and est_user_idx = '" + user_idx + "'");

			String est_name = "";
			String est_wedding_date = "";
			int list_cnt = list_hall.size();
			int est_people = 0;
			int est_rebate = 0;
			int total_rebate = 0;
			int cashback = 0;

			for (int i = 0; i < list_hall.size(); i++) {
				String est_product = list_hall.get(i).getEst_product();

				if (!"".equals(est_product) && est_product != null) {
					JSONArray jarr = new JSONArray(est_product);
					for (int j = 0; j < jarr.length(); j++) {
						if (jarr.getJSONObject(j).getString("est_status").indexOf("on") > -1) {
							est_name = jarr.getJSONObject(j).getString("est_name");
							est_wedding_date = jarr.getJSONObject(j).getString("est_wedding_date");
							est_people = Integer.parseInt(list_hall.get(i).getEst_people());
							est_rebate = Integer.parseInt(jarr.getJSONObject(j).getString("est_rebate"));
							total_rebate = est_people * est_rebate;
							cashback = est_people * Integer.parseInt(jarr.getJSONObject(j).getString("est_cashback"));
						}
					}
				}
			}

			mav.addObject("est_name", est_name);
			mav.addObject("est_wedding_date", est_wedding_date);
			mav.addObject("list_cnt", list_cnt);
			mav.addObject("est_people", est_people);
			mav.addObject("est_rebate", est_rebate);
			mav.addObject("total_rebate", total_rebate);
			mav.addObject("cashback", cashback);

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 웨딩홀 견적정보

		// 스드메 견적정보
		List<See_sdm_vo> list_sdm = see_sdm_dao.selSee_sdm("1 and see_user_idx = '" + list.get(0).getUser_idx() + "'");

		String studio_date = "";
		String dress_date = "";
		String makeup_date = "";

		String studio_name = "";
		String dress_name = "";
		String makeup_name = "";

		String studio_option = "";
		String dress_option = "";
		String makeup_option = "";

		String studio_pay = "";
		String dress_pay = "";
		String makeup_pay = "";

		String studio_charge = "";
		String dress_charge = "";
		String makeup_charge = "";

		String studio_price = "";
		String dress_price = "";
		String makeup_price = "";

		for (int i = 0; i < list_sdm.size(); i++) {
			if (!"".equals(list_sdm.get(i).getSee_confirm_date()) && list_sdm.get(i).getSee_confirm_date() != null) {
				String con_arr[] = list_sdm.get(i).getSee_confirm_date().split("@");
				for (int j = 0; j < con_arr.length; j++) {
					if (j == 0) {
						if (con_arr[j].indexOf("완료") > -1) {
							String pro_name_arr[] = list_sdm.get(i).getSee_pro_name().split(",");
							String pro_option_arr[] = list_sdm.get(i).getSee_option().split("@");
							studio_date = con_arr[j].replace("(예약완료)", "");
							studio_name = pro_name_arr[j];
							studio_option = pro_option_arr[j];
						}
					} else if (j == con_arr.length - 1) {
						if (con_arr[j].indexOf("완료") > -1) {
							String pro_name_arr[] = list_sdm.get(i).getSee_pro_name().split(",");
							String pro_option_arr[] = list_sdm.get(i).getSee_option().split("@");
							makeup_date = con_arr[j].replace("(예약완료)", "");
							makeup_name = pro_name_arr[j];
							makeup_option = pro_option_arr[j];
						}
					} else {
						if (con_arr[j].indexOf("완료") > -1) {
							String pro_name_arr[] = list_sdm.get(i).getSee_pro_name().split(",");
							String pro_option_arr[] = list_sdm.get(i).getSee_option().split("@");
							dress_date += "," + con_arr[j].replace("(예약완료)", "");
							dress_name += "," + pro_name_arr[j];
							dress_option += "@" + pro_option_arr[j];
						}
					}
				}
			}
		}
		if (dress_date.length() > 1) {
			dress_date = dress_date.substring(1, dress_date.length());
		}
		if (dress_name.length() > 1) {
			dress_name = dress_name.substring(1, dress_name.length());
		}
		if (dress_option.length() > 1) {
			dress_option = dress_option.substring(1, dress_option.length());
		}

		mav.addObject("studio_date", studio_date);
		mav.addObject("dress_date", dress_date);
		mav.addObject("makeup_date", makeup_date);
		mav.addObject("studio_name", studio_name);
		mav.addObject("dress_name", dress_name);
		mav.addObject("makeup_name", makeup_name);

		List<Studio_vo> list_studio = studio_dao.selList_studio("1 and pro_name = '" + studio_name + "'");
		if (list_studio.size() > 0) {
			mav.addObject("studio_com", list_studio.get(0).getPro_com_name());

			String studio_option_arr[] = list_studio.get(0).getPro_composition().split("&&");
			for (int i = 0; i < studio_option_arr.length; i++) {
				if (studio_option.equals(studio_option_arr[i])) {
					studio_pay = list_studio.get(0).getPro_composition_pay().split("&&")[i].replaceAll(",", "");
					studio_charge = list_studio.get(0).getPro_composition_charge().split("&&")[i].replaceAll(",", "");
					studio_price = list_studio.get(0).getPro_composition_price().split("&&")[i].replaceAll(",", "");
				}
			}
			mav.addObject("studio_pay", studio_pay);
			mav.addObject("studio_charge", studio_charge);
			mav.addObject("studio_price", studio_price);
			if (studio_price.length() > 5) {
				String studio_cashback = studio_price.substring(0, studio_price.length() - 1);
				studio_cashback = studio_cashback.substring(0, studio_cashback.length() - 4) + "0000";
				mav.addObject("studio_cashback", studio_cashback);
			}
		}

		String dress_name_arr[] = dress_name.split(",");
		String dress_option_arr2[] = dress_option.split("@");
		String dress_cashback = "";
		String dress_com = "";
		for (int z = 0; z < dress_name_arr.length; z++) {
			List<Dress_vo> list_dress = dress_dao.selList_dress("1 and pro_name = '" + dress_name_arr[z] + "'");
			if (list_dress.size() > 0) {
				dress_com += "," + list_dress.get(0).getPro_com_name();

				String dress_option_arr[] = list_dress.get(0).getPro_composition().split("&&");
				for (int i = 0; i < dress_option_arr.length; i++) {
					if (dress_option_arr2[z].equals(dress_option_arr[i])) {
						dress_pay += ","
								+ list_dress.get(0).getPro_composition_pay().split("&&")[i].replaceAll(",", "");
						dress_charge += ","
								+ list_dress.get(0).getPro_composition_charge().split("&&")[i].replaceAll(",", "");
						dress_price += ","
								+ list_dress.get(0).getPro_composition_price().split("&&")[i].replaceAll(",", "");
					}
				}
			}
		}
		if (dress_price.length() > 1) {
			dress_price = dress_price.substring(1, dress_price.length());
		}
		String dress_price_arr[] = dress_price.split(",");
		for (int i = 0; i < dress_price_arr.length; i++) {
			if (dress_price_arr[i].length() > 5) {
				String result = dress_price_arr[i].substring(0, dress_price_arr[i].length() - 1);
				dress_cashback += "," + result.substring(0, result.length() - 4) + "0000";
			} else {
				dress_cashback += ",0";
			}
		}
		if (dress_com.length() > 1) {
			dress_com = dress_com.substring(1, dress_com.length());
		}
		if (dress_pay.length() > 1) {
			dress_pay = dress_pay.substring(1, dress_pay.length());
		}
		if (dress_charge.length() > 1) {
			dress_charge = dress_charge.substring(1, dress_charge.length());
		}
		if (dress_cashback.length() > 1) {
			dress_cashback = dress_cashback.substring(1, dress_cashback.length());
		}
		mav.addObject("dress_com", dress_com);
		mav.addObject("dress_pay", dress_pay);
		mav.addObject("dress_charge", dress_charge);
		mav.addObject("dress_price", dress_price);
		mav.addObject("dress_cashback", dress_cashback);

		List<Makeup_vo> list_makeup = makeup_dao.selList_makeup("1 and pro_name = '" + makeup_name + "'");
		if (list_makeup.size() > 0) {
			mav.addObject("makeup_com", list_makeup.get(0).getPro_com_name());

			String makeup_option_arr[] = list_makeup.get(0).getPro_composition().split("&&");
			for (int i = 0; i < makeup_option_arr.length; i++) {
				if (makeup_option.equals(makeup_option_arr[i])) {
					makeup_pay = list_makeup.get(0).getPro_composition_pay().split("&&")[i].replaceAll(",", "");
					makeup_charge = list_makeup.get(0).getPro_composition_charge().split("&&")[i].replaceAll(",", "");
					makeup_price = list_makeup.get(0).getPro_composition_price().split("&&")[i].replaceAll(",", "");
				}
			}
			mav.addObject("makeup_pay", makeup_pay);
			mav.addObject("makeup_charge", makeup_charge);
			mav.addObject("makeup_price", makeup_price);
			if (makeup_price.length() > 5) {
				String makeup_cashback = makeup_price.substring(0, makeup_price.length() - 1);
				makeup_cashback = makeup_cashback.substring(0, makeup_cashback.length() - 4) + "0000";
				mav.addObject("makeup_cashback", makeup_cashback);
			}
		}

		// 스드메 견적정보

		// 큐레이션 신청횟수
		List<Est_hall_vo> list_est_hall = est_hall_dao
				.selEst_hall("1 and est_user_idx = '" + list.get(0).getUser_idx() + "'");

		mav.addObject("est_hall_cnt", list_est_hall.size());
		// 큐레이션 신청횟수

		// 자동견적 신청횟수
		List<See_sdm_vo> list_see_sdm = see_sdm_dao
				.selSee_sdm("1 and see_user_idx = '" + list.get(0).getUser_idx() + "' and see_status = '견적신청'");

		mav.addObject("see_sdm_cnt", list_see_sdm.size());
		// 자동견적 신청횟수

		// 견적 버튼별 누른횟수

		String query_est = "1 and stats_user_idx = '" + user_idx + "' and stats_content = '견적내기'";
		List<Stats_auto_vo> list_auto = stats_auto_dao.getStats_auto(query_est);
		int auto = list_auto.size();
		mav.addObject("auto", auto);

		query_est = "1 and stats_user_idx = '" + user_idx + "' and stats_content = '계약하기'";
		List<Stats_auto_vo> list_est = stats_auto_dao.getStats_auto(query_est);
		int est = list_est.size();
		mav.addObject("est", est);

		query_est = "1 and stats_user_idx = '" + user_idx + "' and stats_content = '촬영일정 선택'";
		List<Stats_auto_vo> list_photo = stats_auto_dao.getStats_auto(query_est);
		int photo = list_photo.size();
		mav.addObject("photo", photo);

		query_est = "1 and stats_user_idx = '" + user_idx + "' and stats_content = '피팅일정 선택'";
		List<Stats_auto_vo> list_pit = stats_auto_dao.getStats_auto(query_est);
		int pit = list_pit.size();
		mav.addObject("pit", pit);

		query_est = "1 and stats_user_idx = '" + user_idx + "' and stats_content = '상담일정 선택'";
		List<Stats_auto_vo> list_talk = stats_auto_dao.getStats_auto(query_est);
		int talk = list_talk.size();
		mav.addObject("talk", talk);

		query_est = "1 and stats_user_idx = '" + user_idx + "' and stats_content = '예약하기'";
		List<Stats_auto_vo> list_res = stats_auto_dao.getStats_auto(query_est);
		int res = list_res.size();
		mav.addObject("res", res);

		query_est = "1 and stats_user_idx = '" + user_idx + "' and stats_content = '문의하기'";
		List<Stats_auto_vo> list_voc = stats_auto_dao.getStats_auto(query_est);
		int voc = list_voc.size();
		mav.addObject("voc", voc);

		query_est = "1 and stats_user_idx = '" + user_idx + "' and stats_content = '문의확인'";
		List<Stats_auto_vo> list_voc_submit = stats_auto_dao.getStats_auto(query_est);
		int voc_submit = list_voc_submit.size();
		mav.addObject("voc_submit", voc_submit);

		// 견적 버튼별 누른횟수

		// 공지 리스트 확인

		List<Message_vo> list_notice = message_dao.getMessage_query(
				"1 and msg_user_idx = '" + user_idx + "' and msg_est_idx = '-1' order by msg_idx desc");

		mav.addObject("list_notice", list_notice);

		// 공지 리스트 확인

		return mav;
	}

	@RequestMapping("/detail_notice.pnp")
	public ModelAndView detail_notice(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/detail_notice");

		String msg_idx = request.getParameter("idx");

		// 공지 리스트 확인

		List<Message_vo> list = message_dao.getMessage_query("1 and msg_idx = '" + msg_idx + "'");
		List<Message_vo> list_notice = message_dao.getMessage_notice(
				"1 and msg_content = '" + list.get(0).getMsg_content() + "' and msg_submit_date like '"
						+ list.get(0).getMsg_submit_date().substring(0, 12) + "%' and msg_notice = '전체'");

		mav.addObject("list_notice", list_notice);

		// 공지 리스트 확인

		return mav;
	}

	@RequestMapping("/cont_info_hall.pnp")
	public ModelAndView cont_info_hall(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/cont_info_hall");

		String query = "1";

		String searchOrder1 = "";
		String searchOrder2 = "";
		String searchSche1 = "";
		String searchSche2 = "";
		String search_val = "";

		mav.addObject("selMonthOrder", request.getParameter("selMonthOrder"));
		mav.addObject("selMonthSche", request.getParameter("selMonthSche"));

		if ("on".equals(request.getParameter("계약중")) || "on".equals(request.getParameter("계약완료"))
				|| "on".equals(request.getParameter("계약해지"))) {
			String subQuery = "";
			if ("on".equals(request.getParameter("계약중"))) {
				subQuery += " or cont_status = '계약중'";
				mav.addObject("chk1", "on");
			}
			if ("on".equals(request.getParameter("계약완료"))) {
				subQuery += " or cont_status = '계약완료'";
				mav.addObject("chk2", "on");
			}
			if ("on".equals(request.getParameter("계약해지"))) {
				subQuery += " or cont_status = '계약해지'";
				mav.addObject("chk3", "on");
			}
			subQuery = subQuery.substring(4, subQuery.length());

			query += " and (" + subQuery + ")";
		}
		if (!"".equals(request.getParameter("searchOrder1")) && request.getParameter("searchOrder1") != null) {
			searchOrder1 = request.getParameter("searchOrder1") + "0000";
			query += " and cont_order_date >= " + searchOrder1;
			mav.addObject("searchOrder1", searchOrder1.substring(0, 8));
		}
		if (!"".equals(request.getParameter("searchOrder2")) && request.getParameter("searchOrder2") != null) {
			searchOrder2 = request.getParameter("searchOrder2") + "9999";
			query += " and cont_order_date <=" + searchOrder2;
			mav.addObject("searchOrder2", searchOrder2.substring(0, 8));
		}
		if (!"".equals(request.getParameter("searchSche1")) && request.getParameter("searchSche1") != null) {
			searchSche1 = request.getParameter("searchSche1") + "0000";
			query += " and cont_schedule >= " + searchSche1;
			mav.addObject("searchSche1", searchSche1.substring(0, 8));
		}
		if (!"".equals(request.getParameter("searchSche2")) && request.getParameter("searchSche2") != null) {
			searchSche2 = request.getParameter("searchSche2") + "9999";
			query += " and cont_schedule <=" + searchSche2;
			mav.addObject("searchSche2", searchSche2.substring(0, 8));
		}
		if (!"".equals(request.getParameter("search_val")) && request.getParameter("search_val") != null) {
			search_val = request.getParameter("search_val");
			query += " and (cont_name_m like '%" + search_val + "%' or cont_name_w like '%" + search_val
					+ "%' or cont_name like '%" + search_val + "%')";
			mav.addObject("search_val", search_val);
		}

		HttpSession session = request.getSession();
		if (!"root".equals(session.getAttribute("session"))) {
			query += " and cont_com_idx = " + session.getAttribute("com_idx");
		}

		List<Cont_hall_vo> list_size = cont_hall_dao.selCont_hall(query);

		int page = 1;
		if (!"".equals(request.getParameter("page")) && request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		int page1 = page * 15 - 15;
		int ten = page - (page % 10);

		if (page % 10 == 0) // 10, 20페이지 눌렀는데 넘어가면 안되니까~ 처리!
		{
			mav.addObject("list_size1", ten - 9);
			mav.addObject("list_size2", ten);
			if (ten < list_size.size() / 15 + 1) {
				mav.addObject("next", "next");
			} else {
				mav.addObject("next", "done");
			}
		} else {
			mav.addObject("list_size1", ten + 1);
			if (ten + 10 > list_size.size() / 15 + 1) {
				mav.addObject("list_size2", list_size.size() / 15 + 1);
				mav.addObject("next", "done");
			} else {
				mav.addObject("list_size2", ten + 10);
				mav.addObject("next", "next");
			}

		}
		mav.addObject("list_size", list_size.size() / 15 + 1);
		mav.addObject("page", page);

		String sort_val = "cont_idx";

		String sort_type = "";
		if (!"".equals(request.getParameter("sort_val")) && request.getParameter("sort_val") != null) {
			sort_type = request.getParameter("sort_type");
			sort_val = request.getParameter("sort_val");
			query += " order by " + sort_val + " " + sort_type;
		}

		query += " limit " + page1 + ",15";

		List<Cont_hall_vo> list = cont_hall_dao.selCont_hall(query);

		mav.addObject("list", list);
		mav.addObject("max_page", list_size.size());
		mav.addObject("sort_type", sort_type);
		mav.addObject("sort_val", sort_val);

		return mav;
	}

	@RequestMapping("/cont_info_other.pnp")
	public ModelAndView cont_info_other(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/cont_info_other");

		String query = "1";

		String searchDate1 = "";
		String searchDate2 = "";
		String searchPlay1 = "";
		String searchPlay2 = "";
		String search_val = "";

		mav.addObject("selMonthDate", request.getParameter("selMonthDate"));
		mav.addObject("selMonthPlay", request.getParameter("selMonthPlay"));

		if ("on".equals(request.getParameter("계약중")) || "on".equals(request.getParameter("계약완료"))
				|| "on".equals(request.getParameter("계약해지"))) {
			String subQuery = "";
			if ("on".equals(request.getParameter("계약중"))) {
				subQuery += " or cont_status = '계약중'";
				mav.addObject("chk1", "on");
			}
			if ("on".equals(request.getParameter("계약완료"))) {
				subQuery += " or cont_status = '계약완료'";
				mav.addObject("chk2", "on");
			}
			if ("on".equals(request.getParameter("계약해지"))) {
				subQuery += " or cont_status = '계약해지'";
				mav.addObject("chk3", "on");
			}
			subQuery = subQuery.substring(4, subQuery.length());

			query += " and (" + subQuery + ")";
		}
		if (!"".equals(request.getParameter("searchDate1")) && request.getParameter("searchDate1") != null) {
			searchDate1 = request.getParameter("searchDate1") + "0000";
			query += " and cont_date >= " + searchDate1;
			mav.addObject("searchDate1", searchDate1.substring(0, 8));
		}
		if (!"".equals(request.getParameter("searchDate2")) && request.getParameter("searchDate2") != null) {
			searchDate2 = request.getParameter("searchDate2") + "9999";
			query += " and cont_date <=" + searchDate2;
			mav.addObject("searchDate2", searchDate2.substring(0, 8));
		}
		if (!"".equals(request.getParameter("searchPlay1")) && request.getParameter("searchPlay1") != null) {
			searchPlay1 = request.getParameter("searchPlay1") + "0000";
			query += " and substr(cont_column3, 1, 8) >= " + searchPlay1;
			mav.addObject("searchPlay1", searchPlay1.substring(0, 8));
		}
		if (!"".equals(request.getParameter("searchPlay2")) && request.getParameter("searchPlay2") != null) {
			searchPlay2 = request.getParameter("searchPlay2") + "9999";
			query += " and substr(cont_column3, 1, 8) <=" + searchPlay2;
			mav.addObject("searchPlay2", searchPlay2.substring(0, 8));
		}
		if (!"".equals(request.getParameter("search_val")) && request.getParameter("search_val") != null) {
			search_val = request.getParameter("search_val");
			query += " and (cont_name_m like '%" + search_val + "%' or cont_name_w like '%" + search_val
					+ "%' or cont_name like '%" + search_val + "%')";
			mav.addObject("search_val", search_val);
		}

		HttpSession session = request.getSession();
		if (!"root".equals(session.getAttribute("session"))) {
			query += " and cont_com_idx = " + session.getAttribute("com_idx");
		}

		List<Cont_other_vo> list_size = cont_other_dao.selCont_other(query);

		int page = 1;
		if (!"".equals(request.getParameter("page")) && request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		int page1 = page * 15 - 15;
		int ten = page - (page % 10);

		if (page % 10 == 0) // 10, 20페이지 눌렀는데 넘어가면 안되니까~ 처리!
		{
			mav.addObject("list_size1", ten - 9);
			mav.addObject("list_size2", ten);
			if (ten < list_size.size() / 15 + 1) {
				mav.addObject("next", "next");
			} else {
				mav.addObject("next", "done");
			}
		} else {
			mav.addObject("list_size1", ten + 1);
			if (ten + 10 > list_size.size() / 15 + 1) {
				mav.addObject("list_size2", list_size.size() / 15 + 1);
				mav.addObject("next", "done");
			} else {
				mav.addObject("list_size2", ten + 10);
				mav.addObject("next", "next");
			}

		}
		mav.addObject("list_size", list_size.size() / 15 + 1);
		mav.addObject("page", page);

		String sort_val = "cont_idx";

		String sort_type = "";
		if (!"".equals(request.getParameter("sort_val")) && request.getParameter("sort_val") != null) {
			sort_type = request.getParameter("sort_type");
			sort_val = request.getParameter("sort_val");
			query += " order by " + sort_val + " " + sort_type;
		}

		query += " limit " + page1 + ",15";

		List<Cont_other_vo> list = cont_other_dao.selCont_other(query);

		mav.addObject("list", list);
		mav.addObject("max_page", list_size.size());
		mav.addObject("sort_type", sort_type);
		mav.addObject("sort_val", sort_val);
		mav.addObject("com_category", session.getAttribute("com_category"));

		return mav;
	}

	@RequestMapping("/cont_insert_hall.pnp")
	public ModelAndView cont_insert_hall(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/cont_insert_hall");

		int user_idx = Integer.parseInt(request.getParameter("user_idx"));

		String query = "1 and user_idx = '" + user_idx + "'";

		List<User2_vo> list = user2_dao.selList_user(query);

		mav.addObject("user_idx", user_idx);
		mav.addObject("user_gender", list.get(0).getUser_gender());
		mav.addObject("user_name", list.get(0).getUser_name());
		mav.addObject("user_phone", list.get(0).getUser_phone());

		return mav;
	}

	@RequestMapping("/cont_insert_other.pnp")
	public ModelAndView cont_insert_other(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/cont_insert_other");

		int user_idx = Integer.parseInt(request.getParameter("user_idx"));

		String query = "1 and user_idx = '" + user_idx + "'";

		List<User2_vo> list = user2_dao.selList_user(query);

		mav.addObject("user_idx", user_idx);
		mav.addObject("user_gender", list.get(0).getUser_gender());
		mav.addObject("user_name", list.get(0).getUser_name());
		mav.addObject("user_phone", list.get(0).getUser_phone());
		mav.addObject("category", request.getParameter("category"));

		return mav;
	}

	@RequestMapping("/cont_insert_hall_output.pnp")
	public ModelAndView cont_insert_hall_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/cont_insert_hall_output");

		String cont_user_idx = request.getParameter("cont_user_idx");
		String cont_name_m = request.getParameter("cont_name_m");
		String cont_tel_m = request.getParameter("cont_tel_m1") + "-" + request.getParameter("cont_tel_m2") + "-"
				+ request.getParameter("cont_tel_m3");
		String cont_email_m = request.getParameter("cont_email_m");
		String cont_name_w = request.getParameter("cont_name_w");
		String cont_tel_w = request.getParameter("cont_tel_w1") + "-" + request.getParameter("cont_tel_w2") + "-"
				+ request.getParameter("cont_tel_w3");
		String cont_email_w = request.getParameter("cont_email_w");
		String cont_pro_idx = request.getParameter("cont_pro_idx");
		String cont_com_idx = request.getParameter("cont_com_idx");
		String cont_name = request.getParameter("cont_name");
		String cont_schedule = "";
		String cont_schedule_arr[] = request.getParameter("cont_schedule_date").split("-");
		for (int i = 0; i < cont_schedule_arr.length; i++) {
			if (cont_schedule_arr[i].length() == 1) {
				cont_schedule_arr[i] = "0" + cont_schedule_arr[i];
			}
			cont_schedule += cont_schedule_arr[i];
		}
		cont_schedule += request.getParameter("cont_schedule_time1");
		cont_schedule += request.getParameter("cont_schedule_time2");

		String cont_person = request.getParameter("cont_person1") + "명*" + request.getParameter("cont_person2") + "원="
				+ request.getParameter("cont_person3") + "원";

		String cont_memo = request.getParameter("cont_memo").replace("\r\n", "<br>").replace("\"", "＂").replace("\'",
				"’");

		String cont_hall_persons = request.getParameter("cont_hall_persons");
		String cont_hall_tel = request.getParameter("cont_hall_tel1") + "-" + request.getParameter("cont_hall_tel2")
				+ "-" + request.getParameter("cont_hall_tel3");
		String cont_hall_fax = request.getParameter("cont_hall_fax1") + "-" + request.getParameter("cont_hall_fax2")
				+ "-" + request.getParameter("cont_hall_fax3");

		String cont_order_persons = request.getParameter("cont_order_persons");
		String cont_order_tel = request.getParameter("cont_order_tel1") + "-" + request.getParameter("cont_order_tel2")
				+ "-" + request.getParameter("cont_order_tel3");
		String cont_order_fax = request.getParameter("cont_order_fax1") + "-" + request.getParameter("cont_order_fax2")
				+ "-" + request.getParameter("cont_order_fax3");

		String cont_order_date = "";
		String cont_order_arr[] = request.getParameter("cont_order_date").split("-");
		for (int i = 0; i < cont_order_arr.length; i++) {
			if (cont_order_arr[i].length() == 1) {
				cont_order_arr[i] = "0" + cont_order_arr[i];
			}
			cont_order_date += cont_order_arr[i];
		}
		cont_order_date += request.getParameter("cont_order_time1");
		cont_order_date += request.getParameter("cont_order_time2");

		try {
			cont_hall_dao.insCont_hall(cont_user_idx, cont_pro_idx, cont_com_idx, cont_name_m, cont_name_w, cont_tel_m,
					cont_tel_w, cont_email_m, cont_email_w, cont_name, cont_schedule, cont_person, cont_memo,
					cont_hall_persons, cont_hall_tel, cont_hall_fax, cont_order_persons, cont_order_tel, cont_order_fax,
					cont_order_date);
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
		}

		return mav;
	}

	@RequestMapping("/cont_insert_other_output.pnp")
	public ModelAndView cont_insert_other_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/cont_insert_other_output");

		String cont_user_idx = request.getParameter("cont_user_idx");
		String cont_name_m = request.getParameter("cont_name_m");
		String cont_tel_m = request.getParameter("cont_tel_m1") + "-" + request.getParameter("cont_tel_m2") + "-"
				+ request.getParameter("cont_tel_m3");
		String cont_email_m = request.getParameter("cont_email_m");
		String cont_name_w = request.getParameter("cont_name_w");
		String cont_tel_w = request.getParameter("cont_tel_w1") + "-" + request.getParameter("cont_tel_w2") + "-"
				+ request.getParameter("cont_tel_w3");
		String cont_email_w = request.getParameter("cont_email_w");
		String cont_pro_idx = request.getParameter("cont_pro_idx");
		String cont_com_idx = request.getParameter("cont_com_idx");
		String cont_name = request.getParameter("cont_name");

		int cont_composition_cnt = Integer.parseInt(request.getParameter("cont_composition_cnt"));
		String cont_composition = "";
		for (int i = 1; i <= cont_composition_cnt; i++) {
			cont_composition += request.getParameter("cont_composition_" + i) + "&&";
		}
		cont_composition = cont_composition.substring(0, cont_composition.length() - 2);

		String cont_pay = request.getParameter("cont_pay");

		String cont_date = "";
		String cont_date_arr[] = request.getParameter("cont_date_date").split("-");
		for (int i = 0; i < cont_date_arr.length; i++) {
			if (cont_date_arr[i].length() == 1) {
				cont_date_arr[i] = "0" + cont_date_arr[i];
			}
			cont_date += cont_date_arr[i];
		}

		String cont_com_category = request.getParameter("category");
		String cont_column1 = request.getParameter("cont_column1");
		String cont_column2 = "";
		String cont_column3 = "";
		String cont_column4 = "";
		String cont_column5 = "";

		if ("studio".equals(cont_com_category) || "dress".equals(cont_com_category)
				|| "makeup".equals(cont_com_category) || "snap".equals(cont_com_category)
				|| "pb".equals(cont_com_category)) {
			cont_column2 = request.getParameter("cont_column2");
		} else if ("suit".equals(cont_com_category) || "korea".equals(cont_com_category)
				|| "jewelry".equals(cont_com_category)) {
			String cont_column2_arr[] = request.getParameter("cont_column2_date").split("-");
			for (int i = 0; i < cont_column2_arr.length; i++) {
				if (cont_column2_arr[i].length() == 1) {
					cont_column2_arr[i] = "0" + cont_column2_arr[i];
				}
				cont_column2 += cont_column2_arr[i];
			}
			cont_column2 += request.getParameter("cont_column2_time1");
			cont_column2 += request.getParameter("cont_column2_time2");
		}
		if ("studio".equals(cont_com_category) || "dress".equals(cont_com_category)
				|| "makeup".equals(cont_com_category) || "snap".equals(cont_com_category)) {
			String cont_column3_arr[] = request.getParameter("cont_column3_date").split("-");
			for (int i = 0; i < cont_column3_arr.length; i++) {
				if (cont_column3_arr[i].length() == 1) {
					cont_column3_arr[i] = "0" + cont_column3_arr[i];
				}
				cont_column3 += cont_column3_arr[i];
			}
			cont_column3 += request.getParameter("cont_column3_time1");
			cont_column3 += request.getParameter("cont_column3_time2");
		} else if ("suit".equals(cont_com_category) || "korea".equals(cont_com_category)
				|| "jewelry".equals(cont_com_category) || "pb".equals(cont_com_category)) {
			String cont_column3_arr[] = request.getParameter("cont_column3_date").split("-");
			for (int i = 0; i < cont_column3_arr.length; i++) {
				if (cont_column3_arr[i].length() == 1) {
					cont_column3_arr[i] = "0" + cont_column3_arr[i];
				}
				cont_column3 += cont_column3_arr[i];
			}
		}

		if ("studio".equals(cont_com_category) || "snap".equals(cont_com_category) || "suit".equals(cont_com_category)
				|| "korea".equals(cont_com_category)) {
			String cont_column4_arr[] = request.getParameter("cont_column4_date").split("-");
			for (int i = 0; i < cont_column4_arr.length; i++) {
				if (cont_column4_arr[i].length() == 1) {
					cont_column4_arr[i] = "0" + cont_column4_arr[i];
				}
				cont_column4 += cont_column4_arr[i];
			}
		} else if ("dress".equals(cont_com_category) || "makeup".equals(cont_com_category)
				|| "jewelry".equals(cont_com_category) || "pb".equals(cont_com_category)) {
			cont_column4 = request.getParameter("cont_column4");
		}

		String cont_column5_arr[] = request.getParameter("cont_column5_date").split("-");
		for (int i = 0; i < cont_column5_arr.length; i++) {
			if (cont_column5_arr[i].length() == 1) {
				cont_column5_arr[i] = "0" + cont_column5_arr[i];
			}
			cont_column5 += cont_column5_arr[i];
		}
		cont_column5 += request.getParameter("cont_column5_time1");
		cont_column5 += request.getParameter("cont_column5_time2");

		String cont_notice = request.getParameter("cont_notice").replace("\r\n", "<br>").replace("\"", "＂")
				.replace("\'", "’");
		String cont_memo = request.getParameter("cont_memo").replace("\r\n", "<br>").replace("\"", "＂").replace("\'",
				"’");

		if ("studio".equals(cont_com_category)) {
			cont_com_category = "스튜디오";
		}
		if ("dress".equals(cont_com_category)) {
			cont_com_category = "웨딩드레스";
		}
		if ("makeup".equals(cont_com_category)) {
			cont_com_category = "헤어메이크업";
		}
		if ("snap".equals(cont_com_category)) {
			cont_com_category = "본식스냅";
		}
		if ("suit".equals(cont_com_category)) {
			cont_com_category = "예복";
		}
		if ("korea".equals(cont_com_category)) {
			cont_com_category = "한복";
		}
		if ("jewelry".equals(cont_com_category)) {
			cont_com_category = "예물";
		}
		if ("pb".equals(cont_com_category)) {
			cont_com_category = "폐백";
		}

		try {
			cont_other_dao.insCont_other(cont_user_idx, cont_pro_idx, cont_com_idx, cont_com_category, cont_name_m,
					cont_name_w, cont_tel_m, cont_tel_w, cont_email_m, cont_email_w, cont_name, cont_composition,
					cont_pay, cont_date, cont_column1, cont_column2, cont_column3, cont_column4, cont_column5,
					cont_notice, cont_memo);
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
		}

		return mav;
	}

	@RequestMapping("/print_hall.pnp")
	public ModelAndView print_hall(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/print_hall");

		String cont_name_m = request.getParameter("cont_name_m");
		String cont_tel_m = request.getParameter("cont_tel_m1") + "-" + request.getParameter("cont_tel_m2") + "-"
				+ request.getParameter("cont_tel_m3");
		String cont_email_m = request.getParameter("cont_email_m");
		String cont_name_w = request.getParameter("cont_name_w");
		String cont_tel_w = request.getParameter("cont_tel_w1") + "-" + request.getParameter("cont_tel_w2") + "-"
				+ request.getParameter("cont_tel_w3");
		String cont_email_w = request.getParameter("cont_email_w");
		String cont_name = request.getParameter("cont_name");
		String cont_schedule = "";
		String cont_schedule_arr[] = request.getParameter("cont_schedule_date").split("-");
		for (int i = 0; i < cont_schedule_arr.length; i++) {
			if (cont_schedule_arr[i].length() == 1) {
				cont_schedule_arr[i] = "0" + cont_schedule_arr[i];
			}
			cont_schedule += cont_schedule_arr[i];
		}
		cont_schedule += request.getParameter("cont_schedule_time1");
		cont_schedule += request.getParameter("cont_schedule_time2");

		String cont_person = request.getParameter("cont_person1") + "명*" + request.getParameter("cont_person2") + "원="
				+ request.getParameter("cont_person3") + "원";

		String cont_memo = request.getParameter("cont_memo").replace("\r\n", "<br>").replace("\"", "＂").replace("\'",
				"’");

		String cont_hall_persons = request.getParameter("cont_hall_persons");
		String cont_hall_tel = request.getParameter("cont_hall_tel1") + "-" + request.getParameter("cont_hall_tel2")
				+ "-" + request.getParameter("cont_hall_tel3");
		String cont_hall_fax = request.getParameter("cont_hall_fax1") + "-" + request.getParameter("cont_hall_fax2")
				+ "-" + request.getParameter("cont_hall_fax3");

		String cont_order_persons = request.getParameter("cont_order_persons");
		String cont_order_tel = request.getParameter("cont_order_tel1") + "-" + request.getParameter("cont_order_tel2")
				+ "-" + request.getParameter("cont_order_tel3");
		String cont_order_fax = request.getParameter("cont_order_fax1") + "-" + request.getParameter("cont_order_fax2")
				+ "-" + request.getParameter("cont_order_fax3");

		String cont_order_date = "";
		String cont_order_arr[] = request.getParameter("cont_order_date").split("-");
		for (int i = 0; i < cont_order_arr.length; i++) {
			if (cont_order_arr[i].length() == 1) {
				cont_order_arr[i] = "0" + cont_order_arr[i];
			}
			cont_order_date += cont_order_arr[i];
		}
		cont_order_date += request.getParameter("cont_order_time1");
		cont_order_date += request.getParameter("cont_order_time2");

		mav.addObject("cont_name_m", cont_name_m);
		mav.addObject("cont_tel_m", cont_tel_m);
		mav.addObject("cont_email_m", cont_email_m);
		mav.addObject("cont_name_w", cont_name_w);
		mav.addObject("cont_tel_w", cont_tel_w);
		mav.addObject("cont_email_w", cont_email_w);
		mav.addObject("cont_name", cont_name);
		mav.addObject("cont_schedule", cont_schedule);
		mav.addObject("cont_person", cont_person);
		mav.addObject("cont_memo", cont_memo);
		mav.addObject("cont_hall_persons", cont_hall_persons);
		mav.addObject("cont_hall_tel", cont_hall_tel);
		mav.addObject("cont_hall_fax", cont_hall_fax);
		mav.addObject("cont_order_persons", cont_order_persons);
		mav.addObject("cont_order_tel", cont_order_tel);
		mav.addObject("cont_order_fax", cont_order_fax);
		mav.addObject("cont_order_date", cont_order_date);

		return mav;
	}

	@RequestMapping("/print_hall_detail.pnp")
	public ModelAndView print_hall_detail(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/print_hall_detail");

		String cont_name_m = request.getParameter("cont_name_m");
		String cont_tel_m = request.getParameter("cont_tel_m");
		String cont_email_m = request.getParameter("cont_email_m");
		String cont_name_w = request.getParameter("cont_name_w");
		String cont_tel_w = request.getParameter("cont_tel_w");
		String cont_email_w = request.getParameter("cont_email_w");
		String cont_name = request.getParameter("cont_name");
		String cont_schedule = request.getParameter("cont_schedule");
		String cont_person = request.getParameter("cont_person");

		String cont_memo = request.getParameter("cont_memo").replace("\r\n", "<br>").replace("\"", "＂").replace("\'",
				"’");

		String cont_hall_persons = request.getParameter("cont_hall_persons");
		String cont_hall_tel = request.getParameter("cont_hall_tel");
		String cont_hall_fax = request.getParameter("cont_hall_fax");

		String cont_order_persons = request.getParameter("cont_order_persons");
		String cont_order_tel = request.getParameter("cont_order_tel");
		String cont_order_fax = request.getParameter("cont_order_fax");

		String cont_order_date = request.getParameter("cont_order_date");

		mav.addObject("cont_name_m", cont_name_m);
		mav.addObject("cont_tel_m", cont_tel_m);
		mav.addObject("cont_email_m", cont_email_m);
		mav.addObject("cont_name_w", cont_name_w);
		mav.addObject("cont_tel_w", cont_tel_w);
		mav.addObject("cont_email_w", cont_email_w);
		mav.addObject("cont_name", cont_name);
		mav.addObject("cont_schedule", cont_schedule);
		mav.addObject("cont_person", cont_person);
		mav.addObject("cont_memo", cont_memo);
		mav.addObject("cont_hall_persons", cont_hall_persons);
		mav.addObject("cont_hall_tel", cont_hall_tel);
		mav.addObject("cont_hall_fax", cont_hall_fax);
		mav.addObject("cont_order_persons", cont_order_persons);
		mav.addObject("cont_order_tel", cont_order_tel);
		mav.addObject("cont_order_fax", cont_order_fax);
		mav.addObject("cont_order_date", cont_order_date);

		return mav;
	}

	@RequestMapping("/cont_cancle_hall.pnp")
	public ModelAndView cont_cancle_hall(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/cont_cancle_hall");

		String query = "1";

		String cont_idx = (request.getParameter("cancle_idx")).substring(0,
				(request.getParameter("cancle_idx")).length() - 1);

		query += " and cont_idx in (" + cont_idx + ")";

		cont_hall_dao.cancleCont_hall(query);

		return mav;
	}

	@RequestMapping("/cont_detail_hall.pnp")
	public ModelAndView cont_detail_hall(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/cont_detail_hall");

		String cont_idx = request.getParameter("idx");

		String query = "1 and cont_idx = '" + cont_idx + "'";
		List<Cont_hall_vo> list = cont_hall_dao.selCont_hall(query);

		mav.addObject("cont_idx", list.get(0).getCont_idx());
		mav.addObject("cont_user_idx", list.get(0).getCont_user_idx());
		mav.addObject("cont_pro_idx", list.get(0).getCont_pro_idx());
		mav.addObject("cont_com_idx", list.get(0).getCont_com_idx());
		mav.addObject("cont_name_m", list.get(0).getCont_name_m());
		mav.addObject("cont_name_w", list.get(0).getCont_name_w());
		mav.addObject("cont_tel_m", list.get(0).getCont_tel_m());
		mav.addObject("cont_tel_w", list.get(0).getCont_tel_w());
		mav.addObject("cont_email_m", list.get(0).getCont_email_m());
		mav.addObject("cont_email_w", list.get(0).getCont_email_w());
		mav.addObject("cont_name", list.get(0).getCont_name());
		mav.addObject("cont_schedule", list.get(0).getCont_schedule());
		mav.addObject("cont_person", list.get(0).getCont_person());
		mav.addObject("cont_memo", list.get(0).getCont_memo());
		mav.addObject("cont_hall_persons", list.get(0).getCont_hall_persons());
		mav.addObject("cont_hall_tel", list.get(0).getCont_hall_tel());
		mav.addObject("cont_hall_fax", list.get(0).getCont_hall_fax());
		mav.addObject("cont_order_persons", list.get(0).getCont_order_persons());
		mav.addObject("cont_order_tel", list.get(0).getCont_order_tel());
		mav.addObject("cont_order_fax", list.get(0).getCont_order_fax());
		mav.addObject("cont_order_date", list.get(0).getCont_order_date());
		mav.addObject("cont_cancle_date", list.get(0).getCont_cancle_date());
		mav.addObject("cont_status", list.get(0).getCont_status());
		mav.addObject("cont_submit_date", list.get(0).getCont_submit_date());

		return mav;
	}

	@RequestMapping("/cont_detail_other.pnp")
	public ModelAndView cont_detail_other(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/cont_detail_other");

		String cont_idx = request.getParameter("idx");

		String query = "1 and cont_idx = '" + cont_idx + "'";
		List<Cont_other_vo> list = cont_other_dao.selCont_other(query);

		mav.addObject("cont_idx", list.get(0).getCont_idx());
		mav.addObject("cont_user_idx", list.get(0).getCont_user_idx());
		mav.addObject("cont_pro_idx", list.get(0).getCont_pro_idx());
		mav.addObject("cont_com_idx", list.get(0).getCont_com_idx());
		mav.addObject("cont_com_category", list.get(0).getCont_com_category());
		mav.addObject("cont_name_m", list.get(0).getCont_name_m());
		mav.addObject("cont_name_w", list.get(0).getCont_name_w());
		mav.addObject("cont_tel_m", list.get(0).getCont_tel_m());
		mav.addObject("cont_tel_w", list.get(0).getCont_tel_w());
		mav.addObject("cont_email_m", list.get(0).getCont_email_m());
		mav.addObject("cont_email_w", list.get(0).getCont_email_w());
		mav.addObject("cont_name", list.get(0).getCont_name());
		mav.addObject("cont_composition", list.get(0).getCont_composition());
		mav.addObject("cont_pay", list.get(0).getCont_pay());
		mav.addObject("cont_date", list.get(0).getCont_date());
		mav.addObject("cont_column1", list.get(0).getCont_column1());
		mav.addObject("cont_column2", list.get(0).getCont_column2());
		mav.addObject("cont_column3", list.get(0).getCont_column3());
		mav.addObject("cont_column4", list.get(0).getCont_column4());
		mav.addObject("cont_column5", list.get(0).getCont_column5());
		mav.addObject("cont_notice", list.get(0).getCont_notice());
		mav.addObject("cont_cancle_date", list.get(0).getCont_cancle_date());
		mav.addObject("cont_status", list.get(0).getCont_status());
		mav.addObject("cont_submit_date", list.get(0).getCont_submit_date());

		return mav;
	}

	
	@RequestMapping("/event_cnt.pnp")
	public ModelAndView event_cnt(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/confirm_sdm");
		String pro_category = request.getParameter("json");
		String category="";
		try {
			JSONObject json=new JSONObject(pro_category);
			category=json.getString("category");
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File directory = new File("/plan/weddingQ_product/event/" + category);
		File[] files = directory.listFiles();
		mav.addObject("json", files.length+"");

		return mav;
	}
	
	
	@RequestMapping("/pro_status.pnp")
	public ModelAndView pro_status(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/pro_status");

		int pro_idx = Integer.parseInt(request.getParameter("change_idx"));
		String pro_category = request.getParameter("change_category");
		String pro_status = request.getParameter("change_status");

		if ("dress".equals(pro_category)) {
			dress_dao.upStatus_dress(pro_idx, pro_status);
		} else if ("hall".equals(pro_category)) {
			hall_dao.upStatus_hall(pro_idx, pro_status);
		} else if ("jewelry".equals(pro_category)) {
			jewelry_dao.upStatus_jewelry(pro_idx, pro_status);
		} else if ("korea".equals(pro_category)) {
			korea_dao.upStatus_korea(pro_idx, pro_status);
		} else if ("makeup".equals(pro_category)) {
			makeup_dao.upStatus_makeup(pro_idx, pro_status);
		} else if ("pb".equals(pro_category)) {
			pb_dao.upStatus_pb(pro_idx, pro_status);
		} else if ("snap".equals(pro_category)) {
			snap_dao.upStatus_snap(pro_idx, pro_status);
		} else if ("studio".equals(pro_category)) {
			studio_dao.upStatus_studio(pro_idx, pro_status);
		} else if ("suit".equals(pro_category)) {
			suit_dao.upStatus_suit(pro_idx, pro_status);
		}

		return mav;
	}

	@RequestMapping("/est_status.pnp")
	public ModelAndView est_status(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/est_status");

		int est_idx = Integer.parseInt(request.getParameter("change_idx"));
		String est_category = request.getParameter("change_category");
		String est_status = request.getParameter("change_status");

		if ("hall".equals(est_category)) {
			est_hall_dao.upEst_status_hall(est_idx, est_status, "&&큐레이션 " + est_status + "_");
		}

		return mav;
	}

	@RequestMapping("/voc_status.pnp")
	public ModelAndView voc_status(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/voc_status");

		int voc_idx = Integer.parseInt(request.getParameter("change_idx"));
		String voc_status = request.getParameter("change_status");

		voc2_dao.upVoc_status(voc_idx, voc_status);

		return mav;
	}

	@RequestMapping("/pack_status.pnp")
	public ModelAndView pack_status(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/pack_status");

		int pack_idx = Integer.parseInt(request.getParameter("change_idx"));
		String pack_status = request.getParameter("change_status");

		pro_package_dao.upPack_status(pack_idx, pack_status);

		return mav;
	}

	@RequestMapping("/pack2_status.pnp")
	public ModelAndView pack2_status(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/pack2_status");

		int pack_idx = Integer.parseInt(request.getParameter("change_idx"));
		String pack_status = request.getParameter("change_status");

		pro_package2_dao.upPack2_status(pack_idx, pack_status);

		return mav;
	}

	@RequestMapping("/pack_cnt.pnp")
	public ModelAndView pack_cnt(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/pack_cnt");

		int pack_idx = Integer.parseInt(request.getParameter("pack_idx"));
		int pack_cnt = Integer.parseInt(request.getParameter("change_cnt"));

		pro_package_dao.upPack_cnt(pack_idx, pack_cnt);

		return mav;
	}

	@RequestMapping("/cont_status.pnp")
	public ModelAndView cont_status(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/cont_status");

		int cont_idx = Integer.parseInt(request.getParameter("change_idx"));
		String cont_status = request.getParameter("change_status");

		cont_package_dao.upCont_package_status(cont_idx, cont_status);

		return mav;
	}

	@RequestMapping("/cont_status_drawer.pnp")
	public ModelAndView cont_status_drawer(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/cont_status_drawer");

		int cont_idx = Integer.parseInt(request.getParameter("change_idx"));
		String cont_status = request.getParameter("change_status");

		cont_drawer_dao.upCont_drawer_status(cont_idx, cont_status);

		return mav;
	}

	@RequestMapping("/cont_status_self.pnp")
	public ModelAndView cont_status_self(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/cont_status_self");

		int cont_idx = Integer.parseInt(request.getParameter("change_idx"));
		String cont_status = request.getParameter("change_status");

		cont_self_dao.upCont_self_status(cont_idx, cont_status);

		return mav;
	}

	@RequestMapping("/scrap.pnp")
	public ModelAndView scrap(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/scrap");
		try {
			String json = request.getParameter("json");
			int scrap_user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));
			int scrap_pro_idx = Integer.parseInt(new JSONObject(json).getString("pro_idx"));
			String scrap_pro_category = new JSONObject(json).getString("type");
			String scrap_action = new JSONObject(json).getString("action");

			if ("ins".equals(scrap_action)) {
				scrap_dao.insScrap(scrap_user_idx, scrap_pro_idx, scrap_pro_category);
			} else if ("del".equals(scrap_action)) {
				scrap_dao.delScrap(scrap_user_idx, scrap_pro_idx, scrap_pro_category);
			}
			mav.addObject("json", "9000");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/insScrap_sdm.pnp")
	public ModelAndView insScrap_sdm(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insScrap_sdm");
		try {
			String json = request.getParameter("json");
			int scrap_user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));
			String scrap_cate = new JSONObject(json).getString("cate");
			String scrap_pro_idx = new JSONObject(json).getString("pro_idx");
			String scrap_pro_name = new JSONObject(json).getString("pro_name");
			String scrap_pro_option = new JSONObject(json).getString("pro_option");

			Utils utils = new Utils();
			String scrap_user_name = "";
			List<User2_vo> list = user2_dao.selList_user("1 and user_idx = '" + scrap_user_idx + "'");
			scrap_user_name = utils.decode(list.get(0).getUser_name());

			scrap_sdm_dao.insScrap_sdm(scrap_user_idx, scrap_user_name, scrap_cate, scrap_pro_idx, scrap_pro_name,
					scrap_pro_option);

			mav.addObject("json", "9000");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/delScrap_sdm.pnp")
	public ModelAndView delScrap_sdm(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/delScrap_sdm");
		try {
			String json = request.getParameter("json");
			String scrap_idx = new JSONObject(json).getString("idx");

			String query = "1";
			query += " and scrap_idx in (" + scrap_idx + ")";

			scrap_sdm_dao.delScrap_sdm(query);

			mav.addObject("json", "9000");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/selScrap_sdm.pnp")
	public ModelAndView selScrap_sdm(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/selScrap_sdm");
		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));

			String return_json = "9001";
			List<Scrap_sdm_vo> list = scrap_sdm_dao.selList_scrap_sdm("1 and scrap_user_idx = '" + user_idx + "'");

			if (list.size() > 0) {
				return_json = "";
				return_json += "[";
				for (int i = 0; i < list.size(); i++) {
					if (i != 0) {
						return_json += ",";
					}
					return_json += "{";
					return_json += "\"scrap_idx\":\"" + list.get(i).getScrap_idx() + "\",";
					return_json += "\"scrap_user_idx\":\"" + list.get(i).getScrap_user_idx() + "\",";
					return_json += "\"scrap_user_name\":\"" + list.get(i).getScrap_user_name() + "\",";
					return_json += "\"scrap_cate\":\"" + list.get(i).getScrap_cate() + "\",";
					return_json += "\"scrap_pro_idx\":\"" + list.get(i).getScrap_pro_idx() + "\",";
					return_json += "\"scrap_pro_name\":\"" + list.get(i).getScrap_pro_name() + "\",";
					return_json += "\"scrap_pro_option\":\"" + list.get(i).getScrap_pro_option() + "\",";
					return_json += "\"scrap_submit_date\":\"" + list.get(i).getScrap_submit_date() + "\"";
					return_json += "}";
				}
				return_json += "]";
			}
			mav.addObject("json", return_json);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/hits.pnp")
	public ModelAndView hits(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/hits");
		try {
			String json = request.getParameter("json");
			int pro_idx = Integer.parseInt(new JSONObject(json).getString("pro_idx"));
			String type = new JSONObject(json).getString("type");
			if ("hall".equals(type)) {
				String query = "1 and pro_idx = " + pro_idx;
				List<Hall_vo> list = hall_dao.selList_hall(query);
				int pro_hits = (list.get(0).getPro_hits()) + 1;
				hall_dao.upHits_hall(pro_idx, pro_hits);
			}
			if ("studio".equals(type)) {
				String query = "1 and pro_idx = " + pro_idx;
				List<Studio_vo> list = studio_dao.selList_studio(query);
				int pro_hits = (list.get(0).getPro_hits()) + 1;
				studio_dao.upHits_studio(pro_idx, pro_hits);
			}
			if ("dress".equals(type)) {
				String query = "1 and pro_idx = " + pro_idx;
				List<Dress_vo> list = dress_dao.selList_dress(query);
				int pro_hits = (list.get(0).getPro_hits()) + 1;
				dress_dao.upHits_dress(pro_idx, pro_hits);
			}
			if ("makeup".equals(type)) {
				String query = "1 and pro_idx = " + pro_idx;
				List<Makeup_vo> list = makeup_dao.selList_makeup(query);
				int pro_hits = (list.get(0).getPro_hits()) + 1;
				makeup_dao.upHits_makeup(pro_idx, pro_hits);
			}
			if ("snap".equals(type)) {
				String query = "1 and pro_idx = " + pro_idx;
				List<Snap_vo> list = snap_dao.selList_snap(query);
				int pro_hits = (list.get(0).getPro_hits()) + 1;
				snap_dao.upHits_snap(pro_idx, pro_hits);
			}
			if ("suit".equals(type)) {
				String query = "1 and pro_idx = " + pro_idx;
				List<Suit_vo> list = suit_dao.selList_suit(query);
				int pro_hits = (list.get(0).getPro_hits()) + 1;
				suit_dao.upHits_suit(pro_idx, pro_hits);
			}
			if ("korea".equals(type)) {
				String query = "1 and pro_idx = " + pro_idx;
				List<Korea_vo> list = korea_dao.selList_korea(query);
				int pro_hits = (list.get(0).getPro_hits()) + 1;
				korea_dao.upHits_korea(pro_idx, pro_hits);
			}
			if ("jewelry".equals(type)) {
				String query = "1 and pro_idx = " + pro_idx;
				List<Jewelry_vo> list = jewelry_dao.selList_jewelry(query);
				int pro_hits = (list.get(0).getPro_hits()) + 1;
				jewelry_dao.upHits_jewelry(pro_idx, pro_hits);
			}
			if ("pb".equals(type)) {
				String query = "1 and pro_idx = " + pro_idx;
				List<Pb_vo> list = pb_dao.selList_pb(query);
				int pro_hits = (list.get(0).getPro_hits()) + 1;
				pb_dao.upHits_pb(pro_idx, pro_hits);
			}

			mav.addObject("json", "9000");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/scrap_info.pnp")
	public ModelAndView scrap_info(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/scrap_info");

		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));
			String type = new JSONObject(json).getString("type");

			String return_json = "";

			String query = "1";
			query += " and scrap_user_idx = " + user_idx;
			query += " and scrap_pro_category = '" + type + "'";

			List<Scrap_vo> list_scrap = scrap_dao.selList_scrap(query);

			String pro_idx = "";
			for (int i = 0; i < list_scrap.size(); i++) {
				pro_idx += "," + list_scrap.get(i).getScrap_pro_idx();
			}
			String query2 = "1";
			if (pro_idx.length() > 1) {
				pro_idx = pro_idx.substring(1, pro_idx.length());
				query2 += " and pro_idx in (" + pro_idx + ")";
			} else {
				query2 += " and null";
			}
			return_json = pro_select(user_idx, type, query2, "", 1, 999);
			mav.addObject("json", return_json);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/insert_sample.pnp")
	public ModelAndView insert_sample(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insert_sample");

		String idx = request.getParameter("idx");
		HttpSession session = request.getSession();
		session.setAttribute("pro_idx", idx);
		return mav;
	}

	@RequestMapping("/insert_sample_output.pnp")
	public ModelAndView insert_sample_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insert_sample_output");

		try {

			HttpSession session = request.getSession();

			String pro_idx = (String) session.getAttribute("pro_idx");
			String com_category = (String) session.getAttribute("com_category");
			if ("웨딩홀".equals(com_category)) {
				com_category = "hall";
			}
			if ("스튜디오".equals(com_category)) {
				com_category = "studio";
			}
			if ("웨딩드레스".equals(com_category)) {
				com_category = "dress";
			}
			if ("헤어메이크업".equals(com_category)) {
				com_category = "makeup";
			}
			if ("본식스냅".equals(com_category)) {
				com_category = "snap";
			}
			if ("예복".equals(com_category)) {
				com_category = "suit";
			}
			if ("한복".equals(com_category)) {
				com_category = "korea";
			}
			if ("예물".equals(com_category)) {
				com_category = "jewelry";
			}
			if ("폐백".equals(com_category)) {
				com_category = "pb";
			}

			// 기존 이미지를 지움
			File directory = new File("/plan/weddingQ_sample/" + com_category + "/" + pro_idx);
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					if (file.isFile()) {
						Utils.fileDelete(directory + "/" + file.getName());
					}
				}
			}
			// 기존 이미지를 지움

			String savePath = "/plan/weddingQ_sample/" + com_category + "/" + pro_idx + "/";
			int sizeLimit = 1024 * 1024 * 1000; // 1000메가..
			File dir = new File(savePath);
			if (!dir.exists()) { // 디렉토리가 존재하지 않으면
				dir.mkdirs(); // 디렉토리 생성.!
			}

			MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "utf-8",
					new DefaultFileRenamePolicy());

		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
		}

		return mav;
	}

	@RequestMapping("/ansData.pnp")
	public ModelAndView ansData(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/ansData");

		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));
			String data = new JSONObject(json).getString("data");

			List<Answer2_vo> list = answer2_dao.selAns_idx(user_idx);

			if (list.size() > 0) {
				answer2_dao.upData(user_idx, data);
			} else {
				answer2_dao.insData(user_idx, data);
			}

			mav.addObject("json", "9000");

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/matching_data.pnp")
	public ModelAndView matching_data(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/matching_data");

		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));
			String type = new JSONObject(json).getString("type");

			String return_json = "";
			List<Answer2_vo> ans_list = answer2_dao.selAns_idx(user_idx);

			if ("hall".equals(type)) {
				String query = "1";
				query += " and pro_status = 'Y'";
				List<Hall_vo> list_size = hall_dao.selList_hall(query);
				List<Hall_vo> list = hall_dao.selList_hall(query);

				String matching_arr1[] = { "8", "9", "10", "10", "10", "10", "10" };
				String matching_arr2[] = { "0", "0", "1", "3", "5", "7", "9" };
				String matching_arr3[] = { "", "", "", "", "", "", "" };

				if (ans_list.size() > 0) {
					JSONObject jsonobj = new JSONObject(ans_list.get(0).getAns_data());

					for (int i = 0; i < matching_arr1.length; i++) {
						try {
							JSONArray jsonobj2 = jsonobj.getJSONArray(matching_arr1[i]);
							String val = "";

							for (int j = 0; j < jsonobj2.length(); j++) {
								if (matching_arr2[i].equals(jsonobj2.getJSONObject(j).getString("num"))) {
									val = jsonobj2.getJSONObject(j).getString("value");
								}
							}

							matching_arr3[i] = val;
						} catch (Exception e) {
							matching_arr3[i] = "default";
						}
					}
				}

				for (int i = 0; i < matching_arr3.length; i++) {
					if ("".equals(matching_arr3[i])) {
						matching_arr3[i] = "default";
					}
				}

				ArrayList<Hall_vo> list_7 = new ArrayList();
				ArrayList<Hall_vo> list_6 = new ArrayList();
				ArrayList<Hall_vo> list_5 = new ArrayList();
				ArrayList<Hall_vo> list_4 = new ArrayList();
				ArrayList<Hall_vo> list_3 = new ArrayList();
				ArrayList<Hall_vo> list_2 = new ArrayList();
				ArrayList<Hall_vo> list_1 = new ArrayList();
				ArrayList<Hall_vo> list_0 = new ArrayList();
				ArrayList<Hall_vo> sort_list = new ArrayList();
				ArrayList<String> matching_arr = new ArrayList();

				for (int i = 0; i < list.size(); i++) {
					int matching_point = 0;

					// 지역 매칭
					if (!"default".equals(matching_arr3[0])) {
						String pro_addr[] = list.get(i).getPro_addr1().replaceAll("특별", "").replaceAll("광역", "")
								.split(" ");
						String user_addr[] = matching_arr3[0].replaceAll("특별", "").replaceAll("광역", "").split(" ");

						if (pro_addr.length > 1 && user_addr.length > 1) {
							if (pro_addr[0].equals(user_addr[0]) && pro_addr[1].equals(user_addr[1])) {
								matching_point++;
							}
						}

					}
					// 지역 매칭

					// 웨딩홀유형 매칭
					if (!"default".equals(matching_arr3[1])) {
						String user_hall_type[] = matching_arr3[1].split(",");

						for (int j = 0; j < user_hall_type.length; j++) {
							if (list.get(i).getPro_type().indexOf(user_hall_type[j]) > -1) {
								matching_point++;
								break;
							}
						}

					}
					// 웨딩홀유형 매칭

					// 예식타입 매칭
					if (!"default".equals(matching_arr3[2])) {
						String user_wedding_type[] = matching_arr3[2].split(",");

						for (int j = 0; j < user_wedding_type.length; j++) {
							if (list.get(i).getPro_wedding_type().indexOf(user_wedding_type[j]) > -1) {
								matching_point++;
								break;
							}
						}

					}
					// 예식타입 매칭

					// 예식시간 매칭
					if (!"default".equals(matching_arr3[3])) {
						String user_wedding_time[] = matching_arr3[3].split("~");
						String pro_wedding_time = list.get(i).getPro_wedding_time();

						double user_time1 = 0;
						double user_time2 = 0;
						double pro_time = 0;

						user_time1 = Integer.parseInt(user_wedding_time[0].substring(0, 1));
						user_time2 = Integer.parseInt(user_wedding_time[1].substring(0, 1));
						pro_time = Integer.parseInt(pro_wedding_time.substring(0, 1));

						if (user_wedding_time[0].indexOf("반") > -1) {
							user_time1 += 0.5;
						}
						if (user_wedding_time[1].indexOf("반") > -1) {
							user_time2 += 0.5;
						}
						if (pro_wedding_time.indexOf("반") > -1) {
							pro_time += 0.5;
						}

						if (pro_time >= user_time1 && pro_time <= user_time2) {
							matching_point++;
						}

					}
					// 예식시간 매칭

					// 메뉴 매칭
					if (!"default".equals(matching_arr3[4])) {
						String user_menu[] = matching_arr3[4].split(",");

						for (int j = 0; j < user_menu.length; j++) {
							if (list.get(i).getPro_menu().indexOf(user_menu[j]) > -1) {
								matching_point++;
								break;
							}
						}

					}
					// 메뉴 매칭

					// 식사금액 매칭
					if (!"default".equals(matching_arr3[5])) {
						String user_eat_pay = matching_arr3[5];
						String pro_eat_pay = list.get(i).getPro_eat_pay().split("~")[0].replaceAll(",", "");

						if ("3만원이하".equals(user_eat_pay) && Integer.parseInt(pro_eat_pay) < 30000) {
							matching_point++;
						} else if ("3만원대".equals(user_eat_pay) && Integer.parseInt(pro_eat_pay) >= 30000
								&& Integer.parseInt(pro_eat_pay) < 40000) {
							matching_point++;
						} else if ("4만원대".equals(user_eat_pay) && Integer.parseInt(pro_eat_pay) >= 40000
								&& Integer.parseInt(pro_eat_pay) < 50000) {
							matching_point++;
						} else if ("5만원이상".equals(user_eat_pay) && Integer.parseInt(pro_eat_pay) >= 50000) {
							matching_point++;
						}

					}
					// 식사금액 매칭

					// 지불보증인원 매칭
					if (!"default".equals(matching_arr3[6])) {
						if (!"".equals(list.get(i).getPro_person())) {
							String user_person_result[] = matching_arr3[6].split("~");
							String pro_person_result = list.get(i).getPro_person();

							int user_person1 = 0;
							int user_person2 = 0;
							int pro_person = 0;

							user_person1 = Integer.parseInt(user_person_result[0].substring(0, 3));
							user_person2 = Integer.parseInt(user_person_result[1].substring(0, 3));
							pro_person = Integer.parseInt(pro_person_result.substring(0, 3));

							if (pro_person >= user_person1 && pro_person <= user_person2) {
								matching_point++;
							}
						} else {
							matching_point++;
						}

					}
					// 지불보증인원 매칭

					if (matching_point == 7) {
						list_7.add(list.get(i));
					} else if (matching_point == 6) {
						list_6.add(list.get(i));
					} else if (matching_point == 5) {
						list_5.add(list.get(i));
					} else if (matching_point == 4) {
						list_4.add(list.get(i));
					} else if (matching_point == 3) {
						list_3.add(list.get(i));
					} else if (matching_point == 2) {
						list_2.add(list.get(i));
					} else if (matching_point == 1) {
						list_1.add(list.get(i));
					} else if (matching_point == 0) {
						list_0.add(list.get(i));
					}

				}
				for (int i = 0; i < list_7.size(); i++) {
					sort_list.add(list_7.get(i));
					matching_arr.add("7");
				}
				for (int i = 0; i < list_6.size(); i++) {
					sort_list.add(list_6.get(i));
					matching_arr.add("6");
				}
				for (int i = 0; i < list_5.size(); i++) {
					sort_list.add(list_5.get(i));
					matching_arr.add("5");
				}
				for (int i = 0; i < list_4.size(); i++) {
					sort_list.add(list_4.get(i));
					matching_arr.add("4");
				}
				for (int i = 0; i < list_3.size(); i++) {
					sort_list.add(list_3.get(i));
					matching_arr.add("3");
				}
				for (int i = 0; i < list_2.size(); i++) {
					sort_list.add(list_2.get(i));
					matching_arr.add("2");
				}
				for (int i = 0; i < list_1.size(); i++) {
					sort_list.add(list_1.get(i));
					matching_arr.add("1");
				}
				for (int i = 0; i < list_0.size(); i++) {
					sort_list.add(list_0.get(i));
					matching_arr.add("0");
				}

				return_json += "[";
				for (int i = 0; i < sort_list.size(); i++) {
					int sample_cnt = 0;
					File directory = new File("/plan/weddingQ_product/hall/" + sort_list.get(i).getPro_idx());
					File[] files = directory.listFiles();
					if (files != null) {
						for (File file : files) {
							if ((file.getName()).indexOf("sample") > -1) {
								sample_cnt++;
							}
						}
					}

					String scrap_query = "1";

					scrap_query += " and scrap_user_idx = " + user_idx;
					scrap_query += " and scrap_pro_idx = '" + sort_list.get(i).getPro_idx() + "'";
					scrap_query += " and scrap_pro_category = 'hall'";
					List<Scrap_vo> scrap_list = scrap_dao.selList_scrap(scrap_query);

					if (i >= 0 && i < 5) {
						if (i != 0) {
							return_json += ",";
						}
						return_json += "{";
						return_json += "\"img_cnt\":\"" + sample_cnt + "\",";
						return_json += "\"pro_idx\":\"" + sort_list.get(i).getPro_idx() + "\",";
						return_json += "\"pro_sort\":\"" + sort_list.get(i).getPro_sort() + "\",";
						return_json += "\"pro_category\":\"" + sort_list.get(i).getPro_category() + "\",";
						return_json += "\"pro_name\":\"" + sort_list.get(i).getPro_name() + "\",";
						return_json += "\"pro_homepage\":\"" + sort_list.get(i).getPro_homepage() + "\",";
						return_json += "\"pro_tel\":\"" + sort_list.get(i).getPro_tel() + "\",";
						return_json += "\"pro_zipcode\":\"" + sort_list.get(i).getPro_zipcode() + "\",";
						return_json += "\"pro_addr1\":\"" + sort_list.get(i).getPro_addr1() + "\",";
						return_json += "\"pro_addr2\":\"" + sort_list.get(i).getPro_addr2() + "\",";
						return_json += "\"pro_subway1\":\"" + sort_list.get(i).getPro_subway1() + "\",";
						return_json += "\"pro_subway2\":\"" + sort_list.get(i).getPro_subway2() + "\",";
						return_json += "\"pro_subway3\":\"" + sort_list.get(i).getPro_subway3() + "\",";
						return_json += "\"pro_bus\":\"" + sort_list.get(i).getPro_bus() + "\",";
						return_json += "\"pro_intro1\":\"" + sort_list.get(i).getPro_intro1() + "\",";
						return_json += "\"pro_intro2\":\"" + sort_list.get(i).getPro_intro2() + "\",";
						return_json += "\"pro_type\":\"" + sort_list.get(i).getPro_type() + "\",";
						return_json += "\"pro_wedding_type\":\"" + sort_list.get(i).getPro_wedding_type() + "\",";
						return_json += "\"pro_wedding_time\":\"" + sort_list.get(i).getPro_wedding_time() + "\",";
						return_json += "\"pro_hall_seat\":\"" + sort_list.get(i).getPro_hall_seat() + "\",";
						return_json += "\"pro_party_seat\":\"" + sort_list.get(i).getPro_party_seat() + "\",";
						return_json += "\"pro_person\":\"" + sort_list.get(i).getPro_person() + "\",";
						return_json += "\"pro_parking\":\"" + sort_list.get(i).getPro_parking() + "\",";
						return_json += "\"pro_talk_time\":\"" + sort_list.get(i).getPro_talk_time() + "\",";
						return_json += "\"pro_menu\":\"" + sort_list.get(i).getPro_menu() + "\",";
						return_json += "\"pro_eat_pay\":\"" + sort_list.get(i).getPro_eat_pay() + "\",";
						return_json += "\"pro_other_pay\":\"" + sort_list.get(i).getPro_other_pay() + "\",";
						return_json += "\"pro_rent_pay\":\"" + sort_list.get(i).getPro_rent_pay() + "\",";
						return_json += "\"pro_basic_option\":\"" + sort_list.get(i).getPro_basic_option() + "\",";
						return_json += "\"pro_essential_option\":\"" + sort_list.get(i).getPro_essential_option()
								+ "\",";
						return_json += "\"pro_essential_option_pay\":\""
								+ sort_list.get(i).getPro_essential_option_pay() + "\",";
						return_json += "\"pro_menu_type\":\"" + sort_list.get(i).getPro_menu_type() + "\",";
						return_json += "\"pro_menu_name\":\"" + sort_list.get(i).getPro_menu_name() + "\",";
						return_json += "\"pro_menu_pay\":\"" + sort_list.get(i).getPro_menu_pay() + "\",";
						return_json += "\"pro_charge1\":\"" + sort_list.get(i).getPro_charge1() + "\",";
						return_json += "\"pro_charge2\":\"" + sort_list.get(i).getPro_charge2() + "\",";
						return_json += "\"pro_charge3\":\"" + sort_list.get(i).getPro_charge3() + "\",";
						if (scrap_list.size() > 0) {
							return_json += "\"scrap\":\"on\",";
						} else {
							return_json += "\"scrap\":\"off\",";
						}
						return_json += "\"matching_point\":\""
								+ Math.round(Integer.parseInt(matching_arr.get(i)) * 5 / 7.0) + "\",";
						return_json += "\"count\":\"" + list_size.size() + "\"";
						return_json += "}";
					}
				}
				return_json += "]";
			} else if ("studio".equals(type)) {
				String query = "1";
				query += " and pro_status = 'Y'";
				List<Studio_vo> list_size = studio_dao.selList_studio(query);
				List<Studio_vo> list = studio_dao.selList_studio(query);

				String matching_arr1[] = { "17", "18", "19", "20" };
				String matching_arr2[] = { "0", "0", "0", "0" };
				String matching_arr3[] = { "", "", "", "" };

				if (ans_list.size() > 0) {
					JSONObject jsonobj = new JSONObject(ans_list.get(0).getAns_data());

					for (int i = 0; i < matching_arr1.length; i++) {
						try {
							JSONArray jsonobj2 = jsonobj.getJSONArray(matching_arr1[i]);
							String val = "";

							for (int j = 0; j < jsonobj2.length(); j++) {
								if (matching_arr2[i].equals(jsonobj2.getJSONObject(j).getString("num"))) {
									val = jsonobj2.getJSONObject(j).getString("value");
								}
							}

							matching_arr3[i] = val;
						} catch (Exception e) {
							matching_arr3[i] = "default";
						}
					}
				}

				for (int i = 0; i < matching_arr3.length; i++) {
					if ("".equals(matching_arr3[i])) {
						matching_arr3[i] = "default";
					}
				}

				ArrayList<Studio_vo> list_4 = new ArrayList();
				ArrayList<Studio_vo> list_3 = new ArrayList();
				ArrayList<Studio_vo> list_2 = new ArrayList();
				ArrayList<Studio_vo> list_1 = new ArrayList();
				ArrayList<Studio_vo> list_0 = new ArrayList();
				ArrayList<Studio_vo> sort_list = new ArrayList();
				ArrayList<String> matching_arr = new ArrayList();

				for (int i = 0; i < list.size(); i++) {
					int matching_point = 0;

					// 촬영유형 매칭
					if (!"default".equals(matching_arr3[0])) {
						String user_type[] = matching_arr3[0].split(",");

						for (int j = 0; j < user_type.length; j++) {
							if (list.get(i).getPro_type().indexOf(user_type[j]) > -1) {
								matching_point++;
								break;
							}

						}

					}
					// 촬영유형 매칭

					// 컨셉1 매칭
					if (!"default".equals(matching_arr3[1])) {
						String pro_concept1[] = list.get(i).getPro_concept1().replaceAll("&&", ",").replaceAll(" ", "")
								.split(",");

						for (int j = 0; j < pro_concept1.length; j++) {
							if (matching_arr3[1].replaceAll(" ", "").indexOf(pro_concept1[j]) > -1) {
								matching_point++;
								break;
							}
						}

					}
					// 컨셉1 매칭

					// 컨셉2 매칭
					if (!"default".equals(matching_arr3[2])) {
						String pro_concept2[] = list.get(i).getPro_concept2().replaceAll("&&", ",").replaceAll(" ", "")
								.split(",");

						for (int j = 0; j < pro_concept2.length; j++) {
							if (matching_arr3[2].replaceAll(" ", "").indexOf(pro_concept2[j]) > -1) {
								matching_point++;
								break;
							}
						}

					}
					// 컨셉2 매칭

					// 판매가 매칭
					if (!"default".equals(matching_arr3[3])) {
						int pro_composition_price = Integer
								.parseInt(list.get(i).getPro_composition_price().replaceAll(",", ""));
						String user_composition_price[] = matching_arr3[3].split(",");
						for (int j = 0; j < user_composition_price.length; j++) {
							if (user_composition_price[j].equals("30만원 미만") && pro_composition_price < 300000) {
								matching_point++;
							} else if (user_composition_price[j].equals("30만원~50만원") && pro_composition_price >= 300000
									&& pro_composition_price < 500000) {
								matching_point++;
							} else if (user_composition_price[j].equals("50만원~70만원") && pro_composition_price >= 500000
									&& pro_composition_price < 700000) {
								matching_point++;
							} else if (user_composition_price[j].equals("70만원~100만원") && pro_composition_price >= 700000
									&& pro_composition_price < 1000000) {
								matching_point++;
							} else if (user_composition_price[j].equals("100만원이상")
									&& pro_composition_price >= 1000000) {
								matching_point++;
							}
						}

					}
					// 판매가 매칭

					if (matching_point == 4) {
						list_4.add(list.get(i));
					} else if (matching_point == 3) {
						list_3.add(list.get(i));
					} else if (matching_point == 2) {
						list_2.add(list.get(i));
					} else if (matching_point == 1) {
						list_1.add(list.get(i));
					} else if (matching_point == 0) {
						list_0.add(list.get(i));
					}

				}
				for (int i = 0; i < list_4.size(); i++) {
					sort_list.add(list_4.get(i));
					matching_arr.add("4");
				}
				for (int i = 0; i < list_3.size(); i++) {
					sort_list.add(list_3.get(i));
					matching_arr.add("3");
				}
				for (int i = 0; i < list_2.size(); i++) {
					sort_list.add(list_2.get(i));
					matching_arr.add("2");
				}
				for (int i = 0; i < list_1.size(); i++) {
					sort_list.add(list_1.get(i));
					matching_arr.add("1");
				}
				for (int i = 0; i < list_0.size(); i++) {
					sort_list.add(list_0.get(i));
					matching_arr.add("0");
				}

				return_json += "[";
				for (int i = 0; i < sort_list.size(); i++) {
					int sample_cnt = 0;
					File directory = new File("/plan/weddingQ_product/studio/" + sort_list.get(i).getPro_idx());
					File[] files = directory.listFiles();
					if (files != null) {
						for (File file : files) {
							if ((file.getName()).indexOf("sample") > -1) {
								sample_cnt++;
							}
						}
					}

					String scrap_query = "1";

					scrap_query += " and scrap_user_idx = " + user_idx;
					scrap_query += " and scrap_pro_idx = '" + sort_list.get(i).getPro_idx() + "'";
					scrap_query += " and scrap_pro_category = 'studio'";
					List<Scrap_vo> scrap_list = scrap_dao.selList_scrap(scrap_query);

					if (i >= 0 && i < 5) {
						if (i != 0) {
							return_json += ",";
						}
						return_json += "{";
						return_json += "\"img_cnt\":\"" + sample_cnt + "\",";
						return_json += "\"pro_idx\":\"" + sort_list.get(i).getPro_idx() + "\",";
						return_json += "\"pro_sort\":\"" + sort_list.get(i).getPro_sort() + "\",";
						return_json += "\"pro_category\":\"" + sort_list.get(i).getPro_category() + "\",";
						return_json += "\"pro_name\":\"" + sort_list.get(i).getPro_name() + "\",";
						return_json += "\"pro_homepage\":\"" + sort_list.get(i).getPro_homepage() + "\",";
						return_json += "\"pro_tel\":\"" + sort_list.get(i).getPro_tel() + "\",";
						return_json += "\"pro_zipcode\":\"" + sort_list.get(i).getPro_zipcode() + "\",";
						return_json += "\"pro_addr1\":\"" + sort_list.get(i).getPro_addr1() + "\",";
						return_json += "\"pro_addr2\":\"" + sort_list.get(i).getPro_addr2() + "\",";
						return_json += "\"pro_subway1\":\"" + sort_list.get(i).getPro_subway1() + "\",";
						return_json += "\"pro_subway2\":\"" + sort_list.get(i).getPro_subway2() + "\",";
						return_json += "\"pro_subway3\":\"" + sort_list.get(i).getPro_subway3() + "\",";
						return_json += "\"pro_bus\":\"" + sort_list.get(i).getPro_bus() + "\",";
						return_json += "\"pro_intro1\":\"" + sort_list.get(i).getPro_intro1() + "\",";
						return_json += "\"pro_intro2\":\"" + sort_list.get(i).getPro_intro2() + "\",";
						return_json += "\"pro_type\":\"" + sort_list.get(i).getPro_type() + "\",";
						return_json += "\"pro_clothes\":\"" + sort_list.get(i).getPro_clothes() + "\",";
						return_json += "\"pro_props\":\"" + sort_list.get(i).getPro_props() + "\",";
						return_json += "\"pro_play_time\":\"" + sort_list.get(i).getPro_play_time() + "\",";
						return_json += "\"pro_photo_time\":\"" + sort_list.get(i).getPro_photo_time() + "\",";
						return_json += "\"pro_talk_time\":\"" + sort_list.get(i).getPro_talk_time() + "\",";
						return_json += "\"pro_holiday\":\"" + sort_list.get(i).getPro_holiday() + "\",";
						return_json += "\"pro_parking\":\"" + sort_list.get(i).getPro_parking() + "\",";
						return_json += "\"pro_concept1\":\"" + sort_list.get(i).getPro_concept1() + "\",";
						return_json += "\"pro_concept2\":\"" + sort_list.get(i).getPro_concept2() + "\",";
						return_json += "\"pro_composition\":\"" + sort_list.get(i).getPro_composition() + "\",";
						return_json += "\"pro_composition_pay\":\"" + sort_list.get(i).getPro_composition_pay() + "\",";
						return_json += "\"pro_composition_charge\":\"" + sort_list.get(i).getPro_composition_charge()
								+ "\",";
						return_json += "\"pro_composition_price\":\"" + sort_list.get(i).getPro_composition_price()
								+ "\",";
						return_json += "\"pro_add_name\":\"" + sort_list.get(i).getPro_add_name() + "\",";
						return_json += "\"pro_add_pay\":\"" + sort_list.get(i).getPro_add_pay() + "\",";
						return_json += "\"pro_pay_engine\":\"" + sort_list.get(i).getPro_pay_engine() + "\",";
						return_json += "\"pro_pay_number\":\"" + sort_list.get(i).getPro_pay_number() + "\",";
						return_json += "\"pro_pay_name\":\"" + sort_list.get(i).getPro_pay_name() + "\",";
						if (scrap_list.size() > 0) {
							return_json += "\"scrap\":\"on\",";
						} else {
							return_json += "\"scrap\":\"off\",";
						}
						return_json += "\"matching_point\":\""
								+ Math.round(Integer.parseInt(matching_arr.get(i)) * 5 / 4.0) + "\",";
						return_json += "\"count\":\"" + list_size.size() + "\"";
						return_json += "}";
					}
				}
				return_json += "]";
			} else if ("dress".equals(type)) {
				String query = "1";
				query += " and pro_status = 'Y'";
				List<Dress_vo> list_size = dress_dao.selList_dress(query);

				List<Dress_vo> list = dress_dao.selList_dress(query);

				String matching_arr1[] = { "66", "22", "67", "23" };
				String matching_arr2[] = { "0", "0", "0", "0" };
				String matching_arr3[] = { "", "", "", "" };

				if (ans_list.size() > 0) {
					JSONObject jsonobj = new JSONObject(ans_list.get(0).getAns_data());

					for (int i = 0; i < matching_arr1.length; i++) {
						try {
							JSONArray jsonobj2 = jsonobj.getJSONArray(matching_arr1[i]);
							String val = "";

							for (int j = 0; j < jsonobj2.length(); j++) {
								if (matching_arr2[i].equals(jsonobj2.getJSONObject(j).getString("num"))) {
									val = jsonobj2.getJSONObject(j).getString("value");
								}
							}

							matching_arr3[i] = val;
						} catch (Exception e) {
							matching_arr3[i] = "default";
						}
					}
				}

				for (int i = 0; i < matching_arr3.length; i++) {
					if ("".equals(matching_arr3[i])) {
						matching_arr3[i] = "default";
					}
				}
				ArrayList<Dress_vo> list_3 = new ArrayList();
				ArrayList<Dress_vo> list_2 = new ArrayList();
				ArrayList<Dress_vo> list_1 = new ArrayList();
				ArrayList<Dress_vo> list_0 = new ArrayList();
				ArrayList<Dress_vo> sort_list = new ArrayList();
				ArrayList<String> matching_arr = new ArrayList();

				for (int i = 0; i < list.size(); i++) {
					int matching_point = 0;

					// 브랜드 매칭
					if (!"default".equals(matching_arr3[0])) {
						String user_brand = matching_arr3[0];
						if ("국내드레스".equals(user_brand) && "".equals(list.get(i).getPro_brand())) {
							matching_point++;
						} else if ("수입드레스".equals(user_brand) && "수입드레스".equals(list.get(i).getPro_brand())) {
							matching_point++;
						}

					}
					// 브랜드 매칭

					// 판매방식 매칭
					if (!"default".equals(matching_arr3[1])) {
						if (matching_arr3[1].indexOf("대여") > -1 && list.get(i).getPro_type().indexOf("대여") > -1) {
							matching_point++;
						} else if (matching_arr3[1].indexOf("구입") > -1
								&& list.get(i).getPro_type().indexOf("판매") > -1) {
							matching_point++;
						}

					}
					// 판매방식 매칭

					// 예산 매칭
					if (!"default".equals(matching_arr3[2]) && !"default".equals(matching_arr3[3])) {
						String pro_composition[] = list.get(i).getPro_composition().split("&&");
						String pro_composition_price[] = list.get(i).getPro_composition_price().replaceAll(",", "")
								.split("&&");
						for (int j = 0; j < pro_composition.length; j++) {
							if (matching_arr3[2].indexOf("리허설") > -1 && pro_composition[j].indexOf("리허설") > -1) {
								if ("30만원 미만".equals(matching_arr3[3])
										&& Integer.parseInt(pro_composition_price[j]) < 300000) {
									matching_point++;
								} else if ("30만원~50만원".equals(matching_arr3[3])
										&& Integer.parseInt(pro_composition_price[j]) >= 300000
										&& Integer.parseInt(pro_composition_price[j]) < 500000) {
									matching_point++;
								} else if ("50만원~70만원".equals(matching_arr3[3])
										&& Integer.parseInt(pro_composition_price[j]) >= 500000
										&& Integer.parseInt(pro_composition_price[j]) < 700000) {
									matching_point++;
								} else if ("70만원~100만원".equals(matching_arr3[3])
										&& Integer.parseInt(pro_composition_price[j]) >= 700000
										&& Integer.parseInt(pro_composition_price[j]) < 1000000) {
									matching_point++;
								} else if ("100만원이상".equals(matching_arr3[3])
										&& Integer.parseInt(pro_composition_price[j]) >= 1000000) {
									matching_point++;
								}
							}
							if (matching_arr3[2].indexOf("결혼식") > -1 && pro_composition[j].indexOf("본식") > -1) {
								if ("30만원 미만".equals(matching_arr3[3])
										&& Integer.parseInt(pro_composition_price[j]) < 300000) {
									matching_point++;
								} else if ("30만원~50만원".equals(matching_arr3[3])
										&& Integer.parseInt(pro_composition_price[j]) >= 300000
										&& Integer.parseInt(pro_composition_price[j]) < 500000) {
									matching_point++;
								} else if ("50만원~70만원".equals(matching_arr3[3])
										&& Integer.parseInt(pro_composition_price[j]) >= 500000
										&& Integer.parseInt(pro_composition_price[j]) < 700000) {
									matching_point++;
								} else if ("70만원~100만원".equals(matching_arr3[3])
										&& Integer.parseInt(pro_composition_price[j]) >= 700000
										&& Integer.parseInt(pro_composition_price[j]) < 1000000) {
									matching_point++;
								} else if ("100만원이상".equals(matching_arr3[3])
										&& Integer.parseInt(pro_composition_price[j]) >= 1000000) {
									matching_point++;
								}
							}
						}

					}
					// 예산 매칭
					if (matching_point == 3) {
						list_3.add(list.get(i));
					} else if (matching_point == 2) {
						list_2.add(list.get(i));
					} else if (matching_point == 1) {
						list_1.add(list.get(i));
					} else if (matching_point == 0) {
						list_0.add(list.get(i));
					}
				}
				for (int i = 0; i < list_3.size(); i++) {
					sort_list.add(list_3.get(i));
					matching_arr.add("3");
				}
				for (int i = 0; i < list_2.size(); i++) {
					sort_list.add(list_2.get(i));
					matching_arr.add("2");
				}
				for (int i = 0; i < list_1.size(); i++) {
					sort_list.add(list_1.get(i));
					matching_arr.add("1");
				}
				for (int i = 0; i < list_0.size(); i++) {
					sort_list.add(list_0.get(i));
					matching_arr.add("0");
				}

				return_json += "[";
				for (int i = 0; i < sort_list.size(); i++) {
					int sample_cnt = 0;
					File directory = new File("/plan/weddingQ_product/dress/" + sort_list.get(i).getPro_idx());
					File[] files = directory.listFiles();
					if (files != null) {
						for (File file : files) {
							if ((file.getName()).indexOf("sample") > -1) {
								sample_cnt++;
							}
						}
					}

					String scrap_query = "1";

					scrap_query += " and scrap_user_idx = " + user_idx;
					scrap_query += " and scrap_pro_idx = '" + sort_list.get(i).getPro_idx() + "'";
					scrap_query += " and scrap_pro_category = 'dress'";
					List<Scrap_vo> scrap_list = scrap_dao.selList_scrap(scrap_query);

					if (i >= 0 && i < 5) {
						if (i != 0) {
							return_json += ",";
						}
						return_json += "{";
						return_json += "\"img_cnt\":\"" + sample_cnt + "\",";
						return_json += "\"pro_idx\":\"" + sort_list.get(i).getPro_idx() + "\",";
						return_json += "\"pro_sort\":\"" + sort_list.get(i).getPro_sort() + "\",";
						return_json += "\"pro_category\":\"" + sort_list.get(i).getPro_category() + "\",";
						return_json += "\"pro_name\":\"" + sort_list.get(i).getPro_name() + "\",";
						return_json += "\"pro_homepage\":\"" + sort_list.get(i).getPro_homepage() + "\",";
						return_json += "\"pro_tel\":\"" + sort_list.get(i).getPro_tel() + "\",";
						return_json += "\"pro_zipcode\":\"" + sort_list.get(i).getPro_zipcode() + "\",";
						return_json += "\"pro_addr1\":\"" + sort_list.get(i).getPro_addr1() + "\",";
						return_json += "\"pro_addr2\":\"" + sort_list.get(i).getPro_addr2() + "\",";
						return_json += "\"pro_subway1\":\"" + sort_list.get(i).getPro_subway1() + "\",";
						return_json += "\"pro_subway2\":\"" + sort_list.get(i).getPro_subway2() + "\",";
						return_json += "\"pro_subway3\":\"" + sort_list.get(i).getPro_subway3() + "\",";
						return_json += "\"pro_bus\":\"" + sort_list.get(i).getPro_bus() + "\",";
						return_json += "\"pro_intro1\":\"" + sort_list.get(i).getPro_intro1() + "\",";
						return_json += "\"pro_intro2\":\"" + sort_list.get(i).getPro_intro2() + "\",";
						return_json += "\"pro_brand\":\"" + sort_list.get(i).getPro_brand() + "\",";
						return_json += "\"pro_type\":\"" + sort_list.get(i).getPro_type() + "\",";
						return_json += "\"pro_talk_time\":\"" + sort_list.get(i).getPro_talk_time() + "\",";
						return_json += "\"pro_holiday\":\"" + sort_list.get(i).getPro_holiday() + "\",";
						return_json += "\"pro_parking\":\"" + sort_list.get(i).getPro_parking() + "\",";
						return_json += "\"pro_composition\":\"" + sort_list.get(i).getPro_composition() + "\",";
						return_json += "\"pro_composition_pay\":\"" + sort_list.get(i).getPro_composition_pay() + "\",";
						return_json += "\"pro_composition_charge\":\"" + sort_list.get(i).getPro_composition_charge()
								+ "\",";
						return_json += "\"pro_composition_price\":\"" + sort_list.get(i).getPro_composition_price()
								+ "\",";
						return_json += "\"pro_add_name\":\"" + sort_list.get(i).getPro_add_name() + "\",";
						return_json += "\"pro_add_pay\":\"" + sort_list.get(i).getPro_add_pay() + "\",";
						return_json += "\"pro_pay_engine\":\"" + sort_list.get(i).getPro_pay_engine() + "\",";
						return_json += "\"pro_pay_number\":\"" + sort_list.get(i).getPro_pay_number() + "\",";
						return_json += "\"pro_pay_name\":\"" + sort_list.get(i).getPro_pay_name() + "\",";
						if (scrap_list.size() > 0) {
							return_json += "\"scrap\":\"on\",";
						} else {
							return_json += "\"scrap\":\"off\",";
						}
						return_json += "\"matching_point\":\""
								+ Math.round(Integer.parseInt(matching_arr.get(i)) * 5 / 3.0) + "\",";
						return_json += "\"count\":\"" + list_size.size() + "\"";
						return_json += "}";
					}
				}
				return_json += "]";

			} else if ("makeup".equals(type)) {
				String query = "1";
				query += " and pro_status = 'Y'";
				List<Makeup_vo> list_size = makeup_dao.selList_makeup(query);

				List<Makeup_vo> list = makeup_dao.selList_makeup(query);

				String matching_arr1[] = { "24", "25", "68" };
				String matching_arr2[] = { "0", "0", "0" };
				String matching_arr3[] = { "", "", "" };

				if (ans_list.size() > 0) {
					JSONObject jsonobj = new JSONObject(ans_list.get(0).getAns_data());

					for (int i = 0; i < matching_arr1.length; i++) {
						try {
							JSONArray jsonobj2 = jsonobj.getJSONArray(matching_arr1[i]);
							String val = "";

							for (int j = 0; j < jsonobj2.length(); j++) {
								if (matching_arr2[i].equals(jsonobj2.getJSONObject(j).getString("num"))) {
									val = jsonobj2.getJSONObject(j).getString("value");
								}
							}

							matching_arr3[i] = val;
						} catch (Exception e) {
							matching_arr3[i] = "default";
						}
					}
				}

				for (int i = 0; i < matching_arr3.length; i++) {
					if ("".equals(matching_arr3[i])) {
						matching_arr3[i] = "default";
					}
				}

				ArrayList<Makeup_vo> list_2 = new ArrayList();
				ArrayList<Makeup_vo> list_1 = new ArrayList();
				ArrayList<Makeup_vo> list_0 = new ArrayList();
				ArrayList<Makeup_vo> sort_list = new ArrayList();
				ArrayList<String> matching_arr = new ArrayList();

				for (int i = 0; i < list.size(); i++) {
					int matching_point = 0;

					// 컨셉 매칭
					if (!"default".equals(matching_arr3[0])) {
						String pro_concept[] = list.get(i).getPro_concept().split("&&");

						for (int j = 0; j < pro_concept.length; j++) {
							if (matching_arr3[0].indexOf(pro_concept[j]) > -1) {
								matching_point++;
								break;
							}
						}

					}
					// 컨셉 매칭

					// 예산 매칭
					if (!"default".equals(matching_arr3[1]) && !"default".equals(matching_arr3[2])) {
						String pro_composition[] = list.get(i).getPro_composition().split("&&");
						String pro_composition_price[] = list.get(i).getPro_composition_price().replaceAll(",", "")
								.split("&&");
						for (int j = 0; j < pro_composition.length; j++) {
							if (matching_arr3[2].indexOf("리허설") > -1 && pro_composition[j].indexOf("리허설") > -1) {
								if ("30만원 미만".equals(matching_arr3[1])
										&& Integer.parseInt(pro_composition_price[j]) < 300000) {
									matching_point++;
								} else if ("30만원~50만원".equals(matching_arr3[1])
										&& Integer.parseInt(pro_composition_price[j]) >= 300000
										&& Integer.parseInt(pro_composition_price[j]) < 500000) {
									matching_point++;
								} else if ("50만원~70만원".equals(matching_arr3[1])
										&& Integer.parseInt(pro_composition_price[j]) >= 500000
										&& Integer.parseInt(pro_composition_price[j]) < 700000) {
									matching_point++;
								} else if ("70만원~100만원".equals(matching_arr3[1])
										&& Integer.parseInt(pro_composition_price[j]) >= 700000
										&& Integer.parseInt(pro_composition_price[j]) < 1000000) {
									matching_point++;
								} else if ("100만원이상".equals(matching_arr3[1])
										&& Integer.parseInt(pro_composition_price[j]) >= 1000000) {
									matching_point++;
								}
							}
							if (matching_arr3[2].indexOf("결혼식") > -1 && pro_composition[j].indexOf("본식") > -1) {
								if ("30만원 미만".equals(matching_arr3[1])
										&& Integer.parseInt(pro_composition_price[j]) < 300000) {
									matching_point++;
								} else if ("30만원~50만원".equals(matching_arr3[1])
										&& Integer.parseInt(pro_composition_price[j]) >= 300000
										&& Integer.parseInt(pro_composition_price[j]) < 500000) {
									matching_point++;
								} else if ("50만원~70만원".equals(matching_arr3[1])
										&& Integer.parseInt(pro_composition_price[j]) >= 500000
										&& Integer.parseInt(pro_composition_price[j]) < 700000) {
									matching_point++;
								} else if ("70만원~100만원".equals(matching_arr3[1])
										&& Integer.parseInt(pro_composition_price[j]) >= 700000
										&& Integer.parseInt(pro_composition_price[j]) < 1000000) {
									matching_point++;
								} else if ("100만원이상".equals(matching_arr3[1])
										&& Integer.parseInt(pro_composition_price[j]) >= 1000000) {
									matching_point++;
								}
							}
						}

					}
					// 예산 매칭
					if (matching_point == 2) {
						list_2.add(list.get(i));
					} else if (matching_point == 1) {
						list_1.add(list.get(i));
					} else if (matching_point == 0) {
						list_0.add(list.get(i));
					}
				}
				for (int i = 0; i < list_2.size(); i++) {
					sort_list.add(list_2.get(i));
					matching_arr.add("2");
				}
				for (int i = 0; i < list_1.size(); i++) {
					sort_list.add(list_1.get(i));
					matching_arr.add("1");
				}
				for (int i = 0; i < list_0.size(); i++) {
					sort_list.add(list_0.get(i));
					matching_arr.add("0");
				}

				return_json += "[";
				for (int i = 0; i < sort_list.size(); i++) {
					int sample_cnt = 0;
					File directory = new File("/plan/weddingQ_product/makeup/" + sort_list.get(i).getPro_idx());
					File[] files = directory.listFiles();
					if (files != null) {
						for (File file : files) {
							if ((file.getName()).indexOf("sample") > -1) {
								sample_cnt++;
							}
						}
					}

					String scrap_query = "1";

					scrap_query += " and scrap_user_idx = " + user_idx;
					scrap_query += " and scrap_pro_idx = '" + sort_list.get(i).getPro_idx() + "'";
					scrap_query += " and scrap_pro_category = 'makeup'";
					List<Scrap_vo> scrap_list = scrap_dao.selList_scrap(scrap_query);

					if (i >= 0 && i < 5) {
						if (i != 0) {
							return_json += ",";
						}
						return_json += "{";
						return_json += "\"img_cnt\":\"" + sample_cnt + "\",";
						return_json += "\"pro_idx\":\"" + sort_list.get(i).getPro_idx() + "\",";
						return_json += "\"pro_sort\":\"" + sort_list.get(i).getPro_sort() + "\",";
						return_json += "\"pro_category\":\"" + sort_list.get(i).getPro_category() + "\",";
						return_json += "\"pro_name\":\"" + sort_list.get(i).getPro_name() + "\",";
						return_json += "\"pro_homepage\":\"" + sort_list.get(i).getPro_homepage() + "\",";
						return_json += "\"pro_tel\":\"" + sort_list.get(i).getPro_tel() + "\",";
						return_json += "\"pro_zipcode\":\"" + sort_list.get(i).getPro_zipcode() + "\",";
						return_json += "\"pro_addr1\":\"" + sort_list.get(i).getPro_addr1() + "\",";
						return_json += "\"pro_addr2\":\"" + sort_list.get(i).getPro_addr2() + "\",";
						return_json += "\"pro_subway1\":\"" + sort_list.get(i).getPro_subway1() + "\",";
						return_json += "\"pro_subway2\":\"" + sort_list.get(i).getPro_subway2() + "\",";
						return_json += "\"pro_subway3\":\"" + sort_list.get(i).getPro_subway3() + "\",";
						return_json += "\"pro_bus\":\"" + sort_list.get(i).getPro_bus() + "\",";
						return_json += "\"pro_intro1\":\"" + sort_list.get(i).getPro_intro1() + "\",";
						return_json += "\"pro_intro2\":\"" + sort_list.get(i).getPro_intro2() + "\",";
						return_json += "\"pro_go\":\"" + sort_list.get(i).getPro_go() + "\",";
						return_json += "\"pro_concept\":\"" + sort_list.get(i).getPro_concept() + "\",";
						return_json += "\"pro_talk_time\":\"" + sort_list.get(i).getPro_talk_time() + "\",";
						return_json += "\"pro_holiday\":\"" + sort_list.get(i).getPro_holiday() + "\",";
						return_json += "\"pro_parking\":\"" + sort_list.get(i).getPro_parking() + "\",";
						return_json += "\"pro_composition\":\"" + sort_list.get(i).getPro_composition() + "\",";
						return_json += "\"pro_composition_pay\":\"" + sort_list.get(i).getPro_composition_pay() + "\",";
						return_json += "\"pro_composition_charge\":\"" + sort_list.get(i).getPro_composition_charge()
								+ "\",";
						return_json += "\"pro_composition_price\":\"" + sort_list.get(i).getPro_composition_price()
								+ "\",";
						return_json += "\"pro_add_name\":\"" + sort_list.get(i).getPro_add_name() + "\",";
						return_json += "\"pro_add_pay\":\"" + sort_list.get(i).getPro_add_pay() + "\",";
						return_json += "\"pro_pay_engine\":\"" + sort_list.get(i).getPro_pay_engine() + "\",";
						return_json += "\"pro_pay_number\":\"" + sort_list.get(i).getPro_pay_number() + "\",";
						return_json += "\"pro_pay_name\":\"" + sort_list.get(i).getPro_pay_name() + "\",";
						if (scrap_list.size() > 0) {
							return_json += "\"scrap\":\"on\",";
						} else {
							return_json += "\"scrap\":\"off\",";
						}
						return_json += "\"matching_point\":\""
								+ Math.round(Integer.parseInt(matching_arr.get(i)) * 5 / 2.0) + "\",";
						return_json += "\"count\":\"" + list_size.size() + "\"";
						return_json += "}";
					}
				}
				return_json += "]";

			} else if ("suit".equals(type)) {
				String query = "1";
				query += " and pro_status = 'Y'";
				List<Suit_vo> list_size = suit_dao.selList_suit(query);

				List<Suit_vo> list = suit_dao.selList_suit(query);
				String matching_arr1[] = { "29", "28" };
				String matching_arr2[] = { "0", "0" };
				String matching_arr3[] = { "", "" };

				if (ans_list.size() > 0) {
					JSONObject jsonobj = new JSONObject(ans_list.get(0).getAns_data());

					for (int i = 0; i < matching_arr1.length; i++) {
						try {
							JSONArray jsonobj2 = jsonobj.getJSONArray(matching_arr1[i]);
							String val = "";

							for (int j = 0; j < jsonobj2.length(); j++) {
								if (matching_arr2[i].equals(jsonobj2.getJSONObject(j).getString("num"))) {
									val = jsonobj2.getJSONObject(j).getString("value");
								}
							}

							matching_arr3[i] = val;
						} catch (Exception e) {
							matching_arr3[i] = "default";
						}
					}
				}

				for (int i = 0; i < matching_arr3.length; i++) {
					if ("".equals(matching_arr3[i])) {
						matching_arr3[i] = "default";
					}
				}
				ArrayList<Suit_vo> list_2 = new ArrayList();
				ArrayList<Suit_vo> list_1 = new ArrayList();
				ArrayList<Suit_vo> list_0 = new ArrayList();
				ArrayList<Suit_vo> sort_list = new ArrayList();
				ArrayList<String> matching_arr = new ArrayList();
				for (int i = 0; i < list.size(); i++) {
					int matching_point = 0;

					// 지역 매칭
					if (!"default".equals(matching_arr3[0])) {
						String pro_addr[] = list.get(i).getPro_addr1().replaceAll("특별", "").replaceAll("광역", "")
								.split(" ");
						String user_addr[] = matching_arr3[0].replaceAll("특별", "").replaceAll("광역", "").split(" ");

						if (pro_addr.length > 1 && user_addr.length > 1) {
							if (pro_addr[0].equals(user_addr[0]) && pro_addr[1].equals(user_addr[1])) {
								matching_point++;
							}
						}

					}
					// 지역 매칭

					// 판매방식 매칭
					if (!"default".equals(matching_arr3[1])) {
						if (matching_arr3[1].indexOf("대여") > -1 && list.get(i).getPro_type().indexOf("대여") > -1) {
							matching_point++;
						} else if (matching_arr3[1].indexOf("맞춤") > -1
								&& list.get(i).getPro_type().indexOf("맞춤") > -1) {
							matching_point++;
						}

					}
					// 판매방식 매칭

					if (matching_point == 2) {
						list_2.add(list.get(i));
					} else if (matching_point == 1) {
						list_1.add(list.get(i));
					} else if (matching_point == 0) {
						list_0.add(list.get(i));
					}
				}
				for (int i = 0; i < list_2.size(); i++) {
					sort_list.add(list_2.get(i));
					matching_arr.add("2");
				}
				for (int i = 0; i < list_1.size(); i++) {
					sort_list.add(list_1.get(i));
					matching_arr.add("1");
				}
				for (int i = 0; i < list_0.size(); i++) {
					sort_list.add(list_0.get(i));
					matching_arr.add("0");
				}

				return_json += "[";
				for (int i = 0; i < sort_list.size(); i++) {
					int sample_cnt = 0;
					File directory = new File("/plan/weddingQ_product/suit/" + sort_list.get(i).getPro_idx());
					File[] files = directory.listFiles();
					if (files != null) {
						for (File file : files) {
							if ((file.getName()).indexOf("sample") > -1) {
								sample_cnt++;
							}
						}
					}

					String scrap_query = "1";

					scrap_query += " and scrap_user_idx = " + user_idx;
					scrap_query += " and scrap_pro_idx = '" + sort_list.get(i).getPro_idx() + "'";
					scrap_query += " and scrap_pro_category = 'suit'";
					List<Scrap_vo> scrap_list = scrap_dao.selList_scrap(scrap_query);

					if (i >= 0 && i < 5) {
						if (i != 0) {
							return_json += ",";
						}
						return_json += "{";
						return_json += "\"img_cnt\":\"" + sample_cnt + "\",";
						return_json += "\"pro_idx\":\"" + sort_list.get(i).getPro_idx() + "\",";
						return_json += "\"pro_sort\":\"" + sort_list.get(i).getPro_sort() + "\",";
						return_json += "\"pro_category\":\"" + sort_list.get(i).getPro_category() + "\",";
						return_json += "\"pro_name\":\"" + sort_list.get(i).getPro_name() + "\",";
						return_json += "\"pro_homepage\":\"" + sort_list.get(i).getPro_homepage() + "\",";
						return_json += "\"pro_tel\":\"" + sort_list.get(i).getPro_tel() + "\",";
						return_json += "\"pro_zipcode\":\"" + sort_list.get(i).getPro_zipcode() + "\",";
						return_json += "\"pro_addr1\":\"" + sort_list.get(i).getPro_addr1() + "\",";
						return_json += "\"pro_addr2\":\"" + sort_list.get(i).getPro_addr2() + "\",";
						return_json += "\"pro_subway1\":\"" + sort_list.get(i).getPro_subway1() + "\",";
						return_json += "\"pro_subway2\":\"" + sort_list.get(i).getPro_subway2() + "\",";
						return_json += "\"pro_subway3\":\"" + sort_list.get(i).getPro_subway3() + "\",";
						return_json += "\"pro_bus\":\"" + sort_list.get(i).getPro_bus() + "\",";
						return_json += "\"pro_intro1\":\"" + sort_list.get(i).getPro_intro1() + "\",";
						return_json += "\"pro_intro2\":\"" + sort_list.get(i).getPro_intro2() + "\",";
						return_json += "\"pro_type\":\"" + sort_list.get(i).getPro_type() + "\",";
						return_json += "\"pro_talk_time\":\"" + sort_list.get(i).getPro_talk_time() + "\",";
						return_json += "\"pro_holiday\":\"" + sort_list.get(i).getPro_holiday() + "\",";
						return_json += "\"pro_parking\":\"" + sort_list.get(i).getPro_parking() + "\",";
						return_json += "\"pro_service\":\"" + sort_list.get(i).getPro_service() + "\",";
						return_json += "\"pro_event\":\"" + sort_list.get(i).getPro_event() + "\",";
						return_json += "\"pro_cashback\":\"" + sort_list.get(i).getPro_cashback() + "\",";
						return_json += "\"pro_composition\":\"" + sort_list.get(i).getPro_composition() + "\",";
						return_json += "\"pro_composition_charge\":\"" + sort_list.get(i).getPro_composition_charge()
								+ "\",";
						return_json += "\"pro_composition_price\":\"" + sort_list.get(i).getPro_composition_price()
								+ "\",";
						return_json += "\"pro_add_name\":\"" + sort_list.get(i).getPro_add_name() + "\",";
						return_json += "\"pro_add_pay\":\"" + sort_list.get(i).getPro_add_pay() + "\",";
						return_json += "\"pro_pay_engine\":\"" + sort_list.get(i).getPro_pay_engine() + "\",";
						return_json += "\"pro_pay_number\":\"" + sort_list.get(i).getPro_pay_number() + "\",";
						return_json += "\"pro_pay_name\":\"" + sort_list.get(i).getPro_pay_name() + "\",";
						if (scrap_list.size() > 0) {
							return_json += "\"scrap\":\"on\",";
						} else {
							return_json += "\"scrap\":\"off\",";
						}
						return_json += "\"matching_point\":\""
								+ Math.round(Integer.parseInt(matching_arr.get(i)) * 5 / 2.0) + "\",";
						return_json += "\"count\":\"" + list_size.size() + "\"";
						return_json += "}";
					}
				}
				return_json += "]";
			} else if ("korea".equals(type)) {
				String query = "1";
				query += " and pro_status = 'Y'";
				List<Korea_vo> list_size = korea_dao.selList_korea(query);

				List<Korea_vo> list = korea_dao.selList_korea(query);

				String matching_arr1[] = { "32", "31" };
				String matching_arr2[] = { "0", "0" };
				String matching_arr3[] = { "", "" };

				if (ans_list.size() > 0) {
					JSONObject jsonobj = new JSONObject(ans_list.get(0).getAns_data());

					for (int i = 0; i < matching_arr1.length; i++) {
						try {
							JSONArray jsonobj2 = jsonobj.getJSONArray(matching_arr1[i]);
							String val = "";

							for (int j = 0; j < jsonobj2.length(); j++) {
								if (matching_arr2[i].equals(jsonobj2.getJSONObject(j).getString("num"))) {
									val = jsonobj2.getJSONObject(j).getString("value");
								}
							}

							matching_arr3[i] = val;
						} catch (Exception e) {
							matching_arr3[i] = "default";
						}
					}
				}

				for (int i = 0; i < matching_arr3.length; i++) {
					if ("".equals(matching_arr3[i])) {
						matching_arr3[i] = "default";
					}
				}
				ArrayList<Korea_vo> list_2 = new ArrayList();
				ArrayList<Korea_vo> list_1 = new ArrayList();
				ArrayList<Korea_vo> list_0 = new ArrayList();
				ArrayList<Korea_vo> sort_list = new ArrayList();
				ArrayList<String> matching_arr = new ArrayList();
				for (int i = 0; i < list.size(); i++) {
					int matching_point = 0;

					// 지역 매칭
					if (!"default".equals(matching_arr3[0])) {
						String user_addr = matching_arr3[0];

						if ("강남/청담동".equals(user_addr) && list.get(i).getPro_addr1().indexOf("강남") > -1) {
							matching_point++;
						} else if ("동대문".equals(user_addr) && list.get(i).getPro_addr1().indexOf("동대문") > -1) {
							matching_point++;
						} else if ("그 외".equals(user_addr)) {
							matching_point++;
						}

					}
					// 지역 매칭

					// 판매방식 매칭
					if (!"default".equals(matching_arr3[1])) {
						if (matching_arr3[1].indexOf("대여") > -1 && list.get(i).getPro_type().indexOf("대여") > -1) {
							matching_point++;
						} else if (matching_arr3[1].indexOf("맞춤") > -1
								&& list.get(i).getPro_type().indexOf("맞춤") > -1) {
							matching_point++;
						}

					}
					// 판매방식 매칭

					if (matching_point == 2) {
						list_2.add(list.get(i));
					} else if (matching_point == 1) {
						list_1.add(list.get(i));
					} else if (matching_point == 0) {
						list_0.add(list.get(i));
					}
				}
				for (int i = 0; i < list_2.size(); i++) {
					sort_list.add(list_2.get(i));
					matching_arr.add("2");
				}
				for (int i = 0; i < list_1.size(); i++) {
					sort_list.add(list_1.get(i));
					matching_arr.add("1");
				}
				for (int i = 0; i < list_0.size(); i++) {
					sort_list.add(list_0.get(i));
					matching_arr.add("0");
				}

				return_json += "[";
				for (int i = 0; i < sort_list.size(); i++) {
					int sample_cnt = 0;
					File directory = new File("/plan/weddingQ_product/korea/" + sort_list.get(i).getPro_idx());
					File[] files = directory.listFiles();
					if (files != null) {
						for (File file : files) {
							if ((file.getName()).indexOf("sample") > -1) {
								sample_cnt++;
							}
						}
					}

					String scrap_query = "1";

					scrap_query += " and scrap_user_idx = " + user_idx;
					scrap_query += " and scrap_pro_idx = '" + sort_list.get(i).getPro_idx() + "'";
					scrap_query += " and scrap_pro_category = 'korea'";
					List<Scrap_vo> scrap_list = scrap_dao.selList_scrap(scrap_query);

					if (i >= 0 && i < 5) {
						if (i != 0) {
							return_json += ",";
						}
						return_json += "{";
						return_json += "\"img_cnt\":\"" + sample_cnt + "\",";
						return_json += "\"pro_idx\":\"" + sort_list.get(i).getPro_idx() + "\",";
						return_json += "\"pro_sort\":\"" + sort_list.get(i).getPro_sort() + "\",";
						return_json += "\"pro_category\":\"" + sort_list.get(i).getPro_category() + "\",";
						return_json += "\"pro_name\":\"" + sort_list.get(i).getPro_name() + "\",";
						return_json += "\"pro_homepage\":\"" + sort_list.get(i).getPro_homepage() + "\",";
						return_json += "\"pro_tel\":\"" + sort_list.get(i).getPro_tel() + "\",";
						return_json += "\"pro_zipcode\":\"" + sort_list.get(i).getPro_zipcode() + "\",";
						return_json += "\"pro_addr1\":\"" + sort_list.get(i).getPro_addr1() + "\",";
						return_json += "\"pro_addr2\":\"" + sort_list.get(i).getPro_addr2() + "\",";
						return_json += "\"pro_subway1\":\"" + sort_list.get(i).getPro_subway1() + "\",";
						return_json += "\"pro_subway2\":\"" + sort_list.get(i).getPro_subway2() + "\",";
						return_json += "\"pro_subway3\":\"" + sort_list.get(i).getPro_subway3() + "\",";
						return_json += "\"pro_bus\":\"" + sort_list.get(i).getPro_bus() + "\",";
						return_json += "\"pro_intro1\":\"" + sort_list.get(i).getPro_intro1() + "\",";
						return_json += "\"pro_intro2\":\"" + sort_list.get(i).getPro_intro2() + "\",";
						return_json += "\"pro_type\":\"" + sort_list.get(i).getPro_type() + "\",";
						return_json += "\"pro_talk_time\":\"" + sort_list.get(i).getPro_talk_time() + "\",";
						return_json += "\"pro_holiday\":\"" + sort_list.get(i).getPro_holiday() + "\",";
						return_json += "\"pro_parking\":\"" + sort_list.get(i).getPro_parking() + "\",";
						return_json += "\"pro_service\":\"" + sort_list.get(i).getPro_service() + "\",";
						return_json += "\"pro_event\":\"" + sort_list.get(i).getPro_event() + "\",";
						return_json += "\"pro_cashback\":\"" + sort_list.get(i).getPro_cashback() + "\",";
						return_json += "\"pro_composition\":\"" + sort_list.get(i).getPro_composition() + "\",";
						return_json += "\"pro_composition_charge\":\"" + sort_list.get(i).getPro_composition_charge()
								+ "\",";
						return_json += "\"pro_composition_price\":\"" + sort_list.get(i).getPro_composition_price()
								+ "\",";
						return_json += "\"pro_add_name\":\"" + sort_list.get(i).getPro_add_name() + "\",";
						return_json += "\"pro_add_pay\":\"" + sort_list.get(i).getPro_add_pay() + "\",";
						return_json += "\"pro_pay_engine\":\"" + sort_list.get(i).getPro_pay_engine() + "\",";
						return_json += "\"pro_pay_number\":\"" + sort_list.get(i).getPro_pay_number() + "\",";
						return_json += "\"pro_pay_name\":\"" + sort_list.get(i).getPro_pay_name() + "\",";
						if (scrap_list.size() > 0) {
							return_json += "\"scrap\":\"on\",";
						} else {
							return_json += "\"scrap\":\"off\",";
						}
						return_json += "\"matching_point\":\""
								+ Math.round(Integer.parseInt(matching_arr.get(i)) * 5 / 2.0) + "\",";
						return_json += "\"count\":\"" + list_size.size() + "\"";
						return_json += "}";
					}
				}
				return_json += "]";

			} else if ("jewelry".equals(type)) {
				String query = "1";
				query += " and pro_status = 'Y'";
				List<Jewelry_vo> list_size = jewelry_dao.selList_jewelry(query);

				List<Jewelry_vo> list = jewelry_dao.selList_jewelry(query);

				String matching_arr1[] = { "38" };
				String matching_arr2[] = { "0" };
				String matching_arr3[] = { "" };

				if (ans_list.size() > 0) {
					JSONObject jsonobj = new JSONObject(ans_list.get(0).getAns_data());

					for (int i = 0; i < matching_arr1.length; i++) {
						try {
							JSONArray jsonobj2 = jsonobj.getJSONArray(matching_arr1[i]);
							String val = "";

							for (int j = 0; j < jsonobj2.length(); j++) {
								if (matching_arr2[i].equals(jsonobj2.getJSONObject(j).getString("num"))) {
									val = jsonobj2.getJSONObject(j).getString("value");
								}
							}

							matching_arr3[i] = val;
						} catch (Exception e) {
							matching_arr3[i] = "default";
						}
					}
				}

				for (int i = 0; i < matching_arr3.length; i++) {
					if ("".equals(matching_arr3[i])) {
						matching_arr3[i] = "default";
					}
				}
				ArrayList<Jewelry_vo> list_1 = new ArrayList();
				ArrayList<Jewelry_vo> list_0 = new ArrayList();
				ArrayList<Jewelry_vo> sort_list = new ArrayList();
				ArrayList<String> matching_arr = new ArrayList();
				for (int i = 0; i < list.size(); i++) {
					int matching_point = 0;

					// 지역 매칭
					if (!"default".equals(matching_arr3[0])) {
						String user_addr = matching_arr3[0];

						if ("강남/청담동".equals(user_addr) && list.get(i).getPro_addr1().indexOf("강남") > -1) {
							matching_point++;
						} else if ("종로".equals(user_addr) && list.get(i).getPro_addr1().indexOf("종로") > -1) {
							matching_point++;
						} else if ("백화점".equals(user_addr) && list.get(i).getPro_addr1().indexOf("백화점") > -1) {
							matching_point++;
						}

					}
					// 지역 매칭
					if (matching_point == 1) {
						list_1.add(list.get(i));
					} else if (matching_point == 0) {
						list_0.add(list.get(i));
					}
				}
				for (int i = 0; i < list_1.size(); i++) {
					sort_list.add(list_1.get(i));
					matching_arr.add("1");
				}
				for (int i = 0; i < list_0.size(); i++) {
					sort_list.add(list_0.get(i));
					matching_arr.add("0");
				}

				return_json += "[";
				for (int i = 0; i < sort_list.size(); i++) {
					int sample_cnt = 0;
					File directory = new File("/plan/weddingQ_product/jewelry/" + sort_list.get(i).getPro_idx());
					File[] files = directory.listFiles();
					if (files != null) {
						for (File file : files) {
							if ((file.getName()).indexOf("sample") > -1) {
								sample_cnt++;
							}
						}
					}

					String scrap_query = "1";

					scrap_query += " and scrap_user_idx = " + user_idx;
					scrap_query += " and scrap_pro_idx = '" + sort_list.get(i).getPro_idx() + "'";
					scrap_query += " and scrap_pro_category = 'jewelry'";
					List<Scrap_vo> scrap_list = scrap_dao.selList_scrap(scrap_query);

					if (i >= 0 && i < 5) {
						if (i != 0) {
							return_json += ",";
						}
						return_json += "{";
						return_json += "\"img_cnt\":\"" + sample_cnt + "\",";
						return_json += "\"pro_idx\":\"" + sort_list.get(i).getPro_idx() + "\",";
						return_json += "\"pro_sort\":\"" + sort_list.get(i).getPro_sort() + "\",";
						return_json += "\"pro_category\":\"" + sort_list.get(i).getPro_category() + "\",";
						return_json += "\"pro_name\":\"" + sort_list.get(i).getPro_name() + "\",";
						return_json += "\"pro_homepage\":\"" + sort_list.get(i).getPro_homepage() + "\",";
						return_json += "\"pro_tel\":\"" + sort_list.get(i).getPro_tel() + "\",";
						return_json += "\"pro_zipcode\":\"" + sort_list.get(i).getPro_zipcode() + "\",";
						return_json += "\"pro_addr1\":\"" + sort_list.get(i).getPro_addr1() + "\",";
						return_json += "\"pro_addr2\":\"" + sort_list.get(i).getPro_addr2() + "\",";
						return_json += "\"pro_subway1\":\"" + sort_list.get(i).getPro_subway1() + "\",";
						return_json += "\"pro_subway2\":\"" + sort_list.get(i).getPro_subway2() + "\",";
						return_json += "\"pro_subway3\":\"" + sort_list.get(i).getPro_subway3() + "\",";
						return_json += "\"pro_bus\":\"" + sort_list.get(i).getPro_bus() + "\",";
						return_json += "\"pro_intro1\":\"" + sort_list.get(i).getPro_intro1() + "\",";
						return_json += "\"pro_intro2\":\"" + sort_list.get(i).getPro_intro2() + "\",";
						return_json += "\"pro_talk_time\":\"" + sort_list.get(i).getPro_talk_time() + "\",";
						return_json += "\"pro_holiday\":\"" + sort_list.get(i).getPro_holiday() + "\",";
						return_json += "\"pro_parking\":\"" + sort_list.get(i).getPro_parking() + "\",";
						return_json += "\"pro_service\":\"" + sort_list.get(i).getPro_service() + "\",";
						return_json += "\"pro_event\":\"" + sort_list.get(i).getPro_event() + "\",";
						return_json += "\"pro_cashback\":\"" + sort_list.get(i).getPro_cashback() + "\",";
						return_json += "\"pro_composition\":\"" + sort_list.get(i).getPro_composition() + "\",";
						return_json += "\"pro_composition_charge\":\"" + sort_list.get(i).getPro_composition_charge()
								+ "\",";
						return_json += "\"pro_composition_price\":\"" + sort_list.get(i).getPro_composition_price()
								+ "\",";
						return_json += "\"pro_add_name\":\"" + sort_list.get(i).getPro_add_name() + "\",";
						return_json += "\"pro_add_pay\":\"" + sort_list.get(i).getPro_add_pay() + "\",";
						return_json += "\"pro_pay_engine\":\"" + sort_list.get(i).getPro_pay_engine() + "\",";
						return_json += "\"pro_pay_number\":\"" + sort_list.get(i).getPro_pay_number() + "\",";
						return_json += "\"pro_pay_name\":\"" + sort_list.get(i).getPro_pay_name() + "\",";
						if (scrap_list.size() > 0) {
							return_json += "\"scrap\":\"on\",";
						} else {
							return_json += "\"scrap\":\"off\",";
						}
						return_json += "\"matching_point\":\""
								+ Math.round(Integer.parseInt(matching_arr.get(i)) * 5 / 1.0) + "\",";
						return_json += "\"count\":\"" + list_size.size() + "\"";
						return_json += "}";
					}
				}
				return_json += "]";

			}
			mav.addObject("json", return_json);

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/submit_pw.pnp")
	public ModelAndView submit_pw(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/submit_pw");

		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));
			String user_password = new JSONObject(json).getString("user_password");

			List<User2_vo> list = user2_dao.submit_pw(user_idx, user_password);

			if (list.size() > 0) {
				mav.addObject("json", "9000");
			} else {
				mav.addObject("json", "9001");
			}

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/find_user.pnp")
	public ModelAndView find_user(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/find_user");

		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));

			System.out.println(json);
			List<User2_vo> list = user2_dao.find_user(user_idx);

			if (list.size() > 0) {
				String user_schedule[] = list.get(0).getUser_schedule().split("&&");
				String return_json = "";
				return_json += "{";
				return_json += "\"user_idx\":\"" + list.get(0).getUser_idx() + "\",";
				return_json += "\"user_name\":\"" + list.get(0).getUser_name() + "\",";
				return_json += "\"user_password\":\"" + list.get(0).getUser_password() + "\",";
				return_json += "\"user_phone\":\"" + list.get(0).getUser_phone() + "\",";
				return_json += "\"user_gender\":\"" + list.get(0).getUser_gender() + "\",";
				return_json += "\"user_nickname\":\"" + list.get(0).getUser_nickname() + "\",";
				return_json += "\"user_schedule\":\"" + user_schedule[user_schedule.length - 1] + "\",";
				return_json += "\"user_status\":\"" + list.get(0).getUser_status() + "\",";
				return_json += "\"user_submit_date\":\"" + list.get(0).getUser_submit_date() + "\"";
				return_json += "}";
				mav.addObject("json", return_json);
			} else {
				mav.addObject("json", "9001");
			}

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/update_user.pnp")
	public ModelAndView update_user(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/update_user");

		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));
			String user_name = new JSONObject(json).getString("user_name");
			String user_password = new JSONObject(json).getString("user_password");
			String user_phone = new JSONObject(json).getString("user_phone");
			String user_gender = new JSONObject(json).getString("user_gender");
			String user_nickname = new JSONObject(json).getString("user_nickname");
			String user_schedule = "&&" + new JSONObject(json).getString("user_schedule");

			user2_dao.update_user(user_idx, user_name, user_password, user_phone, user_gender, user_nickname,
					user_schedule);

			mav.addObject("json", "9000");

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/find_answer.pnp")
	public ModelAndView find_answer(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/find_answer");

		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));

			List<Answer2_vo> list = answer2_dao.selAns_idx(user_idx);

			if (list.size() > 0) {
				String return_json = "";
				return_json += "{";
				return_json += "\"ans_idx\":\"" + list.get(0).getAns_idx() + "\",";
				return_json += "\"ans_user\":\"" + list.get(0).getAns_user() + "\",";
				if ("".equals(list.get(0).getAns_data())) {
					return_json += "\"ans_data\":\"" + list.get(0).getAns_data() + "\",";
				} else {
					return_json += "\"ans_data\":" + list.get(0).getAns_data() + ",";
				}
				return_json += "\"ans_submit_date\":\"" + list.get(0).getAns_submit_date() + "\"";
				return_json += "}";
				mav.addObject("json", return_json);
			} else {
				mav.addObject("json", "9001");
			}

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/ques3_info.pnp")
	public ModelAndView ques3_info(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/ques3_info");

		String query = "1";

		String search_val = "";
		if (!"".equals(request.getParameter("search_val")) && request.getParameter("search_val") != null) {
			search_val = request.getParameter("search_val");
			query += " and (ques_cate like '%" + search_val + "%' or ques_title like '%" + search_val + "%')";
		}

		List<Ques3_vo> list_size = ques3_dao.selList_ques3(query);

		int page = 1;
		if (!"".equals(request.getParameter("page")) && request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		int page1 = page * 15 - 15;
		int ten = page - (page % 10);

		if (page % 10 == 0) // 10, 20페이지 눌렀는데 넘어가면 안되니까~ 처리!
		{
			mav.addObject("list_size1", ten - 9);
			mav.addObject("list_size2", ten);
			if (ten < list_size.size() / 15 + 1) {
				mav.addObject("next", "next");
			} else {
				mav.addObject("next", "done");
			}
		} else {
			mav.addObject("list_size1", ten + 1);
			if (ten + 10 > list_size.size() / 15 + 1) {
				mav.addObject("list_size2", list_size.size() / 15 + 1);
				mav.addObject("next", "done");
			} else {
				mav.addObject("list_size2", ten + 10);
				mav.addObject("next", "next");
			}

		}
		mav.addObject("list_size", list_size.size() / 15 + 1);
		mav.addObject("page", page);

		String sort_val = "ques_idx";

		String sort_type = "";
		if (!"".equals(request.getParameter("sort_val")) && request.getParameter("sort_val") != null) {
			sort_type = request.getParameter("sort_type");
			sort_val = request.getParameter("sort_val");
			query += " order by " + sort_val + " " + sort_type;
		}

		query += " limit " + page1 + ",15";

		List<Ques3_vo> list = ques3_dao.selList_ques3(query);

		mav.addObject("list", list);
		mav.addObject("max_page", list_size.size());
		mav.addObject("search_val", search_val);
		mav.addObject("sort_type", sort_type);
		mav.addObject("sort_val", sort_val);

		return mav;
	}

	@RequestMapping("/ques3_insert.pnp")
	public ModelAndView ques3_insert(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/ques3_insert");

		return mav;
	}

	@RequestMapping("/ques3_insert_output.pnp")
	public ModelAndView ques3_insert_output(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/ques3_insert_output");

		try {
			// IDX 번호 가져옴.
			List<Ques3_vo> quesIdx = ques3_dao.selIdx_ques3();
			int ques_idx;
			if (quesIdx.size() == 0) {
				ques_idx = 1;
			} else {
				ques_idx = quesIdx.get(0).getQues_idx() + 1;
			}
			// IDX 번호 가져옴.

			String savePath = "/plan/weddingQ/ques3/" + ques_idx + "/";
			int sizeLimit = 1024 * 1024 * 1000; // 1000메가..
			File dir = new File(savePath);
			if (!dir.exists()) { // 디렉토리가 존재하지 않으면
				dir.mkdirs(); // 디렉토리 생성.!
			}

			MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "utf-8",
					new DefaultFileRenamePolicy());

			String ques_cate = multi.getParameter("ques_cate");
			String ques_title = multi.getParameter("main_title").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "＇");
			String ques_card1 = "";
			String ques_card2 = "";
			String ques_card3 = "";
			String ques_card4 = "";

			int card_cnt = Integer.parseInt(multi.getParameter("card_cnt"));
			for (int i = 1; i <= card_cnt; i++) {
				if (i == 1) {
					ques_card1 = multi.getParameter("card_title_" + i).replace("\r\n", "<br>").replace("\"", "＂")
							.replace("\'", "＇");
					ques_card2 = multi.getFilesystemName("card_img_" + i).replace("\r\n", "<br>").replace("\"", "＂")
							.replace("\'", "＇");
					ques_card3 = multi.getParameter("card_content_" + i).replace("\r\n", "<br>").replace("\"", "＂")
							.replace("\'", "＇");
					ques_card4 = multi.getParameter("card_button_" + i).replace("\r\n", "<br>").replace("\"", "＂")
							.replace("\'", "＇");
				} else {
					ques_card1 += "&&" + multi.getParameter("card_title_" + i).replace("\r\n", "<br>")
							.replace("\"", "＂").replace("\'", "＇");
					ques_card2 += "&&" + multi.getFilesystemName("card_img_" + i).replace("\r\n", "<br>")
							.replace("\"", "＂").replace("\'", "＇");
					ques_card3 += "&&" + multi.getParameter("card_content_" + i).replace("\r\n", "<br>")
							.replace("\"", "＂").replace("\'", "＇");
					ques_card4 += "&&" + multi.getParameter("card_button_" + i).replace("\r\n", "<br>")
							.replace("\"", "＂").replace("\'", "＇");
				}
			}
			ques_card1 += "&&" + multi.getParameter("card_ans_title").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "＇");
			;
			ques_card2 += "&&"
					+ multi.getParameter("card_ans_type").replace("\r\n", "<br>").replace("\"", "＂").replace("\'", "＇");
			ques_card3 += "&&" + multi.getParameter("card_ans_content").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "＇");
			ques_card4 += "&&" + multi.getParameter("card_ans_button").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "＇");

			int ans_cnt = Integer.parseInt(multi.getParameter("ans_cnt"));
			if (ques_card2.indexOf("문자입력") > -1 || ques_card2.indexOf("단일선택") > -1 || ques_card2.indexOf("다중선택") > -1) {
				ques_card2 += "(";
				for (int i = 1; i <= ans_cnt; i++) {
					if (i == 1) {
						ques_card2 += multi.getParameter("ans_text_" + i);
					} else {
						ques_card2 += "$$" + multi.getParameter("ans_text_" + i);
					}
				}
				ques_card2 += ")";
			}

			ques3_dao.insQues3(ques_idx, ques_cate, ques_title, ques_card1, ques_card2, ques_card3, ques_card4,
					card_cnt);

		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
		}

		return mav;
	}

	@RequestMapping("/ques3_delete.pnp")
	public ModelAndView ques3_delete(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/ques3_delete");

		String idx = request.getParameter("del_idx");

		ques3_dao.delQues3(idx);

		// 기존 파일 지움
		File directory = new File("/plan/weddingQ/ques3/" + idx);
		File[] files = directory.listFiles();
		if (files != null) {
			for (File file : files) {
				Utils.fileDelete(directory + "/" + file.getName());
			}
		}
		// 기존 파일 지움

		return mav;
	}

	@RequestMapping("/ques3_update.pnp")
	public ModelAndView ques3_update(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/ques3_update");

		String query = "1";
		String ques_idx = request.getParameter("idx");
		query += " and ques_idx = '" + ques_idx + "'";

		List<Ques3_vo> list = ques3_dao.selList_ques3(query);

		mav.addObject("list", list);
		mav.addObject("ques_idx", list.get(0).getQues_idx());
		mav.addObject("ques_cate", list.get(0).getQues_cate());
		mav.addObject("ques_title", list.get(0).getQues_title());
		mav.addObject("ques_card1", list.get(0).getQues_card1());
		mav.addObject("ques_card2", list.get(0).getQues_card2());
		mav.addObject("ques_card3", list.get(0).getQues_card3());
		mav.addObject("ques_card4", list.get(0).getQues_card4());
		return mav;
	}

	@RequestMapping("/ques3_update_output.pnp")
	public ModelAndView ques3_update_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/ques3_update_output");

		try {
			String savePath = "/plan/weddingQ/ques3/";
			int sizeLimit = 1024 * 1024 * 1000; // 1000메가..
			File dir = new File(savePath);
			if (!dir.exists()) { // 디렉토리가 존재하지 않으면
				dir.mkdirs(); // 디렉토리 생성.!
			}

			MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "utf-8",
					new DefaultFileRenamePolicy());
			// IDX 가져옴
			int ques_idx = Integer.parseInt(multi.getParameter("ques_idx"));
			// IDX 가져옴

			// 저장될 폴더 지정
			String outFolder = "/plan/weddingQ/ques3/" + ques_idx + "/"; // 이동될 폴더 경로

			dir = new File(outFolder);
			if (!dir.exists()) { // 디렉토리가 존재하지 않으면
				dir.mkdirs(); // 디렉토리 생성.!
			}
			// 저장될 폴더 지정

			String ques_cate = multi.getParameter("ques_cate");
			String ques_title = multi.getParameter("main_title").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "＇");
			String ques_card1 = "";
			String ques_card2 = "";
			String ques_card3 = "";
			String ques_card4 = "";

			int card_cnt = Integer.parseInt(multi.getParameter("card_cnt"));

			// 이미지 작업
			String query = "1";
			query += " and ques_idx = '" + ques_idx + "'";
			List<Ques3_vo> list = ques3_dao.selList_ques3(query);
			String img_arr[] = list.get(0).getQues_card2().split("&&");

			for (int i = 1; i <= card_cnt; i++) {
				String card_img = multi.getFilesystemName("card_img_" + i);
				if (!"".equals(card_img) && card_img != null && !"null".equals(card_img)) {
					// 기존 파일 지움
					File directory = new File("/plan/weddingQ/ques3/" + ques_idx);
					File[] files = directory.listFiles();
					if (files != null) {
						for (File file : files) {
							if (file.isFile() && (file.getName()).indexOf(img_arr[i - 1]) > -1) {
								Utils.fileDelete(directory + "/" + file.getName());
							}
						}
					}
					// 기존 파일 지움

					// 새 이미지 업로드
					Utils.fileMove(savePath + card_img, outFolder + card_img);
					ques_card2 += "&&" + card_img;
					// 새 이미지 업로드
				} else {
					ques_card2 += "&&" + img_arr[i - 1];
				}
			}
			if (!"".equals(ques_card2)) {
				ques_card2 = ques_card2.substring(2, ques_card2.length());
			} // 앞에 && 없애기
				// 이미지 작업

			for (int i = 1; i <= card_cnt; i++) {
				if (i == 1) {
					ques_card1 = multi.getParameter("card_title_" + i).replace("\r\n", "<br>").replace("\"", "＂")
							.replace("\'", "＇");
					ques_card3 = multi.getParameter("card_content_" + i).replace("\r\n", "<br>").replace("\"", "＂")
							.replace("\'", "＇");
					ques_card4 = multi.getParameter("card_button_" + i).replace("\r\n", "<br>").replace("\"", "＂")
							.replace("\'", "＇");
				} else {
					ques_card1 += "&&" + multi.getParameter("card_title_" + i).replace("\r\n", "<br>")
							.replace("\"", "＂").replace("\'", "＇");
					ques_card3 += "&&" + multi.getParameter("card_content_" + i).replace("\r\n", "<br>")
							.replace("\"", "＂").replace("\'", "＇");
					ques_card4 += "&&" + multi.getParameter("card_button_" + i).replace("\r\n", "<br>")
							.replace("\"", "＂").replace("\'", "＇");
				}
			}
			ques_card1 += "&&" + multi.getParameter("card_ans_title").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "＇");
			ques_card2 += "&&"
					+ multi.getParameter("card_ans_type").replace("\r\n", "<br>").replace("\"", "＂").replace("\'", "＇");
			ques_card3 += "&&" + multi.getParameter("card_ans_content").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "＇");
			ques_card4 += "&&" + multi.getParameter("card_ans_button").replace("\r\n", "<br>").replace("\"", "＂")
					.replace("\'", "＇");

			int ans_cnt = Integer.parseInt(multi.getParameter("ans_cnt"));
			if (ques_card2.indexOf("문자입력") > -1 || ques_card2.indexOf("단일선택") > -1 || ques_card2.indexOf("다중선택") > -1) {
				ques_card2 += "(";
				for (int i = 1; i <= ans_cnt; i++) {
					if (i == 1) {
						ques_card2 += multi.getParameter("ans_text_" + i);
					} else {
						ques_card2 += "$$" + multi.getParameter("ans_text_" + i);
					}
				}
				ques_card2 += ")";
			}

			ques3_dao.upQues3(ques_idx, ques_cate, ques_title, ques_card1, ques_card2, ques_card3, ques_card4,
					card_cnt);

		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
		}

		return mav;
	}

	@RequestMapping("/ques3_sort.pnp")
	public ModelAndView ques3_sort(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/ques3_sort");

		List<Ques3_sort_vo> list = ques3_sort_dao.selQues3_sort();

		mav.addObject("list", list);
		mav.addObject("ques_meet", list.get(0).getQues_meet());
		mav.addObject("ques_hall", list.get(0).getQues_hall());
		mav.addObject("ques_honey", list.get(0).getQues_honey());
		mav.addObject("ques_package", list.get(0).getQues_package());
		mav.addObject("ques_suit", list.get(0).getQues_suit());
		mav.addObject("ques_korea", list.get(0).getQues_korea());
		mav.addObject("ques_jewelry", list.get(0).getQues_jewelry());
		mav.addObject("ques_gift", list.get(0).getQues_gift());
		mav.addObject("ques_drawer", list.get(0).getQues_drawer());
		mav.addObject("ques_card", list.get(0).getQues_card());
		mav.addObject("ques_pb", list.get(0).getQues_pb());
		mav.addObject("ques_ready", list.get(0).getQues_ready());
		mav.addObject("ques_other", list.get(0).getQues_other());
		return mav;
	}

	@RequestMapping("/ques3_sort_output.pnp")
	public ModelAndView ques3_sort_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/ques3_sort_output");

		String ques_meet = request.getParameter("ques_meet");
		String ques_hall = request.getParameter("ques_hall");
		String ques_honey = request.getParameter("ques_honey");
		String ques_package = request.getParameter("ques_package");
		String ques_suit = request.getParameter("ques_suit");
		String ques_korea = request.getParameter("ques_korea");
		String ques_jewelry = request.getParameter("ques_jewelry");
		String ques_gift = request.getParameter("ques_gift");
		String ques_drawer = request.getParameter("ques_drawer");
		String ques_card = request.getParameter("ques_card");
		String ques_pb = request.getParameter("ques_pb");
		String ques_ready = request.getParameter("ques_ready");
		String ques_other = request.getParameter("ques_other");

		ques3_sort_dao.upQues_sort(ques_meet, ques_hall, ques_honey, ques_package, ques_suit, ques_korea, ques_jewelry,
				ques_gift, ques_drawer, ques_card, ques_pb, ques_ready, ques_other);
		return mav;
	}

	@RequestMapping("/ques3_api.pnp")
	public ModelAndView ques3_api(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/ques3_api");
		try {
			String json = request.getParameter("json");
			int ques_idx = Integer.parseInt(new JSONObject(json).getString("ques_idx"));

			String query = "1";
			query += " and ques_idx = " + ques_idx;

			List<Ques3_vo> list = ques3_dao.selList_ques3(query);

			if (list.size() == 0) {
				mav.addObject("json", "9001");
			} else {
				String return_json = "";
				String ques_card1[] = list.get(0).getQues_card1().split("&&");
				String ques_card2[] = list.get(0).getQues_card2().split("&&");
				String ques_card3[] = list.get(0).getQues_card3().split("&&");
				String ques_card4[] = list.get(0).getQues_card4().split("&&");

				return_json += "{";
				return_json += "\"question_idx\":\"" + list.get(0).getQues_idx() + "\",";
				return_json += "\"question_category\":\"" + list.get(0).getQues_cate() + "\",";
				return_json += "\"main_title\":\"" + list.get(0).getQues_title() + "\",";
				return_json += "\"main_tip\":";
				return_json += "[";
				for (int i = 0; i < ques_card1.length; i++) {
					if (i != 0) {
						return_json += ",";
					}
					return_json += "{";
					return_json += "\"card_idx\":\"" + (i + 1) + "\",";
					if (i != ques_card2.length - 1) {
						return_json += "\"card_type\":\"tip\",";
					} else {
						return_json += "\"card_type\":\"question\",";
					}
					return_json += "\"card_title\":\"" + ques_card1[i] + "\",";
					return_json += "\"card_img\":\"" + ques_card2[i] + "\",";
					return_json += "\"card_content\":\"" + ques_card3[i] + "\",";
					return_json += "\"card_button\":\"" + ques_card4[i] + "\"";
					return_json += "}";
				}
				return_json += "]";
				return_json += "}";
				mav.addObject("json", return_json);
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/ques3_sort_api.pnp")
	public ModelAndView ques3_sort_api(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/ques3_sort_api");
		try {
			String json = request.getParameter("json");

			List<Ques3_sort_vo> list = ques3_sort_dao.selQues3_sort();

			String return_json = "";

			return_json += "{";
			return_json += "\"ques_meet\":\"" + list.get(0).getQues_meet() + "\",";
			return_json += "\"ques_hall\":\"" + list.get(0).getQues_hall() + "\",";
			return_json += "\"ques_honey\":\"" + list.get(0).getQues_honey() + "\",";
			return_json += "\"ques_package\":\"" + list.get(0).getQues_package() + "\",";
			return_json += "\"ques_suit\":\"" + list.get(0).getQues_suit() + "\",";
			return_json += "\"ques_korea\":\"" + list.get(0).getQues_korea() + "\",";
			return_json += "\"ques_jewelry\":\"" + list.get(0).getQues_jewelry() + "\",";
			return_json += "\"ques_gift\":\"" + list.get(0).getQues_gift() + "\",";
			return_json += "\"ques_drawer\":\"" + list.get(0).getQues_drawer() + "\",";
			return_json += "\"ques_card\":\"" + list.get(0).getQues_card() + "\",";
			return_json += "\"ques_pb\":\"" + list.get(0).getQues_pb() + "\",";
			return_json += "\"ques_ready\":\"" + list.get(0).getQues_ready() + "\",";
			return_json += "\"ques_other\":\"" + list.get(0).getQues_other() + "\"";
			return_json += "}";
			mav.addObject("json", return_json);

		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/recom.pnp")
	public ModelAndView recom(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/recom");
		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));
			String type = new JSONObject(json).getString("type");

			String return_json = "9001";
			if ("package".equals(type)) {
				String s = pro_select(user_idx, "studio", "1 and pro_status = 'Y'", "matching", 1, 3);
				s = s.substring(1, s.length() - 1);
				String d = pro_select(user_idx, "dress", "1 and pro_status = 'Y'", "matching", 1, 3);
				d = d.substring(1, d.length() - 1);
				String m = pro_select(user_idx, "makeup", "1 and pro_status = 'Y'", "matching", 1, 3);
				m = m.substring(1, m.length() - 1);

				return_json = "[";
				return_json += s;
				return_json += "," + d;
				return_json += "," + m;
				return_json += "]";
			} else {
				return_json = pro_select(user_idx, type, "1 and pro_status = 'Y'", "matching", 1, 5);
			}
			mav.addObject("json", return_json);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/mail_api.pnp")
	public ModelAndView mail_api(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/mail_api");
		try {
			String savePath = "/plan/weddingQ_mail/";
			int sizeLimit = 1024 * 1024 * 10; // 10메가..
			File dir = new File(savePath);
			if (!dir.exists()) { // 디렉토리가 존재하지 않으면
				dir.mkdirs(); // 디렉토리 생성.!
			}
			MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "utf-8",
					new DefaultFileRenamePolicy());

			String json = multi.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			String to = new JSONObject(json).getString("to");
			String title = new JSONObject(json).getString("title");
			String msg = new JSONObject(json).getString("msg");
			msg = msg.replaceAll("\n", "<br>");
			String file_name = new JSONObject(json).getString("file_name");

			msg += "<br><br>첨부파일 : http://14.63.216.145/weddingQ_mail/" + file_name;

			// 메일전송
			String mailBody = msg;

			String toMAil = to;
			String mailTitle = title;
			JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
			MimeMessage message = mailSender.createMimeMessage();

			// Properties 설정
			Properties props = new Properties();

			// 인증여부
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.quitwait", "false");
			// 디버그 모드
			// props.put("mail.debug","true");
			props.put("mail.debug", "false");

			mailSender.setJavaMailProperties(props);
			// GMAIL 서버정보
			mailSender.setProtocol("smtp");
			mailSender.setHost("smtp.gmail.com");
			mailSender.setPort(587);
			// GMAIL 계정정보
			mailSender.setUsername("chaplin2004");
			mailSender.setPassword("l0adingg");
			mailSender.setDefaultEncoding("utf-8");

			try {
				MimeMessageHelper messageHelper = new MimeMessageHelper(message, true, "UTF-8");

				messageHelper.setSubject(mailTitle); // 제목
				messageHelper.setTo(toMAil); // 받는사람
				messageHelper.setText(mailBody, true);

				mailSender.send(message);

			} catch (MessagingException e) {
				e.printStackTrace();
			}

			mav.addObject("json", "9000");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/mail_api_noImg.pnp")
	public ModelAndView mail_api_noImg(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/mail_api_noImg");
		try {
			String json = request.getParameter("json");
			System.out.println(json);
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			String to = new JSONObject(json).getString("to");
			String title = new JSONObject(json).getString("title");
			String msg = new JSONObject(json).getString("msg");
			msg = msg.replaceAll("\n", "<br>");

			// 메일전송
			String mailBody = msg;

			String toMAil = to;
			String mailTitle = title;
			JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
			MimeMessage message = mailSender.createMimeMessage();

			// Properties 설정
			Properties props = new Properties();

			// 인증여부
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.quitwait", "false");
			// 디버그 모드
			// props.put("mail.debug","true");
			props.put("mail.debug", "false");

			mailSender.setJavaMailProperties(props);
			// GMAIL 서버정보
			mailSender.setProtocol("smtp");
			mailSender.setHost("smtp.gmail.com");
			mailSender.setPort(587);
			// GMAIL 계정정보
			mailSender.setUsername("chaplin2004");
			mailSender.setPassword("l0adingg");
			mailSender.setDefaultEncoding("utf-8");

			try {
				MimeMessageHelper messageHelper = new MimeMessageHelper(message, true, "UTF-8");

				messageHelper.setSubject(mailTitle); // 제목
				messageHelper.setTo(toMAil); // 받는사람
				messageHelper.setText(mailBody, true);

				mailSender.send(message);

			} catch (MessagingException e) {
				e.printStackTrace();
			}

			mav.addObject("json", "9000");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/setPoint.pnp")
	public ModelAndView setPoint(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/setPoint");
		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));
			String btn = new JSONObject(json).getString("btn");
			String user_name = "";

			if (user_idx == 0) {
				user_name = "비회원";
			} else {
				List<User2_vo> list = user2_dao.selList_user("1 and user_idx = '" + user_idx + "'");
				Utils utils = new Utils();
				user_name = utils.decode(list.get(0).getUser_name());
			}

			stats_point_dao.setStats_point(user_idx, user_name, btn);

			mav.addObject("json", "9000");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/getPoint.pnp")
	public ModelAndView getPoint(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/getPoint");
		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));

			int point = 0;

			List<Stats_vo> login_list = stats_dao.getStats("1 and stats_user_idx = '" + user_idx + "'");
			if (login_list.size() > 4) {
				point++;
			}

			List<Answer2_vo> ans_list = answer2_dao.selAns_all("1 and ans_user = '" + user_idx + "'");
			List<Ques3_sort_vo> ques_list = ques3_sort_dao.selQues3_sort();

			String meet_arr[] = ques_list.get(0).getQues_meet().split(">");
			String hall_arr[] = ques_list.get(0).getQues_hall().split(">");
			String honey_arr[] = ques_list.get(0).getQues_honey().split(">");
			String package_arr[] = ques_list.get(0).getQues_package().split(">");
			String suit_arr[] = ques_list.get(0).getQues_suit().split(">");
			String korea_arr[] = ques_list.get(0).getQues_korea().split(">");
			String jewelry_arr[] = ques_list.get(0).getQues_jewelry().split(">");
			String drawer_arr[] = ques_list.get(0).getQues_drawer().split(">");
			String pb_arr[] = ques_list.get(0).getQues_pb().split(">");

			int end = 0;

			for (int i = 0; i < ans_list.size(); i++) {
				if (ans_list.get(i).getAns_data().indexOf("상견례") > -1) {
					// 상견례
					if (ans_list.get(i).getAns_data().indexOf("\"" + meet_arr[meet_arr.length - 1] + "\":") > -1) // 상견례
																													// 마지막번호
					{
						end++;
					}
					// 상견례

					// 웨딩홀
					if (ans_list.get(i).getAns_data().indexOf("\"" + hall_arr[hall_arr.length - 1] + "\":") > -1) // 웨딩홀
																													// 마지막번호
					{
						end++;
					}
					// 웨딩홀

					// 허니문
					if (ans_list.get(i).getAns_data().indexOf("\"" + honey_arr[honey_arr.length - 1] + "\":") > -1) // 허니문
																													// 마지막번호
					{
						end++;
					}
					// 허니문

					// 스드메
					if (ans_list.get(i).getAns_data().indexOf("\"" + package_arr[package_arr.length - 1] + "\":") > -1) // 스드메
																														// 마지막번호
					{
						end++;
					}
					// 스드메

					// 예복
					if (ans_list.get(i).getAns_data().indexOf("\"" + suit_arr[suit_arr.length - 1] + "\":") > -1) // 예복
																													// 마지막번호
					{
						end++;
					}
					// 예복

					// 한복
					if (ans_list.get(i).getAns_data().indexOf("\"" + korea_arr[korea_arr.length - 1] + "\":") > -1) // 한복
																													// 마지막번호
					{
						end++;
					}
					// 한복

					// 예물
					if (ans_list.get(i).getAns_data().indexOf("\"" + jewelry_arr[jewelry_arr.length - 1] + "\":") > -1) // 예물
																														// 마지막번호
					{
						end++;
					}
					// 예물

					// 혼수
					if (ans_list.get(i).getAns_data().indexOf("\"" + drawer_arr[drawer_arr.length - 1] + "\":") > -1) // 혼수
																														// 마지막번호
					{
						end++;
					}
					// 혼수

					// 폐백
					if (ans_list.get(i).getAns_data().indexOf("\"" + pb_arr[pb_arr.length - 1] + "\":") > -1) // 폐백
																												// 마지막번호
					{
						end++;
					}
					// 폐백
				}
			}
			if (end > 3) {
				point++;
			}

			List<See_sdm_vo> sdm_list = see_sdm_dao
					.selSee_sdm("1 and see_user_idx = '" + user_idx + "' and see_status = '견적신청'");

			if (sdm_list.size() > 9) {
				point++;
			}

			if (point > 2) {
				mav.addObject("json", "true");
			} else {
				mav.addObject("json", "false");
			}

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/select_rand.pnp")
	public ModelAndView select_rand(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/select_rand");
		try {

			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));

			String align = "rand";
			String query = "1 and pro_status = 'Y'";

			String return_json = "";

			String return_json_hall = pro_select(user_idx, "hall", query, align, 1, 1);
			return_json_hall = return_json_hall.substring(1, return_json_hall.length() - 1);
			String return_json_studio = pro_select(user_idx, "studio", query, align, 1, 1);
			return_json_studio = return_json_studio.substring(1, return_json_studio.length() - 1);
			String return_json_dress = pro_select(user_idx, "dress", query, align, 1, 1);
			return_json_dress = return_json_dress.substring(1, return_json_dress.length() - 1);
			String return_json_makeup = pro_select(user_idx, "makeup", query, align, 1, 1);
			return_json_makeup = return_json_makeup.substring(1, return_json_makeup.length() - 1);
			String return_json_snap = pro_select(user_idx, "snap", query, align, 1, 1);
			return_json_snap = return_json_snap.substring(1, return_json_snap.length() - 1);
			String return_json_suit = pro_select(user_idx, "suit", query, align, 1, 1);
			return_json_suit = return_json_suit.substring(1, return_json_suit.length() - 1);
			String return_json_korea = pro_select(user_idx, "korea", query, align, 1, 1);
			return_json_korea = return_json_korea.substring(1, return_json_korea.length() - 1);
			String return_json_jewelry = pro_select(user_idx, "jewelry", query, align, 1, 1);
			return_json_jewelry = return_json_jewelry.substring(1, return_json_jewelry.length() - 1);
			String return_json_pb = pro_select(user_idx, "pb", query, align, 1, 1);
			return_json_pb = return_json_pb.substring(1, return_json_pb.length() - 1);

			return_json += "[";
			return_json += return_json_hall + "," + return_json_studio + "," + return_json_dress + ","
					+ return_json_makeup + "," + return_json_snap + "," + return_json_suit + "," + return_json_korea
					+ "," + return_json_jewelry + "," + return_json_pb;
			return_json += "]";

			mav.addObject("json", return_json);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/upToken.pnp")
	public ModelAndView upToken(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/upToken");
		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));
			String token = new JSONObject(json).getString("token");

			String return_json = "";
			user2_dao.upToken(user_idx, token);

			return_json = "9000";
			mav.addObject("json", return_json);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/estProduct.pnp")
	public ModelAndView estProduct(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/estProduct");
		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int est_idx = Integer.parseInt(new JSONObject(json).getString("est_idx"));

			List<Est_hall_vo> list = est_hall_dao.selEst_hall("1 and est_idx = " + est_idx);
			mav.addObject("json", list.get(0).getEst_product());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/selEst_list.pnp")
	public ModelAndView selEst_list(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/selEst_list");
		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int est_user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));

			List<Est_hall_vo> list = est_hall_dao.selEst_hall("1 and est_user_idx = " + est_user_idx);

			String return_json = "";
			return_json += "[";
			for (int i = 0; i < list.size(); i++) {
				if (i != 0) {
					return_json += ",";
				}
				return_json += "{";
				return_json += "\"est_idx\":\"" + list.get(i).getEst_idx() + "\",";
				return_json += "\"est_user_idx\":\"" + list.get(i).getEst_user_idx() + "\",";
				return_json += "\"est_name\":\"" + list.get(i).getEst_name() + "\",";
				return_json += "\"est_phone\":\"" + list.get(i).getEst_phone() + "\",";
				return_json += "\"est_schedule\":\"" + list.get(i).getEst_schedule() + "\",";
				return_json += "\"est_addr1\":\"" + list.get(i).getEst_addr1() + "\",";
				return_json += "\"est_addr2\":\"" + list.get(i).getEst_addr2() + "\",";
				return_json += "\"est_want_hall\":\"" + list.get(i).getEst_want_hall() + "\",";
				return_json += "\"est_want_date\":\"" + list.get(i).getEst_want_date() + "\",";
				return_json += "\"est_est_hall_type\":\"" + list.get(i).getEst_hall_type() + "\",";
				return_json += "\"est_wedding_type\":\"" + list.get(i).getEst_wedding_type() + "\",";
				return_json += "\"est_menu\":\"" + list.get(i).getEst_menu() + "\",";
				return_json += "\"est_people\":\"" + list.get(i).getEst_people() + "\",";
				return_json += "\"est_memo\":\"" + list.get(i).getEst_memo() + "\",";
				return_json += "\"est_bank\":\"" + list.get(i).getEst_bank() + "\",";
				return_json += "\"est_comment\":\"" + list.get(i).getEst_comment() + "\",";
				return_json += "\"est_status\":\"" + list.get(i).getEst_status() + "\",";
				return_json += "\"est_res_date\":\"" + list.get(i).getEst_res_date() + "\",";
				return_json += "\"est_submit_date\":\"" + list.get(i).getEst_submit_date() + "\",";
				return_json += "\"est_product\":" + list.get(i).getEst_product() + "";
				return_json += "}";
			}
			return_json += "]";

			mav.addObject("json", return_json);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/getCashback.pnp")
	public ModelAndView getCashback(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/getCashback");
		try {
			String json = request.getParameter("json");
			int est_user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));

			String return_json = "[";

			// 웨딩홀 캐쉬백 전달
			try {
				List<Est_hall_vo> list = est_hall_dao
						.selEst_hall("1 and est_user_idx = '" + est_user_idx + "' and est_status = '계약'");
				if (list.size() > 0) {
					JSONArray jarr = new JSONArray(list.get(0).getEst_product());
					for (int i = 0; i < jarr.length(); i++) {
						String est_status = jarr.getJSONObject(i).getString("est_status");
						if (est_status.indexOf("on") > -1) {
							int cashback = Integer.parseInt(jarr.getJSONObject(i).getString("est_cashback"))
									* Integer.parseInt(jarr.getJSONObject(i).getString("est_people"));
							return_json += "{";
							return_json += "\"category\":\"웨딩홀\",";
							return_json += "\"name\":\"" + jarr.getJSONObject(i).getString("est_name") + "\",";
							return_json += "\"cashback\":\"" + cashback + "\",";
							return_json += "\"getMoney\":\"" + est_status.split("&&")[2] + "\",";
							return_json += "\"submit_date\":\"" + est_status.split("&&")[1] + "\",";
							return_json += "\"res_date\":\"" + list.get(0).getEst_schedule() + "\"";
							return_json += "},";
						}
					}
				}
			} catch (JSONException e) {
				e.printStackTrace();
			}
			// 웨딩홀 캐쉬백 전달

			// 스드메 캐쉬백 전달
			try {
				int cashback = 0;
				List<Payment_sdm_vo> list_sdm = payment_sdm_dao.selPayment_sdm("1 and pm_user_idx = '" + est_user_idx
						+ "' and pm_status like '결제완료%' and pm_status not like '%출금완료%'");

				if (list_sdm.size() > 0) {
					// cashback = Integer.parseInt(list_sdm.get(0).getPm_cashback().replaceAll(",",
					// ""));

					String user_name = "";
					if ("M".equals(list_sdm.get(0).getPm_user_gender())) {
						user_name = list_sdm.get(0).getPm_m_name();
					} else {
						user_name = list_sdm.get(0).getPm_w_name();
					}
					String getMoney = "";
					if (list_sdm.get(0).getPm_status().indexOf("출금완료") > -1) {
						getMoney = "출금완료";
					} else {
						getMoney = "출금전";
					}

					// 예약완료된거 찾기
					List<See_sdm_vo> list_his = see_sdm_dao
							.selSee_sdm("1 and see_user_idx = '" + est_user_idx + "' order by see_idx desc");
					String date_result = "";
					for (int i = 0; i < list_his.size(); i++) {
						if (!"".equals(list_his.get(i).getSee_confirm_date())
								&& list_his.get(i).getSee_confirm_date() != null) {
							String con_arr[] = list_his.get(i).getSee_confirm_date().split("@");
							for (int j = 0; j < con_arr.length; j++) {
								if (j == 0) {
									if (con_arr[j].indexOf("완료") > -1) {
										date_result = con_arr[j].replace("(예약완료)", "");
									}
								}
							}
						}
					}
					// 예약완료된거 찾기

					String category = "";
					if ("0".equals(list_sdm.get(0).getPm_studio())) {
						category = "드메";
					} else {
						category = "스드메";
					}
					return_json += "{";
					return_json += "\"category\":\"" + category + "\",";
					return_json += "\"name\":\"" + user_name + "\",";
					return_json += "\"cashback\":\"" + cashback + "\",";
					return_json += "\"getMoney\":\"" + getMoney + "\",";
					return_json += "\"submit_date\":\"" + list_sdm.get(0).getPm_submit_date() + "\",";
					return_json += "\"res_date\":\"" + date_result + "\"";
					return_json += "}";
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			// 스드메 캐쉬백 전달

			return_json += "]";

			mav.addObject("json", return_json);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/getMoney.pnp")
	public ModelAndView getMoney(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/getMoney");
		try {
			String json = request.getParameter("json");
			int user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));
			String type = new JSONObject(json).getString("type");

			if ("hall".equals(type)) {
				List<Est_hall_vo> list = est_hall_dao
						.selEst_hall("1 and est_user_idx = '" + user_idx + "' and est_status = '계약'");
				if (list.size() > 0) {
					String getMoney = list.get(0).getEst_product().replaceAll("출금전", "출금요청");

					est_hall_dao.getMoney(list.get(0).getEst_idx(), getMoney);
				}
			} else {
				List<Payment_sdm_vo> list = payment_sdm_dao.selPayment_sdm("1 and pm_user_idx = '" + user_idx
						+ "' and pm_status like '결제완료%' and pm_status not like '%출금완료%'");
				if (list.size() > 0) {
					payment_sdm_dao.upStatus_pm(user_idx, "결제완료(출금요청)");
				}
			}

			mav.addObject("json", "9000");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/ques3_cnt.pnp")
	public ModelAndView ques3_cnt(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/ques3_cnt");
		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			String type = new JSONObject(json).getString("type");

			if ("meet".equals(type)) {
				type = "상견례";
			} else if ("hall".equals(type)) {
				type = "웨딩홀";
			} else if ("honey".equals(type)) {
				type = "허니문";
			} else if ("package".equals(type)) {
				type = "스드메";
			} else if ("suit".equals(type)) {
				type = "예복";
			} else if ("korea".equals(type)) {
				type = "한복";
			} else if ("jewelry".equals(type)) {
				type = "예물";
			} else if ("drawer".equals(type)) {
				type = "혼수";
			} else if ("pb".equals(type)) {
				type = "폐백";
			}

			List<Ques3_vo> list = ques3_dao.selList_ques3("1 and ques_cate = '" + type + "'");

			mav.addObject("json", list.size());

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/insEst.pnp")
	public ModelAndView insEst(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insEst");
		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));
			String type = new JSONObject(json).getString("type");
			if ("hall".equals(type)) {
				String est_schedule = new JSONObject(json).getString("schedule1")
						+ new JSONObject(json).getString("schedule2");
				String est_addr1 = new JSONObject(json).getString("addr1");
				String est_addr2 = new JSONObject(json).getString("addr2");
				String est_want_hall = new JSONObject(json).getString("want_hall");
				String est_want_date = new JSONObject(json).getString("want_date");
				String est_hall_type = new JSONObject(json).getString("hall_type").replaceAll(",", "&&");
				String est_menu = new JSONObject(json).getString("hall_menu").replaceAll(",", "&&");
				String est_wedding_type = new JSONObject(json).getString("wedding_type");
				String est_people = new JSONObject(json).getString("people");
				String est_name = new JSONObject(json).getString("name");
				String est_phone = new JSONObject(json).getString("phone");
				String est_memo = new JSONObject(json).getString("memo");

				List<Est_hall_vo> list = est_hall_dao.selEst_hall("1 and est_user_idx = " + user_idx);
				if (list.size() > 0) {
					est_hall_dao.insEst_hall(user_idx, est_schedule, est_addr1, est_addr2, est_want_hall, est_want_date,
							est_hall_type, est_menu, est_wedding_type, est_people, est_name, est_phone, est_memo, "재신청",
							"큐레이션 재신청_");
				} else {
					est_hall_dao.insEst_hall(user_idx, est_schedule, est_addr1, est_addr2, est_want_hall, est_want_date,
							est_hall_type, est_menu, est_wedding_type, est_people, est_name, est_phone, est_memo, "신청",
							"큐레이션 신청_");
				}

				// 문자전송

				String msg = "";
				msg += "▣ 웨딩홀 큐레이션 신청 ▣";
				msg += "\n";
				msg += est_name + " " + est_phone;
				msg += "\n";
				msg += "통화가능시간 : " + est_memo.substring(est_memo.indexOf("해피콜:") + 4, est_memo.length());
				msg += "\n";
				msg += "결혼예정일 : " + est_schedule.substring(0, 4) + "년" + est_schedule.substring(4, 6) + "월"
						+ est_schedule.substring(6, 8) + "일" + est_schedule.substring(8, est_schedule.length());
				msg += "\n";
				msg += "지역 : " + est_addr1 + " " + est_addr2;
				msg += "\n";
				msg += "보증인원 : " + est_people;
				msg += "\n";
				msg += "유형 : " + est_hall_type;
				msg += "\n";
				msg += "메뉴 : " + est_menu;
				msg += "\n";
				msg += "타입 : " + est_wedding_type;
				msg += "\n";
				msg += "관심웨딩홀 : " + est_want_hall;
				msg += "\n";
				msg += "방문희망일 : " + est_want_date.substring(0, 4) + "년" + est_want_date.substring(4, 6) + "월"
						+ est_want_date.substring(6, 8) + "일";
				msg += "\n";
				msg += "메모 : " + est_memo.substring(0, est_memo.indexOf("해피콜:"));
				Utils utils = new Utils();
				utils.sendSMS("1090095264", msg);
				utils.sendSMS("1041782958", msg);
				// 문자전송

				// 문자전송
				// Utils utils = new Utils();
				// utils.sendSMS("1090095264", "[웨딩큐] "+est_name+"님의 웨딩홀 큐레이션 서비스 신청이 도착하였습니다");
				// 문자전송
			}
			message_dao.insMessage(0, user_idx, "웨딩홀 큐레이션 서비스 신청이 완료되었습니다");
			stats_est_dao.setStats_est("신청완료");

			mav.addObject("json", "9000");

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/insEstHoney.pnp")
	public ModelAndView insEstHoney(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insEst");
		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));
			String est_name = new JSONObject(json).getString("name");
			String est_phone = new JSONObject(json).getString("phone");
			String est_schedule = new JSONObject(json).getString("schedule");
			String est_honey_schedule = new JSONObject(json).getString("honey_schedule");
			String est_honey_money = new JSONObject(json).getString("honey_money");
			String est_honey_destination = new JSONObject(json).getString("honey_destination");
			String est_honey_style = new JSONObject(json).getString("honey_style");
			String est_etc = new JSONObject(json).getString("etc");
			String est_etc2 = new JSONObject(json).getString("etc2");
			System.out.println(est_name + "  " + est_etc);
			// List<Est_honey_vo> list = est_honey_dao.selEst_hall("1 and est_user_idx =
			// "+user_idx);
			// if(list.size() > 0)
			// {
			est_honey_dao.insEst_hoeny(user_idx, est_name, est_phone, est_schedule, est_honey_schedule, est_honey_money,
					est_honey_destination, est_honey_style, est_etc, est_etc2);
			// }
			// else
			// {
			// est_hall_dao.insEst_hall(user_idx, est_schedule, est_addr1, est_addr2,
			// est_want_hall, est_want_date, est_hall_type, est_menu, est_wedding_type,
			// est_people, est_name, est_phone, est_memo, "신청", "큐레이션 신청_");
			// }

			// 문자전송

			String msg = "";
			msg += "▣ 웨딩큐 허니문 큐레이션 신청 ▣";
			msg += "\n";
			msg += est_name + " " + est_phone;
			msg += "\n";
			msg += "결혼예정일 : " + est_schedule;
			msg += "\n";
			msg += "출발예정일 : " + est_honey_schedule;
			msg += "\n";
			msg += "희망여행지 : " + est_honey_destination;
			msg += "\n";
			msg += "일정 : " + est_etc2;
			msg += "\n";
			msg += "여행스타일 : " + est_honey_style;
			msg += "\n";
			msg += "예산 : " + est_honey_money;
			msg += "\n";
			msg += "추가 문의사항 : " + est_etc;
			msg += "\n";

			Utils utils = new Utils();
			utils.sendSMS("1090095264", msg);
			utils.sendSMS("1041782958", msg);
			// utils.sendSMS("1031279823", msg);
			// 문자전송

			// 문자전송
			// Utils utils = new Utils();
			// utils.sendSMS("1090095264", "[웨딩큐] "+est_name+"님의 웨딩홀 큐레이션 서비스 신청이 도착하였습니다");
			// 문자전송
			// message_dao.insMessage(0, user_idx, "웨딩홀 큐레이션 서비스 신청이 완료되었습니다");
			// stats_est_dao.setStats_est("신청완료");

			mav.addObject("json", "9000");

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/getMessage.pnp")
	public ModelAndView getMessage(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/getMessage");
		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));
			String return_json = "";

			List<Message_vo> list = message_dao.getMessage(user_idx);

			return_json += "[";
			for (int i = 0; i < list.size(); i++) {
				if (i != 0) {
					return_json += ",";
				}
				return_json += "{";
				return_json += "\"msg_idx\":\"" + list.get(i).getMsg_idx() + "\",";
				return_json += "\"msg_est_idx\":\"" + list.get(i).getMsg_est_idx() + "\",";
				return_json += "\"msg_user_idx\":\"" + list.get(i).getMsg_user_idx() + "\",";
				return_json += "\"msg_content\":\"" + list.get(i).getMsg_content() + "\",";
				return_json += "\"msg_status\":\"" + list.get(i).getMsg_status() + "\",";
				return_json += "\"msg_submit_date\":\"" + list.get(i).getMsg_submit_date() + "\"";
				return_json += "}";
			}
			return_json += "]";

			mav.addObject("json", return_json);

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/upMessage.pnp")
	public ModelAndView upMessage(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/upMessage");
		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int msg_idx = Integer.parseInt(new JSONObject(json).getString("msg_idx"));

			message_dao.upMessage(msg_idx);

			mav.addObject("json", "9000");

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/info_est_hall.pnp")
	public ModelAndView info_est_hall(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/info_est_hall");

		String query = "1";

		String searchDate1 = "";
		String searchDate2 = "";
		String searchSchedule1 = "";
		String searchSchedule2 = "";
		String searchAddr = "";
		String searchType = "";
		String searchWeddingType = "";
		String searchMenu = "";
		String search_val = "";
		String searchPerson = "";
		String searchStatus = "";

		mav.addObject("selMonth", request.getParameter("selMonth"));
		mav.addObject("selMonth2", request.getParameter("selMonth2"));

		if (!"".equals(request.getParameter("searchDate1")) && request.getParameter("searchDate1") != null) {
			searchDate1 = request.getParameter("searchDate1") + "000000";
			query += " and est_submit_date >= " + searchDate1;
			mav.addObject("searchDate1", searchDate1.substring(0, 8));
		}
		if (!"".equals(request.getParameter("searchDate2")) && request.getParameter("searchDate2") != null) {
			searchDate2 = request.getParameter("searchDate2") + "999999";
			query += " and est_submit_date <=" + searchDate2;
			mav.addObject("searchDate2", searchDate2.substring(0, 8));
		}
		if (!"".equals(request.getParameter("searchSchedule1")) && request.getParameter("searchSchedule1") != null) {
			searchSchedule1 = request.getParameter("searchSchedule1") + "000000";
			query += " and est_schedule >= " + searchSchedule1;
			mav.addObject("searchSchedule1", searchSchedule1.substring(0, 8));
		}
		if (!"".equals(request.getParameter("searchSchedule2")) && request.getParameter("searchSchedule2") != null) {
			searchSchedule2 = request.getParameter("searchSchedule2") + "999999";
			query += " and est_schedule <= " + searchSchedule2;
			mav.addObject("searchSchedule2", searchSchedule2.substring(0, 8));
		}
		if (!"".equals(request.getParameter("searchAddr")) && request.getParameter("searchAddr") != null) {
			searchAddr = request.getParameter("searchAddr");
			query += " and est_addr1 like '%" + searchAddr + "%'";
			mav.addObject("searchAddr", searchAddr);
		}
		if (!"".equals(request.getParameter("searchType")) && request.getParameter("searchType") != null) {
			searchType = request.getParameter("searchType");
			query += " and est_hall_type like '%" + searchType + "%'";
			mav.addObject("searchType", searchType);
		}
		if (!"".equals(request.getParameter("searchWeddingType"))
				&& request.getParameter("searchWeddingType") != null) {
			searchWeddingType = request.getParameter("searchWeddingType");
			query += " and est_wedding_type like '%" + searchWeddingType + "%'";
			mav.addObject("searchWeddingType", searchWeddingType);
		}
		if (!"".equals(request.getParameter("searchMenu")) && request.getParameter("searchMenu") != null) {
			searchMenu = request.getParameter("searchMenu");
			query += " and (est_menu like '%" + searchMenu + "%' or est_menu like '%" + searchMenu + "%')";
			mav.addObject("searchMenu", searchMenu);
		}
		if (!"".equals(request.getParameter("search_val")) && request.getParameter("search_val") != null) {
			search_val = request.getParameter("search_val");
			query += " and (est_name like '%" + search_val + "%' or est_phone like '%" + search_val + "%')";
			mav.addObject("search_val", search_val);
		}
		if (!"".equals(request.getParameter("searchPerson")) && request.getParameter("searchPerson") != null) {
			searchPerson = request.getParameter("searchPerson");
			if ("up".equals(request.getParameter("searchUpDown"))) {
				query += " and est_people >= " + searchPerson;
				mav.addObject("searchUpDown", "up");
			} else {
				query += " and est_people <= " + searchPerson;
				mav.addObject("searchUpDown", "down");
			}
			mav.addObject("searchPerson", searchPerson);
		}
		if (!"".equals(request.getParameter("searchStatus")) && request.getParameter("searchStatus") != null) {
			searchStatus = request.getParameter("searchStatus");
			query += " and est_status = '" + searchStatus + "'";
			mav.addObject("searchStatus", searchStatus);
		}

		List<Est_hall_vo> list_size = est_hall_dao.selEst_hall(query);

		int page = 1;
		if (!"".equals(request.getParameter("page")) && request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		int page1 = page * 15 - 15;
		int ten = page - (page % 10);

		if (page % 10 == 0) // 10, 20페이지 눌렀는데 넘어가면 안되니까~ 처리!
		{
			mav.addObject("list_size1", ten - 9);
			mav.addObject("list_size2", ten);
			if (ten < list_size.size() / 15 + 1) {
				mav.addObject("next", "next");
			} else {
				mav.addObject("next", "done");
			}
		} else {
			mav.addObject("list_size1", ten + 1);
			if (ten + 10 > list_size.size() / 15 + 1) {
				mav.addObject("list_size2", list_size.size() / 15 + 1);
				mav.addObject("next", "done");
			} else {
				mav.addObject("list_size2", ten + 10);
				mav.addObject("next", "next");
			}

		}
		mav.addObject("list_size", list_size.size() / 15 + 1);
		mav.addObject("page", page);

		String sort_val = "est_idx";

		String sort_type = "";
		if (!"".equals(request.getParameter("sort_val")) && request.getParameter("sort_val") != null) {
			sort_type = request.getParameter("sort_type");
			sort_val = request.getParameter("sort_val");
			query += " order by " + sort_val + " " + sort_type;
		} else {
			query += " order by est_idx desc";
			sort_type = "desc";
			sort_val = "est_idx";
		}

		query += " limit " + page1 + ",15";

		List<Est_hall_vo> list = est_hall_dao.selEst_hall(query);

		mav.addObject("list", list);
		mav.addObject("max_page", list_size.size());
		mav.addObject("sort_type", sort_type);
		mav.addObject("sort_val", sort_val);

		return mav;
	}

	@RequestMapping("/info_est_sdm.pnp")
	public ModelAndView info_est_sdm(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/info_est_sdm");

		String query = "1 and see_user_idx != '61'";

		String type = request.getParameter("type");
		if ("1".equals(type)) {
			query += " and see_status = '견적신청'";
		} else {
			query += " and see_status != '견적신청'";
		}
		mav.addObject("type", type);

		String searchDate1 = "";
		String searchDate2 = "";
		String search_val = "";
		String searchStatus = "";

		mav.addObject("selMonth", request.getParameter("selMonth"));

		if (!"".equals(request.getParameter("searchDate1")) && request.getParameter("searchDate1") != null) {
			searchDate1 = request.getParameter("searchDate1") + "000000";
			query += " and see_submit_date >= " + searchDate1;
			mav.addObject("searchDate1", searchDate1.substring(0, 8));
		}
		if (!"".equals(request.getParameter("searchDate2")) && request.getParameter("searchDate2") != null) {
			searchDate2 = request.getParameter("searchDate2") + "999999";
			query += " and see_submit_date <=" + searchDate2;
			mav.addObject("searchDate2", searchDate2.substring(0, 8));
		}
		if (!"".equals(request.getParameter("search_val")) && request.getParameter("search_val") != null) {
			search_val = request.getParameter("search_val");
			query += " and (see_user_name like '%" + search_val + "%' or see_pro_name like '%" + search_val + "%')";
			mav.addObject("search_val", search_val);
		}
		if (!"".equals(request.getParameter("searchStatus")) && request.getParameter("searchStatus") != null) {
			searchStatus = request.getParameter("searchStatus");
			query += " and see_status = '" + searchStatus + "'";
			mav.addObject("searchStatus", searchStatus);
		}

		List<See_sdm_vo> list_size = see_sdm_dao.selSee_sdm(query);

		int page = 1;
		if (!"".equals(request.getParameter("page")) && request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		int page1 = page * 15 - 15;
		int ten = page - (page % 10);

		if (page % 10 == 0) // 10, 20페이지 눌렀는데 넘어가면 안되니까~ 처리!
		{
			mav.addObject("list_size1", ten - 9);
			mav.addObject("list_size2", ten);
			if (ten < list_size.size() / 15 + 1) {
				mav.addObject("next", "next");
			} else {
				mav.addObject("next", "done");
			}
		} else {
			mav.addObject("list_size1", ten + 1);
			if (ten + 10 > list_size.size() / 15 + 1) {
				mav.addObject("list_size2", list_size.size() / 15 + 1);
				mav.addObject("next", "done");
			} else {
				mav.addObject("list_size2", ten + 10);
				mav.addObject("next", "next");
			}

		}
		mav.addObject("list_size", list_size.size() / 15 + 1);
		mav.addObject("page", page);

		String sort_val = "see_idx";

		String sort_type = "";

		if (!"".equals(request.getParameter("sort_val")) && request.getParameter("sort_val") != null) {
			sort_type = request.getParameter("sort_type");
			sort_val = request.getParameter("sort_val");
			query += " order by " + sort_val + " " + sort_type;
		} else {
			query += " order by see_idx desc";
			sort_type = "desc";
			sort_val = "see_idx";
		}
		query += " limit " + page1 + ",15";

		List<See_sdm_vo> list = see_sdm_dao.selSee_sdm(query);

		mav.addObject("list", list);
		mav.addObject("max_page", list_size.size());
		mav.addObject("sort_type", sort_type);
		mav.addObject("sort_val", sort_val);

		return mav;
	}

	@RequestMapping("/info_voc.pnp")
	public ModelAndView info_voc(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/info_voc");

		String query = "1";

		String search_val = "";
		String searchStatus = "";

		mav.addObject("selMonth", request.getParameter("selMonth"));

		if (!"".equals(request.getParameter("search_val")) && request.getParameter("search_val") != null) {
			search_val = request.getParameter("search_val");
			query += " and (voc_user_name like '%" + search_val + "%' or voc_content like '%" + search_val + "%')";
			mav.addObject("search_val", search_val);
		}
		if (!"".equals(request.getParameter("searchStatus")) && request.getParameter("searchStatus") != null) {
			searchStatus = request.getParameter("searchStatus");
			query += " and voc_status = '" + searchStatus + "'";
			mav.addObject("searchStatus", searchStatus);
		}

		List<Voc_vo> list_size = voc_dao.selVoc(query);

		int page = 1;
		if (!"".equals(request.getParameter("page")) && request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		int page1 = page * 15 - 15;
		int ten = page - (page % 10);

		if (page % 10 == 0) // 10, 20페이지 눌렀는데 넘어가면 안되니까~ 처리!
		{
			mav.addObject("list_size1", ten - 9);
			mav.addObject("list_size2", ten);
			if (ten < list_size.size() / 15 + 1) {
				mav.addObject("next", "next");
			} else {
				mav.addObject("next", "done");
			}
		} else {
			mav.addObject("list_size1", ten + 1);
			if (ten + 10 > list_size.size() / 15 + 1) {
				mav.addObject("list_size2", list_size.size() / 15 + 1);
				mav.addObject("next", "done");
			} else {
				mav.addObject("list_size2", ten + 10);
				mav.addObject("next", "next");
			}

		}
		mav.addObject("list_size", list_size.size() / 15 + 1);
		mav.addObject("page", page);

		String sort_val = "voc_idx";

		String sort_type = "";

		if (!"".equals(request.getParameter("sort_val")) && request.getParameter("sort_val") != null) {
			sort_type = request.getParameter("sort_type");
			sort_val = request.getParameter("sort_val");
			query += " order by " + sort_val + " " + sort_type;
		} else {
			query += " order by voc_idx desc";
			sort_type = "desc";
			sort_val = "voc_idx";
		}
		query += " limit " + page1 + ",15";

		List<Voc_vo> list = voc_dao.selVoc(query);

		mav.addObject("list", list);
		mav.addObject("max_page", list_size.size());
		mav.addObject("sort_type", sort_type);
		mav.addObject("sort_val", sort_val);

		return mav;
	}

	@RequestMapping("/info_notice.pnp")
	public ModelAndView info_notice(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/info_notice");

		String query = "1 and msg_est_idx = '-1' and msg_notice = '개인'";

		String search_val = "";

		mav.addObject("selMonth", request.getParameter("selMonth"));

		if (!"".equals(request.getParameter("search_val")) && request.getParameter("search_val") != null) {
			search_val = request.getParameter("search_val");
			query += " and msg_content like '%" + search_val + "%'";
			mav.addObject("search_val", search_val);
		}

		// query += " group by msg_content";

		List<Message_vo> list_size = message_dao.getMessage_notice(query);

		int page = 1;
		if (!"".equals(request.getParameter("page")) && request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		int page1 = page * 15 - 15;
		int ten = page - (page % 10);

		if (page % 10 == 0) // 10, 20페이지 눌렀는데 넘어가면 안되니까~ 처리!
		{
			mav.addObject("list_size1", ten - 9);
			mav.addObject("list_size2", ten);
			if (ten < list_size.size() / 15 + 1) {
				mav.addObject("next", "next");
			} else {
				mav.addObject("next", "done");
			}
		} else {
			mav.addObject("list_size1", ten + 1);
			if (ten + 10 > list_size.size() / 15 + 1) {
				mav.addObject("list_size2", list_size.size() / 15 + 1);
				mav.addObject("next", "done");
			} else {
				mav.addObject("list_size2", ten + 10);
				mav.addObject("next", "next");
			}

		}
		mav.addObject("list_size", list_size.size() / 15 + 1);
		mav.addObject("page", page);

		String sort_val = "msg_idx";

		String sort_type = "";

		if (!"".equals(request.getParameter("sort_val")) && request.getParameter("sort_val") != null) {
			sort_type = request.getParameter("sort_type");
			sort_val = request.getParameter("sort_val");
			query += " order by " + sort_val + " " + sort_type;
		} else {
			query += " order by msg_idx desc";
			sort_type = "desc";
			sort_val = "msg_idx";
		}
		query += " limit " + page1 + ",15";

		List<Message_vo> list = message_dao.getMessage_notice(query);

		mav.addObject("list", list);
		mav.addObject("max_page", list_size.size());
		mav.addObject("sort_type", sort_type);
		mav.addObject("sort_val", sort_val);

		return mav;
	}

	@RequestMapping("/info_notice_all.pnp")
	public ModelAndView info_notice_all(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/info_notice_all");

		String query = "1 and msg_est_idx = '-1' and msg_notice = '전체'";

		String search_val = "";

		mav.addObject("selMonth", request.getParameter("selMonth"));

		if (!"".equals(request.getParameter("search_val")) && request.getParameter("search_val") != null) {
			search_val = request.getParameter("search_val");
			query += " and msg_content like '%" + search_val + "%'";
			mav.addObject("search_val", search_val);
		}

		query += " group by msg_content, left(msg_submit_date, 12)";

		List<Message_vo> list_size = message_dao.getMessage_notice(query);

		int page = 1;
		if (!"".equals(request.getParameter("page")) && request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		int page1 = page * 15 - 15;
		int ten = page - (page % 10);

		if (page % 10 == 0) // 10, 20페이지 눌렀는데 넘어가면 안되니까~ 처리!
		{
			mav.addObject("list_size1", ten - 9);
			mav.addObject("list_size2", ten);
			if (ten < list_size.size() / 15 + 1) {
				mav.addObject("next", "next");
			} else {
				mav.addObject("next", "done");
			}
		} else {
			mav.addObject("list_size1", ten + 1);
			if (ten + 10 > list_size.size() / 15 + 1) {
				mav.addObject("list_size2", list_size.size() / 15 + 1);
				mav.addObject("next", "done");
			} else {
				mav.addObject("list_size2", ten + 10);
				mav.addObject("next", "next");
			}

		}
		mav.addObject("list_size", list_size.size() / 15 + 1);
		mav.addObject("page", page);

		String sort_val = "msg_idx";

		String sort_type = "";

		if (!"".equals(request.getParameter("sort_val")) && request.getParameter("sort_val") != null) {
			sort_type = request.getParameter("sort_type");
			sort_val = request.getParameter("sort_val");
			query += " order by " + sort_val + " " + sort_type;
		} else {
			query += " order by msg_idx desc";
			sort_type = "desc";
			sort_val = "msg_idx";
		}
		query += " limit " + page1 + ",15";

		List<Message_vo> list = message_dao.getMessage_notice(query);

		mav.addObject("list", list);
		mav.addObject("max_page", list_size.size());
		mav.addObject("sort_type", sort_type);
		mav.addObject("sort_val", sort_val);

		return mav;
	}

	@RequestMapping("/detail_voc.pnp")
	public ModelAndView detail_voc(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/detail_voc");

		String voc_user_idx = request.getParameter("idx");

		String query = "1 and user_idx = '" + voc_user_idx + "'";
		List<User2_vo> list = user2_dao.selList_user(query);

		mav.addObject("user_idx", list.get(0).getUser_idx());
		mav.addObject("user_email", list.get(0).getUser_email());
		mav.addObject("user_name", list.get(0).getUser_name());
		mav.addObject("user_password", list.get(0).getUser_password());
		mav.addObject("user_phone", list.get(0).getUser_phone());
		mav.addObject("user_gender", list.get(0).getUser_gender());
		mav.addObject("user_nickname", list.get(0).getUser_nickname());
		mav.addObject("user_schedule", list.get(0).getUser_schedule());
		mav.addObject("user_type", list.get(0).getUser_type());
		mav.addObject("user_submit_date", list.get(0).getUser_submit_date());

		String query2 = "1 and stats_user_idx = '" + voc_user_idx + "' order by stats_idx desc";

		List<Stats_vo> list_stats = stats_dao.getStats(query2);

		mav.addObject("join_cnt", list_stats.size());
		if (list_stats.size() > 0) {
			mav.addObject("last_join", list_stats.get(0).getStats_date());
		}

		// 큐레이션 신청횟수
		List<Est_hall_vo> list_est_hall = est_hall_dao
				.selEst_hall("1 and est_user_idx = '" + list.get(0).getUser_idx() + "'");

		mav.addObject("est_hall_cnt", list_est_hall.size());
		// 큐레이션 신청횟수

		String query1 = "1 and voc_user_idx = '" + voc_user_idx + "'";
		List<Voc_vo> list1 = voc_dao.selVoc(query1);

		mav.addObject("list1", list1);

		// 견적정보
		List<See_sdm_vo> list2 = see_sdm_dao
				.selSee_sdm("1 and see_user_idx = '" + voc_user_idx + "' and see_status = '견적신청'");

		String return_info = "";
		return_info += "<table class=\"result_table result_info_table\">";
		return_info += "<tr>";
		return_info += "<th class=\"info_table_title\" colspan=\"10\">견적정보</th>";
		return_info += "</tr>";
		return_info += "<tr>";
		return_info += "<td>번호</td>";
		return_info += "<td>스튜디오</td>";
		return_info += "<td>금액</td>";
		return_info += "<td>드레스</td>";
		return_info += "<td>금액</td>";
		return_info += "<td>메이크업</td>";
		return_info += "<td>금액</td>";
		return_info += "<td>견적가</td>";
		return_info += "<td>캐쉬백</td>";
		return_info += "<td>견적날짜</td>";
		return_info += "</tr>";
		for (int i = 0; i < list2.size(); i++) {
			String idx_arr[] = list2.get(i).getSee_pro_idx().split(",");
			List<Studio_vo> list_studio = studio_dao.selList_studio("1 and pro_idx = '" + idx_arr[0] + "'");
			List<Dress_vo> list_dress = dress_dao.selList_dress("1 and pro_idx = '" + idx_arr[1] + "'");
			List<Makeup_vo> list_makeup = makeup_dao.selList_makeup("1 and pro_idx = '" + idx_arr[2] + "'");

			String option_arr[] = list2.get(i).getSee_option().split("@");

			int studio_price = 0;
			int studio_pay = 0;
			int studio_charge = 0;
			if (list_studio.size() > 0) {
				String studio_option_arr[] = list_studio.get(0).getPro_composition().split("&&");
				for (int z = 0; z < studio_option_arr.length; z++) {
					if (option_arr[0].equals(studio_option_arr[z])) {
						studio_price = Integer.parseInt(
								list_studio.get(0).getPro_composition_price().split("&&")[z].replaceAll(",", ""));
						studio_pay = Integer.parseInt(
								list_studio.get(0).getPro_composition_pay().split("&&")[z].replaceAll(",", ""));
						studio_charge = Integer.parseInt(
								list_studio.get(0).getPro_composition_charge().split("&&")[z].replaceAll(",", ""));
					}
				}
			}
			int dress_price = 0;
			if (list_dress.size() > 0) {
				String dress_option_arr[] = list_dress.get(0).getPro_composition().split("&&");
				for (int z = 0; z < dress_option_arr.length; z++) {
					if (option_arr[1].equals(dress_option_arr[z])) {
						dress_price = Integer.parseInt(
								list_dress.get(0).getPro_composition_price().split("&&")[z].replaceAll(",", ""));
					}
				}
			}
			int makeup_price = 0;
			if (list_makeup.size() > 0) {
				String makeup_option_arr[] = list_makeup.get(0).getPro_composition().split("&&");
				for (int z = 0; z < makeup_option_arr.length; z++) {
					if (option_arr[2].equals(makeup_option_arr[z])) {
						makeup_price = Integer.parseInt(
								list_makeup.get(0).getPro_composition_price().split("&&")[z].replaceAll(",", ""));
					}
				}
			}
			int total_price = studio_price + dress_price + makeup_price;

			DecimalFormat df = new DecimalFormat("#,###");
			String return_price = df.format(total_price);

			// 캐쉬백 계산
			int studio_cashback = (int) (studio_pay * 0.05);
			studio_cashback = (int) (Math.ceil((double) studio_cashback / 10000)) * 10000 + studio_charge;

			int dress_cashback = (int) (dress_price * 0.1);
			dress_cashback = dress_cashback / 10000 * 10000;

			int makeup_cashback = (int) (makeup_price * 0.1);
			makeup_cashback = makeup_cashback / 10000 * 10000;

			int total_cashback = studio_cashback + dress_cashback + makeup_cashback;
			// 캐쉬백 계산

			return_info += "<tr>";
			return_info += "<td>" + i + "</td>";
			if (list_studio.size() > 0) {
				return_info += "<td>" + list_studio.get(0).getPro_name() + "</td>";
				return_info += "<td>" + df.format(studio_price) + "</td>";
			} else {
				return_info += "<td></td>";
				return_info += "<td></td>";
			}
			return_info += "<td>" + list_dress.get(0).getPro_name() + "</td>";
			return_info += "<td>" + df.format(dress_price) + "</td>";
			return_info += "<td>" + list_makeup.get(0).getPro_name() + "</td>";
			return_info += "<td>" + df.format(makeup_price) + "</td>";
			return_info += "<td>" + return_price + "</td>";
			return_info += "<td>" + df.format(total_cashback) + "</td>";
			return_info += "<td>";
			return_info += list2.get(i).getSee_submit_date().substring(0, 4) + "/";
			return_info += list2.get(i).getSee_submit_date().substring(4, 6) + "/";
			return_info += list2.get(i).getSee_submit_date().substring(6, 8) + " ";
			return_info += list2.get(i).getSee_submit_date().substring(8, 10) + ":";
			return_info += list2.get(i).getSee_submit_date().substring(10, 12);
			return_info += "</td>";
			return_info += "</tr>";
		}
		return_info += "</table>";
		mav.addObject("return_info", return_info);
		mav.addObject("see_sdm_cnt", list2.size());
		// 견적정보

		return mav;
	}

	@RequestMapping("/detail_est_hall.pnp")
	public ModelAndView detail_est_hall(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/detail_est_hall");

		String est_idx = request.getParameter("idx");

		String query = "1 and est_idx = '" + est_idx + "'";
		List<Est_hall_vo> list = est_hall_dao.selEst_hall(query);

		mav.addObject("est_idx", list.get(0).getEst_idx());
		mav.addObject("est_user_idx", list.get(0).getEst_user_idx());
		mav.addObject("est_name", list.get(0).getEst_name());
		mav.addObject("est_phone", list.get(0).getEst_phone());
		mav.addObject("est_schedule", list.get(0).getEst_schedule());
		mav.addObject("est_addr1", list.get(0).getEst_addr1());
		mav.addObject("est_want_hall", list.get(0).getEst_want_hall());
		mav.addObject("est_want_date", list.get(0).getEst_want_date());
		mav.addObject("est_hall_type", list.get(0).getEst_hall_type());
		mav.addObject("est_wedding_type", list.get(0).getEst_wedding_type());
		mav.addObject("est_menu", list.get(0).getEst_menu());
		mav.addObject("est_people", list.get(0).getEst_people());
		mav.addObject("est_memo", list.get(0).getEst_memo());
		mav.addObject("est_bank", list.get(0).getEst_bank());
		mav.addObject("est_product", list.get(0).getEst_product());
		mav.addObject("est_comment", list.get(0).getEst_comment());
		mav.addObject("est_history", list.get(0).getEst_history());
		mav.addObject("est_res_date", list.get(0).getEst_res_date());

		String scrap_query = "1 and scrap_user_idx = " + list.get(0).getEst_user_idx()
				+ " and scrap_pro_category = 'hall'";
		List<Scrap_vo> scrap_list = scrap_dao.selList_scrap(scrap_query);

		String scrap_pro_idx = "";
		for (int i = 0; i < scrap_list.size(); i++) {
			scrap_pro_idx += "," + scrap_list.get(i).getScrap_pro_idx();
		}

		if (!"".equals(scrap_pro_idx)) {
			scrap_pro_idx = scrap_pro_idx.substring(1, scrap_pro_idx.length());
		} else {
			scrap_pro_idx = "0";
		}
		mav.addObject("scrap_pro_idx", scrap_pro_idx);

		// 방문예약 정보
		List<See_vo> see_list = see_dao.selSee("1 and see_est_idx = " + est_idx);
		mav.addObject("see_list", see_list);
		// 방문예약 정보

		// 지난 견적정보
		String query2 = "1 and est_idx != '" + est_idx + "' and est_user_idx = '" + list.get(0).getEst_user_idx() + "'";
		List<Est_hall_vo> list2 = est_hall_dao.selEst_hall(query2);

		String history = "";
		for (int i = 0; i < list2.size(); i++) {
			history += "&&" + list2.get(i).getEst_product();
		}
		if (history.length() > 2) {
			history = history.substring(2, history.length());
		}
		mav.addObject("history", history);
		// 지난 견적정보

		int user_idx = list.get(0).getEst_user_idx();

		String query_user = "1 and user_idx = '" + user_idx + "'";
		List<User2_vo> list_user = user2_dao.selList_user(query_user);

		mav.addObject("user_idx", list_user.get(0).getUser_idx());
		mav.addObject("user_email", list_user.get(0).getUser_email());
		mav.addObject("user_name", list_user.get(0).getUser_name());
		mav.addObject("user_password", list_user.get(0).getUser_password());
		mav.addObject("user_phone", list_user.get(0).getUser_phone());
		mav.addObject("user_gender", list_user.get(0).getUser_gender());
		mav.addObject("user_nickname", list_user.get(0).getUser_nickname());
		mav.addObject("user_schedule", list_user.get(0).getUser_schedule());
		mav.addObject("user_type", list_user.get(0).getUser_type());
		mav.addObject("user_submit_date", list_user.get(0).getUser_submit_date());

		String query2_user = "1 and stats_user_idx = '" + user_idx + "' order by stats_idx desc";

		List<Stats_vo> list2_user = stats_dao.getStats(query2_user);

		mav.addObject("join_cnt", list2_user.size());
		if (list2_user.size() > 0) {
			mav.addObject("last_join", list2_user.get(0).getStats_date());
		}

		// 큐레이션 신청횟수
		List<Est_hall_vo> list_est_hall = est_hall_dao.selEst_hall("1 and est_user_idx = '" + user_idx + "'");

		mav.addObject("est_hall_cnt", list_est_hall.size());
		// 큐레이션 신청횟수

		// 자동견적 신청횟수
		List<See_sdm_vo> list_see_sdm = see_sdm_dao
				.selSee_sdm("1 and see_user_idx = '" + user_idx + "' and see_status = '견적신청'");

		mav.addObject("see_sdm_cnt", list_see_sdm.size());
		// 자동견적 신청횟수

		// 견적 버튼별 누른횟수

		String query_est = "1 and stats_user_idx = '" + user_idx + "' and stats_content = '견적내기'";
		List<Stats_auto_vo> list_auto = stats_auto_dao.getStats_auto(query_est);
		int auto = list_auto.size();
		mav.addObject("auto", auto);

		query_est = "1 and stats_user_idx = '" + user_idx + "' and stats_content = '계약하기'";
		List<Stats_auto_vo> list_est = stats_auto_dao.getStats_auto(query_est);
		int est = list_est.size();
		mav.addObject("est", est);

		query_est = "1 and stats_user_idx = '" + user_idx + "' and stats_content = '촬영일정 선택'";
		List<Stats_auto_vo> list_photo = stats_auto_dao.getStats_auto(query_est);
		int photo = list_photo.size();
		mav.addObject("photo", photo);

		query_est = "1 and stats_user_idx = '" + user_idx + "' and stats_content = '피팅일정 선택'";
		List<Stats_auto_vo> list_pit = stats_auto_dao.getStats_auto(query_est);
		int pit = list_pit.size();
		mav.addObject("pit", pit);

		query_est = "1 and stats_user_idx = '" + user_idx + "' and stats_content = '상담일정 선택'";
		List<Stats_auto_vo> list_talk = stats_auto_dao.getStats_auto(query_est);
		int talk = list_talk.size();
		mav.addObject("talk", talk);

		query_est = "1 and stats_user_idx = '" + user_idx + "' and stats_content = '예약하기'";
		List<Stats_auto_vo> list_res = stats_auto_dao.getStats_auto(query_est);
		int res = list_res.size();
		mav.addObject("res", res);

		query_est = "1 and stats_user_idx = '" + user_idx + "' and stats_content = '문의하기'";
		List<Stats_auto_vo> list_voc = stats_auto_dao.getStats_auto(query_est);
		int voc = list_voc.size();
		mav.addObject("voc", voc);

		query_est = "1 and stats_user_idx = '" + user_idx + "' and stats_content = '문의확인'";
		List<Stats_auto_vo> list_voc_submit = stats_auto_dao.getStats_auto(query_est);
		int voc_submit = list_voc_submit.size();
		mav.addObject("voc_submit", voc_submit);

		// 견적 버튼별 누른횟수
		return mav;
	}

	@RequestMapping("/detail_est_sdm.pnp")
	public ModelAndView detail_est_sdm(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/detail_est_sdm");

		String see_idx = request.getParameter("idx");

		String query = "1 and see_idx = '" + see_idx + "'";
		List<See_sdm_vo> list = see_sdm_dao.selSee_sdm(query);

		mav.addObject("see_idx", list.get(0).getSee_idx());
		mav.addObject("see_user_idx", list.get(0).getSee_user_idx());
		mav.addObject("see_user_name", list.get(0).getSee_user_name());
		mav.addObject("see_pro_idx", list.get(0).getSee_pro_idx());
		mav.addObject("see_pro_name", list.get(0).getSee_pro_name());
		mav.addObject("see_pro_tel", list.get(0).getSee_pro_tel());
		mav.addObject("see_pro_fax", list.get(0).getSee_pro_fax());
		mav.addObject("see_option", list.get(0).getSee_option());
		mav.addObject("see_schedule", list.get(0).getSee_schedule());
		mav.addObject("see_comment", list.get(0).getSee_comment());
		mav.addObject("see_status", list.get(0).getSee_status());
		mav.addObject("see_pay_engine", list.get(0).getSee_pay_engine());
		mav.addObject("see_pay_number", list.get(0).getSee_pay_number());
		mav.addObject("see_pay_name", list.get(0).getSee_pay_name());
		mav.addObject("see_want_date", list.get(0).getSee_want_date());
		mav.addObject("see_return_date", list.get(0).getSee_return_date());
		mav.addObject("see_confirm_date", list.get(0).getSee_confirm_date());
		mav.addObject("see_submit_date", list.get(0).getSee_submit_date());

		Utils utils = new Utils();
		List<User2_vo> list_user = user2_dao.find_user(list.get(0).getSee_user_idx());
		if (list.get(0).getSee_user_idx() == 0) {
			mav.addObject("user_name", "비회원");
			mav.addObject("user_phone", "");
		} else {
			mav.addObject("user_name", utils.decode(list_user.get(0).getUser_name()));
			mav.addObject("user_phone", utils.decode(list_user.get(0).getUser_phone()));
		}

		List<See_sdm_vo> list_his = see_sdm_dao
				.selSee_sdm("1 and see_user_idx = '" + list.get(0).getSee_user_idx() + "' order by see_idx desc");

		mav.addObject("list_his", list_his);

		// 견적정보
		String return_info = "";
		if (list.get(0).getSee_user_idx() != 0) {
			List<See_sdm_vo> list2 = see_sdm_dao
					.selSee_sdm("1 and see_user_idx = '" + list.get(0).getSee_user_idx() + "' and see_status = '견적신청'");

			return_info += "<table class=\"result_table result_info_table\">";
			return_info += "<tr>";
			return_info += "<th class=\"info_table_title\" colspan=\"10\">견적정보</th>";
			return_info += "</tr>";
			return_info += "<tr>";
			return_info += "<td>번호</td>";
			return_info += "<td>스튜디오</td>";
			return_info += "<td>금액</td>";
			return_info += "<td>드레스</td>";
			return_info += "<td>금액</td>";
			return_info += "<td>메이크업</td>";
			return_info += "<td>금액</td>";
			return_info += "<td>견적가</td>";
			return_info += "<td>할인금액</td>";
			return_info += "<td>견적날짜</td>";
			return_info += "</tr>";

			DecimalFormat df = new DecimalFormat("#,###");

			for (int i = 0; i < list2.size(); i++) {
				String pro_idx_arr[] = list2.get(i).getSee_pro_idx().split(",");
				String pro_name_arr[] = list2.get(i).getSee_pro_name().split(",");
				String pro_price_arr[] = list2.get(i).getSee_price().split("@");
				String pro_dc_arr[] = list2.get(i).getSee_dc().split("@");

				return_info += "<tr>";
				return_info += "<td>" + i + "</td>";
				if (!"-1".equals(pro_idx_arr[0]) && !"0".equals(pro_idx_arr[0])) {
					return_info += "<td>" + pro_name_arr[0] + "</td>";
					return_info += "<td>" + df.format(Integer.parseInt(pro_price_arr[0])) + "</td>";
				} else {
					return_info += "<td></td>";
					return_info += "<td></td>";
				}
				return_info += "<td>" + pro_name_arr[1] + "</td>";
				return_info += "<td>" + df.format(Integer.parseInt(pro_price_arr[1])) + "</td>";
				return_info += "<td>" + pro_name_arr[2] + "</td>";
				return_info += "<td>" + df.format(Integer.parseInt(pro_price_arr[2])) + "</td>";
				return_info += "<td>" + df.format(Integer.parseInt(pro_price_arr[0])
						+ Integer.parseInt(pro_price_arr[1]) + Integer.parseInt(pro_price_arr[2])) + "</td>";
				return_info += "<td>" + df.format(Integer.parseInt(pro_dc_arr[0]) + Integer.parseInt(pro_dc_arr[1])
						+ Integer.parseInt(pro_dc_arr[2])) + "</td>";
				return_info += "<td>";
				return_info += list2.get(i).getSee_submit_date().substring(0, 4) + "/";
				return_info += list2.get(i).getSee_submit_date().substring(4, 6) + "/";
				return_info += list2.get(i).getSee_submit_date().substring(6, 8) + " ";
				return_info += list2.get(i).getSee_submit_date().substring(8, 10) + ":";
				return_info += list2.get(i).getSee_submit_date().substring(10, 12);
				return_info += "</td>";
				return_info += "</tr>";
			}
			return_info += "</table>";
			mav.addObject("return_info", return_info);
		}

		// 견적정보

		// 예약완료된거 찾기
		String studio_date = "";
		String dress_date = "";
		String makeup_date = "";
		for (int i = 0; i < list_his.size(); i++) {
			if (!"".equals(list_his.get(i).getSee_confirm_date()) && list_his.get(i).getSee_confirm_date() != null) {
				String con_arr[] = list_his.get(i).getSee_confirm_date().split("@");
				for (int j = 0; j < con_arr.length; j++) {
					if (j == 0) {
						if (con_arr[j].indexOf("완료") > -1) {
							if ("".equals(studio_date)) {
								String date_result = con_arr[j].replace("(예약완료)", "");
								date_result = date_result.substring(0, 4) + "/" + date_result.substring(4, 6) + "/"
										+ date_result.substring(6, 8) + " " + date_result.substring(8, 10) + ":"
										+ date_result.substring(10, 12);

								String pro_name_arr[] = list_his.get(i).getSee_pro_name().split(",");
								studio_date = pro_name_arr[j] + " " + date_result;
							}
						}
					} else if (j == con_arr.length - 1) {
						if (con_arr[j].indexOf("완료") > -1) {
							if ("".equals(makeup_date)) {
								String date_result = con_arr[j].replace("(예약완료)", "");
								date_result = date_result.substring(0, 4) + "/" + date_result.substring(4, 6) + "/"
										+ date_result.substring(6, 8) + " " + date_result.substring(8, 10) + ":"
										+ date_result.substring(10, 12);

								String pro_name_arr[] = list_his.get(i).getSee_pro_name().split(",");
								makeup_date = pro_name_arr[j] + " " + date_result;
							}
						}
					} else {
						if (con_arr[j].indexOf("완료") > -1) {
							if ("".equals(dress_date)) {
								String date_result = con_arr[j].replace("(예약완료)", "");
								date_result = date_result.substring(0, 4) + "/" + date_result.substring(4, 6) + "/"
										+ date_result.substring(6, 8) + " " + date_result.substring(8, 10) + ":"
										+ date_result.substring(10, 12);

								String pro_name_arr[] = list_his.get(i).getSee_pro_name().split(",");
								dress_date += "," + pro_name_arr[j] + " " + date_result;
							}
						}
					}
				}
			}
		}
		if (dress_date.length() > 1) {
			dress_date = dress_date.substring(1, dress_date.length());
		}
		mav.addObject("studio_date", studio_date);
		mav.addObject("dress_date", dress_date);
		mav.addObject("makeup_date", makeup_date);
		// 예약완료된거 찾기

		// 결제금액, 캐쉬백 찾기

		int cashback = 0;
		int submit_pay = 0;

		List<Payment_sdm_vo> list_sdm = payment_sdm_dao.selPayment_sdm("1 and pm_user_idx = '"
				+ list.get(0).getSee_user_idx() + "' and pm_status like '결제완료%' and pm_status not like '%출금완료%'");

		if (list_sdm.size() > 0) {
			// cashback = Integer.parseInt(list_sdm.get(0).getPm_cashback().replaceAll(",",
			// ""));
			submit_pay = Integer.parseInt(list_sdm.get(0).getPm_pay().replaceAll(",", ""));
		}
		mav.addObject("cashback", cashback);
		mav.addObject("submit_pay", submit_pay);
		// 결제금액, 캐쉬백 찾기

		int user_idx = list.get(0).getSee_user_idx();

		mav.addObject("user_idx", list_user.get(0).getUser_idx());
		mav.addObject("user_email", list_user.get(0).getUser_email());
		mav.addObject("user_name", list_user.get(0).getUser_name());
		mav.addObject("user_password", list_user.get(0).getUser_password());
		mav.addObject("user_phone", list_user.get(0).getUser_phone());
		mav.addObject("user_gender", list_user.get(0).getUser_gender());
		mav.addObject("user_nickname", list_user.get(0).getUser_nickname());
		mav.addObject("user_schedule", list_user.get(0).getUser_schedule());
		mav.addObject("user_type", list_user.get(0).getUser_type());
		mav.addObject("user_submit_date", list_user.get(0).getUser_submit_date());

		String query2_user = "1 and stats_user_idx = '" + user_idx + "' order by stats_idx desc";

		List<Stats_vo> list2_user = stats_dao.getStats(query2_user);

		mav.addObject("join_cnt", list2_user.size());
		if (list2_user.size() > 0) {
			mav.addObject("last_join", list2_user.get(0).getStats_date());
		}

		// 큐레이션 신청횟수
		List<Est_hall_vo> list_est_hall = est_hall_dao.selEst_hall("1 and est_user_idx = '" + user_idx + "'");

		mav.addObject("est_hall_cnt", list_est_hall.size());
		// 큐레이션 신청횟수

		// 자동견적 신청횟수
		List<See_sdm_vo> list_see_sdm = see_sdm_dao
				.selSee_sdm("1 and see_user_idx = '" + user_idx + "' and see_status = '견적신청'");

		mav.addObject("see_sdm_cnt", list_see_sdm.size());
		// 자동견적 신청횟수

		// 견적 버튼별 누른횟수

		String query_est = "1 and stats_user_idx = '" + user_idx + "' and stats_content = '견적내기'";
		List<Stats_auto_vo> list_auto = stats_auto_dao.getStats_auto(query_est);
		int auto = list_auto.size();
		mav.addObject("auto", auto);

		query_est = "1 and stats_user_idx = '" + user_idx + "' and stats_content = '계약하기'";
		List<Stats_auto_vo> list_est = stats_auto_dao.getStats_auto(query_est);
		int est = list_est.size();
		mav.addObject("est", est);

		query_est = "1 and stats_user_idx = '" + user_idx + "' and stats_content = '촬영일정 선택'";
		List<Stats_auto_vo> list_photo = stats_auto_dao.getStats_auto(query_est);
		int photo = list_photo.size();
		mav.addObject("photo", photo);

		query_est = "1 and stats_user_idx = '" + user_idx + "' and stats_content = '피팅일정 선택'";
		List<Stats_auto_vo> list_pit = stats_auto_dao.getStats_auto(query_est);
		int pit = list_pit.size();
		mav.addObject("pit", pit);

		query_est = "1 and stats_user_idx = '" + user_idx + "' and stats_content = '상담일정 선택'";
		List<Stats_auto_vo> list_talk = stats_auto_dao.getStats_auto(query_est);
		int talk = list_talk.size();
		mav.addObject("talk", talk);

		query_est = "1 and stats_user_idx = '" + user_idx + "' and stats_content = '예약하기'";
		List<Stats_auto_vo> list_res = stats_auto_dao.getStats_auto(query_est);
		int res = list_res.size();
		mav.addObject("res", res);

		query_est = "1 and stats_user_idx = '" + user_idx + "' and stats_content = '문의하기'";
		List<Stats_auto_vo> list_voc = stats_auto_dao.getStats_auto(query_est);
		int voc = list_voc.size();
		mav.addObject("voc", voc);

		query_est = "1 and stats_user_idx = '" + user_idx + "' and stats_content = '문의확인'";
		List<Stats_auto_vo> list_voc_submit = stats_auto_dao.getStats_auto(query_est);
		int voc_submit = list_voc_submit.size();
		mav.addObject("voc_submit", voc_submit);

		// 견적 버튼별 누른횟수
		return mav;
	}

	@RequestMapping("/detail_self.pnp")
	public ModelAndView detail_self(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/detail_self");

		String cont_idx = request.getParameter("idx");

		String query = "1 and cont_idx = '" + cont_idx + "'";
		List<Cont_self_vo> list = cont_self_dao.selCont_self(query);

		mav.addObject("cont_idx", list.get(0).getCont_idx());
		mav.addObject("cont_user_idx", list.get(0).getCont_user_idx());
		mav.addObject("cont_pro_idx", list.get(0).getCont_pro_idx());
		mav.addObject("cont_pro_name", list.get(0).getCont_pro_name());
		mav.addObject("cont_pro_option", list.get(0).getCont_pro_option());
		mav.addObject("cont_see_date", list.get(0).getCont_see_date());
		mav.addObject("cont_name", list.get(0).getCont_name());
		mav.addObject("cont_phone", list.get(0).getCont_phone());
		mav.addObject("cont_call_time", list.get(0).getCont_call_time());
		mav.addObject("cont_content", list.get(0).getCont_content());
		mav.addObject("cont_return_date", list.get(0).getCont_return_date());
		mav.addObject("cont_submit_date", list.get(0).getCont_submit_date());

		Utils utils = new Utils();
		List<User2_vo> list_user = user2_dao.find_user(list.get(0).getCont_user_idx());
		if (list.get(0).getCont_user_idx() == 0) {
			mav.addObject("user_name", "비회원");
			mav.addObject("user_phone", "");
		} else {
			mav.addObject("user_name", utils.decode(list_user.get(0).getUser_name()));
			mav.addObject("user_phone", utils.decode(list_user.get(0).getUser_phone()));
		}

		if (list.get(0).getCont_user_idx() != 0) {
			// 견적정보
			String return_info = "";
			if (list.get(0).getCont_user_idx() != 0) {
				List<See_sdm_vo> list2 = see_sdm_dao.selSee_sdm(
						"1 and see_user_idx = '" + list.get(0).getCont_user_idx() + "' and see_status = '견적신청'");

				return_info += "<table class=\"result_table result_info_table\">";
				return_info += "<tr>";
				return_info += "<th class=\"info_table_title\" colspan=\"10\">견적정보</th>";
				return_info += "</tr>";
				return_info += "<tr>";
				return_info += "<td>번호</td>";
				return_info += "<td>스튜디오</td>";
				return_info += "<td>금액</td>";
				return_info += "<td>드레스</td>";
				return_info += "<td>금액</td>";
				return_info += "<td>메이크업</td>";
				return_info += "<td>금액</td>";
				return_info += "<td>견적가</td>";
				return_info += "<td>할인금액</td>";
				return_info += "<td>견적날짜</td>";
				return_info += "</tr>";

				DecimalFormat df = new DecimalFormat("#,###");

				for (int i = 0; i < list2.size(); i++) {
					String pro_idx_arr[] = list2.get(i).getSee_pro_idx().split(",");
					String pro_name_arr[] = list2.get(i).getSee_pro_name().split(",");
					String pro_price_arr[] = list2.get(i).getSee_price().split("@");
					String pro_dc_arr[] = list2.get(i).getSee_dc().split("@");

					return_info += "<tr>";
					return_info += "<td>" + i + "</td>";
					if (!"-1".equals(pro_idx_arr[0]) && !"0".equals(pro_idx_arr[0])) {
						return_info += "<td>" + pro_name_arr[0] + "</td>";
						return_info += "<td>" + df.format(Integer.parseInt(pro_price_arr[0])) + "</td>";
					} else {
						return_info += "<td></td>";
						return_info += "<td></td>";
					}
					return_info += "<td>" + pro_name_arr[1] + "</td>";
					return_info += "<td>" + df.format(Integer.parseInt(pro_price_arr[1])) + "</td>";
					return_info += "<td>" + pro_name_arr[2] + "</td>";
					return_info += "<td>" + df.format(Integer.parseInt(pro_price_arr[2])) + "</td>";
					return_info += "<td>" + df.format(Integer.parseInt(pro_price_arr[0])
							+ Integer.parseInt(pro_price_arr[1]) + Integer.parseInt(pro_price_arr[2])) + "</td>";
					return_info += "<td>" + df.format(Integer.parseInt(pro_dc_arr[0]) + Integer.parseInt(pro_dc_arr[1])
							+ Integer.parseInt(pro_dc_arr[2])) + "</td>";
					return_info += "<td>";
					return_info += list2.get(i).getSee_submit_date().substring(0, 4) + "/";
					return_info += list2.get(i).getSee_submit_date().substring(4, 6) + "/";
					return_info += list2.get(i).getSee_submit_date().substring(6, 8) + " ";
					return_info += list2.get(i).getSee_submit_date().substring(8, 10) + ":";
					return_info += list2.get(i).getSee_submit_date().substring(10, 12);
					return_info += "</td>";
					return_info += "</tr>";
				}
				return_info += "</table>";
				mav.addObject("return_info", return_info);
			}

			// 견적정보

			int user_idx = list.get(0).getCont_user_idx();

			mav.addObject("user_idx", list_user.get(0).getUser_idx());
			mav.addObject("user_email", list_user.get(0).getUser_email());
			mav.addObject("user_name", list_user.get(0).getUser_name());
			mav.addObject("user_password", list_user.get(0).getUser_password());
			mav.addObject("user_phone", list_user.get(0).getUser_phone());
			mav.addObject("user_gender", list_user.get(0).getUser_gender());
			mav.addObject("user_nickname", list_user.get(0).getUser_nickname());
			mav.addObject("user_schedule", list_user.get(0).getUser_schedule());
			mav.addObject("user_type", list_user.get(0).getUser_type());
			mav.addObject("user_submit_date", list_user.get(0).getUser_submit_date());

			String query2_user = "1 and stats_user_idx = '" + user_idx + "' order by stats_idx desc";

			List<Stats_vo> list2_user = stats_dao.getStats(query2_user);

			mav.addObject("join_cnt", list2_user.size());
			if (list2_user.size() > 0) {
				mav.addObject("last_join", list2_user.get(0).getStats_date());
			}

			// 큐레이션 신청횟수
			List<Est_hall_vo> list_est_hall = est_hall_dao.selEst_hall("1 and est_user_idx = '" + user_idx + "'");

			mav.addObject("est_hall_cnt", list_est_hall.size());
			// 큐레이션 신청횟수

			// 자동견적 신청횟수
			List<See_sdm_vo> list_see_sdm = see_sdm_dao
					.selSee_sdm("1 and see_user_idx = '" + user_idx + "' and see_status = '견적신청'");

			mav.addObject("see_sdm_cnt", list_see_sdm.size());
			// 자동견적 신청횟수

			// 견적 버튼별 누른횟수

			String query_est = "1 and stats_user_idx = '" + user_idx + "' and stats_content = '견적내기'";
			List<Stats_auto_vo> list_auto = stats_auto_dao.getStats_auto(query_est);
			int auto = list_auto.size();
			mav.addObject("auto", auto);

			query_est = "1 and stats_user_idx = '" + user_idx + "' and stats_content = '계약하기'";
			List<Stats_auto_vo> list_est = stats_auto_dao.getStats_auto(query_est);
			int est = list_est.size();
			mav.addObject("est", est);

			query_est = "1 and stats_user_idx = '" + user_idx + "' and stats_content = '촬영일정 선택'";
			List<Stats_auto_vo> list_photo = stats_auto_dao.getStats_auto(query_est);
			int photo = list_photo.size();
			mav.addObject("photo", photo);

			query_est = "1 and stats_user_idx = '" + user_idx + "' and stats_content = '피팅일정 선택'";
			List<Stats_auto_vo> list_pit = stats_auto_dao.getStats_auto(query_est);
			int pit = list_pit.size();
			mav.addObject("pit", pit);

			query_est = "1 and stats_user_idx = '" + user_idx + "' and stats_content = '상담일정 선택'";
			List<Stats_auto_vo> list_talk = stats_auto_dao.getStats_auto(query_est);
			int talk = list_talk.size();
			mav.addObject("talk", talk);

			query_est = "1 and stats_user_idx = '" + user_idx + "' and stats_content = '예약하기'";
			List<Stats_auto_vo> list_res = stats_auto_dao.getStats_auto(query_est);
			int res = list_res.size();
			mav.addObject("res", res);

			query_est = "1 and stats_user_idx = '" + user_idx + "' and stats_content = '문의하기'";
			List<Stats_auto_vo> list_voc = stats_auto_dao.getStats_auto(query_est);
			int voc = list_voc.size();
			mav.addObject("voc", voc);

			query_est = "1 and stats_user_idx = '" + user_idx + "' and stats_content = '문의확인'";
			List<Stats_auto_vo> list_voc_submit = stats_auto_dao.getStats_auto(query_est);
			int voc_submit = list_voc_submit.size();
			mav.addObject("voc_submit", voc_submit);

			// 견적 버튼별 누른횟수

			mav.addObject("isLogin", "o");
		} else {
			mav.addObject("isLogin", "x");
		}

		return mav;
	}

	@RequestMapping("/insert_est_sdm.pnp")
	public ModelAndView insert_est_sdm(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insert_est_sdm");

		Utils utils = new Utils();

		int user_idx = Integer.parseInt(request.getParameter("user_idx"));
		List<User2_vo> list_user = user2_dao.find_user(user_idx);
		String user_name = utils.decode(list_user.get(0).getUser_name());
		mav.addObject("user_idx", user_idx);
		mav.addObject("user_name", user_name);

		// 견적정보
		String return_info = "";
		List<See_sdm_vo> list2 = see_sdm_dao
				.selSee_sdm("1 and see_user_idx = '" + user_idx + "' and see_status = '견적신청'");

		return_info += "<table class=\"result_table result_info_table\">";
		return_info += "<tr>";
		return_info += "<th class=\"info_table_title\" colspan=\"10\">견적정보</th>";
		return_info += "</tr>";
		return_info += "<tr>";
		return_info += "<td>번호</td>";
		return_info += "<td>스튜디오</td>";
		return_info += "<td>금액</td>";
		return_info += "<td>드레스</td>";
		return_info += "<td>금액</td>";
		return_info += "<td>메이크업</td>";
		return_info += "<td>금액</td>";
		return_info += "<td>견적가</td>";
		return_info += "<td>할인금액</td>";
		return_info += "<td>견적날짜</td>";
		return_info += "</tr>";
		for (int i = 0; i < list2.size(); i++) {
			String idx_arr[] = list2.get(i).getSee_pro_idx().split(",");
			List<Studio_vo> list_studio = studio_dao.selList_studio("1 and pro_idx = '" + idx_arr[0] + "'");
			List<Dress_vo> list_dress = dress_dao.selList_dress("1 and pro_idx = '" + idx_arr[1] + "'");
			List<Makeup_vo> list_makeup = makeup_dao.selList_makeup("1 and pro_idx = '" + idx_arr[2] + "'");

			String option_arr[] = list2.get(i).getSee_option().split("@");

			int studio_price = 0;
			int studio_pay = 0;
			int studio_charge = 0;
			if (list_studio.size() > 0) {
				String studio_option_arr[] = list_studio.get(0).getPro_composition().split("&&");
				for (int z = 0; z < studio_option_arr.length; z++) {
					if (option_arr[0].equals(studio_option_arr[z])) {
						studio_price = Integer.parseInt(
								list_studio.get(0).getPro_composition_price().split("&&")[z].replaceAll(",", ""));
						studio_pay = Integer.parseInt(
								list_studio.get(0).getPro_composition_pay().split("&&")[z].replaceAll(",", ""));
						studio_charge = Integer.parseInt(
								list_studio.get(0).getPro_composition_charge().split("&&")[z].replaceAll(",", ""));
					}
				}
			}
			int dress_price = 0;
			if (list_dress.size() > 0) {
				String dress_option_arr[] = list_dress.get(0).getPro_composition().split("&&");
				for (int z = 0; z < dress_option_arr.length; z++) {
					if (option_arr[1].equals(dress_option_arr[z])) {
						dress_price = Integer.parseInt(
								list_dress.get(0).getPro_composition_price().split("&&")[z].replaceAll(",", ""));
					}
				}
			}
			int makeup_price = 0;
			if (list_makeup.size() > 0) {
				String makeup_option_arr[] = list_makeup.get(0).getPro_composition().split("&&");
				for (int z = 0; z < makeup_option_arr.length; z++) {
					if (option_arr[2].equals(makeup_option_arr[z])) {
						makeup_price = Integer.parseInt(
								list_makeup.get(0).getPro_composition_price().split("&&")[z].replaceAll(",", ""));
					}
				}
			}
			int total_price = studio_price + dress_price + makeup_price;

			DecimalFormat df = new DecimalFormat("#,###");
			String return_price = df.format(total_price);

			// 캐쉬백 계산
			int studio_cashback = (int) (studio_pay * 0.05);
			studio_cashback = (int) (Math.ceil((double) studio_cashback / 10000)) * 10000 + studio_charge;

			int dress_cashback = (int) (dress_price * 0.1);
			dress_cashback = dress_cashback / 10000 * 10000;

			int makeup_cashback = (int) (makeup_price * 0.1);
			makeup_cashback = makeup_cashback / 10000 * 10000;

			int total_cashback = studio_cashback + dress_cashback + makeup_cashback;
			// 캐쉬백 계산

			return_info += "<tr>";
			return_info += "<td>" + i + "</td>";
			if (list_studio.size() > 0) {
				return_info += "<td>" + list_studio.get(0).getPro_name() + "</td>";
				return_info += "<td>" + df.format(studio_price) + "</td>";
			} else {
				return_info += "<td></td>";
				return_info += "<td></td>";
			}
			return_info += "<td>" + list_dress.get(0).getPro_name() + "</td>";
			return_info += "<td>" + df.format(dress_price) + "</td>";
			return_info += "<td>" + list_makeup.get(0).getPro_name() + "</td>";
			return_info += "<td>" + df.format(makeup_price) + "</td>";
			return_info += "<td>" + return_price + "</td>";
			return_info += "<td>" + df.format(total_cashback) + "</td>";
			return_info += "<td>";
			return_info += list2.get(i).getSee_submit_date().substring(0, 4) + "/";
			return_info += list2.get(i).getSee_submit_date().substring(4, 6) + "/";
			return_info += list2.get(i).getSee_submit_date().substring(6, 8) + " ";
			return_info += list2.get(i).getSee_submit_date().substring(8, 10) + ":";
			return_info += list2.get(i).getSee_submit_date().substring(10, 12);
			return_info += "</td>";
			return_info += "</tr>";
		}
		return_info += "</table>";
		mav.addObject("return_info", return_info);

		// 견적정보
		return mav;
	}

	@RequestMapping("/insert_est_sdm_output.pnp")
	public ModelAndView insert_est_sdm_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insert_est_sdm_output");

		String see_action = request.getParameter("return_action");

		String see_return_date = request.getParameter("return_date");
		see_return_date = see_return_date.replaceAll(" ", "").replaceAll("/", "").replaceAll(":", "");
		see_return_date = see_return_date.replaceAll("신청하신날짜의예약이모두마감되었습니다.<br>다른날짜로다시신청해주세요.",
				"신청하신 날짜의 예약이 모두 마감되었습니다.<br>다른 날짜로 다시 신청해주세요.");

		int see_user_idx = Integer.parseInt(request.getParameter("return_user_idx"));
		String see_user_name = request.getParameter("return_user_name");
		String see_pro_idx = request.getParameter("return_pro_idx").replaceAll("&&", ",");
		String see_pro_name = request.getParameter("return_pro_name").replaceAll("&&", ",");
		String see_pro_option_cnt = request.getParameter("return_pro_option_cnt").replaceAll("&&", ",");

		String see_pro_tel = "";
		String see_pro_fax = "";
		String see_pro_option = "";
		String see_pro_price = "";
		String see_pro_dc = "";
		String see_want_date = "";

		for (int i = 0; i < see_pro_idx.split(",").length; i++) {
			see_want_date += "@0000년 00월 00일 (0요일)";
		}
		see_want_date = see_want_date.substring(1, see_want_date.length());

		for (int i = 0; i < see_pro_idx.split(",").length; i++) {
			if (i == 0) {
				if ("0".equals(see_pro_idx.split(",")[i])) {
					see_pro_tel += ",0";
					see_pro_fax += ",0";
					see_pro_option += "@0";
					see_pro_price += "@0";
					see_pro_dc += "@0";
				} else {
					List<Studio_vo> list_pro = studio_dao
							.selList_studio("1 and pro_idx = '" + see_pro_idx.split(",")[i] + "'");
					List<Company_vo> list_com = company_dao
							.selList_company("1 and com_idx = '" + list_pro.get(0).getPro_com_idx() + "'");
					see_pro_tel += "," + list_pro.get(0).getPro_tel();
					see_pro_fax += "," + list_com.get(0).getCom_fax();
					see_pro_option += "@" + list_pro.get(0).getPro_composition().split("&&")[Integer
							.parseInt(see_pro_option_cnt.split(",")[i])];
					see_pro_price += "@" + list_pro.get(0).getPro_composition_price().split("&&")[Integer
							.parseInt(see_pro_option_cnt.split(",")[i])];
					see_pro_dc += "@" + list_pro.get(0).getPro_composition_dc().split("&&")[Integer
							.parseInt(see_pro_option_cnt.split(",")[i])];
				}
			} else if (i == see_pro_idx.split(",").length - 1) {
				if ("0".equals(see_pro_idx.split(",")[i])) {
					see_pro_tel += ",0";
					see_pro_fax += ",0";
					see_pro_option += "@0";
					see_pro_price += "@0";
					see_pro_dc += "@0";
				} else {
					List<Makeup_vo> list_pro = makeup_dao
							.selList_makeup("1 and pro_idx = '" + see_pro_idx.split(",")[i] + "'");
					List<Company_vo> list_com = company_dao
							.selList_company("1 and com_idx = '" + list_pro.get(0).getPro_com_idx() + "'");
					see_pro_tel += "," + list_pro.get(0).getPro_tel();
					see_pro_fax += "," + list_com.get(0).getCom_fax();
					see_pro_option += "@" + list_pro.get(0).getPro_composition().split("&&")[Integer
							.parseInt(see_pro_option_cnt.split(",")[i])];
					see_pro_price += "@" + list_pro.get(0).getPro_composition_price().split("&&")[Integer
							.parseInt(see_pro_option_cnt.split(",")[i])];
					see_pro_dc += "@" + list_pro.get(0).getPro_composition_dc().split("&&")[Integer
							.parseInt(see_pro_option_cnt.split(",")[i])];
				}
			} else {
				if ("0".equals(see_pro_idx.split(",")[i])) {
					see_pro_tel += ",0";
					see_pro_fax += ",0";
					see_pro_option += "@0";
					see_pro_price += "@0";
					see_pro_dc += "@0";
				} else {
					List<Dress_vo> list_pro = dress_dao
							.selList_dress("1 and pro_idx = '" + see_pro_idx.split(",")[i] + "'");
					List<Company_vo> list_com = company_dao
							.selList_company("1 and com_idx = '" + list_pro.get(0).getPro_com_idx() + "'");
					see_pro_tel += "," + list_pro.get(0).getPro_tel();
					see_pro_fax += "," + list_com.get(0).getCom_fax();
					see_pro_option += "@" + list_pro.get(0).getPro_composition().split("&&")[Integer
							.parseInt(see_pro_option_cnt.split(",")[i])];
					see_pro_price += "@" + list_pro.get(0).getPro_composition_price().split("&&")[Integer
							.parseInt(see_pro_option_cnt.split(",")[i])];
					see_pro_dc += "@" + list_pro.get(0).getPro_composition_dc().split("&&")[Integer
							.parseInt(see_pro_option_cnt.split(",")[i])];
				}
			}
		}
		see_pro_tel = see_pro_tel.substring(1, see_pro_tel.length());
		see_pro_fax = see_pro_fax.substring(1, see_pro_fax.length());
		see_pro_option = see_pro_option.substring(1, see_pro_option.length());
		see_pro_price = see_pro_price.substring(1, see_pro_price.length());
		see_pro_price = see_pro_price.replaceAll(",", "");
		see_pro_dc = see_pro_dc.substring(1, see_pro_dc.length());
		see_pro_dc = see_pro_dc.replaceAll(",", "");
		see_sdm_dao.insSee_sdm(see_user_idx, see_user_name, see_pro_idx, see_pro_name, see_pro_tel, see_pro_fax,
				see_pro_option, see_pro_price, see_pro_dc, "0000년 00월 00일 00시 00분", "일정전달", see_want_date, "");

		List<See_sdm_vo> list_sdm = see_sdm_dao
				.selSee_sdm("1 and see_user_idx = '" + see_user_idx + "' and see_status = '일정전달'");

		if (list_sdm.size() > 0) {
			see_sdm_dao.upSee_return_date(list_sdm.get(0).getSee_idx(), "", "일정전달", see_return_date);
		}

		// 예약완료까지 진행하기

		if ("confirm".equals(see_action)) {
			String confirm_arr[] = see_return_date.split("@");
			String see_confirm_date = "";
			for (int i = 0; i < confirm_arr.length; i++) {
				if (!"0".equals(confirm_arr[i])) {
					confirm_arr[i] = confirm_arr[i] + "(예약완료)";
				}

			}
			for (int i = 0; i < confirm_arr.length; i++) {
				see_confirm_date += "@" + confirm_arr[i];
			}
			see_confirm_date = see_confirm_date.substring(1, see_confirm_date.length());

			see_sdm_dao.upSee_confirm_date(list_sdm.get(0).getSee_idx(), "", "예약완료", see_confirm_date);

			send_push(see_user_idx, "웨딩큐", "스드메 일정 예약이 완료되었습니다.<br>일정을 확인해보세요.");
			message_dao.insMessage(list_sdm.get(0).getSee_idx(), see_user_idx, "스드메 일정 예약이 완료되었습니다.<br>일정을 확인해보세요.");
		} else {
			send_push(see_user_idx, "웨딩큐", "스드메 예약가능 일정이 도착하였습니다.<br>원하는 날짜와 시간을 선택해주세요.");
			message_dao.insMessage(list_sdm.get(0).getSee_idx(), see_user_idx,
					"스드메 예약가능 일정이 도착하였습니다.<br>원하는 날짜와 시간을 선택해주세요.");
		}
		// 예약완료까지 진행하기

		return mav;
	}

	@RequestMapping("/est_bank.pnp")
	public ModelAndView est_bank(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/est_bank");

		String bank_cate = request.getParameter("bank_cate");
		int bank_idx = Integer.parseInt(request.getParameter("bank_idx"));
		if ("hall".equals(bank_cate)) {
			String est_bank = request.getParameter("bank_1") + "&&" + request.getParameter("bank_2") + "&&"
					+ request.getParameter("bank_3");
			est_hall_dao.upEst_bank_hall(bank_idx, est_bank);
		}
		return mav;
	}

	@RequestMapping("/est_comment.pnp")
	public ModelAndView est_comment(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/est_comment");

		String comment_cate = request.getParameter("comment_cate");
		int comment_idx = Integer.parseInt(request.getParameter("comment_idx"));
		if ("hall".equals(comment_cate)) {
			List<Est_hall_vo> list = est_hall_dao.selEst_hall("1 and est_idx = " + comment_idx);

			String est_comment = "";
			if (!"".equals(list.get(0).getEst_comment()) && list.get(0).getEst_comment() != null) {
				est_comment += "&&" + request.getParameter("est_comment") + "_";
			} else {
				est_comment += request.getParameter("est_comment") + "_";
			}
			est_hall_dao.upEst_comment_hall(comment_idx, est_comment);
		} else if ("sdm".equals(comment_cate)) {
			List<See_sdm_vo> list = see_sdm_dao.selSee_sdm("1 and see_idx = " + comment_idx);

			String est_comment = "";
			if (!"".equals(list.get(0).getSee_comment()) && list.get(0).getSee_comment() != null) {
				est_comment += "&&" + request.getParameter("est_comment") + "_";
			} else {
				est_comment += request.getParameter("est_comment") + "_";
			}
			see_sdm_dao.upSee_comment_sdm(comment_idx, est_comment);
		}
		return mav;
	}

	@RequestMapping("/voc_output.pnp")
	public ModelAndView voc_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/voc_output");

		int voc_user_idx = Integer.parseInt(request.getParameter("voc_user_idx"));
		String voc_content = request.getParameter("voc_content").replace("\r\n", "<br>").replace("\"", "＂")
				.replace("\'", "＇");
		String voc_user_name = request.getParameter("voc_user_name");

		voc_dao.insVoc(voc_user_idx, voc_user_name, voc_content, "답변");

		String query = "1 and voc_user_idx = '" + voc_user_idx + "' and voc_content = '" + voc_content
				+ "' and voc_user_name = '" + voc_user_name + "'";

		List<Voc_vo> list = voc_dao.selVoc(query);

		message_dao.insMessage(list.get(0).getVoc_idx(), voc_user_idx, "스드메 문의 답변이 도착했습니다.");
		send_push(voc_user_idx, "웨딩큐", "스드메 문의 답변이 도착했습니다.");

		return mav;
	}

	@RequestMapping("/insert_est_hall.pnp")
	public ModelAndView insert_est_hall(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insert_est_hall");

		int est_idx = Integer.parseInt(request.getParameter("est_idx"));
		int est_user_idx = Integer.parseInt(request.getParameter("est_user_idx"));
		List<Est_hall_vo> list = est_hall_dao.selEst_hall("1 and est_idx = " + est_idx);

		mav.addObject("est_idx", est_idx);
		mav.addObject("est_product", list.get(0).getEst_product());
		mav.addObject("est_user_idx", est_user_idx);
		return mav;
	}

	@RequestMapping("/est_output.pnp")
	public ModelAndView est_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/est_output");

		int est_idx = Integer.parseInt(request.getParameter("est_idx"));
		int est_cnt = 0;
		if (!"".equals(request.getParameter("est_cnt")) && request.getParameter("est_cnt") != null) {
			est_cnt = Integer.parseInt(request.getParameter("est_cnt"));

			List<Est_hall_vo> list = est_hall_dao.selEst_hall("1 and est_idx = " + est_idx);
			String est_product = list.get(0).getEst_product();

			try {
				JSONArray jarr = new JSONArray(est_product);
				for (int i = 0; i < jarr.length(); i++) {
					if (i == est_cnt) {
						jarr.getJSONObject(i).put("est_status", "on&&" + list.get(0).getEst_schedule() + "&&출금전");
					} else {
						jarr.getJSONObject(i).put("est_status", "off");
					}
				}
				est_product = jarr.toString();

				est_hall_dao.submitEst(est_idx, est_product);
			} catch (JSONException e) {
				e.printStackTrace();
			}
			est_hall_dao.upEst_status_hall(est_idx, "계약", "&&웨딩홀 계약완료_");
			message_dao.insMessage(est_idx, list.get(0).getEst_user_idx(), "캐쉬백이 적립되었습니다<br>적립된 캐쉬백 내역을 확인해보세요");
			send_push(list.get(0).getEst_user_idx(), "웨딩큐", "캐쉬백이 적립되었습니다<br>적립된 캐쉬백 내역을 확인해보세요");
			stats_est_dao.setStats_est("계약완료");
		}
		return mav;
	}

	@RequestMapping("/insert_est_hall_output.pnp")
	public ModelAndView insert_est_hall_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insert_est_hall_output");

		int est_idx = Integer.parseInt(request.getParameter("est_idx"));
		int est_user_idx = Integer.parseInt(request.getParameter("est_user_idx"));
		int est_cnt = Integer.parseInt(request.getParameter("est_cnt"));

		String insJson = "";
		insJson += "[";
		for (int i = 1; i <= est_cnt; i++) {
			if (i != 1) {
				insJson += ",";
			}
			insJson += "{";
			insJson += "\"est_cnt\":\"" + est_cnt + "\",";
			insJson += "\"est_status\":\"off\",";
			insJson += "\"est_pro_idx\":\"" + request.getParameter("est_pro_idx_" + i) + "\",";
			insJson += "\"est_name\":\"" + request.getParameter("est_name_" + i) + "\",";
			insJson += "\"est_addr\":\"" + request.getParameter("est_addr_" + i) + "\",";
			insJson += "\"est_homepage\":\"" + request.getParameter("est_homepage_" + i) + "\",";
			insJson += "\"est_tel\":\"" + request.getParameter("est_tel_" + i) + "\",";
			insJson += "\"est_type\":\"" + request.getParameter("est_type_" + i) + "\",";
			insJson += "\"est_wedding_date\":\"" + request.getParameter("est_wedding_date_" + i).replace("\r\n", "<br>")
					.replace("\"", "＂").replace("\'", "＇") + "\",";
			insJson += "\"est_play_time\":\"" + request.getParameter("est_play_time_" + i) + "\",";
			insJson += "\"est_rent_pay\":\"" + request.getParameter("est_rent_pay_" + i).replace("\r\n", "<br>")
					.replace("\"", "＂").replace("\'", "＇") + "\",";
			insJson += "\"est_flower\":\"" + request.getParameter("est_flower_" + i).replace("\r\n", "<br>")
					.replace("\"", "＂").replace("\'", "＇") + "\",";
			insJson += "\"est_menu\":\"" + request.getParameter("est_menu_" + i).replace("\r\n", "<br>")
					.replace("\"", "＂").replace("\'", "＇") + "\",";
			insJson += "\"est_drink\":\"" + request.getParameter("est_drink_" + i).replace("\r\n", "<br>")
					.replace("\"", "＂").replace("\'", "＇") + "\",";
			insJson += "\"est_people\":\"" + request.getParameter("est_people_" + i) + "\",";
			insJson += "\"est_rebate\":\"" + request.getParameter("est_rebate_" + i) + "\",";
			insJson += "\"est_cashback\":\"" + request.getParameter("est_cashback_" + i) + "\",";
			insJson += "\"est_benefit\":\"" + request.getParameter("est_benefit_" + i).replace("\r\n", "<br>")
					.replace("\"", "＂").replace("\'", "＇") + "\",";
			insJson += "\"est_notice\":\"" + request.getParameter("est_notice_" + i).replace("\r\n", "<br>")
					.replace("\"", "＂").replace("\'", "＇") + "\",";
			insJson += "\"est_min_menu\":\"" + request.getParameter("est_min_menu_" + i) + "\",";
			insJson += "\"est_min_pay\":\"" + request.getParameter("est_min_pay_" + i) + "\"";
			insJson += "}";
		}
		insJson += "]";

		List<Est_hall_vo> list = est_hall_dao.selEst_hall("1 and est_idx = " + est_idx);
		est_hall_dao.submitEst(est_idx, insJson);
		if ("".equals(list.get(0).getEst_product()) || list.get(0).getEst_product() == null) {
			if (list.get(0).getEst_status().indexOf("재") > -1) {
				est_hall_dao.upEst_status_hall(est_idx, "재전달", "&&리스트 재전달_");
			} else {
				est_hall_dao.upEst_status_hall(est_idx, "전달", "&&리스트 전달_");
			}
			message_dao.insMessage(est_idx, est_user_idx, "맞춤 웨딩홀 리스트가 도착했습니다<br>제휴혜택과 캐쉬백을 확인해보세요");
			send_push(list.get(0).getEst_user_idx(), "웨딩큐", "맞춤 웨딩홀 리스트가 도착했습니다<br>제휴혜택과 캐쉬백을 확인해보세요");
		}
		stats_est_dao.setStats_est("견적완료");
		return mav;
	}

	@RequestMapping("/stats_join.pnp")
	public ModelAndView stats_join(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/stats_join");

		String query = "1";

		List<User2_vo> list_total = user2_dao.selList_user(query);

		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		mav.addObject("now", sdf.format(now));

		String date_type = "date";
		String startDateYear = (sdf.format(now)).substring(0, 4);
		String startDateMonth = (sdf.format(now)).substring(4, 6);
		String startDateDay = "01";
		String endDateYear = (sdf.format(now)).substring(0, 4);
		String endDateMonth = (sdf.format(now)).substring(4, 6);
		String endDateDay = (sdf.format(now)).substring(6, 8);

		if (!"".equals(request.getParameter("startDateYear")) && request.getParameter("startDateYear") != null) {
			date_type = request.getParameter("date_type");
			startDateYear = request.getParameter("startDateYear");
			startDateMonth = request.getParameter("startDateMonth");
			startDateDay = request.getParameter("startDateDay");
			endDateYear = request.getParameter("endDateYear");
			endDateMonth = request.getParameter("endDateMonth");
			endDateDay = request.getParameter("endDateDay");
		}

		String year_data = "";
		if ("today".equals(date_type)) {
			query += " and user_submit_date like '" + sdf.format(now) + "%'";
		} else if ("time".equals(date_type) || "date".equals(date_type)) {
			String start_date = startDateYear + startDateMonth + startDateDay + "000000";
			String end_date = endDateYear + endDateMonth + endDateDay + "999999";
			query += " and user_submit_date >= '" + start_date + "' and user_submit_date <= '" + end_date + "'";
		} else if ("month".equals(date_type)) {
			year_data = (sdf.format(now)).substring(0, 4);
			if (!"".equals(request.getParameter("year_data")) && request.getParameter("year_data") != null) {
				year_data = request.getParameter("year_data");
			}
			query += " and user_submit_date like '" + year_data + "%'";
		}

		List<User2_vo> list = user2_dao.selList_user(query);

		String query_today = "1";
		query_today += " and user_submit_date like '" + sdf.format(now) + "%'";
		List<User2_vo> list_today = user2_dao.selList_user(query_today);

		String query_tomonth = "1";
		query_tomonth += " and user_submit_date like '" + (sdf.format(now)).substring(0, 6) + "%'";
		List<User2_vo> list_tomonth = user2_dao.selList_user(query_tomonth);

		mav.addObject("list", list);
		mav.addObject("list_total", list_total.size());
		mav.addObject("list_today", list_today.size());
		mav.addObject("list_tomonth", list_tomonth.size());
		mav.addObject("date_type", date_type);
		mav.addObject("startDateYear", startDateYear);
		mav.addObject("startDateMonth", startDateMonth);
		mav.addObject("startDateDay", startDateDay);
		mav.addObject("endDateYear", endDateYear);
		mav.addObject("endDateMonth", endDateMonth);
		mav.addObject("endDateDay", endDateDay);
		mav.addObject("year_data", year_data);

		// 일평균 가입자 뽑기

		List<Stats_avg_vo> list_avg = stats_avg_dao.selStats_avg("1 and stats_cate = 'join'");
		int avg = 0;
		if (list_avg.size() > 0) {
			int sum = 0;
			for (int i = 0; i < list_avg.size(); i++) {
				sum += list_avg.get(i).getStats_cnt();
			}
			avg = sum / list_avg.size();
		}
		mav.addObject("list_avg", avg);

		// 일평균 가입자 뽑기

		// 지정일 평균 가입자 뽑기

		String start_date = startDateYear + startDateMonth + startDateDay;
		String end_date = endDateYear + endDateMonth + endDateDay;
		query += " and stats_date >= '" + start_date + "' and stats_date <= '" + end_date + "'";
		List<Stats_avg_vo> list_avg2 = stats_avg_dao.selStats_avg("1 and stats_cate = 'join' and stats_date >= '"
				+ start_date + "' and stats_date <= '" + end_date + "'");
		int avg2 = 0;
		if (list_avg2.size() > 0) {
			int sum = 0;
			for (int i = 0; i < list_avg2.size(); i++) {
				sum += list_avg2.get(i).getStats_cnt();
			}
			avg2 = sum / list_avg2.size();
		}
		mav.addObject("list_avg2", avg2);

		// 지정일 평균 가입자 뽑기

		return mav;
	}

	@RequestMapping("/stats_login.pnp")
	public ModelAndView stats_login(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/stats_login");

		String query = "1";

		List<Stats_vo> list_total = stats_dao.getStats(query);

		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		mav.addObject("now", sdf.format(now));

		String date_type = "date";
		String startDateYear = (sdf.format(now)).substring(0, 4);
		String startDateMonth = (sdf.format(now)).substring(4, 6);
		String startDateDay = "01";
		String endDateYear = (sdf.format(now)).substring(0, 4);
		String endDateMonth = (sdf.format(now)).substring(4, 6);
		String endDateDay = (sdf.format(now)).substring(6, 8);

		if (!"".equals(request.getParameter("startDateYear")) && request.getParameter("startDateYear") != null) {
			date_type = request.getParameter("date_type");
			startDateYear = request.getParameter("startDateYear");
			startDateMonth = request.getParameter("startDateMonth");
			startDateDay = request.getParameter("startDateDay");
			endDateYear = request.getParameter("endDateYear");
			endDateMonth = request.getParameter("endDateMonth");
			endDateDay = request.getParameter("endDateDay");
		}

		String year_data = "";
		if ("today".equals(date_type)) {
			query += " and stats_date like '" + sdf.format(now) + "%'";
		} else if ("time".equals(date_type) || "date".equals(date_type)) {
			String start_date = startDateYear + startDateMonth + startDateDay + "000000";
			String end_date = endDateYear + endDateMonth + endDateDay + "999999";
			query += " and stats_date >= '" + start_date + "' and stats_date <= '" + end_date + "'";
		} else if ("month".equals(date_type)) {
			year_data = (sdf.format(now)).substring(0, 4);
			if (!"".equals(request.getParameter("year_data")) && request.getParameter("year_data") != null) {
				year_data = request.getParameter("year_data");
			}
			query += " and stats_date like '" + year_data + "%'";
		}
		if ("on".equals(request.getParameter("delBeLogin"))) {
			query += " and stats_user_idx != '0'";
			mav.addObject("delBeLogin", request.getParameter("delBeLogin"));
		}

		if ("on".equals(request.getParameter("delSame"))) {
			if ("month".equals(date_type)) {
				query += " group by stats_mac, left(stats_date, 6)";
				mav.addObject("delSame", request.getParameter("delSame"));
			} else if ("year".equals(date_type)) {
				query += " group by stats_mac, left(stats_date, 4)";
				mav.addObject("delSame", request.getParameter("delSame"));
			} else {
				query += " group by stats_mac, left(stats_date, 8)";
				mav.addObject("delSame", request.getParameter("delSame"));
			}
		}
		List<Stats_vo> list = stats_dao.getStats(query);

		String query_today = "1";
		query_today += " and stats_date like '" + sdf.format(now) + "%'";
		List<Stats_vo> list_today = stats_dao.getStats(query_today);

		String query_tomonth = "1";
		query_tomonth += " and stats_date like '" + (sdf.format(now)).substring(0, 6) + "%'";
		List<Stats_vo> list_tomonth = stats_dao.getStats(query_tomonth);

		mav.addObject("list", list);
		mav.addObject("list_total", list_total.size());
		mav.addObject("list_today", list_today.size());
		mav.addObject("list_tomonth", list_tomonth.size());
		mav.addObject("date_type", date_type);
		mav.addObject("startDateYear", startDateYear);
		mav.addObject("startDateMonth", startDateMonth);
		mav.addObject("startDateDay", startDateDay);
		mav.addObject("endDateYear", endDateYear);
		mav.addObject("endDateMonth", endDateMonth);
		mav.addObject("endDateDay", endDateDay);
		mav.addObject("year_data", year_data);
		mav.addObject("year_data", year_data);

		// 일평균 접속자 뽑기

		List<Stats_avg_vo> list_avg = stats_avg_dao.selStats_avg("1 and stats_cate = 'login'");
		int avg = 0;
		if (list_avg.size() > 0) {
			int sum = 0;
			for (int i = 0; i < list_avg.size(); i++) {
				sum += list_avg.get(i).getStats_cnt();
			}
			avg = sum / list_avg.size();
		}
		mav.addObject("list_avg", avg);

		// 일평균 접속자 뽑기

		// 지정일 평균 접속자 뽑기

		String start_date = startDateYear + startDateMonth + startDateDay;
		String end_date = endDateYear + endDateMonth + endDateDay;
		query += " and stats_date >= '" + start_date + "' and stats_date <= '" + end_date + "'";
		List<Stats_avg_vo> list_avg2 = stats_avg_dao.selStats_avg("1 and stats_cate = 'login' and stats_date >= '"
				+ start_date + "' and stats_date <= '" + end_date + "'");
		int avg2 = 0;
		if (list_avg2.size() > 0) {
			int sum = 0;
			for (int i = 0; i < list_avg2.size(); i++) {
				sum += list_avg2.get(i).getStats_cnt();
			}
			avg2 = sum / list_avg2.size();
		}
		mav.addObject("list_avg2", avg2);

		// 지정일 평균 접속자 뽑기

		return mav;
	}

	@RequestMapping("/stats_page.pnp")
	public ModelAndView stats_page(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/stats_page");

		String site = request.getParameter("site");
		mav.addObject("site", site);
		String query = "1 and stats_site = '" + site + "'";

		List<Stats_page_vo> list_total = stats_page_dao.getStats_page(query);

		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		mav.addObject("now", sdf.format(now));

		String date_type = "date";
		String startDateYear = (sdf.format(now)).substring(0, 4);
		String startDateMonth = (sdf.format(now)).substring(4, 6);
		String startDateDay = "01";
		String endDateYear = (sdf.format(now)).substring(0, 4);
		String endDateMonth = (sdf.format(now)).substring(4, 6);
		String endDateDay = (sdf.format(now)).substring(6, 8);

		if (!"".equals(request.getParameter("startDateYear")) && request.getParameter("startDateYear") != null) {
			date_type = request.getParameter("date_type");
			startDateYear = request.getParameter("startDateYear");
			startDateMonth = request.getParameter("startDateMonth");
			startDateDay = request.getParameter("startDateDay");
			endDateYear = request.getParameter("endDateYear");
			endDateMonth = request.getParameter("endDateMonth");
			endDateDay = request.getParameter("endDateDay");
		}

		String year_data = "";
		if ("today".equals(date_type)) {
			query += " and stats_date like '" + sdf.format(now) + "%'";
		} else if ("time".equals(date_type) || "date".equals(date_type)) {
			String start_date = startDateYear + startDateMonth + startDateDay + "000000";
			String end_date = endDateYear + endDateMonth + endDateDay + "999999";
			query += " and stats_date >= '" + start_date + "' and stats_date <= '" + end_date + "'";
		} else if ("month".equals(date_type)) {
			year_data = (sdf.format(now)).substring(0, 4);
			if (!"".equals(request.getParameter("year_data")) && request.getParameter("year_data") != null) {
				year_data = request.getParameter("year_data");
			}
			query += " and stats_date like '" + year_data + "%'";
		}
		List<Stats_page_vo> list = stats_page_dao.getStats_page(query);

		String query_today = "1 and stats_site = '" + site + "'";
		query_today += " and stats_date like '" + sdf.format(now) + "%'";
		List<Stats_page_vo> list_today = stats_page_dao.getStats_page(query_today);

		String query_tomonth = "1 and stats_site = '" + site + "'";
		query_tomonth += " and stats_date like '" + (sdf.format(now)).substring(0, 6) + "%'";
		List<Stats_page_vo> list_tomonth = stats_page_dao.getStats_page(query_tomonth);

		mav.addObject("list", list);
		mav.addObject("list_total", list_total.size());
		mav.addObject("list_today", list_today.size());
		mav.addObject("list_tomonth", list_tomonth.size());
		mav.addObject("date_type", date_type);
		mav.addObject("startDateYear", startDateYear);
		mav.addObject("startDateMonth", startDateMonth);
		mav.addObject("startDateDay", startDateDay);
		mav.addObject("endDateYear", endDateYear);
		mav.addObject("endDateMonth", endDateMonth);
		mav.addObject("endDateDay", endDateDay);
		mav.addObject("year_data", year_data);

		return mav;
	}

	@RequestMapping("/stats_model.pnp")
	public ModelAndView stats_model(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/stats_model");

		String query = "1";

		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		mav.addObject("now", sdf.format(now));

		String startDateYear = (sdf.format(now)).substring(0, 4);
		String startDateMonth = (sdf.format(now)).substring(4, 6);
		String startDateDay = "01";
		String endDateYear = (sdf.format(now)).substring(0, 4);
		String endDateMonth = (sdf.format(now)).substring(4, 6);
		String endDateDay = (sdf.format(now)).substring(6, 8);

		if (!"".equals(request.getParameter("startDateYear")) && request.getParameter("startDateYear") != null) {
			startDateYear = request.getParameter("startDateYear");
			startDateMonth = request.getParameter("startDateMonth");
			startDateDay = request.getParameter("startDateDay");
			endDateYear = request.getParameter("endDateYear");
			endDateMonth = request.getParameter("endDateMonth");
			endDateDay = request.getParameter("endDateDay");
		}

		String start_date = startDateYear + startDateMonth + startDateDay + "000000";
		String end_date = endDateYear + endDateMonth + endDateDay + "999999";
		query += " and stats_date >= '" + start_date + "' and stats_date <= '" + end_date + "'";

		if ("on".equals(request.getParameter("delBeLogin"))) {
			query += " and stats_user_idx != '0'";
			mav.addObject("delBeLogin", request.getParameter("delBeLogin"));
		}

		if ("on".equals(request.getParameter("delSame"))) {
			query += " group by stats_mac, left(stats_date, 8)";
			mav.addObject("delSame", request.getParameter("delSame"));
		}
		List<Stats_vo> list = stats_dao.getStats(query);

		ArrayList<ArrayList<String>> model = new ArrayList<ArrayList<String>>();

		for (int i = 0; i < list.size(); i++) {
			boolean isSame = false;

			if (model.size() >= 0) {
				for (int j = 0; j < model.size(); j++) {
					if (list.get(i).getStats_model().equals(model.get(j).get(0))) {
						isSame = true;
						model.get(j).set(1, Integer.toString(Integer.parseInt(model.get(j).get(1)) + 1));
					}
				}
			}

			if (!isSame) {
				ArrayList<String> result = new ArrayList<String>();

				result.add(list.get(i).getStats_model());
				result.add("1");
				result.add("0");

				model.add(result);
			}
		}

		for (int i = 0; i < model.size(); i++) {
			String percent = Double.toString((Double.parseDouble(model.get(i).get(1)) / list.size()) * 100);
			percent = percent.substring(0, percent.indexOf(".") + 2);
			model.get(i).set(2, percent);
		}

		ArrayList<ArrayList<String>> model_sort = new ArrayList<ArrayList<String>>();

		int model_size = model.size();

		for (int z = 0; z < model_size; z++) {
			int best = 0;
			int index = 0;
			for (int i = 0; i < model.size(); i++) {
				if (Integer.parseInt(model.get(i).get(1)) > best) {
					best = Integer.parseInt(model.get(i).get(1));
					index = i;
				}
			}
			model_sort.add(model.get(index));
			model.remove(index);
		}
		for (int i = 0; i < model_sort.size(); i++) {
			model_sort.get(i).set(0, model_sort.get(i).get(0).replaceAll("SM-N935S", "갤럭시노트 FE SK")
					.replaceAll("SM-G950N", "갤럭시S8 SK").replaceAll("SM-N920S", "갤럭시노트5 SK")
					.replaceAll("SM-G610S", "갤럭시온7 SK").replaceAll("SM-G930S", "갤럭시S7 SK")
					.replaceAll("SM-G955N", "갤럭시S8+ SK").replaceAll("SM-N920K", "갤럭시노트5 KT")
					.replaceAll("SM-G930K", "갤럭시S7 KT").replaceAll("SM-G906S", "갤럭시S5 SK")
					.replaceAll("SM-G935S", "갤럭시S7엣지 SK").replaceAll("SM-N910K", "갤럭시노트4 KT")
					.replaceAll("SM-G935K", "갤럭시S7엣지 KT").replaceAll("LG-F400L", "G3 LG")
					.replaceAll("SM-N920L", "갤럭시노트5 LG").replaceAll("SM-G930L", "갤럭시S7 LG")
					.replaceAll("LG-F700L", "G5 LG").replaceAll("LG-F700K", "G5 KT").replaceAll("SM-A520K", "갤럭시A5 KT")
					.replaceAll("LGM-G600L", "G6 LG").replaceAll("LG-F600L", "V10 LG").replaceAll("SM-G925S", "S6엣지 SK")
					.replaceAll("SM-G920S", "갤럭시S6 SK").replaceAll("LG-F800S", "V20 SK").replaceAll("LG-F500S", "G4 SK")
					.replaceAll("SM-G920K", "갤럭시S6 KT").replaceAll("SM-N900S", "갤럭시노트3 SK")
					.replaceAll("SM-G935L", "갤럭시7엣지 LG").replaceAll("SM-N900K", "갤럭시노트3 KT")
					.replaceAll("SM-G925L", "갤럭시S6엣지 LG").replaceAll("SM-A310N0", "갤럭시A3")
					.replaceAll("LG-F800L", "V20 LG").replaceAll("LG-F350K", "G Pro2 LG")
					.replaceAll("LG-F800K", "V20 KT").replaceAll("LG-F500L", "G4 LG").replaceAll("TG-L800S", "루나 SK")
					.replaceAll("SM-N910S", "갤럭시노트4 SK").replaceAll("SM-A800S", "갤럭시A8 SK")
					.replaceAll("SM-A510S", "갤럭시A5 SK").replaceAll("SM-G920L", "갤럭시S6 LG")
					.replaceAll("LG-F600K", "V10 KT").replaceAll("Redmi Note 3", "샤오미 홍미노트3")
					.replaceAll("SM-N910H", "갤럭시노트4 해외").replaceAll("LG-F700S", "G5 SK")
					.replaceAll("SM-G900K", "갤럭시S5 KT").replaceAll("LG-F600S", "V10 SK").replaceAll("EVA-L09", "화웨이 P9")
					.replaceAll("Nexus 7", "넥서스7").replaceAll("SM-A520S", "갤럭시A5 SK").replaceAll("SM-J500N0", "갤럭시J5")
					.replaceAll("SM-N915S", "갤럭시노트엣지 SK").replaceAll("SM-G600S", "갤럭시 와이드 SK")
					.replaceAll("SM-G928L", "갤럭시S6엣지 LG").replaceAll("SM-G610K", "갤럭시On7 KT")
					.replaceAll("Nexus 5X", "넥서스5").replaceAll("SM-A700S", "갤럭시A7 SK")
					.replaceAll("SM-T375S", "갤럭시탭E 8.0 SK").replaceAll("SM-N916K", "갤럭시노트4S KT")
					.replaceAll("LG-F750K", "X파워 KT").replaceAll("LG-F770S", "X5 SK").replaceAll("SM-J510L", "갤럭시J5 LG")
					.replaceAll("IM-A910S", "베가아이언2 SK").replaceAll("STV100-3", "블랙베리")
					.replaceAll("SM-T378S", "갤럭시탭E 8.0 SK").replaceAll("SM-A710K", "갤럭시A7 KT")
					.replaceAll("SHV-E330S", "갤럭시S4 SK").replaceAll("SM-G928K", "갤럭시S6엣지 KT")
					.replaceAll("SM-A500S", "갤럭시A5 SK").replaceAll("SM-N935L", "갤럭시노트 FE LG")
					.replaceAll("IM-A890K", "베가시크릿노트 KT").replaceAll("SM-J710K", "갤럭시J7 KT")
					.replaceAll("SM-N910L", "갤럭시노트4 LG").replaceAll("SM-N916S", "갤럭시노트4S SK")
					.replaceAll("LG-F350L", "G프로2 LG").replaceAll("SM-G925K", "갤럭시S6엣지 KT")
					.replaceAll("SM-J727S", "갤럭시와이드2 SK"));
		}

		mav.addObject("model_sort", model_sort);

		mav.addObject("list", list);
		mav.addObject("startDateYear", startDateYear);
		mav.addObject("startDateMonth", startDateMonth);
		mav.addObject("startDateDay", startDateDay);
		mav.addObject("endDateYear", endDateYear);
		mav.addObject("endDateMonth", endDateMonth);
		mav.addObject("endDateDay", endDateDay);

		return mav;
	}

	@RequestMapping("/stats_auto_cnt.pnp")
	public ModelAndView stats_auto_cnt(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/stats_auto_cnt");

		String query = "1 and stats_content = '견적내기'";

		List<Stats_auto_vo> list_total = stats_auto_dao.getStats_auto(query);

		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		mav.addObject("now", sdf.format(now));

		String date_type = "date";
		String startDateYear = (sdf.format(now)).substring(0, 4);
		String startDateMonth = (sdf.format(now)).substring(4, 6);
		String startDateDay = "01";
		String endDateYear = (sdf.format(now)).substring(0, 4);
		String endDateMonth = (sdf.format(now)).substring(4, 6);
		String endDateDay = (sdf.format(now)).substring(6, 8);

		if (!"".equals(request.getParameter("startDateYear")) && request.getParameter("startDateYear") != null) {
			date_type = request.getParameter("date_type");
			startDateYear = request.getParameter("startDateYear");
			startDateMonth = request.getParameter("startDateMonth");
			startDateDay = request.getParameter("startDateDay");
			endDateYear = request.getParameter("endDateYear");
			endDateMonth = request.getParameter("endDateMonth");
			endDateDay = request.getParameter("endDateDay");
		}

		String year_data = "";
		if ("today".equals(date_type)) {
			query += " and stats_submit_date like '" + sdf.format(now) + "%'";
		} else if ("time".equals(date_type) || "date".equals(date_type)) {
			String start_date = startDateYear + startDateMonth + startDateDay + "000000";
			String end_date = endDateYear + endDateMonth + endDateDay + "999999";
			query += " and stats_submit_date >= '" + start_date + "' and stats_submit_date <= '" + end_date + "'";
		} else if ("month".equals(date_type)) {
			year_data = (sdf.format(now)).substring(0, 4);
			if (!"".equals(request.getParameter("year_data")) && request.getParameter("year_data") != null) {
				year_data = request.getParameter("year_data");
			}
			query += " and stats_submit_date like '" + year_data + "%'";
		}
		if ("on".equals(request.getParameter("delSame"))) {
			if ("month".equals(date_type)) {
				query += " group by stats_mac, left(stats_submit_date, 6)";
				mav.addObject("delSame", request.getParameter("delSame"));
			} else {
				query += " group by stats_mac, left(stats_submit_date, 8)";
				mav.addObject("delSame", request.getParameter("delSame"));
			}
		}
		List<Stats_auto_vo> list = stats_auto_dao.getStats_auto(query);

		String query_today = "1";
		query_today += " and stats_submit_date like '" + sdf.format(now) + "%' and stats_content = '견적내기'";
		List<Stats_auto_vo> list_today = stats_auto_dao.getStats_auto(query_today);

		String query_tomonth = "1";
		query_tomonth += " and stats_submit_date like '" + (sdf.format(now)).substring(0, 6)
				+ "%' and stats_content = '견적내기'";
		List<Stats_auto_vo> list_tomonth = stats_auto_dao.getStats_auto(query_tomonth);

		mav.addObject("list", list);
		mav.addObject("list_total", list_total.size());
		mav.addObject("list_today", list_today.size());
		mav.addObject("list_tomonth", list_tomonth.size());
		mav.addObject("date_type", date_type);
		mav.addObject("startDateYear", startDateYear);
		mav.addObject("startDateMonth", startDateMonth);
		mav.addObject("startDateDay", startDateDay);
		mav.addObject("endDateYear", endDateYear);
		mav.addObject("endDateMonth", endDateMonth);
		mav.addObject("endDateDay", endDateDay);
		mav.addObject("year_data", year_data);

		return mav;
	}

	@RequestMapping("/stats_est.pnp")
	public ModelAndView stats_est(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/stats_est");

		String query = "1";

		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		mav.addObject("now", sdf.format(now));

		String startDateYear = (sdf.format(now)).substring(0, 4);
		String startDateMonth = (sdf.format(now)).substring(4, 6);
		String startDateDay = "01";
		String endDateYear = (sdf.format(now)).substring(0, 4);
		String endDateMonth = (sdf.format(now)).substring(4, 6);
		String endDateDay = (sdf.format(now)).substring(6, 8);

		if (!"".equals(request.getParameter("startDateYear")) && request.getParameter("startDateYear") != null) {
			startDateYear = request.getParameter("startDateYear");
			startDateMonth = request.getParameter("startDateMonth");
			startDateDay = request.getParameter("startDateDay");
			endDateYear = request.getParameter("endDateYear");
			endDateMonth = request.getParameter("endDateMonth");
			endDateDay = request.getParameter("endDateDay");
		}

		String start_date = startDateYear + startDateMonth + startDateDay + "000000";
		String end_date = endDateYear + endDateMonth + endDateDay + "999999";
		query += " and stats_submit_date >= '" + start_date + "' and stats_submit_date <= '" + end_date + "'";

		mav.addObject("startDateYear", startDateYear);
		mav.addObject("startDateMonth", startDateMonth);
		mav.addObject("startDateDay", startDateDay);
		mav.addObject("endDateYear", endDateYear);
		mav.addObject("endDateMonth", endDateMonth);
		mav.addObject("endDateDay", endDateDay);

		List<Stats_est_vo> stats_list = stats_est_dao.getStats_est(query);

		int matching_pro = 0;
		int shop_banner = 0;
		int submit_btn = 0;
		int submit_comple = 0;
		int list_comple = 0;
		int est_comple = 0;
		int main_banner = 0;
		int step3 = 0;

		for (int i = 0; i < stats_list.size(); i++) {
			if ("맞춤상품".equals(stats_list.get(i).getStats_content())) {
				matching_pro++;
			} else if ("웨딩샵".equals(stats_list.get(i).getStats_content())) {
				shop_banner++;
			} else if ("신청하기".equals(stats_list.get(i).getStats_content())) {
				submit_btn++;
			} else if ("신청완료".equals(stats_list.get(i).getStats_content())) {
				submit_comple++;
			} else if ("견적완료".equals(stats_list.get(i).getStats_content())) {
				list_comple++;
			} else if ("계약완료".equals(stats_list.get(i).getStats_content())) {
				est_comple++;
			} else if ("메인배너".equals(stats_list.get(i).getStats_content())) {
				main_banner++;
			} else if ("step3".equals(stats_list.get(i).getStats_content())) {
				main_banner++;
			}
		}

		mav.addObject("matching_pro", matching_pro);
		mav.addObject("shop_banner", shop_banner);
		mav.addObject("submit_btn", submit_btn);
		mav.addObject("submit_comple", submit_comple);
		mav.addObject("list_comple", list_comple);
		mav.addObject("est_comple", est_comple);
		mav.addObject("main_banner", main_banner);
		mav.addObject("step3", step3);

		return mav;
	}

	@RequestMapping("/stats_banner.pnp")
	public ModelAndView stats_banner(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/stats_banner");

		String query = "1";

		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		mav.addObject("now", sdf.format(now));

		String startDateYear = (sdf.format(now)).substring(0, 4);
		String startDateMonth = (sdf.format(now)).substring(4, 6);
		String startDateDay = "01";
		String endDateYear = (sdf.format(now)).substring(0, 4);
		String endDateMonth = (sdf.format(now)).substring(4, 6);
		String endDateDay = (sdf.format(now)).substring(6, 8);

		if (!"".equals(request.getParameter("startDateYear")) && request.getParameter("startDateYear") != null) {
			startDateYear = request.getParameter("startDateYear");
			startDateMonth = request.getParameter("startDateMonth");
			startDateDay = request.getParameter("startDateDay");
			endDateYear = request.getParameter("endDateYear");
			endDateMonth = request.getParameter("endDateMonth");
			endDateDay = request.getParameter("endDateDay");
		}

		String start_date = startDateYear + startDateMonth + startDateDay + "000000";
		String end_date = endDateYear + endDateMonth + endDateDay + "999999";
		query += " and stats_submit_date >= '" + start_date + "' and stats_submit_date <= '" + end_date + "'";

		mav.addObject("startDateYear", startDateYear);
		mav.addObject("startDateMonth", startDateMonth);
		mav.addObject("startDateDay", startDateDay);
		mav.addObject("endDateYear", endDateYear);
		mav.addObject("endDateMonth", endDateMonth);
		mav.addObject("endDateDay", endDateDay);

		List<Stats_banner_vo> stats_list = stats_banner_dao.getStats_banner(query);

		int notice = 0;
		int card = 0;
		int shop = 0;
		int schedule = 0;
		int step1 = 0;
		int step2 = 0;
		int step3 = 0;
		int bottom1 = 0;
		int bottom2 = 0;
		int bottom3 = 0;
		int alarm = 0;
		int msg = 0;
		int hall_banner = 0;
		int est_banner = 0;
		int est_pack = 0;

		for (int i = 0; i < stats_list.size(); i++) {
			if ("공지사항".equals(stats_list.get(i).getStats_content())) {
				notice++;
			} else if ("상담카드".equals(stats_list.get(i).getStats_content())) {
				card++;
			} else if ("웨딩샵".equals(stats_list.get(i).getStats_content())) {
				shop++;
			} else if ("일정관리".equals(stats_list.get(i).getStats_content())) {
				schedule++;
			} else if ("step1".equals(stats_list.get(i).getStats_content())) {
				step1++;
			} else if ("step2".equals(stats_list.get(i).getStats_content())) {
				step2++;
			} else if ("step3".equals(stats_list.get(i).getStats_content())) {
				step3++;
			} else if ("하단일정1".equals(stats_list.get(i).getStats_content())) {
				bottom1++;
			} else if ("하단일정2".equals(stats_list.get(i).getStats_content())) {
				bottom2++;
			} else if ("하단일정3".equals(stats_list.get(i).getStats_content())) {
				bottom3++;
			} else if ("하단알림".equals(stats_list.get(i).getStats_content())) {
				alarm++;
			} else if ("메세지함".equals(stats_list.get(i).getStats_content())) {
				msg++;
			} else if ("웨딩홀배너".equals(stats_list.get(i).getStats_content())) {
				hall_banner++;
			} else if ("자동견적배너".equals(stats_list.get(i).getStats_content())) {
				est_banner++;
			} else if ("자동견적기획상품".equals(stats_list.get(i).getStats_content())) {
				est_pack++;
			}
		}

		mav.addObject("notice", notice);
		mav.addObject("card", card);
		mav.addObject("shop", shop);
		mav.addObject("schedule", schedule);
		mav.addObject("step1", step1);
		mav.addObject("step2", step2);
		mav.addObject("step3", step3);
		mav.addObject("bottom1", bottom1);
		mav.addObject("bottom2", bottom2);
		mav.addObject("bottom3", bottom3);
		mav.addObject("alarm", alarm);
		mav.addObject("msg", msg);
		mav.addObject("hall_banner", hall_banner);
		mav.addObject("est_banner", est_banner);
		mav.addObject("est_pack", est_pack);

		return mav;
	}

	@RequestMapping("/stats_event.pnp")
	public ModelAndView stats_event(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/stats_event");

		String query = "1";

		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		mav.addObject("now", sdf.format(now));

		String startDateYear = (sdf.format(now)).substring(0, 4);
		String startDateMonth = (sdf.format(now)).substring(4, 6);
		String startDateDay = "01";
		String endDateYear = (sdf.format(now)).substring(0, 4);
		String endDateMonth = (sdf.format(now)).substring(4, 6);
		String endDateDay = (sdf.format(now)).substring(6, 8);

		if (!"".equals(request.getParameter("startDateYear")) && request.getParameter("startDateYear") != null) {
			startDateYear = request.getParameter("startDateYear");
			startDateMonth = request.getParameter("startDateMonth");
			startDateDay = request.getParameter("startDateDay");
			endDateYear = request.getParameter("endDateYear");
			endDateMonth = request.getParameter("endDateMonth");
			endDateDay = request.getParameter("endDateDay");
		}

		String start_date = startDateYear + startDateMonth + startDateDay + "000000";
		String end_date = endDateYear + endDateMonth + endDateDay + "999999";
		query += " and stats_submit_date >= '" + start_date + "' and stats_submit_date <= '" + end_date + "'";

		mav.addObject("startDateYear", startDateYear);
		mav.addObject("startDateMonth", startDateMonth);
		mav.addObject("startDateDay", startDateDay);
		mav.addObject("endDateYear", endDateYear);
		mav.addObject("endDateMonth", endDateMonth);
		mav.addObject("endDateDay", endDateDay);

		List<Stats_banner_vo> stats_list = stats_banner_dao.getStats_banner(query);

		int main = 0;
		int notice_talk = 0;
		int est_talk = 0;
		int studio = 0;
		int dress = 0;
		int makeup = 0;

		for (int i = 0; i < stats_list.size(); i++) {
			if ("메인배너".equals(stats_list.get(i).getStats_content())) {
				main++;
			} else if ("안내카톡".equals(stats_list.get(i).getStats_content())) {
				notice_talk++;
			} else if ("견적카톡".equals(stats_list.get(i).getStats_content())) {
				est_talk++;
			} else if ("스튜디오".equals(stats_list.get(i).getStats_content())) {
				studio++;
			} else if ("드레스".equals(stats_list.get(i).getStats_content())) {
				dress++;
			} else if ("메이크업".equals(stats_list.get(i).getStats_content())) {
				makeup++;
			}
		}

		mav.addObject("main", main);
		mav.addObject("notice_talk", notice_talk);
		mav.addObject("est_talk", est_talk);
		mav.addObject("studio", studio);
		mav.addObject("dress", dress);
		mav.addObject("makeup", makeup);

		return mav;
	}

	@RequestMapping("/stats_schedule.pnp")
	public ModelAndView stats_schedule(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/stats_schedule");

		String query = "1";

		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		mav.addObject("now", sdf.format(now));

		String startDateYear = (sdf.format(now)).substring(0, 4);
		String startDateMonth = (sdf.format(now)).substring(4, 6);
		String startDateDay = "01";
		String endDateYear = (sdf.format(now)).substring(0, 4);
		String endDateMonth = (sdf.format(now)).substring(4, 6);
		String endDateDay = (sdf.format(now)).substring(6, 8);

		if (!"".equals(request.getParameter("startDateYear")) && request.getParameter("startDateYear") != null) {
			startDateYear = request.getParameter("startDateYear");
			startDateMonth = request.getParameter("startDateMonth");
			startDateDay = request.getParameter("startDateDay");
			endDateYear = request.getParameter("endDateYear");
			endDateMonth = request.getParameter("endDateMonth");
			endDateDay = request.getParameter("endDateDay");
		}

		String start_date = startDateYear + startDateMonth + startDateDay + "000000";
		String end_date = endDateYear + endDateMonth + endDateDay + "999999";
		query += " and stats_submit_date >= '" + start_date + "' and stats_submit_date <= '" + end_date + "'";

		mav.addObject("startDateYear", startDateYear);
		mav.addObject("startDateMonth", startDateMonth);
		mav.addObject("startDateDay", startDateDay);
		mav.addObject("endDateYear", endDateYear);
		mav.addObject("endDateMonth", endDateMonth);
		mav.addObject("endDateDay", endDateDay);

		List<Stats_schedule_vo> stats_list = stats_schedule_dao.getStats_schedule(query);

		int clean = 0;
		int meet_add = 0;
		int meet_del = 0;
		int meet_update = 0;
		int meet_memo = 0;

		int hall_add = 0;
		int hall_del = 0;
		int hall_update = 0;
		int hall_memo = 0;

		int honey_add = 0;
		int honey_del = 0;
		int honey_update = 0;
		int honey_memo = 0;

		int sdm_add = 0;
		int sdm_del = 0;
		int sdm_update = 0;
		int sdm_memo = 0;

		int suit_add = 0;
		int suit_del = 0;
		int suit_update = 0;
		int suit_memo = 0;

		int korea_add = 0;
		int korea_del = 0;
		int korea_update = 0;
		int korea_memo = 0;

		int jewelry_add = 0;
		int jewelry_del = 0;
		int jewelry_update = 0;
		int jewelry_memo = 0;

		int gift_add = 0;
		int gift_del = 0;
		int gift_update = 0;
		int gift_memo = 0;

		int drawer_add = 0;
		int drawer_del = 0;
		int drawer_update = 0;
		int drawer_memo = 0;

		int pb_add = 0;
		int pb_del = 0;
		int pb_update = 0;
		int pb_memo = 0;

		int card_add = 0;
		int card_del = 0;
		int card_update = 0;
		int card_memo = 0;

		int ready_add = 0;
		int ready_del = 0;
		int ready_update = 0;
		int ready_memo = 0;

		int other_add = 0;
		int other_del = 0;
		int other_update = 0;
		int other_memo = 0;

		int seven_add = 0;
		int seven_del = 0;
		int seven_update = 0;
		int seven_memo = 0;

		for (int i = 0; i < stats_list.size(); i++) {
			if ("초기화".equals(stats_list.get(i).getStats_content())) {
				clean++;
			}

			if ("상견례".equals(stats_list.get(i).getStats_cate())) {
				if ("일정추가".equals(stats_list.get(i).getStats_content())) {
					meet_add++;
				} else if ("일정삭제".equals(stats_list.get(i).getStats_content())) {
					meet_del++;
				} else if ("일정수정".equals(stats_list.get(i).getStats_content())) {
					meet_update++;
				} else if ("메모편집".equals(stats_list.get(i).getStats_content())) {
					meet_memo++;
				}
			} else if ("웨딩홀".equals(stats_list.get(i).getStats_cate())) {
				if ("일정추가".equals(stats_list.get(i).getStats_content())) {
					hall_add++;
				} else if ("일정삭제".equals(stats_list.get(i).getStats_content())) {
					hall_del++;
				} else if ("일정수정".equals(stats_list.get(i).getStats_content())) {
					hall_update++;
				} else if ("메모편집".equals(stats_list.get(i).getStats_content())) {
					hall_memo++;
				}
			} else if ("허니문".equals(stats_list.get(i).getStats_cate())) {
				if ("일정추가".equals(stats_list.get(i).getStats_content())) {
					honey_add++;
				} else if ("일정삭제".equals(stats_list.get(i).getStats_content())) {
					honey_del++;
				} else if ("일정수정".equals(stats_list.get(i).getStats_content())) {
					honey_update++;
				} else if ("메모편집".equals(stats_list.get(i).getStats_content())) {
					honey_memo++;
				}
			} else if ("스드메".equals(stats_list.get(i).getStats_cate())) {
				if ("일정추가".equals(stats_list.get(i).getStats_content())) {
					sdm_add++;
				} else if ("일정삭제".equals(stats_list.get(i).getStats_content())) {
					sdm_del++;
				} else if ("일정수정".equals(stats_list.get(i).getStats_content())) {
					sdm_update++;
				} else if ("메모편집".equals(stats_list.get(i).getStats_content())) {
					sdm_memo++;
				}
			} else if ("예복".equals(stats_list.get(i).getStats_cate())) {
				if ("일정추가".equals(stats_list.get(i).getStats_content())) {
					suit_add++;
				} else if ("일정삭제".equals(stats_list.get(i).getStats_content())) {
					suit_del++;
				} else if ("일정수정".equals(stats_list.get(i).getStats_content())) {
					suit_update++;
				} else if ("메모편집".equals(stats_list.get(i).getStats_content())) {
					suit_memo++;
				}
			} else if ("한복".equals(stats_list.get(i).getStats_cate())) {
				if ("일정추가".equals(stats_list.get(i).getStats_content())) {
					korea_add++;
				} else if ("일정삭제".equals(stats_list.get(i).getStats_content())) {
					korea_del++;
				} else if ("일정수정".equals(stats_list.get(i).getStats_content())) {
					korea_update++;
				} else if ("메모편집".equals(stats_list.get(i).getStats_content())) {
					korea_memo++;
				}
			} else if ("예물".equals(stats_list.get(i).getStats_cate())) {
				if ("일정추가".equals(stats_list.get(i).getStats_content())) {
					jewelry_add++;
				} else if ("일정삭제".equals(stats_list.get(i).getStats_content())) {
					jewelry_del++;
				} else if ("일정수정".equals(stats_list.get(i).getStats_content())) {
					jewelry_update++;
				} else if ("메모편집".equals(stats_list.get(i).getStats_content())) {
					jewelry_memo++;
				}
			} else if ("예단".equals(stats_list.get(i).getStats_cate())) {
				if ("일정추가".equals(stats_list.get(i).getStats_content())) {
					gift_add++;
				} else if ("일정삭제".equals(stats_list.get(i).getStats_content())) {
					gift_del++;
				} else if ("일정수정".equals(stats_list.get(i).getStats_content())) {
					gift_update++;
				} else if ("메모편집".equals(stats_list.get(i).getStats_content())) {
					gift_memo++;
				}
			} else if ("혼수".equals(stats_list.get(i).getStats_cate())) {
				if ("일정추가".equals(stats_list.get(i).getStats_content())) {
					drawer_add++;
				} else if ("일정삭제".equals(stats_list.get(i).getStats_content())) {
					drawer_del++;
				} else if ("일정수정".equals(stats_list.get(i).getStats_content())) {
					drawer_update++;
				} else if ("메모편집".equals(stats_list.get(i).getStats_content())) {
					drawer_memo++;
				}
			} else if ("폐백".equals(stats_list.get(i).getStats_cate())) {
				if ("일정추가".equals(stats_list.get(i).getStats_content())) {
					pb_add++;
				} else if ("일정삭제".equals(stats_list.get(i).getStats_content())) {
					pb_del++;
				} else if ("일정수정".equals(stats_list.get(i).getStats_content())) {
					pb_update++;
				} else if ("메모편집".equals(stats_list.get(i).getStats_content())) {
					pb_memo++;
				}
			} else if ("청첩장".equals(stats_list.get(i).getStats_cate())) {
				if ("일정추가".equals(stats_list.get(i).getStats_content())) {
					card_add++;
				} else if ("일정삭제".equals(stats_list.get(i).getStats_content())) {
					card_del++;
				} else if ("일정수정".equals(stats_list.get(i).getStats_content())) {
					card_update++;
				} else if ("메모편집".equals(stats_list.get(i).getStats_content())) {
					card_memo++;
				}
			} else if ("결혼식준비".equals(stats_list.get(i).getStats_cate())) {
				if ("일정추가".equals(stats_list.get(i).getStats_content())) {
					ready_add++;
				} else if ("일정삭제".equals(stats_list.get(i).getStats_content())) {
					ready_del++;
				} else if ("일정수정".equals(stats_list.get(i).getStats_content())) {
					ready_update++;
				} else if ("메모편집".equals(stats_list.get(i).getStats_content())) {
					ready_memo++;
				}
			} else if ("기타".equals(stats_list.get(i).getStats_cate())) {
				if ("일정추가".equals(stats_list.get(i).getStats_content())) {
					other_add++;
				} else if ("일정삭제".equals(stats_list.get(i).getStats_content())) {
					other_del++;
				} else if ("일정수정".equals(stats_list.get(i).getStats_content())) {
					other_update++;
				} else if ("메모편집".equals(stats_list.get(i).getStats_content())) {
					other_memo++;
				}
			} else if ("+7".equals(stats_list.get(i).getStats_cate())) {
				if ("일정추가".equals(stats_list.get(i).getStats_content())) {
					seven_add++;
				} else if ("일정삭제".equals(stats_list.get(i).getStats_content())) {
					seven_del++;
				} else if ("일정수정".equals(stats_list.get(i).getStats_content())) {
					seven_update++;
				} else if ("메모편집".equals(stats_list.get(i).getStats_content())) {
					seven_memo++;
				}
			}
		}

		mav.addObject("clean", clean);
		mav.addObject("meet_add", meet_add);
		mav.addObject("meet_del", meet_del);
		mav.addObject("meet_update", meet_update);
		mav.addObject("meet_memo", meet_memo);

		mav.addObject("hall_add", hall_add);
		mav.addObject("hall_del", hall_del);
		mav.addObject("hall_update", hall_update);
		mav.addObject("hall_memo", hall_memo);

		mav.addObject("honey_add", honey_add);
		mav.addObject("honey_del", honey_del);
		mav.addObject("honey_update", honey_update);
		mav.addObject("honey_memo", honey_memo);

		mav.addObject("sdm_add", sdm_add);
		mav.addObject("sdm_del", sdm_del);
		mav.addObject("sdm_update", sdm_update);
		mav.addObject("sdm_memo", sdm_memo);

		mav.addObject("suit_add", suit_add);
		mav.addObject("suit_del", suit_del);
		mav.addObject("suit_update", suit_update);
		mav.addObject("suit_memo", suit_memo);

		mav.addObject("korea_add", korea_add);
		mav.addObject("korea_del", korea_del);
		mav.addObject("korea_update", korea_update);
		mav.addObject("korea_memo", korea_memo);

		mav.addObject("jewelry_add", jewelry_add);
		mav.addObject("jewelry_del", jewelry_del);
		mav.addObject("jewelry_update", jewelry_update);
		mav.addObject("jewelry_memo", jewelry_memo);

		mav.addObject("gift_add", gift_add);
		mav.addObject("gift_del", gift_del);
		mav.addObject("gift_update", gift_update);
		mav.addObject("gift_memo", gift_memo);

		mav.addObject("drawer_add", drawer_add);
		mav.addObject("drawer_del", drawer_del);
		mav.addObject("drawer_update", drawer_update);
		mav.addObject("drawer_memo", drawer_memo);

		mav.addObject("pb_add", pb_add);
		mav.addObject("pb_del", pb_del);
		mav.addObject("pb_update", pb_update);
		mav.addObject("pb_memo", pb_memo);

		mav.addObject("card_add", card_add);
		mav.addObject("card_del", card_del);
		mav.addObject("card_update", card_update);
		mav.addObject("card_memo", card_memo);

		mav.addObject("ready_add", ready_add);
		mav.addObject("ready_del", ready_del);
		mav.addObject("ready_update", ready_update);
		mav.addObject("ready_memo", ready_memo);

		mav.addObject("other_add", other_add);
		mav.addObject("other_del", other_del);
		mav.addObject("other_update", other_update);
		mav.addObject("other_memo", other_memo);

		mav.addObject("seven_add", seven_add);
		mav.addObject("seven_del", seven_del);
		mav.addObject("seven_update", seven_update);
		mav.addObject("seven_memo", seven_memo);

		return mav;
	}

	@RequestMapping("/stats_auto.pnp")
	public ModelAndView stats_auto(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/stats_auto");

		String query = "1";

		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		mav.addObject("now", sdf.format(now));

		String startDateYear = (sdf.format(now)).substring(0, 4);
		String startDateMonth = (sdf.format(now)).substring(4, 6);
		String startDateDay = "01";
		String endDateYear = (sdf.format(now)).substring(0, 4);
		String endDateMonth = (sdf.format(now)).substring(4, 6);
		String endDateDay = (sdf.format(now)).substring(6, 8);

		if (!"".equals(request.getParameter("startDateYear")) && request.getParameter("startDateYear") != null) {
			startDateYear = request.getParameter("startDateYear");
			startDateMonth = request.getParameter("startDateMonth");
			startDateDay = request.getParameter("startDateDay");
			endDateYear = request.getParameter("endDateYear");
			endDateMonth = request.getParameter("endDateMonth");
			endDateDay = request.getParameter("endDateDay");
		}

		String start_date = startDateYear + startDateMonth + startDateDay + "000000";
		String end_date = endDateYear + endDateMonth + endDateDay + "999999";
		query += " and stats_submit_date >= '" + start_date + "' and stats_submit_date <= '" + end_date + "'";

		if ("on".equals(request.getParameter("delSame"))) {
			query += " group by stats_content, stats_mac, left(stats_submit_date, 8)";
			mav.addObject("delSame", request.getParameter("delSame"));
		}

		mav.addObject("startDateYear", startDateYear);
		mav.addObject("startDateMonth", startDateMonth);
		mav.addObject("startDateDay", startDateDay);
		mav.addObject("endDateYear", endDateYear);
		mav.addObject("endDateMonth", endDateMonth);
		mav.addObject("endDateDay", endDateDay);

		List<Stats_auto_vo> stats_list = stats_auto_dao.getStats_auto(query);

		int auto = 0;
		int est = 0;
		int photo = 0;
		int pit = 0;
		int talk = 0;
		int res = 0;
		int voc = 0;
		int voc_submit = 0;
		int kakao = 0;
		int call = 0;
		int simple = 0;
		int self = 0;

		for (int i = 0; i < stats_list.size(); i++) {
			if ("견적내기".equals(stats_list.get(i).getStats_content())) {
				auto++;
			} else if ("계약하기".equals(stats_list.get(i).getStats_content())) {
				est++;
			} else if ("촬영일정 선택".equals(stats_list.get(i).getStats_content())) {
				photo++;
			} else if ("피팅일정 선택".equals(stats_list.get(i).getStats_content())) {
				pit++;
			} else if ("상담일정 선택".equals(stats_list.get(i).getStats_content())) {
				talk++;
			} else if ("예약하기".equals(stats_list.get(i).getStats_content())) {
				res++;
			} else if ("문의하기".equals(stats_list.get(i).getStats_content())) {
				voc++;
			} else if ("문의확인".equals(stats_list.get(i).getStats_content())) {
				voc_submit++;
			} else if ("카톡문의".equals(stats_list.get(i).getStats_content())) {
				kakao++;
			} else if ("전화상담".equals(stats_list.get(i).getStats_content())) {
				call++;
			} else if ("간단문의".equals(stats_list.get(i).getStats_content())) {
				simple++;
			} else if ("직접예약".equals(stats_list.get(i).getStats_content())) {
				self++;
			}
		}

		mav.addObject("auto", auto);
		mav.addObject("est", est);
		mav.addObject("photo", photo);
		mav.addObject("pit", pit);
		mav.addObject("talk", talk);
		mav.addObject("res", res);
		mav.addObject("voc", voc);
		mav.addObject("voc_submit", voc_submit);
		mav.addObject("kakao", kakao);
		mav.addObject("call", call);
		mav.addObject("simple", simple);
		mav.addObject("self", self);

		return mav;
	}

	@RequestMapping("/setStats.pnp")
	public ModelAndView setStats(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/setStats");

		try {

			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			String stats_mac = new JSONObject(json).getString("mac");
			String stats_model = new JSONObject(json).getString("model");
			int stats_user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));

			user2_dao.upLastdate(stats_user_idx);
			stats_dao.setStats(stats_user_idx, stats_mac, stats_model);
			mav.addObject("json", "9000");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		// 일평균 접속자 통계를위한부분
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

		List<Stats_avg_vo> list = stats_avg_dao
				.selStats_avg("1 and stats_date = '" + sdf.format(now) + "' and stats_cate = 'login'");

		if (list.size() == 0) {
			stats_avg_dao.setStats_avg("login", sdf.format(now));
		} else {
			stats_avg_dao.upStats_avg("login", sdf.format(now));
		}
		// 일평균 접속자 통계를위한부분
		return mav;
	}

	@RequestMapping("/setStats_est.pnp")
	public ModelAndView setStats_est(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/setStats_est");

		try {

			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			String stats_content = new JSONObject(json).getString("content");

			stats_est_dao.setStats_est(stats_content);
			mav.addObject("json", "9000");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}
		return mav;
	}

	@RequestMapping("/setStats_banner.pnp")
	public ModelAndView setStats_banner(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/setStats_banner");

		try {

			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			String stats_content = new JSONObject(json).getString("content");

			stats_banner_dao.setStats_banner(stats_content);
			mav.addObject("json", "9000");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}
		return mav;
	}

	@RequestMapping("/setStats_schedule.pnp")
	public ModelAndView setStats_schedule(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/setStats_schedule");

		try {

			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			String stats_content = new JSONObject(json).getString("content");
			String stats_cate = new JSONObject(json).getString("cate");

			stats_schedule_dao.setStats_schedule(stats_cate, stats_content);
			mav.addObject("json", "9000");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}
		return mav;
	}

	@RequestMapping("/setStats_auto.pnp")
	public ModelAndView setStats_auto(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/setStats_auto");

		try {

			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			String stats_content = new JSONObject(json).getString("content");
			String stats_mac = new JSONObject(json).getString("mac");
			int stats_user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));

			stats_auto_dao.setStats_auto(stats_content, stats_mac, stats_user_idx);
			mav.addObject("json", "9000");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}
		return mav;
	}

	@RequestMapping("/setStats_shop.pnp")
	public ModelAndView setStats_shop(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/setStats_shop");

		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int stats_pro_idx = Integer.parseInt(new JSONObject(json).getString("idx"));
			String stats_type = new JSONObject(json).getString("type");
			String stats_btn = new JSONObject(json).getString("btn");
			String stats_pro_name = "";
			if ("hall".equals(stats_type)) {
				List<Hall_vo> list = hall_dao.selList_hall("1 and pro_idx = " + stats_pro_idx);
				stats_pro_name = list.get(0).getPro_name();
			} else if ("studio".equals(stats_type)) {
				List<Studio_vo> list = studio_dao.selList_studio("1 and pro_idx = " + stats_pro_idx);
				stats_pro_name = list.get(0).getPro_name();
			} else if ("dress".equals(stats_type)) {
				List<Dress_vo> list = dress_dao.selList_dress("1 and pro_idx = " + stats_pro_idx);
				stats_pro_name = list.get(0).getPro_name();
			} else if ("makeup".equals(stats_type)) {
				List<Makeup_vo> list = makeup_dao.selList_makeup("1 and pro_idx = " + stats_pro_idx);
				stats_pro_name = list.get(0).getPro_name();
			} else if ("suit".equals(stats_type)) {
				List<Suit_vo> list = suit_dao.selList_suit("1 and pro_idx = " + stats_pro_idx);
				stats_pro_name = list.get(0).getPro_name();
			} else if ("korea".equals(stats_type)) {
				List<Korea_vo> list = korea_dao.selList_korea("1 and pro_idx = " + stats_pro_idx);
				stats_pro_name = list.get(0).getPro_name();
			} else if ("jewelry".equals(stats_type)) {
				List<Jewelry_vo> list = jewelry_dao.selList_jewelry("1 and pro_idx = " + stats_pro_idx);
				stats_pro_name = list.get(0).getPro_name();
			} else if ("pb".equals(stats_type)) {
				List<Pb_vo> list = pb_dao.selList_pb("1 and pro_idx = " + stats_pro_idx);
				stats_pro_name = list.get(0).getPro_name();
			}

			String query = "1";
			query += " and stats_pro_idx = " + stats_pro_idx;
			query += " and stats_pro_name = '" + stats_pro_name + "'";
			query += " and stats_type = '" + stats_type + "'";
			List<Stats_shop_vo> list = stats_shop_dao.selStats_shop(query);

			int stats_detail = 0;
			int stats_scrap1 = 0;
			int stats_scrap2 = 0;
			int stats_map = 0;
			int stats_homepage = 0;
			int stats_call = 0;
			int stats_photo = 0;
			int stats_intro = 0;
			int stats_est = 0;
			int stats_cont = 0;
			int stats_review = 0;

			if (list.size() == 0) {
				stats_shop_dao.setStats_shop(stats_pro_idx, stats_pro_name, stats_type, stats_detail, stats_scrap1,
						stats_scrap2, stats_map, stats_homepage, stats_call, stats_photo, stats_intro, stats_est,
						stats_cont, stats_review);
			}
			List<Stats_shop_vo> list2 = stats_shop_dao.selStats_shop(query);
			stats_detail = list2.get(0).getStats_detail();
			stats_scrap1 = list2.get(0).getStats_scrap1();
			stats_scrap2 = list2.get(0).getStats_scrap2();
			stats_map = list2.get(0).getStats_map();
			stats_homepage = list2.get(0).getStats_homepage();
			stats_call = list2.get(0).getStats_call();
			stats_photo = list2.get(0).getStats_photo();
			stats_intro = list2.get(0).getStats_intro();
			stats_est = list2.get(0).getStats_est();
			stats_cont = list2.get(0).getStats_cont();
			stats_review = list2.get(0).getStats_review();

			if ("detail".equals(stats_btn)) {
				stats_detail++;
			} else if ("scrap1".equals(stats_btn)) {
				stats_scrap1++;
			} else if ("scrap2".equals(stats_btn)) {
				stats_scrap2++;
			} else if ("map".equals(stats_btn)) {
				stats_map++;
			} else if ("homepage".equals(stats_btn)) {
				stats_homepage++;
			} else if ("call".equals(stats_btn)) {
				stats_call++;
			} else if ("photo".equals(stats_btn)) {
				stats_photo++;
			} else if ("intro".equals(stats_btn)) {
				stats_intro++;
			} else if ("est".equals(stats_btn)) {
				stats_est++;
			} else if ("cont".equals(stats_btn)) {
				stats_cont++;
			} else if ("review".equals(stats_btn)) {
				stats_review++;
			}
			stats_shop_dao.upStats_shop(stats_pro_idx, stats_pro_name, stats_type, stats_detail, stats_scrap1,
					stats_scrap2, stats_map, stats_homepage, stats_call, stats_photo, stats_intro, stats_est,
					stats_cont, stats_review);

			mav.addObject("json", "9000");

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}
		return mav;
	}

	@RequestMapping("/setStats_pack.pnp")
	public ModelAndView setStats_pack(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/setStats_pack");

		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int pack_idx = Integer.parseInt(new JSONObject(json).getString("idx"));
			String stats_btn = new JSONObject(json).getString("btn");

			List<Pro_package_vo> list = pro_package_dao.selPro_package("1 and pack_idx = '" + pack_idx + "'");

			int pack_stats_detail = list.get(0).getPack_stats_detail();
			int pack_stats_submit = list.get(0).getPack_stats_submit();
			int pack_stats_comple = list.get(0).getPack_stats_comple();

			if ("상세페이지".equals(stats_btn)) {
				pack_stats_detail++;
			} else if ("신청하기".equals(stats_btn)) {
				pack_stats_submit++;
			} else if ("신청완료".equals(stats_btn)) {
				pack_stats_comple++;
			}
			pro_package_dao.upStats_pro_package(pack_idx, pack_stats_detail, pack_stats_submit, pack_stats_comple);

			mav.addObject("json", "9000");

			// 또다른 통계를 위한 부분
			String stats_pack_name = list.get(0).getPack_name();
			String stats_pro_name = list.get(0).getPack_pro_name();
			int stats_user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));
			String stats_mac = new JSONObject(json).getString("mac");

			stats_pack_dao.setStats_pack(stats_pack_name, stats_pro_name, stats_user_idx, stats_mac, stats_btn);
			// 또다른 통계를 위한 부분

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}
		return mav;
	}

	@RequestMapping("/stats_ans.pnp")
	public ModelAndView stats_ans(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/stats_ans");

		String query = "1";

		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		mav.addObject("now", sdf.format(now));

		String startDateYear = (sdf.format(now)).substring(0, 4);
		String startDateMonth = (sdf.format(now)).substring(4, 6);
		String startDateDay = "01";
		String endDateYear = (sdf.format(now)).substring(0, 4);
		String endDateMonth = (sdf.format(now)).substring(4, 6);
		String endDateDay = (sdf.format(now)).substring(6, 8);

		if (!"".equals(request.getParameter("startDateYear")) && request.getParameter("startDateYear") != null) {
			startDateYear = request.getParameter("startDateYear");
			startDateMonth = request.getParameter("startDateMonth");
			startDateDay = request.getParameter("startDateDay");
			endDateYear = request.getParameter("endDateYear");
			endDateMonth = request.getParameter("endDateMonth");
			endDateDay = request.getParameter("endDateDay");
		}

		String start_date = startDateYear + startDateMonth + startDateDay + "000000";
		String end_date = endDateYear + endDateMonth + endDateDay + "999999";
		query += " and ans_submit_date >= '" + start_date + "' and ans_submit_date <= '" + end_date + "'";

		mav.addObject("startDateYear", startDateYear);
		mav.addObject("startDateMonth", startDateMonth);
		mav.addObject("startDateDay", startDateDay);
		mav.addObject("endDateYear", endDateYear);
		mav.addObject("endDateMonth", endDateMonth);
		mav.addObject("endDateDay", endDateDay);

		List<Answer2_vo> ans_list = answer2_dao.selAns_all(query);
		List<Ques3_sort_vo> ques_list = ques3_sort_dao.selQues3_sort();

		String meet_arr[] = ques_list.get(0).getQues_meet().split(">");
		String hall_arr[] = ques_list.get(0).getQues_hall().split(">");
		String honey_arr[] = ques_list.get(0).getQues_honey().split(">");
		String package_arr[] = ques_list.get(0).getQues_package().split(">");
		String suit_arr[] = ques_list.get(0).getQues_suit().split(">");
		String korea_arr[] = ques_list.get(0).getQues_korea().split(">");
		String jewelry_arr[] = ques_list.get(0).getQues_jewelry().split(">");
		String drawer_arr[] = ques_list.get(0).getQues_drawer().split(">");
		String pb_arr[] = ques_list.get(0).getQues_pb().split(">");

		int meet_start_cnt = 0;
		int meet_end_cnt = 0;
		int hall_start_cnt = 0;
		int hall_end_cnt = 0;
		int honey_start_cnt = 0;
		int honey_end_cnt = 0;
		int package_start_cnt = 0;
		int package_end_cnt = 0;
		int suit_start_cnt = 0;
		int suit_end_cnt = 0;
		int korea_start_cnt = 0;
		int korea_end_cnt = 0;
		int jewelry_start_cnt = 0;
		int jewelry_end_cnt = 0;
		int drawer_start_cnt = 0;
		int drawer_end_cnt = 0;
		int pb_start_cnt = 0;
		int pb_end_cnt = 0;

		for (int i = 0; i < ans_list.size(); i++) {
			if (ans_list.get(i).getAns_data().indexOf("상견례") > -1) {
				// 상견례
				if (ans_list.get(i).getAns_data().indexOf("\"" + meet_arr[meet_arr.length - 1] + "\":") > -1) // 상견례
																												// 마지막번호
				{
					meet_end_cnt++;
				}
				if (ans_list.get(i).getAns_data().indexOf("\"" + meet_arr[0] + "\":") > -1) // 상견례 시작번호
				{
					meet_start_cnt++;
				}
				// 상견례

				// 웨딩홀
				if (ans_list.get(i).getAns_data().indexOf("\"" + hall_arr[hall_arr.length - 1] + "\":") > -1) // 웨딩홀
																												// 마지막번호
				{
					hall_end_cnt++;
				}
				if (ans_list.get(i).getAns_data().indexOf("\"" + hall_arr[0] + "\":") > -1) // 웨딩홀 시작번호
				{
					hall_start_cnt++;
				}
				// 웨딩홀

				// 허니문
				if (ans_list.get(i).getAns_data().indexOf("\"" + honey_arr[honey_arr.length - 1] + "\":") > -1) // 허니문
																												// 마지막번호
				{
					honey_end_cnt++;
				}
				if (ans_list.get(i).getAns_data().indexOf("\"" + honey_arr[0] + "\":") > -1) // 허니문 시작번호
				{
					honey_start_cnt++;
				}
				// 허니문

				// 스드메
				if (ans_list.get(i).getAns_data().indexOf("\"" + package_arr[package_arr.length - 1] + "\":") > -1) // 스드메
																													// 마지막번호
				{
					package_end_cnt++;
				}
				if (ans_list.get(i).getAns_data().indexOf("\"" + package_arr[0] + "\":") > -1) // 스드메 시작번호
				{
					package_start_cnt++;
				}
				// 스드메

				// 예복
				if (ans_list.get(i).getAns_data().indexOf("\"" + suit_arr[suit_arr.length - 1] + "\":") > -1) // 예복
																												// 마지막번호
				{
					suit_end_cnt++;
				}
				if (ans_list.get(i).getAns_data().indexOf("\"" + suit_arr[0] + "\":") > -1) // 예복 시작번호
				{
					suit_start_cnt++;
				}
				// 예복

				// 한복
				if (ans_list.get(i).getAns_data().indexOf("\"" + korea_arr[korea_arr.length - 1] + "\":") > -1) // 한복
																												// 마지막번호
				{
					korea_end_cnt++;
				}
				if (ans_list.get(i).getAns_data().indexOf("\"" + korea_arr[0] + "\":") > -1) // 한복 시작번호
				{
					korea_start_cnt++;
				}
				// 한복

				// 예물
				if (ans_list.get(i).getAns_data().indexOf("\"" + jewelry_arr[jewelry_arr.length - 1] + "\":") > -1) // 예물
																													// 마지막번호
				{
					jewelry_end_cnt++;
				}
				if (ans_list.get(i).getAns_data().indexOf("\"" + jewelry_arr[0] + "\":") > -1) // 예물 시작번호
				{
					jewelry_start_cnt++;
				}
				// 예물

				// 혼수
				if (ans_list.get(i).getAns_data().indexOf("\"" + drawer_arr[drawer_arr.length - 1] + "\":") > -1) // 혼수
																													// 마지막번호
				{
					drawer_end_cnt++;
				}
				if (ans_list.get(i).getAns_data().indexOf("\"" + drawer_arr[0] + "\":") > -1) // 혼수 시작번호
				{
					drawer_start_cnt++;
				}
				// 혼수

				// 폐백
				if (ans_list.get(i).getAns_data().indexOf("\"" + pb_arr[pb_arr.length - 1] + "\":") > -1) // 폐백 마지막번호
				{
					pb_end_cnt++;
				}
				if (ans_list.get(i).getAns_data().indexOf("\"" + pb_arr[0] + "\":") > -1) // 폐백 시작번호
				{
					pb_start_cnt++;
				}
				// 폐백
			}
		}

		mav.addObject("meet_start_cnt", meet_start_cnt);
		mav.addObject("meet_end_cnt", meet_end_cnt);
		mav.addObject("hall_start_cnt", hall_start_cnt);
		mav.addObject("hall_end_cnt", hall_end_cnt);
		mav.addObject("honey_start_cnt", honey_start_cnt);
		mav.addObject("honey_end_cnt", honey_end_cnt);
		mav.addObject("package_start_cnt", package_start_cnt);
		mav.addObject("package_end_cnt", package_end_cnt);
		mav.addObject("suit_start_cnt", suit_start_cnt);
		mav.addObject("suit_end_cnt", suit_end_cnt);
		mav.addObject("korea_start_cnt", korea_start_cnt);
		mav.addObject("korea_end_cnt", korea_end_cnt);
		mav.addObject("jewelry_start_cnt", jewelry_start_cnt);
		mav.addObject("jewelry_end_cnt", jewelry_end_cnt);
		mav.addObject("drawer_start_cnt", drawer_start_cnt);
		mav.addObject("drawer_end_cnt", drawer_end_cnt);
		mav.addObject("pb_start_cnt", pb_start_cnt);
		mav.addObject("pb_end_cnt", pb_end_cnt);

		return mav;
	}

	@RequestMapping("/insSee.pnp")
	public ModelAndView insSee(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insSee");
		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int see_user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));
			int see_pro_idx = Integer.parseInt(new JSONObject(json).getString("pro_idx"));
			int see_est_idx = Integer.parseInt(new JSONObject(json).getString("est_idx"));
			String see_status = new JSONObject(json).getString("status");
			String see_want_date = new JSONObject(json).getString("date");

			List<Hall_vo> list = hall_dao.selList_hall("1 and pro_idx = " + see_pro_idx);
			String see_pro_name = list.get(0).getPro_com_name();
			String see_pro_tel = list.get(0).getPro_tel();

			see_dao.insSee(see_user_idx, see_est_idx, see_pro_idx, see_pro_name, see_pro_tel, see_status,
					see_want_date);
			if ("방문예약".equals(see_status)) {
				message_dao.insMessage(0, see_user_idx, see_pro_name + " 웨딩홀 방문예약 신청이 완료되었습니다");
			} else if ("변경예약".equals(see_status)) {
				message_dao.insMessage(0, see_user_idx, see_pro_name + " 웨딩홀 방문예약 변경신청이 완료되었습니다");
			}

			// 문자전송
			List<User2_vo> list_user = user2_dao.selList_user("1 and user_idx = '" + see_user_idx + "'");
			Utils utils = new Utils();
			utils.sendSMS("1090095264",
					"[웨딩큐] " + utils.decode(list_user.get(0).getUser_name()) + "님의 웨딩홀 " + see_status + " 신청이 도착하였습니다");
			// 문자전송

			est_hall_dao.upEst_status_hall(see_est_idx, see_status, "&&" + see_status + " 신청_");

			mav.addObject("json", "9000");

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/insSee_sdm.pnp")
	public ModelAndView insSee_sdm(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insSee_sdm");
		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int see_user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));
			String see_pro_idx = new JSONObject(json).getString("pro_idx");
			String see_option = new JSONObject(json).getString("option");
			String see_price = new JSONObject(json).getString("price");
			String see_dc = new JSONObject(json).getString("dc");
			String see_schedule = new JSONObject(json).getString("schedule");
			String see_status = new JSONObject(json).getString("status");
			String see_want_date = new JSONObject(json).getString("want_date");

			String see_pro_name = "";
			String see_pro_tel = "";
			String see_pro_fax = "";

			List<User2_vo> list_user = user2_dao.find_user(see_user_idx);

			Utils utils = new Utils();
			String see_user_name = "비회원";
			if (see_user_idx != 0) {
				see_user_name = utils.decode(list_user.get(0).getUser_name());
			}

			String pro_idx_arr[] = see_pro_idx.split(",");

			List<Studio_vo> list_studio = studio_dao.selList_studio("1 and pro_idx = " + pro_idx_arr[0]);
			if (list_studio.size() > 0) {
				see_pro_name += list_studio.get(0).getPro_name();
				see_pro_tel += list_studio.get(0).getPro_tel();

				List<Company_vo> list = company_dao
						.selList_company("1 and com_idx = '" + list_studio.get(0).getPro_com_idx() + "'");
				see_pro_fax += list.get(0).getCom_fax();
			} else {
				see_pro_name += "0";
				see_pro_tel += "0";
				see_pro_fax += "0";
			}

			for (int i = 1; i < pro_idx_arr.length - 1; i++) {
				List<Dress_vo> list_dress = dress_dao.selList_dress("1 and pro_idx = " + pro_idx_arr[i]);
				if (list_dress.size() > 0) {
					see_pro_name += "," + list_dress.get(0).getPro_name();
					see_pro_tel += "," + list_dress.get(0).getPro_tel();

					List<Company_vo> list = company_dao
							.selList_company("1 and com_idx = '" + list_dress.get(0).getPro_com_idx() + "'");
					see_pro_fax += "," + list.get(0).getCom_fax();
				} else {
					see_pro_name += ",0";
					see_pro_tel += ",0";
					see_pro_fax += ",0";
				}
			}
			List<Makeup_vo> list_makeup = makeup_dao
					.selList_makeup("1 and pro_idx = " + pro_idx_arr[pro_idx_arr.length - 1]);
			if (list_makeup.size() > 0) {
				see_pro_name += "," + list_makeup.get(0).getPro_name();
				see_pro_tel += "," + list_makeup.get(0).getPro_tel();

				List<Company_vo> list = company_dao
						.selList_company("1 and com_idx = '" + list_makeup.get(0).getPro_com_idx() + "'");
				see_pro_fax += "," + list.get(0).getCom_fax();
			} else {
				see_pro_name += ",0";
				see_pro_tel += ",0";
				see_pro_fax += ",0";
			}

			// 히스토리 세팅
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

			String want_arr[] = see_want_date.split("@");
			String pro_name_arr[] = see_pro_name.split(",");
			// 히스토리 세팅

			if ("견적신청".equals(see_status)) {
				see_sdm_dao.insSee_sdm(see_user_idx, see_user_name, see_pro_idx, see_pro_name, see_pro_tel, see_pro_fax,
						see_option, see_price, see_dc, see_schedule, see_status, see_want_date,
						"견적신청_" + sdf.format(now));

				// 통계
				List<Stats_package_vo> list_package = stats_package_dao
						.selStats_package("1 and stats_pro_idx = '" + see_pro_idx + "'");

				if (list_package.size() == 0) {
					stats_package_dao.setStats_package(see_pro_idx, see_pro_name);
				} else {
					stats_package_dao.upStats_package(see_pro_idx, see_pro_name,
							list_package.get(0).getStats_cnt() + 1);
				}

				for (int z = 0; z < pro_name_arr.length; z++) {
					if (z == 0) {
						List<Stats_pro_vo> list_pro = stats_pro_dao.selStats_pro(
								"1 and stats_pro_idx = '" + pro_idx_arr[z] + "' and stats_type = 'studio'");

						if (list_pro.size() == 0) {
							stats_pro_dao.setStats_pro(pro_idx_arr[z], pro_name_arr[z], "studio");
						} else {
							stats_pro_dao.upStats_pro(pro_idx_arr[z], pro_name_arr[z], "studio",
									list_pro.get(0).getStats_cnt() + 1);
						}
					} else if (z == pro_name_arr.length - 1) {
						List<Stats_pro_vo> list_pro = stats_pro_dao.selStats_pro(
								"1 and stats_pro_idx = '" + pro_idx_arr[z] + "' and stats_type = 'makeup'");

						if (list_pro.size() == 0) {
							stats_pro_dao.setStats_pro(pro_idx_arr[z], pro_name_arr[z], "makeup");
						} else {
							stats_pro_dao.upStats_pro(pro_idx_arr[z], pro_name_arr[z], "makeup",
									list_pro.get(0).getStats_cnt() + 1);
						}
					} else {
						List<Stats_pro_vo> list_pro = stats_pro_dao.selStats_pro(
								"1 and stats_pro_idx = '" + pro_idx_arr[z] + "' and stats_type = 'dress'");

						if (list_pro.size() == 0) {
							stats_pro_dao.setStats_pro(pro_idx_arr[z], pro_name_arr[z], "dress");
						} else {
							stats_pro_dao.upStats_pro(pro_idx_arr[z], pro_name_arr[z], "dress",
									list_pro.get(0).getStats_cnt() + 1);
						}
					}
				}
				// 통계
			} else if ("일정신청".equals(see_status)) {
				String insHistory = "";
				for (int z = 0; z < want_arr.length; z++) {
					if (z == 0) {
						insHistory += "&&" + pro_name_arr[z] + " 스튜디오 " + see_status + "_" + want_arr[z];
					} else if (z == want_arr.length - 1) {
						insHistory += "&&" + pro_name_arr[z] + " 메이크업 " + see_status + "_" + want_arr[z];
					} else {
						insHistory += "&&" + pro_name_arr[z] + " 드레스 " + see_status + "_" + want_arr[z];
					}
				}
				insHistory = insHistory.substring(2, insHistory.length());
				see_sdm_dao.insSee_sdm(see_user_idx, see_user_name, see_pro_idx, see_pro_name, see_pro_tel, see_pro_fax,
						see_option, see_price, see_dc, see_schedule, see_status, see_want_date, insHistory);

				message_dao.insMessage(0, see_user_idx, "스튜디오, 드레스샵, 메이크업샵의<br>일정확인 접수가 완료되었습니다");

				// 문자전송
				utils.sendSMS("1090095264", "[웨딩큐] " + see_user_name + "님의 스튜디오, 드레스샵, 메이크업샵의 일정신청이 도착하였습니다");
				// 문자전송
			} else if ("변경신청".equals(see_status) || "재신청".equals(see_status)) {
				for (int i = 0; i < pro_idx_arr.length; i++) {
					if (!"0".equals(pro_idx_arr[i])) {
						String insCate = "";
						if (i == 0) {
							insCate = "스튜디오";
							utils.sendSMS("1090095264",
									"[웨딩큐] " + see_user_name + "님의 스튜디오 촬영 일정 " + see_status + "이 도착하였습니다");
							message_dao.insMessage(0, see_user_idx,
									pro_name_arr[i] + "의 촬영일정 " + see_status + "이 완료되었습니다");
						} else if (i == pro_idx_arr.length - 1) {
							insCate = "메이크업";
							utils.sendSMS("1090095264",
									"[웨딩큐] " + see_user_name + "님의 메이크업 상담 일정 " + see_status + "이 도착하였습니다");
							message_dao.insMessage(0, see_user_idx,
									pro_name_arr[i] + "의 상담일정 " + see_status + "이 완료되었습니다");
						} else {
							insCate = "드레스";
							utils.sendSMS("1090095264",
									"[웨딩큐] " + see_user_name + "님의 드레스 피팅 일정 " + see_status + "이 도착하였습니다");
							message_dao.insMessage(0, see_user_idx,
									pro_name_arr[i] + "의 피팅일정 " + see_status + "이 완료되었습니다");
						}

						String insHistory = "";
						for (int z = 0; z < want_arr.length; z++) {
							if (!"0".equals(pro_name_arr[z])) {
								insHistory += "&&" + pro_name_arr[z] + " " + insCate + " " + see_status + "_"
										+ want_arr[z];
							}
						}
						insHistory = insHistory.substring(2, insHistory.length());
						see_sdm_dao.insSee_sdm(see_user_idx, see_user_name, see_pro_idx, see_pro_name, see_pro_tel,
								see_pro_fax, see_option, see_dc, see_price, see_schedule, see_status, see_want_date,
								insHistory);
					}
				}
			}

			mav.addObject("json", "9000");

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/selSee.pnp")
	public ModelAndView selSee(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/selSee");
		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int see_user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));
			int see_pro_idx = Integer.parseInt(new JSONObject(json).getString("pro_idx"));
			int see_est_idx = Integer.parseInt(new JSONObject(json).getString("est_idx"));

			String query = "1";

			query += " and see_user_idx = " + see_user_idx;
			if (see_est_idx != 0) {
				query += " and see_est_idx = " + see_est_idx;
			}
			if (see_pro_idx != 0) {
				query += " and see_pro_idx = " + see_pro_idx;
			}
			List<See_vo> list = see_dao.selSee(query);

			String return_json = "";
			return_json += "[";
			for (int i = 0; i < list.size(); i++) {
				if (i != 0) {
					return_json += ",";
				}
				return_json += "{";
				return_json += "\"user_idx\":\"" + list.get(i).getSee_user_idx() + "\",";
				return_json += "\"est_idx\":\"" + list.get(i).getSee_est_idx() + "\",";
				return_json += "\"pro_idx\":\"" + list.get(i).getSee_pro_idx() + "\",";
				return_json += "\"pro_name\":\"" + list.get(i).getSee_pro_name() + "\",";
				return_json += "\"pro_tel\":\"" + list.get(i).getSee_pro_tel() + "\",";
				return_json += "\"status\":\"" + list.get(i).getSee_status() + "\",";
				return_json += "\"want_date\":\"" + list.get(i).getSee_want_date() + "\",";
				return_json += "\"submit_date\":\"" + list.get(i).getSee_submit_date() + "\"";
				return_json += "}";
			}
			return_json += "]";

			mav.addObject("json", return_json);

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/getConfirm_date.pnp")
	public ModelAndView getConfirm_date(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/getConfirm_date");
		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int see_user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));

			String query = "1 and see_user_idx = '" + see_user_idx + "' and see_status not like '%취소%'";

			List<See_sdm_vo> list = see_sdm_dao.selSee_sdm(query);

			String studio_status = "";
			int studio_idx = 0;
			String studio_confirm = "";

			String dress_status = "";
			int dress_idx = 0;
			String dress_confirm = "";

			String makeup_status = "";
			int makeup_idx = 0;
			String makeup_confirm = "";
			for (int i = 0; i < list.size(); i++) {
				String his_result[] = list.get(i).getSee_history().split("&&");
				for (int j = 0; j < his_result.length; j++) {
					if (his_result[j].indexOf("스튜디오") > -1) {
						studio_status = his_result[j].split("_")[0];
						studio_idx = list.get(i).getSee_idx();
						if (!"".equals(list.get(i).getSee_confirm_date())
								&& list.get(i).getSee_confirm_date() != null) {
							studio_confirm = list.get(i).getSee_confirm_date().split("@")[0];
						} else {
							studio_confirm = "0";
						}
					}

					if (his_result[j].indexOf("드레스") > -1) {
						dress_status = his_result[j].split("_")[0];
						dress_idx = list.get(i).getSee_idx();
						if (!"".equals(list.get(i).getSee_confirm_date())
								&& list.get(i).getSee_confirm_date() != null) {
							dress_confirm = list.get(i).getSee_confirm_date().split("@")[1];
						} else {
							dress_confirm = "0";
						}
					}

					if (his_result[j].indexOf("메이크업") > -1) {
						makeup_status = his_result[j].split("_")[0];
						makeup_idx = list.get(i).getSee_idx();
						if (!"".equals(list.get(i).getSee_confirm_date())
								&& list.get(i).getSee_confirm_date() != null) {
							makeup_confirm = list.get(i).getSee_confirm_date().split("@")[2];
						} else {
							makeup_confirm = "0";
						}
					}
				}

			}

			String return_json = "";
			return_json += "{";
			return_json += "\"studio_status\":\"" + studio_status + "\",";
			return_json += "\"studio_idx\":\"" + studio_idx + "\",";
			return_json += "\"studio_confirm\":\"" + studio_confirm + "\",";
			return_json += "\"dress_status\":\"" + dress_status + "\",";
			return_json += "\"dress_idx\":\"" + dress_idx + "\",";
			return_json += "\"dress_confirm\":\"" + dress_confirm + "\",";
			return_json += "\"makeup_status\":\"" + makeup_status + "\",";
			return_json += "\"makeup_idx\":\"" + makeup_idx + "\",";
			return_json += "\"makeup_confirm\":\"" + makeup_confirm + "\"";
			return_json += "}";

			mav.addObject("json", return_json);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/getPayment_user.pnp")
	public ModelAndView getPayment_user(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/getPayment_user");
		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int pm_user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));

			String query = "1 and pm_user_idx = '" + pm_user_idx + "'";

			List<Payment_sdm_vo> list = payment_sdm_dao.selPayment_sdm(query);

			String isPayment = "off";

			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getPm_status().indexOf("취소") == -1) {
					isPayment = "on";
				}
			}
			mav.addObject("json", isPayment);

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/insVoc.pnp")
	public ModelAndView insVoc(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insVoc");
		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int voc_user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));
			String voc_content = new JSONObject(json).getString("content");

			Utils utils = new Utils();

			List<User2_vo> list = user2_dao.selList_user("1 and user_idx = '" + voc_user_idx + "'");

			String voc_user_name = utils.decode(list.get(0).getUser_name());

			voc_dao.insVoc(voc_user_idx, voc_user_name, voc_content, "문의");

			message_dao.insMessage(0, voc_user_idx, "스드메 문의 접수가 완료되었습니다.");
			utils.sendSMS("1090095264", "[웨딩큐] " + voc_user_name + "님의 스드메 문의가 도착하였습니다.");

			mav.addObject("json", "9000");

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/insVoc2.pnp")
	public ModelAndView insVoc2(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insVoc2");
		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int voc_user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));
			String voc_method = new JSONObject(json).getString("method");
			String voc_name = new JSONObject(json).getString("name");
			String voc_etc1 = new JSONObject(json).getString("etc1");
			String voc_etc2 = new JSONObject(json).getString("etc2");
			String voc_content = new JSONObject(json).getString("content");

			voc2_dao.insVoc2(voc_user_idx, voc_method, voc_name, voc_etc1, voc_etc2, voc_content);

			// 문자전송

			String msg = "";
			msg += "▣ 스드메 간단문의 ▣";
			msg += "\n";
			msg += voc_name + " " + voc_etc1;
			msg += "\n";
			msg += "추가문의사항 : " + voc_content;
			Utils utils = new Utils();
			utils.sendSMS("1090095264", msg);
			utils.sendSMS("1041782958", msg);
			// 문자전송

			// Utils utils = new Utils();
			// utils.sendSMS("1090095264", "[웨딩큐] "+voc_name+"님의 스드메 문의가 도착하였습니다.");

			mav.addObject("json", "9000");

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/selVoc.pnp")
	public ModelAndView selVoc(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/selVoc");
		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int voc_user_idx = Integer.parseInt(new JSONObject(json).getString("idx"));

			List<Voc_vo> list = voc_dao.selVoc("1 and voc_user_idx = '" + voc_user_idx + "'");

			String return_json = "";
			return_json += "[";
			if (list.size() > 0) {
				for (int i = 0; i < list.size(); i++) {
					if (i != 0) {
						return_json += ",";
					}
					return_json += "{";
					return_json += "\"voc_idx\":\"" + list.get(i).getVoc_idx() + "\",";
					return_json += "\"voc_user_idx\":\"" + list.get(i).getVoc_user_idx() + "\",";
					return_json += "\"voc_user_name\":\"" + list.get(i).getVoc_user_name() + "\",";
					return_json += "\"voc_status\":\"" + list.get(i).getVoc_status() + "\",";
					return_json += "\"voc_content\":\"" + list.get(i).getVoc_content() + "\",";
					return_json += "\"voc_submit_date\":\"" + list.get(i).getVoc_submit_date() + "\"";
					return_json += "}";
				}
			}
			return_json += "]";
			mav.addObject("json", return_json);

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/selSee_sdm.pnp")
	public ModelAndView selSee_sdm(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/selSee_sdm");
		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int see_user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));
			String see_pro_name = new JSONObject(json).getString("pro_name");
			int see_idx = Integer.parseInt(new JSONObject(json).getString("see_idx"));

			String query = "1";

			query += " and see_user_idx = " + see_user_idx;
			if (see_idx != 0) {
				query += " and see_idx = " + see_idx;

				query += " order by see_idx desc";

				List<See_sdm_vo> list = see_sdm_dao.selSee_sdm(query);

				String pro_name_arr[] = list.get(0).getSee_pro_name().split(",");
				for (int i = 0; i < pro_name_arr.length; i++) {
					if (see_pro_name.equals(pro_name_arr[i])) {
						String return_json = "";
						return_json += "[";
						return_json += "{";
						return_json += "\"see_idx\":\"" + list.get(0).getSee_idx() + "\",";
						return_json += "\"see_user_idx\":\"" + list.get(0).getSee_user_idx() + "\",";
						return_json += "\"see_pro_idx\":\"" + list.get(0).getSee_pro_idx().split(",")[i] + "\",";
						return_json += "\"see_pro_name\":\"" + list.get(0).getSee_pro_name().split(",")[i] + "\",";
						return_json += "\"see_pro_tel\":\"" + list.get(0).getSee_pro_tel().split(",")[i] + "\",";
						return_json += "\"see_pro_fax\":\"" + list.get(0).getSee_pro_fax().split(",")[i] + "\",";
						return_json += "\"see_option\":\"" + list.get(0).getSee_option().split("@")[i] + "\",";
						return_json += "\"see_price\":\"" + list.get(0).getSee_price().split("@")[i] + "\",";
						return_json += "\"see_dc\":\"" + list.get(0).getSee_dc().split("@")[i] + "\",";
						return_json += "\"see_schedule\":\"" + list.get(0).getSee_schedule() + "\",";
						return_json += "\"see_status\":\"" + list.get(0).getSee_status() + "\",";

						return_json += "\"see_pay_engine\":\"" + list.get(0).getSee_pay_engine() + "\",";
						return_json += "\"see_pay_number\":\"" + list.get(0).getSee_pay_number() + "\",";
						return_json += "\"see_pay_name\":\"" + list.get(0).getSee_pay_name() + "\",";
						return_json += "\"see_pay_cause\":\"" + list.get(0).getSee_pay_cause() + "\",";

						return_json += "\"see_want_date\":\"" + list.get(0).getSee_want_date().split("@")[i] + "\",";
						if (!"".equals(list.get(0).getSee_return_date()) && list.get(0).getSee_return_date() != null) {
							return_json += "\"see_return_date\":\"" + list.get(0).getSee_return_date().split("@")[i]
									+ "\",";
						} else {
							return_json += "\"see_return_date\":\"\",";
						}
						if (!"".equals(list.get(0).getSee_confirm_date())
								&& list.get(0).getSee_confirm_date() != null) {
							return_json += "\"see_confirm_date\":\"" + list.get(0).getSee_confirm_date().split("@")[i]
									+ "\",";
						} else {
							return_json += "\"see_confirm_date\":\"\",";
						}
						return_json += "\"see_submit_date\":\"" + list.get(0).getSee_submit_date() + "\"";
						return_json += "}";
						return_json += "]";
						mav.addObject("json", return_json);
					}
				}
			} else {
				query += " and see_status like '취소%'";

				query += " order by see_idx desc";

				List<See_sdm_vo> list = see_sdm_dao.selSee_sdm(query);

				List<Payment_sdm_vo> list_pay = payment_sdm_dao
						.selPayment_sdm("1 and pm_user_idx = '" + see_user_idx + "' and pm_status like '취소%'");

				String return_json = "";
				if (list_pay.size() > 0) {
					return_json += "[";
					return_json += "{";
					return_json += "\"see_idx\":\"" + list.get(0).getSee_idx() + "\",";
					return_json += "\"see_user_idx\":\"" + list.get(0).getSee_user_idx() + "\",";
					return_json += "\"see_pro_idx\":\"" + list.get(0).getSee_pro_idx() + "\",";
					return_json += "\"see_pro_name\":\"" + list.get(0).getSee_pro_name() + "\",";
					return_json += "\"see_pro_tel\":\"" + list.get(0).getSee_pro_tel() + "\",";
					return_json += "\"see_pro_fax\":\"" + list.get(0).getSee_pro_fax() + "\",";
					return_json += "\"see_option\":\"" + list.get(0).getSee_option() + "\",";
					return_json += "\"see_price\":\"" + list.get(0).getSee_price() + "\",";
					return_json += "\"see_dc\":\"" + list.get(0).getSee_dc() + "\",";
					return_json += "\"see_schedule\":\"" + list.get(0).getSee_schedule() + "\",";
					return_json += "\"see_status\":\"" + list.get(0).getSee_status() + "\",";

					return_json += "\"see_pay_engine\":\"" + list.get(0).getSee_pay_engine() + "\",";
					return_json += "\"see_pay_number\":\"" + list.get(0).getSee_pay_number() + "\",";
					return_json += "\"see_pay_name\":\"" + list.get(0).getSee_pay_name() + "\",";
					return_json += "\"see_pay_cause\":\"" + list.get(0).getSee_pay_cause() + "\",";

					return_json += "\"see_want_date\":\"" + list.get(0).getSee_want_date() + "\",";
					return_json += "\"see_return_date\":\"" + list.get(0).getSee_return_date() + "\",";
					return_json += "\"see_confirm_date\":\"" + list.get(0).getSee_confirm_date() + "\",";
					return_json += "\"see_submit_date\":\"" + list.get(0).getSee_submit_date() + "\",";
					return_json += "\"pm_pay\":\"" + list_pay.get(0).getPm_pay() + " 원\"";
					return_json += "}";
					return_json += "]";
				}
				mav.addObject("json", return_json);
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/cancle_sdm.pnp")
	public ModelAndView cancle_sdm(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/cancle_sdm");
		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));
			String pay_engine = new JSONObject(json).getString("pay_engine");
			String pay_number = new JSONObject(json).getString("pay_number");
			String pay_name = new JSONObject(json).getString("pay_name");
			String pay_cause = new JSONObject(json).getString("pay_cause");

			see_sdm_dao.upPay_sdm(user_idx, pay_engine, pay_number, pay_name, pay_cause);

			payment_sdm_dao.upStatus_pm(user_idx, "취소요청");

			// 첫번째 견적을 취소요청으로 변경
			List<See_sdm_vo> list = see_sdm_dao.selSee_sdm("1 and see_user_idx = '" + user_idx + "'");
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
			see_sdm_dao.upSee_status_sdm(list.get(0).getSee_idx(), "&&취소요청_" + sdf.format(now), "취소요청");
			// 첫번째 견적을 취소요청으로 변경

			mav.addObject("json", "9000");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/getPayment_sdm.pnp")
	public ModelAndView getPayment_sdm(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/getPayment_sdm");
		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));
			List<Payment_sdm_vo> list = payment_sdm_dao.selPayment_sdm("1 and pm_user_idx = '" + user_idx + "'");

			String return_json = "";
			if (list.size() > 0) {
				return_json += "[";
				return_json += "{";
				return_json += "\"pm_idx\":\"" + list.get(0).getPm_idx() + "\",";
				return_json += "\"pm_user_idx\":\"" + list.get(0).getPm_user_idx() + "\",";
				return_json += "\"pm_user_gender\":\"" + list.get(0).getPm_user_gender() + "\",";
				return_json += "\"pm_m_name\":\"" + list.get(0).getPm_m_name() + "\",";
				return_json += "\"pm_m_phone\":\"" + list.get(0).getPm_m_phone() + "\",";
				return_json += "\"pm_w_name\":\"" + list.get(0).getPm_w_name() + "\",";
				return_json += "\"pm_pro_name\":\"" + list.get(0).getPm_pro_name() + "\",";
				return_json += "\"pm_studio\":\"" + list.get(0).getPm_studio() + "\",";
				return_json += "\"pm_dress\":\"" + list.get(0).getPm_dress() + "\",";
				return_json += "\"pm_addpay\":\"" + list.get(0).getPm_addpay() + "\",";
				return_json += "\"pm_makeup\":\"" + list.get(0).getPm_makeup() + "\",";
				return_json += "\"pm_pay\":\"" + list.get(0).getPm_pay() + "\",";
				return_json += "\"pm_remain\":\"" + list.get(0).getPm_remain() + "\",";
				return_json += "\"pm_dc\":\"" + list.get(0).getPm_dc() + "\",";
				return_json += "\"pm_pay_engine\":\"" + list.get(0).getPm_pay_engine() + "\",";
				return_json += "\"pm_pay_number\":\"" + list.get(0).getPm_pay_number() + "\",";
				return_json += "\"pm_pay_name\":\"" + list.get(0).getPm_pay_name() + "\",";
				return_json += "\"pm_pay_date\":\"" + list.get(0).getPm_pay_date() + "\",";
				return_json += "\"pm_send_name\":\"" + list.get(0).getPm_send_name() + "\",";
				return_json += "\"pm_rece\":\"" + list.get(0).getPm_rece() + "\",";
				return_json += "\"pm_rece_engine\":\"" + list.get(0).getPm_rece_engine() + "\",";
				return_json += "\"pm_rece_number\":\"" + list.get(0).getPm_rece_number() + "\",";
				return_json += "\"pm_status\":\"" + list.get(0).getPm_status() + "\",";
				return_json += "\"pm_submit_date\":\"" + list.get(0).getPm_submit_date() + "\"";
				return_json += "}";
				return_json += "]";
			} else {
				return_json = "9001";
			}

			mav.addObject("json", return_json);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/selIdx_name.pnp")
	public ModelAndView selIdx_name(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/selIdx_name");
		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용]
			String pro_name = new JSONObject(json).getString("pro_name");
			String pro_cate = new JSONObject(json).getString("pro_cate");

			String query = "1";

			query += " and pro_name = '" + pro_name + "'";

			if ("studio".equals(pro_cate)) {
				List<Studio_vo> list = studio_dao.selList_studio(query);
				mav.addObject("json", list.get(0).getPro_idx());
			} else if ("dress".equals(pro_cate)) {
				List<Dress_vo> list = dress_dao.selList_dress(query);
				mav.addObject("json", list.get(0).getPro_idx());
			} else if ("makeup".equals(pro_cate)) {
				List<Makeup_vo> list = makeup_dao.selList_makeup(query);
				mav.addObject("json", list.get(0).getPro_idx());
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/hallCount.pnp")
	public ModelAndView hallCount(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/hallCount");

		List<Hall_vo> list = hall_dao.selIdx_hall();
		mav.addObject("json", list.size());

		return mav;
	}

	@RequestMapping("/compleSee.pnp")
	public ModelAndView compleSee(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/compleSee");

		int see_est_idx = Integer.parseInt(request.getParameter("see_est_idx"));
		int see_user_idx = Integer.parseInt(request.getParameter("see_user_idx"));
		String see_status = request.getParameter("see_status");
		if ("예약완료".equals(see_status)) {
			see_dao.compleSee(see_est_idx, see_user_idx, see_status, "방문예약");
			message_dao.insMessage(see_est_idx, see_user_idx, "웨딩홀 방문예약이 완료되었습니다.<br>방문 일정을 확인해보세요");
			send_push(see_user_idx, "웨딩큐", "웨딩홀 방문예약이 완료되었습니다.<br>방문 일정을 확인해보세요");
		} else if ("변경완료".equals(see_status)) {
			see_dao.compleSee(see_est_idx, see_user_idx, see_status, "변경예약");
			message_dao.insMessage(see_est_idx, see_user_idx, "웨딩홀 방문예약 변경이 완료되었습니다.<br>방문 일정을 확인해보세요");
			send_push(see_user_idx, "웨딩큐", "웨딩홀 방문예약 변경이 완료되었습니다.<br>방문 일정을 확인해보세요");
		}

		est_hall_dao.upEst_status_hall(see_est_idx, see_status, "&&" + see_status + "_");

		return mav;
	}

	@RequestMapping("/return_sdm.pnp")
	public ModelAndView return_sdm(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/return_sdm");

		int see_idx = Integer.parseInt(request.getParameter("return_idx"));
		int see_user_idx = Integer.parseInt(request.getParameter("return_user_idx"));

		String see_return_date = request.getParameter("return_date");
		see_return_date = see_return_date.replaceAll(" ", "").replaceAll("/", "").replaceAll(":", "");
		see_return_date = see_return_date.replaceAll("신청하신날짜의예약이모두마감되었습니다.<br>다른날짜로다시신청해주세요.",
				"신청하신 날짜의 예약이 모두 마감되었습니다.<br>다른 날짜로 다시 신청해주세요.");
		String see_status = "";
		String see_status2 = "";
		String see_history = "";
		String see_history2 = "";
		String see_pro_name[] = request.getParameter("return_pro_name").split(",");

		if (request.getParameter("return_status").indexOf("재") > -1) {
			see_status = "재전달";
			see_status2 = "재리스트전달";
		} else if (request.getParameter("return_status").indexOf("변경") > -1) {
			see_status = "변경전달";
			see_status2 = "변경리스트전달";
		} else {
			see_status = "일정전달";
			see_status2 = "일정리스트전달";
		}

		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		for (int i = 0; i < see_pro_name.length; i++) {
			if (!"0".equals(see_pro_name[i])) {
				if (i == 0) {
					see_history += "&&" + see_pro_name[i] + " 스튜디오 " + see_status + "_" + see_return_date.split("@")[i];
					see_history2 += "&&" + see_pro_name[i] + " 스튜디오 " + see_status2 + "_" + sdf.format(now);
					// message_dao.insMessage(see_idx, see_user_idx, see_pro_name[i]+"의 촬영가능 일정이
					// 도착하였습니다");
					if (see_status.indexOf("변경") > -1 || see_status.indexOf("재") > -1) {
						// send_push(see_user_idx,"웨딩큐", see_pro_name[i]+"의 촬영가능 일정이 도착하였습니다");
					}
				} else if (i == see_pro_name.length - 1) {
					see_history += "&&" + see_pro_name[i] + " 메이크업 " + see_status + "_" + see_return_date.split("@")[i];
					see_history2 += "&&" + see_pro_name[i] + " 메이크업 " + see_status2 + "_" + sdf.format(now);
					// message_dao.insMessage(see_idx, see_user_idx, see_pro_name[i]+"의 상담가능 일정이
					// 도착하였습니다");
					if (see_status.indexOf("변경") > -1 || see_status.indexOf("재") > -1) {
						// send_push(see_user_idx,"웨딩큐", see_pro_name[i]+"의 상담가능 일정이 도착하였습니다");
					}
				} else {
					see_history += "&&" + see_pro_name[i] + " 드레스 " + see_status + "_" + see_return_date.split("@")[i];
					see_history2 += "&&" + see_pro_name[i] + " 드레스 " + see_status2 + "_" + sdf.format(now);
					// message_dao.insMessage(see_idx, see_user_idx, see_pro_name[i]+"의 피팅가능 일정이
					// 도착하였습니다");
					if (see_status.indexOf("변경") > -1 || see_status.indexOf("재") > -1) {
						// send_push(see_user_idx,"웨딩큐", see_pro_name[i]+"의 피팅가능 일정이 도착하였습니다");
					}
				}
			}
		}
		// if(see_status.indexOf("변경") == -1 && see_status.indexOf("재") == -1)
		// {
		// send_push(see_user_idx,"웨딩큐", "스튜디오, 드레스, 메이크업 예약가능 일정이 도착하였습니다");
		// }
		send_push(see_user_idx, "웨딩큐", "스드메 예약가능 일정이 도착하였습니다.<br>원하는 날짜와 시간을 선택해주세요.");
		message_dao.insMessage(see_idx, see_user_idx, "스드메 예약가능 일정이 도착하였습니다.<br>원하는 날짜와 시간을 선택해주세요.");
		see_sdm_dao.upSee_return_date(see_idx, see_history, see_status, see_return_date);
		see_sdm_dao.upSee_return_date(see_idx, see_history2, see_status, see_return_date);

		return mav;
	}

	@RequestMapping("/confirm_sdm.pnp")
	public ModelAndView confirm_sdm(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/confirm_sdm");

		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int see_idx = Integer.parseInt(new JSONObject(json).getString("see_idx"));
			int see_user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));
			String see_pro_name = new JSONObject(json).getString("pro_name");
			String see_confirm_date = new JSONObject(json).getString("confirm_date");

			String query = "1";

			query += " and see_user_idx = " + see_user_idx;
			query += " and see_idx = " + see_idx;
			List<See_sdm_vo> list = see_sdm_dao.selSee_sdm(query);

			String see_status = "";
			String see_history = "";
			if (list.get(0).getSee_status().indexOf("재") > -1) {
				see_status = "재예약";
			} else if (list.get(0).getSee_status().indexOf("변경") > -1) {
				see_status = "변경예약";
			} else {
				see_status = "일정예약";
			}

			String pro_name_arr[] = list.get(0).getSee_pro_name().split(",");

			String confirm_date[] = new String[pro_name_arr.length];

			if (!"".equals(list.get(0).getSee_confirm_date()) && list.get(0).getSee_confirm_date() != null) {
				for (int i = 0; i < confirm_date.length; i++) {
					confirm_date[i] = list.get(0).getSee_confirm_date().split("@")[i];
				}
			} else {
				for (int i = 0; i < confirm_date.length; i++) {
					confirm_date[i] = "0";
				}
			}

			// 문자전송
			List<User2_vo> list_user = user2_dao.selList_user("1 and user_idx = '" + see_user_idx + "'");
			Utils utils = new Utils();
			// 문자전송
			for (int i = 0; i < pro_name_arr.length; i++) {
				if (see_pro_name.equals(pro_name_arr[i])) {
					confirm_date[i] = see_confirm_date;

					if (i == 0) {
						see_history += "&&" + see_pro_name + " 스튜디오 " + see_status + "_" + see_confirm_date;
						message_dao.insMessage(0, see_user_idx, see_pro_name + "의 촬영일정 예약접수가 완료되었습니다");

						utils.sendSMS("1090095264",
								"[웨딩큐] " + utils.decode(list_user.get(0).getUser_name()) + "님의 스튜디오 상세일정 예약이 접수되었습니다");
					} else if (i == pro_name_arr.length - 1) {
						see_history += "&&" + see_pro_name + " 메이크업 " + see_status + "_" + see_confirm_date;
						message_dao.insMessage(0, see_user_idx, see_pro_name + "의 상담일정 예약접수가 완료되었습니다");

						utils.sendSMS("1090095264",
								"[웨딩큐] " + utils.decode(list_user.get(0).getUser_name()) + "님의 메이크업 상세일정 예약이 접수되었습니다");
					} else {
						see_history += "&&" + see_pro_name + " 드레스 " + see_status + "_" + see_confirm_date;
						message_dao.insMessage(0, see_user_idx, see_pro_name + "의 피팅일정 예약접수가 완료되었습니다");

						utils.sendSMS("1090095264",
								"[웨딩큐] " + utils.decode(list_user.get(0).getUser_name()) + "님의 드레스 상세일정 예약이 접수되었습니다");
					}

				}
			}

			String insConfirm_date = "";
			for (int i = 0; i < confirm_date.length; i++) {
				if (i != 0) {
					insConfirm_date += "@";
				}
				insConfirm_date += confirm_date[i];
			}

			see_sdm_dao.upSee_confirm_date(see_idx, see_history, see_status, insConfirm_date);

			mav.addObject("json", "9000");

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/cancle_sdm_output.pnp")
	public ModelAndView cancle_sdm_output(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/cancle_sdm_output");

		int see_user_idx = Integer.parseInt(request.getParameter("cancle_user_idx"));

		see_sdm_dao.upSee_status_sdm_user(see_user_idx, "취소완료");

		return mav;
	}

	@RequestMapping("/isSee_sdm.pnp")
	public ModelAndView isSee_sdm(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/isSee_sdm");

		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int see_user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));

			String query = "1";
			query += " and see_user_idx = " + see_user_idx;
			query += " and see_status != '견적신청'";
			List<See_sdm_vo> list = see_sdm_dao.selSee_sdm(query);

			if (list.size() > 0) {
				mav.addObject("json", "on");
			} else {
				mav.addObject("json", "off");
			}

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/final_sdm.pnp")
	public ModelAndView final_sdm(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/final_sdm");

		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int see_user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));

			String query = "1";
			query += " and see_user_idx = '" + see_user_idx
					+ "' and see_status not like '취소%' and see_status not like '견적%' order by see_idx desc";
			List<See_sdm_vo> list = see_sdm_dao.selSee_sdm(query);

			String return_json = "";
			return_json += "[";
			for (int i = 0; i < list.size(); i++) {
				if (i != 0) {
					return_json += ",";
				}
				return_json += "{";
				return_json += "\"see_idx\":\"" + list.get(i).getSee_idx() + "\",";
				return_json += "\"see_user_idx\":\"" + list.get(i).getSee_user_idx() + "\",";
				return_json += "\"see_pro_idx\":\"" + list.get(i).getSee_pro_idx() + "\",";
				return_json += "\"see_pro_name\":\"" + list.get(i).getSee_pro_name() + "\",";
				return_json += "\"see_pro_tel\":\"" + list.get(i).getSee_pro_tel() + "\",";
				return_json += "\"see_pro_fax\":\"" + list.get(i).getSee_pro_fax() + "\",";
				return_json += "\"see_option\":\"" + list.get(i).getSee_option() + "\",";
				return_json += "\"see_price\":\"" + list.get(i).getSee_price() + "\",";
				return_json += "\"see_dc\":\"" + list.get(i).getSee_dc() + "\",";
				return_json += "\"see_schedule\":\"" + list.get(i).getSee_schedule() + "\",";
				return_json += "\"see_status\":\"" + list.get(i).getSee_status() + "\",";
				return_json += "\"see_want_date\":\"" + list.get(i).getSee_want_date() + "\",";
				return_json += "\"see_return_date\":\"" + list.get(i).getSee_return_date() + "\",";
				return_json += "\"see_confirm_date\":\"" + list.get(i).getSee_confirm_date() + "\",";
				return_json += "\"see_submit_date\":\"" + list.get(i).getSee_submit_date() + "\"";
				return_json += "}";
			}
			return_json += "]";
			mav.addObject("json", return_json);

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/insCont_package.pnp")
	public ModelAndView insCont_package(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insCont_package");

		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int cont_pack_idx = Integer.parseInt(new JSONObject(json).getString("pack_idx"));
			String cont_user_name = new JSONObject(json).getString("user_name");
			String cont_content = new JSONObject(json).getString("content");
			String cont_user_phone = new JSONObject(json).getString("user_phone");
			String cont_call_date = new JSONObject(json).getString("call_date");
			String cont_call_time = new JSONObject(json).getString("call_time");

			List<Pro_package_vo> list = pro_package_dao.selPro_package("1 and pack_idx = '" + cont_pack_idx + "'");

			String cont_pack_name = list.get(0).getPack_name();

			cont_package_dao.insCont_package(cont_pack_idx, cont_pack_name, cont_user_name, cont_content,
					cont_user_phone, cont_call_date, cont_call_time);

			// 문자전송

			String msg = "";
			msg += "▣ 기획상품 ▣";
			msg += "\n";
			msg += cont_user_name + " " + cont_user_phone;
			msg += "\n";
			msg += cont_pack_name;
			msg += "\n";
			msg += "추가문의사항 : " + cont_content;
			Utils utils = new Utils();
			utils.sendSMS("1090095264", msg);
			utils.sendSMS("1041782958", msg);
			// 문자전송

			// //문자전송
			// Utils utils = new Utils();
			// utils.sendSMS("1090095264", "[웨딩큐] 기획전 문의신청이 도착하였습니다.");
			// //문자전송

			mav.addObject("json", "9000");

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/insCont_drawer.pnp")
	public ModelAndView insCont_drawer(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insCont_drawer");

		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			String cont_cate = new JSONObject(json).getString("cate");
			String cont_pro_name = new JSONObject(json).getString("pro_name");
			String cont_name = new JSONObject(json).getString("name");
			String cont_phone = new JSONObject(json).getString("phone");
			String cont_call_time = new JSONObject(json).getString("call_time");
			String cont_content = new JSONObject(json).getString("content");

			cont_drawer_dao.insCont_drawer(cont_cate, cont_pro_name, cont_name, cont_phone, cont_call_time,
					cont_content);

			// 문자전송
			Utils utils = new Utils();
			String msg = "";
			if(cont_cate.equals("예물")) {
				msg += "▣ 웨딩큐 예물신청 ▣";
			}else if(cont_cate.equals("예복")) {
				msg += "▣ 웨딩큐 예복신청 ▣";
			}else if(cont_cate.equals("한복")) {
				msg += "▣ 웨딩큐 한복신청 ▣";
			}else if(cont_cate.equals("폐백")) {
				msg += "▣ 웨딩큐 폐백신청 ▣";
			}else if(cont_cate.equals("예물이벤트")) {
				msg += "▣ 웨딩큐 예물 이벤트 신청 ▣";
			}else if(cont_cate.equals("예복이벤트")) {
				msg += "▣ 웨딩큐 예복 이벤트 신청 ▣";
			}else if(cont_cate.equals("한복이벤트")) {
				msg += "▣ 웨딩큐 한복 이벤트 신청 ▣";
			}else if(cont_cate.equals("폐백이벤트")) {
				msg += "▣ 웨딩큐 폐백 이벤트 신청 ▣";
			}else if(cont_cate.equals("스드메이벤트")) {
				msg += "▣ 웨딩큐 스드메 기획전 신청 ▣";
			}
			msg += "\n";
			msg += cont_name + " " + cont_phone;
			msg += "\n";
			msg += "카테고리: "+cont_cate;
			msg += "\n";
			
			if(cont_cate.equals("폐백")) {
				msg += "상품명: "+cont_pro_name;
				msg += "\n";
				msg += "결혼예정일: "+cont_call_time;
			}else	if(cont_cate.equals("예복이벤트")) {
				msg += "결혼예정일: "+cont_call_time;
			}else	if(cont_cate.equals("예물이벤트")) {
				msg += "결혼예정일: "+cont_call_time;
			}else if(cont_cate.equals("한복이벤트")) {
				msg += "결혼예정일: "+cont_call_time;
			}else	if(cont_cate.equals("스드메이벤트")) {
				msg += "결혼예정일: "+cont_call_time;
			}else	if(cont_cate.equals("폐백이벤트")) {
				msg += "결혼예정일: "+cont_call_time;
			}else {
				msg += "업체명: "+cont_pro_name;
				msg += "\n";
				msg += "방문희망일: "+cont_call_time;
			}
			msg += "\n";
			msg += "문의내용: "+cont_content;
			msg += "\n";
			
			
			utils.sendSMS("1090095264", msg);
			utils.sendSMS("1041782958", msg);
			// 문자전송

			mav.addObject("json", "9000");

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/insCont_self.pnp")
	public ModelAndView insCont_self(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insCont_self");

		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int cont_user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));
			String cont_pro_idx = new JSONObject(json).getString("pro_idx");
			String cont_pro_name = new JSONObject(json).getString("pro_name");
			String cont_pro_option = new JSONObject(json).getString("pro_option");
			String cont_see_date = new JSONObject(json).getString("see_date");
			String cont_name = new JSONObject(json).getString("name");
			String cont_phone = new JSONObject(json).getString("phone");
			String cont_call_time = new JSONObject(json).getString("call_time");
			String cont_content = new JSONObject(json).getString("content");

			cont_self_dao.insCont_self(cont_user_idx, cont_pro_idx, cont_pro_name, cont_pro_option, cont_see_date,
					cont_name, cont_phone, cont_call_time, cont_content);

			// 문자전송

			String idx_arr[] = cont_pro_idx.split(",");
			String name_arr[] = cont_pro_name.split(",");
			String option_arr[] = cont_pro_option.split("@");
			String date_arr[] = cont_see_date.split("@");

			int studio_pay = 0;
			int dress_pay = 0;
			int makeup_pay = 0;
			int studio_dc = 0;
			int dress_dc = 0;
			int makeup_dc = 0;
			for (int z = 0; z < idx_arr.length; z++) {
				if (z == 0) {
					if (!"0".equals(idx_arr[z])) {
						List<Studio_vo> list_studio = studio_dao.selList_studio("1 and pro_idx = '" + idx_arr[z] + "'");
						String studio_option_arr[] = list_studio.get(0).getPro_composition().split("&&");
						String studio_price_arr[] = list_studio.get(0).getPro_composition_price().split("&&");
						String studio_dc_arr[] = list_studio.get(0).getPro_composition_dc().split("&&");

						for (int i = 0; i < studio_option_arr.length; i++) {
							if (studio_option_arr[i].replaceAll("\\+", " ")
									.equals(option_arr[z].replaceAll("\\+", " "))) {
								studio_pay += Integer.parseInt(studio_price_arr[i].replaceAll(",", ""));
								studio_dc += Integer.parseInt(studio_dc_arr[i].replaceAll(",", ""));
							}
						}
					}
				} else if (z == idx_arr.length - 1) {
					if (!"0".equals(idx_arr[z])) {
						List<Makeup_vo> list_makeup = makeup_dao.selList_makeup("1 and pro_idx = '" + idx_arr[z] + "'");
						String makeup_option_arr[] = list_makeup.get(0).getPro_composition().split("&&");
						String makeup_price_arr[] = list_makeup.get(0).getPro_composition_price().split("&&");
						String makeup_dc_arr[] = list_makeup.get(0).getPro_composition_dc().split("&&");

						for (int i = 0; i < makeup_option_arr.length; i++) {
							if (makeup_option_arr[i].replaceAll("\\+", " ")
									.equals(option_arr[z].replaceAll("\\+", " "))) {
								makeup_pay += Integer.parseInt(makeup_price_arr[i].replaceAll(",", ""));
								makeup_dc += Integer.parseInt(makeup_dc_arr[i].replaceAll(",", ""));
							}
						}
					}
				} else {
					if (!"0".equals(idx_arr[z])) {
						List<Dress_vo> list_dress = dress_dao.selList_dress("1 and pro_idx = '" + idx_arr[z] + "'");
						String dress_option_arr[] = list_dress.get(0).getPro_composition().split("&&");
						String dress_price_arr[] = list_dress.get(0).getPro_composition_price().split("&&");
						String dress_dc_arr[] = list_dress.get(0).getPro_composition_dc().split("&&");

						for (int i = 0; i < dress_option_arr.length; i++) {
							if (dress_option_arr[i].replaceAll("\\+", " ")
									.equals(option_arr[z].replaceAll("\\+", " "))) {
								dress_pay += Integer.parseInt(dress_price_arr[i].replaceAll(",", ""));
								dress_dc += Integer.parseInt(dress_dc_arr[i].replaceAll(",", ""));
							}
						}
					}
				}
			}

			DecimalFormat df = new DecimalFormat("#,###");
			String pay = df.format(studio_pay - studio_dc + dress_pay - dress_dc + makeup_pay - makeup_dc);

			String msg = "";
			msg += "▣ 스드메 직접예약 ▣";
			msg += "\n";
			msg += cont_name + " " + cont_phone;
			msg += "\n";
			for (int i = 0; i < name_arr.length; i++) {
				if (!"0".equals(name_arr[i])) {
					if (option_arr[i].indexOf("장]") > -1) {
						// msg += name_arr[i] +
						// option_arr[i].substring(0,option_arr[i].indexOf("장]")+2);
						msg += name_arr[i] + "\n" + option_arr[i];
					} else if (option_arr[i].indexOf("표]") > -1) {
						// msg += name_arr[i] +
						// option_arr[i].substring(0,option_arr[i].indexOf("표]")+2);
						msg += name_arr[i] + "\n" + option_arr[i];
					} else {
						// msg += name_arr[i] + option_arr[i].substring(0,option_arr[i].indexOf("]")+1);
						msg += name_arr[i] + "\n" + option_arr[i];
					}

					if (i == 0) {
						msg += "\n";
						if ("0".equals(date_arr[0])) {
							msg += "날짜선택 없음";
						} else {
							msg += date_arr[0];
						}
					} else if (i == name_arr.length - 1) {
						msg += "\n";
						if ("0".equals(date_arr[2])) {
							msg += "날짜선택 없음";
						} else {
							msg += date_arr[2];
						}
					} else {
						msg += "\n";
						if ("0".equals(date_arr[1])) {
							msg += "날짜선택 없음";
						} else {
							msg += date_arr[1];
						}
					}
					msg += "\n";
					msg += "\n";
				}
			}
			msg += "결제금액 : " + pay;
			msg += "\n";
			msg += "추가문의사항 : " + cont_content;
			Utils utils = new Utils();
			utils.sendSMS("1090095264", msg);
			utils.sendSMS("1041782958", msg);
			// 문자전송

			// //문자전송
			// Utils utils = new Utils();
			// utils.sendSMS("1090095264", "[웨딩큐] 스드메 직접예약 신청이 도착하였습니다.");
			// //문자전송

			mav.addObject("json", "9000");

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/selPro_package.pnp")
	public ModelAndView selPro_package(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/selPro_package");

		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int pack_idx = Integer.parseInt(new JSONObject(json).getString("pack_idx"));

			String query = "1 and pack_status = 'Y'";
			if (pack_idx != 0) {
				query += " and pack_idx = '" + pack_idx + "'";
			}

			List<Pro_package_vo> list = pro_package_dao.selPro_package(query);

			String return_json = "";
			return_json += "[";
			for (int i = 0; i < list.size(); i++) {
				if (i != 0) {
					return_json += ",";
				}
				int sample_cnt = sample_cnt(list.get(i).getPack_idx(), "package");
				return_json += "{";
				return_json += "\"img_cnt\":\"" + sample_cnt + "\",";
				return_json += "\"pack_idx\":\"" + list.get(i).getPack_idx() + "\",";
				return_json += "\"pack_sort\":\"" + list.get(i).getPack_sort() + "\",";
				return_json += "\"pack_name\":\"" + list.get(i).getPack_name() + "\",";
				return_json += "\"pack_pro_idx\":\"" + list.get(i).getPack_pro_idx() + "\",";
				return_json += "\"pack_pro_cate\":\"" + list.get(i).getPack_pro_cate() + "\",";
				return_json += "\"pack_pro_name\":\"" + list.get(i).getPack_pro_name() + "\",";
				return_json += "\"pack_pro_option\":\"" + list.get(i).getPack_pro_option() + "\",";
				return_json += "\"pack_pay\":\"" + list.get(i).getPack_pay() + "\",";
				return_json += "\"pack_people\":\"" + list.get(i).getPack_people() + "\",";
				return_json += "\"pack_cnt\":\"" + list.get(i).getPack_cnt() + "\",";
				return_json += "\"pack_end_date\":\"" + list.get(i).getPack_end_date() + "\",";
				return_json += "\"pack_end_date\":\"" + list.get(i).getPack_end_date() + "\"";
				return_json += "}";
			}
			return_json += "]";
			mav.addObject("json", return_json);

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/selPro_package2.pnp")
	public ModelAndView selPro_package2(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/selPro_package2");

		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int pack_idx = Integer.parseInt(new JSONObject(json).getString("pack_idx"));

			String query = "1 and pack_status = 'Y'";
			if (pack_idx != 0) {
				query += " and pack_idx = '" + pack_idx + "'";
			}

			List<Pro_package2_vo> list = pro_package2_dao.selPro_package2(query);

			String return_json = "";
			return_json += "[";
			for (int i = 0; i < list.size(); i++) {
				if (i != 0) {
					return_json += ",";
				}
				int sample_cnt = sample_cnt(list.get(i).getPack_idx(), "package");
				return_json += "{";
				return_json += "\"img_cnt\":\"" + sample_cnt + "\",";
				return_json += "\"pack_idx\":\"" + list.get(i).getPack_idx() + "\",";
				return_json += "\"pack_sort\":\"" + list.get(i).getPack_sort() + "\",";
				return_json += "\"pack_cate\":\"" + list.get(i).getPack_cate() + "\",";
				return_json += "\"pack_name\":\"" + list.get(i).getPack_name() + "\",";
				return_json += "\"pack_pro_idx\":\"" + list.get(i).getPack_pro_idx() + "\",";
				return_json += "\"pack_pro_name\":\"" + list.get(i).getPack_pro_name() + "\",";
				return_json += "\"pack_pro_option\":\"" + list.get(i).getPack_pro_option() + "\",";
				return_json += "\"pack_submit_date\":\"" + list.get(i).getPack_pro_option() + "\"";
				return_json += "}";
			}
			return_json += "]";
			mav.addObject("json", return_json);

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/delSee_sdm.pnp")
	public ModelAndView delSee_sdm(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/delSee_sdm");

		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int see_user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));

			see_sdm_dao.delSee_sdm(see_user_idx);

			mav.addObject("json", "9000");

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/getSorry.pnp")
	public ModelAndView getSorry(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/getSorry");

		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			String pro_idx = new JSONObject(json).getString("pro_idx");
			String pro_idx_arr[] = pro_idx.split("@");

			String change_date = "";
			String sorry_pay = "";

			for (int i = 0; i < pro_idx_arr.length; i++) {
				if (i == 0) {
					if (!"0".equals(pro_idx_arr[i]) && !"-1".equals(pro_idx_arr[i])) {
						List<Studio_vo> list = studio_dao.selList_studio("1 and pro_idx = '" + pro_idx_arr[i] + "'");
						change_date += list.get(0).getPro_change_date();
						sorry_pay += list.get(0).getPro_sorry_pay();
					} else {
						change_date += "null";
						sorry_pay += "null";
					}
				} else if (i == pro_idx_arr.length - 1) {
					if (!"0".equals(pro_idx_arr[i]) && !"-1".equals(pro_idx_arr[i])) {
						List<Makeup_vo> list = makeup_dao.selList_makeup("1 and pro_idx = '" + pro_idx_arr[i] + "'");
						change_date += "@" + list.get(0).getPro_change_date();
						sorry_pay += "@" + list.get(0).getPro_sorry_pay();
					} else {
						change_date += "@null";
						sorry_pay += "@null";
					}
				} else {
					if (!"0".equals(pro_idx_arr[i]) && !"-1".equals(pro_idx_arr[i])) {
						List<Dress_vo> list = dress_dao.selList_dress("1 and pro_idx = '" + pro_idx_arr[i] + "'");
						change_date += "@" + list.get(0).getPro_change_date();
						sorry_pay += "@" + list.get(0).getPro_sorry_pay();
					} else {
						change_date += "@null";
						sorry_pay += "@null";
					}
				}
			}
			String return_json = "";

			return_json += "[";
			return_json += "{";
			return_json += "\"pro_idx\":\"" + pro_idx + "\",";
			return_json += "\"change_date\":\"" + change_date + "\",";
			return_json += "\"sorry_pay\":\"" + sorry_pay + "\"";
			return_json += "}";
			return_json += "]";

			mav.addObject("json", return_json);

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/getPaydate_sdm.pnp")
	public ModelAndView getPaydate_sdm(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/getPaydate_sdm");

		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));

			List<Message_vo> list = message_dao.getMessage(user_idx);

			String submit_date = "";
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getMsg_content().indexOf("결제를 진행해주세요") > -1) {
					submit_date = list.get(i).getMsg_submit_date();
				}
			}

			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
			Date date = sdf.parse(submit_date);

			// 날짜 더하기
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			cal.add(Calendar.DATE, 2);

			mav.addObject("json", sdf.format(cal.getTime()));

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/sendPayment_sdm.pnp")
	public ModelAndView sendPayment_sdm(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/sendPayment_sdm");

		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));

			List<Payment_sdm_vo> list = payment_sdm_dao
					.selPayment_sdm("1 and pm_user_idx = '" + user_idx + "' and pm_status like '결제%'");

			// 예약완료된거 찾기

			List<See_sdm_vo> list_his = see_sdm_dao
					.selSee_sdm("1 and see_user_idx = '" + user_idx + "' order by see_idx desc");
			String studio_date = "";
			String dress_date = "";
			String makeup_date = "";
			for (int i = 0; i < list_his.size(); i++) {
				if (!"".equals(list_his.get(i).getSee_confirm_date())
						&& list_his.get(i).getSee_confirm_date() != null) {
					String con_arr[] = list_his.get(i).getSee_confirm_date().split("@");
					for (int j = 0; j < con_arr.length; j++) {
						if (j == 0) {
							if (con_arr[j].indexOf("완료") > -1) {
								if ("".equals(studio_date)) {
									String date_result = con_arr[j].replace("(예약완료)", "");
									date_result = date_result.substring(0, 4) + "년 " + date_result.substring(4, 6)
											+ "월 " + date_result.substring(6, 8) + "일 " + date_result.substring(8, 10)
											+ "시" + date_result.substring(10, 12) + "분";
									studio_date = date_result;
								}
							}
						} else if (j == con_arr.length - 1) {
							if (con_arr[j].indexOf("완료") > -1) {
								if ("".equals(makeup_date)) {
									String date_result = con_arr[j].replace("(예약완료)", "");
									date_result = date_result.substring(0, 4) + "년 " + date_result.substring(4, 6)
											+ "월 " + date_result.substring(6, 8) + "일 " + date_result.substring(8, 10)
											+ "시" + date_result.substring(10, 12) + "분";
									makeup_date = date_result;
								}
							}
						} else {
							if (con_arr[j].indexOf("완료") > -1) {
								if ("".equals(dress_date)) {
									String date_result = con_arr[j].replace("(예약완료)", "");
									date_result = date_result.substring(0, 4) + "년 " + date_result.substring(4, 6)
											+ "월 " + date_result.substring(6, 8) + "일 " + date_result.substring(8, 10)
											+ "시" + date_result.substring(10, 12) + "분";
									dress_date += date_result;
								}
							}
						}
					}
				}
			}

			// 예약완료된거 찾기

			List<See_sdm_vo> list_sdm = see_sdm_dao
					.selSee_sdm("1 and see_user_idx = '" + user_idx + "' and see_status != '견적신청'");

			String user_schedule = "";

			if (list_sdm.size() > 0) {
				for (int i = 0; i < list_sdm.size(); i++) {
					if (!"".equals(list_sdm.get(i).getSee_schedule()) && list_sdm.get(i).getSee_schedule() != null) {
						user_schedule = list_sdm.get(i).getSee_schedule();
					}
				}
			}

			if (list.size() > 0) {
				String msg = "[웨딩큐 결제정보]\n";
				msg += "입금은행 : " + list.get(0).getPm_pay_engine() + "\n";
				msg += "계좌번호 : " + list.get(0).getPm_pay_number() + "\n";
				msg += "예금주 : " + list.get(0).getPm_pay_name() + "\n";
				msg += "입금금액 : " + list.get(0).getPm_pay() + "\n";
				msg += "입금자명 : " + list.get(0).getPm_send_name() + "\n";
				msg += "입금기한 : " + list.get(0).getPm_pay_date() + "\n";
				msg += "\n";
				msg += "상품명 : " + list.get(0).getPm_pro_name() + "\n";
				if (!"0".equals(list.get(0).getPm_studio())) {
					msg += "스튜디오\n" + list.get(0).getPm_studio() + "\n";
				}
				msg += studio_date + "\n";
				msg += "드레스\n" + list.get(0).getPm_dress() + "\n";
				msg += dress_date + "\n";
				msg += "메이크업\n" + list.get(0).getPm_makeup() + "\n";
				msg += makeup_date + "\n";
				msg += "\n";
				msg += "결혼예정일\n";
				msg += user_schedule + "\n";
				msg += "\n";
				msg += "*입금기한내 미입금시 일정예약이 모두 자동 취소됩니다.\n";
				msg += "*입금자명을 동일하게 입금해주세요.";

				// 문자전송
				Utils utils = new Utils();
				List<User2_vo> list_user = user2_dao.selList_user("1 and user_idx = '" + user_idx + "'");
				String user_phone = utils.decode(list_user.get(0).getUser_phone());
				user_phone = user_phone.substring(1, user_phone.length());
				utils.sendSMS(user_phone, msg);
				// 문자전송

				mav.addObject("json", "9000");
			} else {
				mav.addObject("json", "9001");
			}

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/upEmail.pnp")
	public ModelAndView upEmail(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/upEmail");

		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));
			String user_email = new JSONObject(json).getString("user_email");

			user2_dao.upEmail(user_idx, user_email);

			mav.addObject("json", "9000");

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/insPayment_sdm.pnp")
	public ModelAndView insPayment_sdm(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/insPayment_sdm");

		try {
			String json = request.getParameter("json");
			// json = new String(json.getBytes("8859_1"), "UTF-8"); //테스트시에 사용
			int pm_user_idx = Integer.parseInt(new JSONObject(json).getString("user_idx"));
			String pm_user_gender = new JSONObject(json).getString("user_gender");
			String pm_m_name = new JSONObject(json).getString("m_name");
			String pm_m_phone = new JSONObject(json).getString("m_phone");
			String pm_w_name = new JSONObject(json).getString("w_name");
			String pm_w_phone = new JSONObject(json).getString("w_phone");
			String pm_pro_name = new JSONObject(json).getString("pro_name");
			String pm_studio = new JSONObject(json).getString("studio");
			String pm_dress = new JSONObject(json).getString("dress");
			String pm_addpay = new JSONObject(json).getString("addpay");
			String pm_makeup = new JSONObject(json).getString("makeup");
			String pm_pay = new JSONObject(json).getString("pay");
			String pm_remain = new JSONObject(json).getString("remain");
			String pm_dc = new JSONObject(json).getString("dc");
			String pm_pay_engine = new JSONObject(json).getString("pay_engine");
			String pm_pay_number = new JSONObject(json).getString("pay_number");
			String pm_pay_name = new JSONObject(json).getString("pay_name");
			String pm_pay_date = new JSONObject(json).getString("pay_date");
			String pm_send_name = new JSONObject(json).getString("send_name");
			String pm_rece = new JSONObject(json).getString("rece");
			String pm_rece_engine = new JSONObject(json).getString("rece_engine");
			String pm_rece_number = new JSONObject(json).getString("rece_number");

			payment_sdm_dao.insPayment_sdm(pm_user_idx, pm_user_gender, pm_m_name, pm_m_phone, pm_w_name, pm_w_phone,
					pm_pro_name, pm_studio, pm_dress, pm_addpay, pm_makeup, pm_pay, pm_remain, pm_dc, pm_pay_engine,
					pm_pay_number, pm_pay_name, pm_pay_date, pm_send_name, pm_rece, pm_rece_engine, pm_rece_number);

			String msg_phone = "";

			if ("M".equals(pm_user_gender)) {
				msg_phone = pm_m_phone;
			} else {
				msg_phone = pm_w_phone;
			}
			msg_phone = msg_phone.substring(1, msg_phone.length());
			// 문자전송
			Utils utils = new Utils();
			utils.sendSMS(msg_phone, "[웨딩큐] " + pm_pay_date + "까지 " + pm_pay_engine + " (주)웨딩큐 [" + pm_pay_number
					+ "]로 " + pm_pay + "원을 [" + pm_send_name + "]이름으로 입금해주세요. 입금기한내 미입금시 일정예약이 모두 자동취소 됩니다.");
			// 문자전송

			// 첫번째 견적을 결제진행중으로 변경
			List<See_sdm_vo> list = see_sdm_dao.selSee_sdm("1 and see_user_idx = '" + pm_user_idx + "'");
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
			see_sdm_dao.upSee_status_sdm(list.get(0).getSee_idx(), "&&결제진행중_" + sdf.format(now), "결제진행중");
			// 첫번째 견적을 결제진행중으로 변경

			mav.addObject("json", "9000");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			mav.addObject("json", "9001");
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/finish_sdm.pnp")
	public ModelAndView finish_sdm(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/finish_sdm");

		int see_idx = Integer.parseInt(request.getParameter("finish_idx"));
		int see_user_idx = Integer.parseInt(request.getParameter("finish_user_idx"));
		int finish_cnt = Integer.parseInt(request.getParameter("finish_cnt"));
		String see_status = request.getParameter("finish_status");
		String see_history = "";
		String see_pro_name[] = request.getParameter("finish_pro_name").split(",");

		String msgStatus = "";
		if (request.getParameter("finish_status").indexOf("재") > -1) {
			msgStatus = "재완료";
		} else if (request.getParameter("finish_status").indexOf("변경") > -1) {
			msgStatus = "변경완료";
		} else {
			msgStatus = "예약완료";
		}

		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

		if (finish_cnt == 0) {
			see_history += "&&" + see_pro_name[finish_cnt] + " 스튜디오 " + msgStatus + "_" + sdf.format(now);
			if (see_status.indexOf("변경") > -1) {
				message_dao.insMessage(see_idx, see_user_idx, see_pro_name[finish_cnt] + "의 촬영일정이 변경되었습니다");
				send_push(see_user_idx, "웨딩큐", see_pro_name[finish_cnt] + "의 촬영일정이 변경되었습니다");
			} else {
				message_dao.insMessage(see_idx, see_user_idx, see_pro_name[finish_cnt] + "의 촬영일정이 예약되었습니다");
				send_push(see_user_idx, "웨딩큐", see_pro_name[finish_cnt] + "의 촬영일정이 예약되었습니다");
			}
		} else if (finish_cnt == see_pro_name.length - 1) {
			see_history += "&&" + see_pro_name[finish_cnt] + " 메이크업 " + msgStatus + "_" + sdf.format(now);
			if (see_status.indexOf("변경") > -1) {
				message_dao.insMessage(see_idx, see_user_idx, see_pro_name[finish_cnt] + "의 상담일정이 변경되었습니다");
				send_push(see_user_idx, "웨딩큐", see_pro_name[finish_cnt] + "의 상담일정이 변경되었습니다");
			} else {
				message_dao.insMessage(see_idx, see_user_idx, see_pro_name[finish_cnt] + "의 상담일정이 예약되었습니다");
				send_push(see_user_idx, "웨딩큐", see_pro_name[finish_cnt] + "의 상담일정이 예약되었습니다");
			}
		} else {
			see_history += "&&" + see_pro_name[finish_cnt] + " 드레스 " + msgStatus + "_" + sdf.format(now);
			if (see_status.indexOf("변경") > -1) {
				message_dao.insMessage(see_idx, see_user_idx, see_pro_name[finish_cnt] + "의 피팅일정이 변경되었습니다");
				send_push(see_user_idx, "웨딩큐", see_pro_name[finish_cnt] + "의 피팅일정이 변경되었습니다");
			} else {
				message_dao.insMessage(see_idx, see_user_idx, see_pro_name[finish_cnt] + "의 피팅일정이 예약되었습니다");
				send_push(see_user_idx, "웨딩큐", see_pro_name[finish_cnt] + "의 피팅일정이 예약되었습니다");
			}
		}

		List<See_sdm_vo> list = see_sdm_dao.selSee_sdm("1 and see_idx = '" + see_idx + "'");

		String see_confirm_date = "";
		String confirm_date_arr[] = list.get(0).getSee_confirm_date().split("@");
		confirm_date_arr[finish_cnt] += "(예약완료)";

		boolean isFinish = true;
		for (int i = 0; i < confirm_date_arr.length; i++) {
			if (i != 0) {
				see_confirm_date += "@";
			}
			see_confirm_date += confirm_date_arr[i];

			if (confirm_date_arr[i].indexOf("예약완료") == -1 && !"0".equals(see_pro_name[i])) {
				isFinish = false;
			}
		}

		if (isFinish) {
			if (request.getParameter("finish_status").indexOf("재") > -1) {
				see_status = "재완료";
			} else if (request.getParameter("finish_status").indexOf("변경") > -1) {
				see_status = "변경완료";
			} else {
				see_status = "예약완료";
			}
		}
		see_sdm_dao.upSee_confirm_date(see_idx, see_history, see_status, see_confirm_date);

		return mav;
	}

	@RequestMapping("/payment_sdm.pnp")
	public ModelAndView payment_sdm(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/payment_sdm");

		try {
			int user_idx = Integer.parseInt(request.getParameter("payment_user_idx"));

			message_dao.insMessage(0, user_idx, "스드메 일정 예약이 모두 완료되었습니다<br>결제를 진행해주세요");
			send_push(user_idx, "웨딩큐", "스드메 일정 예약이 모두 완료되었습니다<br>결제를 진행해주세요");

			// 첫번째 견적을 결제완료로 변경
			List<See_sdm_vo> list = see_sdm_dao
					.selSee_sdm("1 and see_user_idx = '" + user_idx + "' and see_status != '견적신청'");
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
			see_sdm_dao.upSee_status_sdm(list.get(0).getSee_idx(), "&&결제요청_" + sdf.format(now), "결제요청");
			// 첫번째 견적을 결제완료로 변경
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
		}

		return mav;
	}

	@RequestMapping("/payment_comple_sdm.pnp")
	public ModelAndView payment_comple_sdm(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/payment_comple_sdm");

		try {
			int user_idx = Integer.parseInt(request.getParameter("payment_comple_user_idx"));

			message_dao.insMessage(0, user_idx, "스드메 결제가 완료되었습니다.<br>스드메 계약내용을 확인해보세요.");
			message_dao.insMessage(0, user_idx, "캐쉬백이 적립되었습니다<br>적립된 캐쉬백 내역을 확인해보세요");
			send_push(user_idx, "웨딩큐", "스드메 결제가 완료되었습니다.<br>스드메 계약내용을 확인해보세요.");

			// 첫번째 견적을 결제완료로 변경
			List<See_sdm_vo> list = see_sdm_dao.selSee_sdm("1 and see_user_idx = '" + user_idx + "'");
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
			see_sdm_dao.upSee_status_sdm(list.get(0).getSee_idx(), "&&결제완료_" + sdf.format(now), "결제완료");
			// 첫번째 견적을 결제완료로 변경

			payment_sdm_dao.upStatus_pm(user_idx, "결제완료");
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
		}

		return mav;
	}

	@RequestMapping("/est_res.pnp")
	public ModelAndView est_res(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/est_res");

		String est_res_date = request.getParameter("est_res_date1") + request.getParameter("est_res_date2")
				+ request.getParameter("est_res_date3");

		String res_cate = request.getParameter("res_cate");
		int res_idx = Integer.parseInt(request.getParameter("res_idx"));
		if ("hall".equals(res_cate)) {
			est_hall_dao.upEst_res_hall(res_idx, est_res_date);
		}
		return mav;
	}

	@RequestMapping("/stats_shop.pnp")
	public ModelAndView stats_shop(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/stats_shop");

		String query = "1";

		String cate = "";
		String search_val = "";
		if (!"".equals(request.getParameter("search_val")) && request.getParameter("search_val") != null) {
			search_val = request.getParameter("search_val");
			query += " and stats_pro_name like '%" + search_val + "%'";
			mav.addObject("search_val", search_val);
		}
		if (!"".equals(request.getParameter("cate")) && request.getParameter("cate") != null) {
			cate = request.getParameter("cate");
			query += " and stats_type like '%" + cate + "%'";
			mav.addObject("cate", cate);
		}

		List<Stats_shop_vo> list_size = stats_shop_dao.selStats_shop(query);

		int page = 1;
		if (!"".equals(request.getParameter("page")) && request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		int page1 = page * 15 - 15;
		int ten = page - (page % 10);

		if (page % 10 == 0) // 10, 20페이지 눌렀는데 넘어가면 안되니까~ 처리!
		{
			mav.addObject("list_size1", ten - 9);
			mav.addObject("list_size2", ten);
			if (ten < list_size.size() / 15 + 1) {
				mav.addObject("next", "next");
			} else {
				mav.addObject("next", "done");
			}
		} else {
			mav.addObject("list_size1", ten + 1);
			if (ten + 10 > list_size.size() / 15 + 1) {
				mav.addObject("list_size2", list_size.size() / 15 + 1);
				mav.addObject("next", "done");
			} else {
				mav.addObject("list_size2", ten + 10);
				mav.addObject("next", "next");
			}

		}
		mav.addObject("list_size", list_size.size() / 15 + 1);
		mav.addObject("page", page);

		String sort_val = "stats_idx";

		String sort_type = "";
		if (!"".equals(request.getParameter("sort_val")) && request.getParameter("sort_val") != null) {
			sort_type = request.getParameter("sort_type");
			sort_val = request.getParameter("sort_val");
			query += " order by " + sort_val + " " + sort_type;
		}

		query += " limit " + page1 + ",15";

		List<Stats_shop_vo> list = stats_shop_dao.selStats_shop(query);

		mav.addObject("list", list);
		mav.addObject("max_page", list_size.size());
		mav.addObject("sort_type", sort_type);
		mav.addObject("sort_val", sort_val);

		return mav;
	}

	@RequestMapping("/stats_point.pnp")
	public ModelAndView stats_point(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/stats_point");

		String query = "1";

		List<Stats_point_vo> list = stats_point_dao.selStats_point(query);

		int btn1 = 0;
		int btn2 = 0;
		int btn3 = 0;
		int btn4 = 0;
		int btn5 = 0;
		int btn6 = 0;

		for (int i = 0; i < list.size(); i++) {
			if ("도움됨".equals(list.get(i).getStats_btn())) {
				btn1++;
			} else if ("도움안됨".equals(list.get(i).getStats_btn())) {
				btn2++;
			} else if ("예".equals(list.get(i).getStats_btn())) {
				btn3++;
			} else if ("아니요".equals(list.get(i).getStats_btn())) {
				btn4++;
			} else if ("취소".equals(list.get(i).getStats_btn())) {
				btn5++;
			} else {
				btn6++;
			}
		}

		mav.addObject("btn1", btn1);
		mav.addObject("btn2", btn2);
		mav.addObject("btn3", btn3);
		mav.addObject("btn4", btn4);
		mav.addObject("btn5", btn5);
		mav.addObject("btn6", btn6);
		mav.addObject("list", list);

		return mav;
	}

	@RequestMapping("/stats_pro.pnp")
	public ModelAndView stats_pro(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/stats_pro");

		String query = "1";

		String cate = "";
		String search_val = "";
		if (!"".equals(request.getParameter("search_val")) && request.getParameter("search_val") != null) {
			search_val = request.getParameter("search_val");
			query += " and stats_pro_name like '%" + search_val + "%'";
			mav.addObject("search_val", search_val);
		}
		if (!"".equals(request.getParameter("cate")) && request.getParameter("cate") != null) {
			cate = request.getParameter("cate");
			query += " and stats_type like '%" + cate + "%'";
			mav.addObject("cate", cate);
		}

		List<Stats_pro_vo> list_size = stats_pro_dao.selStats_pro(query);

		int page = 1;
		if (!"".equals(request.getParameter("page")) && request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		int page1 = page * 15 - 15;
		int ten = page - (page % 10);

		if (page % 10 == 0) // 10, 20페이지 눌렀는데 넘어가면 안되니까~ 처리!
		{
			mav.addObject("list_size1", ten - 9);
			mav.addObject("list_size2", ten);
			if (ten < list_size.size() / 15 + 1) {
				mav.addObject("next", "next");
			} else {
				mav.addObject("next", "done");
			}
		} else {
			mav.addObject("list_size1", ten + 1);
			if (ten + 10 > list_size.size() / 15 + 1) {
				mav.addObject("list_size2", list_size.size() / 15 + 1);
				mav.addObject("next", "done");
			} else {
				mav.addObject("list_size2", ten + 10);
				mav.addObject("next", "next");
			}

		}
		mav.addObject("list_size", list_size.size() / 15 + 1);
		mav.addObject("page", page);

		String sort_val = "stats_cnt";

		String sort_type = "desc";
		if (!"".equals(request.getParameter("sort_val")) && request.getParameter("sort_val") != null) {
			sort_type = request.getParameter("sort_type");
			sort_val = request.getParameter("sort_val");
		}

		query += " order by " + sort_val + " " + sort_type;
		query += " limit " + page1 + ",15";

		List<Stats_pro_vo> list = stats_pro_dao.selStats_pro(query);

		mav.addObject("list", list);
		mav.addObject("max_page", list_size.size());
		mav.addObject("sort_type", sort_type);
		mav.addObject("sort_val", sort_val);

		return mav;
	}

	@RequestMapping("/stats_package.pnp")
	public ModelAndView stats_package(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/stats_package");

		String query = "1";

		String search_val = "";
		if (!"".equals(request.getParameter("search_val")) && request.getParameter("search_val") != null) {
			search_val = request.getParameter("search_val");
			query += " and stats_pro_name like '%" + search_val + "%'";
			mav.addObject("search_val", search_val);
		}

		List<Stats_package_vo> list_size = stats_package_dao.selStats_package(query);

		int page = 1;
		if (!"".equals(request.getParameter("page")) && request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		int page1 = page * 15 - 15;
		int ten = page - (page % 10);

		if (page % 10 == 0) // 10, 20페이지 눌렀는데 넘어가면 안되니까~ 처리!
		{
			mav.addObject("list_size1", ten - 9);
			mav.addObject("list_size2", ten);
			if (ten < list_size.size() / 15 + 1) {
				mav.addObject("next", "next");
			} else {
				mav.addObject("next", "done");
			}
		} else {
			mav.addObject("list_size1", ten + 1);
			if (ten + 10 > list_size.size() / 15 + 1) {
				mav.addObject("list_size2", list_size.size() / 15 + 1);
				mav.addObject("next", "done");
			} else {
				mav.addObject("list_size2", ten + 10);
				mav.addObject("next", "next");
			}

		}
		mav.addObject("list_size", list_size.size() / 15 + 1);
		mav.addObject("page", page);

		String sort_val = "stats_cnt";

		String sort_type = "desc";
		if (!"".equals(request.getParameter("sort_val")) && request.getParameter("sort_val") != null) {
			sort_type = request.getParameter("sort_type");
			sort_val = request.getParameter("sort_val");
		}

		query += " order by " + sort_val + " " + sort_type;
		query += " limit " + page1 + ",15";

		List<Stats_package_vo> list = stats_package_dao.selStats_package(query);

		mav.addObject("list", list);
		mav.addObject("max_page", list_size.size());
		mav.addObject("sort_type", sort_type);
		mav.addObject("sort_val", sort_val);

		return mav;
	}

	@RequestMapping("/sendNotice.pnp")
	public ModelAndView sendNotice(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/sendNotice");

		return mav;
	}

	@RequestMapping("/sendNotice_output.pnp")
	public ModelAndView sendNotice_output(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/sendNotice_output");

		try {
			String send_content = request.getParameter("send_content");
			String send_title = request.getParameter("send_title");
			String all_user = request.getParameter("all_user");

			if ("on".equals(all_user)) {
				List<User2_vo> list = user2_dao.selList_user("1");

				for (int i = 0; i < list.size(); i++) {
					if ("메세지".equals(request.getParameter("send_type"))) {
						message_dao.insMessage_notice(-1, list.get(i).getUser_idx(), send_content, "전체");
					} else if ("푸쉬".equals(request.getParameter("send_type"))) {
						send_push(list.get(i).getUser_idx(), "웨딩큐 " + send_title, send_content);
					}
				}
			} else {
				int user_idx = Integer.parseInt(request.getParameter("user_idx"));

				if ("메세지".equals(request.getParameter("send_type"))) {
					message_dao.insMessage_notice(-1, user_idx, send_content, "개인");
				} else if ("푸쉬".equals(request.getParameter("send_type"))) {
					send_push(user_idx, "웨딩큐 " + send_title, send_content);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("err", "err");
		}

		return mav;
	}
	// 끝

	// 캐쉬백 알아오는 메소드
	public String userCashback(int user_idx) {
		int sdm_cashback = 0;
		int hall_cashback = 0;

		// 스드메 캐쉬백
		List<Payment_sdm_vo> list_sdm = payment_sdm_dao.selPayment_sdm(
				"1 and pm_user_idx = '" + user_idx + "' and pm_status like '결제완료%' and pm_status not like '%출금완료%'");

		if (list_sdm.size() > 0) {
			// sdm_cashback =
			// Integer.parseInt(list_sdm.get(0).getPm_cashback().replaceAll(",", ""));
		}
		// 스드메 캐쉬백

		// 웨딩홀 캐쉬백
		try {
			List<Est_hall_vo> list_hall = est_hall_dao.selEst_hall("1 and est_user_idx = '" + user_idx + "'");

			for (int i = 0; i < list_hall.size(); i++) {
				String est_product = list_hall.get(i).getEst_product();

				if (!"".equals(est_product) && est_product != null) {
					JSONArray jarr = new JSONArray(est_product);
					for (int j = 0; j < jarr.length(); j++) {
						if (jarr.getJSONObject(j).getString("est_status").indexOf("on") > -1) {
							int est_people = Integer.parseInt(list_hall.get(i).getEst_people());
							hall_cashback = est_people
									* Integer.parseInt(jarr.getJSONObject(j).getString("est_cashback"));
						}
					}
				}
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		// 웨딩홀 캐쉬백
		return hall_cashback + "/" + sdm_cashback;
	}

	// 캐쉬백 알아오는 메소드

	// 메소드 시작 검색포인트

	String matching_arr_hall[] = { "6", "7", "8", "10" };
	String matching_arr_studio[] = { "16", "17", "46" };
	String matching_arr_dress[] = { "20", "46" };
	String matching_arr_makeup[] = { "23", "46" };
	String matching_arr_suit[] = { "26", "28", "29" };
	String matching_arr_korea[] = { "30", "32", "34" };
	String matching_arr_jewelry[] = { "35", "38" };
	String matching_arr_pb[] = { "44" };

	public String pro_select(int user_idx, String type, String query, String align, int page, int cnt) // 리턴할 상품 갯수
	{
		if ("rand".equals(align)) {
			align = "order by rand()";
		} else if ("new".equals(align)) {
			align = "order by pro_sort";
		} else if ("korea".equals(align)) {
			align = "order by pro_name";
		} else if ("hits".equals(align)) {
			align = "order by pro_hits";
		} else if ("price".equals(align)) {
			align = "order by CAST(REPLACE(SUBSTRING_INDEX(pro_composition_price, '&&', 1), ',', '') AS signed integer)";
		} else if ("new_desc".equals(align)) {
			align = "order by pro_sort desc";
		} else if ("korea_desc".equals(align)) {
			align = "order by pro_name desc";
		} else if ("hits_desc".equals(align)) {
			align = "order by pro_hits desc";
		} else if ("price_desc".equals(align)) {
			align = "order by CAST(REPLACE(SUBSTRING_INDEX(pro_composition_price, '&&', 1), ',', '') AS signed integer) desc";
		} else if ("matching".equals(align)) {
			align = "matching";
		} else {
			align = "order by pro_sort";
		}

		String return_json = "";

		ArrayList result_arr = new ArrayList();
		if ("hall".equals(type)) {
			List<Hall_vo> list_size = hall_dao.selList_hall(query);
			String sel_query = "";
			if (!"matching".equals(align)) {
				sel_query = query + " " + align + " limit " + ((page - 1) * cnt) + "," + cnt;
			} else {
				sel_query = query;
			}
			List<Hall_vo> list = hall_dao.selList_hall(sel_query);
			for (int i = 0; i < list.size(); i++) {
				int sample_cnt = sample_cnt(list.get(i).getPro_idx(), type);
				String scrap_yn = scrap_yn(user_idx, type, list.get(i).getPro_idx());
				String matching_data[] = matching_data(user_idx, type, list.get(i).getPro_idx()).split("&&");
				int matching_point = Integer.parseInt(matching_data[0]);
				String matching_obj = "";

				for (int z = 1; z < matching_data.length; z++) {
					if (z != 1) {
						matching_obj += "&&";
					}
					matching_obj += matching_data[z];
				}
				// *********************************make json
				// return******************************************
				return_json += "{";
				return_json += "\"img_cnt\":\"" + sample_cnt + "\",";
				return_json += "\"pro_idx\":\"" + list.get(i).getPro_idx() + "\",";
				return_json += "\"pro_sort\":\"" + list.get(i).getPro_sort() + "\",";
				return_json += "\"pro_category\":\"" + list.get(i).getPro_category() + "\",";
				return_json += "\"pro_name\":\"" + list.get(i).getPro_name() + "\",";
				return_json += "\"pro_com_name\":\"" + list.get(i).getPro_com_name() + "\",";
				return_json += "\"pro_homepage\":\"" + list.get(i).getPro_homepage() + "\",";
				return_json += "\"pro_tel\":\"" + list.get(i).getPro_tel() + "\",";
				return_json += "\"pro_zipcode\":\"" + list.get(i).getPro_zipcode() + "\",";
				return_json += "\"pro_addr1\":\"" + list.get(i).getPro_addr1() + "\",";
				return_json += "\"pro_addr2\":\"" + list.get(i).getPro_addr2() + "\",";
				return_json += "\"pro_subway1\":\"" + list.get(i).getPro_subway1() + "\",";
				return_json += "\"pro_subway2\":\"" + list.get(i).getPro_subway2() + "\",";
				return_json += "\"pro_subway3\":\"" + list.get(i).getPro_subway3() + "\",";
				return_json += "\"pro_bus\":\"" + list.get(i).getPro_bus() + "\",";
				return_json += "\"pro_intro1\":\"" + list.get(i).getPro_intro1() + "\",";
				return_json += "\"pro_intro2\":\"" + list.get(i).getPro_intro2() + "\",";
				return_json += "\"pro_type\":\"" + list.get(i).getPro_type() + "\",";
				return_json += "\"pro_wedding_type\":\"" + list.get(i).getPro_wedding_type() + "\",";
				return_json += "\"pro_wedding_time\":\"" + list.get(i).getPro_wedding_time() + "\",";
				return_json += "\"pro_hall_seat\":\"" + list.get(i).getPro_hall_seat() + "\",";
				return_json += "\"pro_party_seat\":\"" + list.get(i).getPro_party_seat() + "\",";
				return_json += "\"pro_person\":\"" + list.get(i).getPro_person() + "\",";
				return_json += "\"pro_parking\":\"" + list.get(i).getPro_parking() + "\",";
				return_json += "\"pro_talk_time\":\"" + list.get(i).getPro_talk_time() + "\",";
				return_json += "\"pro_menu\":\"" + list.get(i).getPro_menu() + "\",";
				return_json += "\"pro_eat_pay\":\"" + list.get(i).getPro_eat_pay() + "\",";
				return_json += "\"pro_other_pay\":\"" + list.get(i).getPro_other_pay() + "\",";
				return_json += "\"pro_rent_pay\":\"" + list.get(i).getPro_rent_pay() + "\",";
				return_json += "\"pro_basic_option\":\"" + list.get(i).getPro_basic_option() + "\",";
				return_json += "\"pro_essential_option\":\"" + list.get(i).getPro_essential_option() + "\",";
				return_json += "\"pro_essential_option_pay\":\"" + list.get(i).getPro_essential_option_pay() + "\",";
				return_json += "\"pro_menu_type\":\"" + list.get(i).getPro_menu_type() + "\",";
				return_json += "\"pro_menu_name\":\"" + list.get(i).getPro_menu_name() + "\",";
				return_json += "\"pro_menu_pay\":\"" + list.get(i).getPro_menu_pay() + "\",";
				return_json += "\"pro_charge1\":\"" + list.get(i).getPro_charge1() + "\",";
				return_json += "\"pro_charge2\":\"" + list.get(i).getPro_charge2() + "\",";
				return_json += "\"pro_charge3\":\"" + list.get(i).getPro_charge3() + "\",";
				return_json += "\"scrap\":\"" + scrap_yn + "\",";
				return_json += "\"matching_point\":\""
						+ Math.round(matching_point * 5 / (double) matching_arr_hall.length) + "\",";
				return_json += "\"matching_obj\":\"" + matching_obj + "\",";
				return_json += "\"count\":\"" + list_size.size() + "\"";
				return_json += "}";
				result_arr.add(return_json);
				return_json = "";
				// *********************************make json
				// return******************************************
			}
			if (!"matching".equals(align)) {
				return_json = "["; // 초기화
				for (int i = 0; i < result_arr.size(); i++) {
					if (i != 0) {
						return_json += ",";
					}
					return_json += result_arr.get(i);
				}
				return_json += "]";
			} else {
				int add_cnt = 0;
				for (int i = 5; i >= 0; i--) // 5점만점이니까
				{
					for (int j = 0; j < result_arr.size(); j++) {
						String matching_result = (String) result_arr.get(j);
						int pro_point = Integer
								.parseInt(matching_result.substring(matching_result.indexOf("matching_point") + 17,
										matching_result.indexOf("matching_point") + 18));
						if (pro_point == i) {
							if (((page - 1) * cnt <= add_cnt) && (page * cnt > add_cnt)) {
								return_json += "," + matching_result;
							}
							add_cnt++;
						}
					}
				}
				if (return_json.length() > 0) {
					return_json = return_json.substring(1, return_json.length());
				}
				return_json = "[" + return_json + "]";
			}
		} else if ("studio".equals(type)) {
			List<Studio_vo> list_size = studio_dao.selList_studio(query);
			String sel_query = "";
			if (!"matching".equals(align)) {
				sel_query = query + " " + align + " limit " + ((page - 1) * cnt) + "," + cnt;
			} else {
				sel_query = query;
			}
			List<Studio_vo> list = studio_dao.selList_studio(sel_query);
			for (int i = 0; i < list.size(); i++) {
				int sample_cnt = sample_cnt(list.get(i).getPro_idx(), type);
				String scrap_yn = scrap_yn(user_idx, type, list.get(i).getPro_idx());
				String matching_data[] = matching_data(user_idx, type, list.get(i).getPro_idx()).split("&&");
				int matching_point = Integer.parseInt(matching_data[0]);
				String matching_obj = "";

				for (int z = 1; z < matching_data.length; z++) {
					if (z != 1) {
						matching_obj += "&&";
					}
					matching_obj += matching_data[z];
				}
				// *********************************make json
				// return******************************************
				return_json += "{";
				return_json += "\"img_cnt\":\"" + sample_cnt + "\",";
				return_json += "\"pro_idx\":\"" + list.get(i).getPro_idx() + "\",";
				return_json += "\"pro_sort\":\"" + list.get(i).getPro_sort() + "\",";
				return_json += "\"pro_category\":\"" + list.get(i).getPro_category() + "\",";
				return_json += "\"pro_name\":\"" + list.get(i).getPro_name() + "\",";
				return_json += "\"pro_com_name\":\"" + list.get(i).getPro_com_name() + "\",";
				return_json += "\"pro_homepage\":\"" + list.get(i).getPro_homepage() + "\",";
				return_json += "\"pro_tel\":\"" + list.get(i).getPro_tel() + "\",";
				return_json += "\"pro_zipcode\":\"" + list.get(i).getPro_zipcode() + "\",";
				return_json += "\"pro_addr1\":\"" + list.get(i).getPro_addr1() + "\",";
				return_json += "\"pro_addr2\":\"" + list.get(i).getPro_addr2() + "\",";
				return_json += "\"pro_subway1\":\"" + list.get(i).getPro_subway1() + "\",";
				return_json += "\"pro_subway2\":\"" + list.get(i).getPro_subway2() + "\",";
				return_json += "\"pro_subway3\":\"" + list.get(i).getPro_subway3() + "\",";
				return_json += "\"pro_bus\":\"" + list.get(i).getPro_bus() + "\",";
				return_json += "\"pro_intro1\":\"" + list.get(i).getPro_intro1() + "\",";
				return_json += "\"pro_intro2\":\"" + list.get(i).getPro_intro2() + "\",";
				return_json += "\"pro_type\":\"" + list.get(i).getPro_type() + "\",";
				return_json += "\"pro_clothes\":\"" + list.get(i).getPro_clothes() + "\",";
				return_json += "\"pro_props\":\"" + list.get(i).getPro_props() + "\",";
				return_json += "\"pro_play_time\":\"" + list.get(i).getPro_play_time() + "\",";
				return_json += "\"pro_photo_time\":\"" + list.get(i).getPro_photo_time() + "\",";
				return_json += "\"pro_talk_time\":\"" + list.get(i).getPro_talk_time() + "\",";
				return_json += "\"pro_holiday\":\"" + list.get(i).getPro_holiday() + "\",";
				return_json += "\"pro_parking\":\"" + list.get(i).getPro_parking() + "\",";
				return_json += "\"pro_concept1\":\"" + list.get(i).getPro_concept1() + "\",";
				return_json += "\"pro_concept2\":\"" + list.get(i).getPro_concept2() + "\",";
				return_json += "\"pro_composition\":\"" + list.get(i).getPro_composition() + "\",";
				return_json += "\"pro_composition_pay\":\"" + list.get(i).getPro_composition_pay() + "\",";
				return_json += "\"pro_composition_charge\":\"" + list.get(i).getPro_composition_charge() + "\",";
				return_json += "\"pro_composition_price\":\"" + list.get(i).getPro_composition_price() + "\",";
				return_json += "\"pro_composition_dc\":\"" + list.get(i).getPro_composition_dc() + "\",";
				return_json += "\"pro_add_name\":\"" + list.get(i).getPro_add_name() + "\",";
				return_json += "\"pro_add_pay\":\"" + list.get(i).getPro_add_pay() + "\",";
				return_json += "\"pro_event\":\"" + list.get(i).getPro_event() + "\",";
				return_json += "\"pro_pay_engine\":\"" + list.get(i).getPro_pay_engine() + "\",";
				return_json += "\"pro_pay_number\":\"" + list.get(i).getPro_pay_number() + "\",";
				return_json += "\"pro_pay_name\":\"" + list.get(i).getPro_pay_name() + "\",";
				return_json += "\"pro_change_date\":\"" + list.get(i).getPro_change_date() + "\",";
				return_json += "\"pro_sorry_pay\":\"" + list.get(i).getPro_sorry_pay() + "\",";
				return_json += "\"scrap\":\"" + scrap_yn + "\",";
				return_json += "\"matching_point\":\""
						+ Math.round(matching_point * 5 / (double) matching_arr_studio.length) + "\",";
				return_json += "\"matching_obj\":\"" + matching_obj + "\",";
				return_json += "\"count\":\"" + list_size.size() + "\"";
				return_json += "}";
				result_arr.add(return_json);
				return_json = "";
				// *********************************make json
				// return******************************************
			}
			if (!"matching".equals(align)) {
				return_json = "["; // 초기화
				for (int i = 0; i < result_arr.size(); i++) {
					if (i != 0) {
						return_json += ",";
					}
					return_json += result_arr.get(i);
				}
				return_json += "]";
			} else {
				int add_cnt = 0;
				for (int i = 5; i >= 0; i--) // 5점만점이니까
				{
					for (int j = 0; j < result_arr.size(); j++) {
						String matching_result = (String) result_arr.get(j);
						int pro_point = Integer
								.parseInt(matching_result.substring(matching_result.indexOf("matching_point") + 17,
										matching_result.indexOf("matching_point") + 18));
						if (pro_point == i) {
							if (((page - 1) * cnt <= add_cnt) && (page * cnt > add_cnt)) {
								return_json += "," + matching_result;
							}
							add_cnt++;
						}
					}
				}
				if (return_json.length() > 0) {
					return_json = return_json.substring(1, return_json.length());
				}
				return_json = "[" + return_json + "]";
			}
		} else if ("dress".equals(type)) {
			List<Dress_vo> list_size = dress_dao.selList_dress(query);
			String sel_query = "";
			if (!"matching".equals(align)) {
				sel_query = query + " " + align + " limit " + ((page - 1) * cnt) + "," + cnt;
			} else {
				sel_query = query;
			}
			List<Dress_vo> list = dress_dao.selList_dress(sel_query);
			for (int i = 0; i < list.size(); i++) {
				int sample_cnt = sample_cnt(list.get(i).getPro_idx(), type);
				String scrap_yn = scrap_yn(user_idx, type, list.get(i).getPro_idx());
				String matching_data[] = matching_data(user_idx, type, list.get(i).getPro_idx()).split("&&");
				int matching_point = Integer.parseInt(matching_data[0]);
				String matching_obj = "";

				for (int z = 1; z < matching_data.length; z++) {
					if (z != 1) {
						matching_obj += "&&";
					}
					matching_obj += matching_data[z];
				}
				// *********************************make json
				// return******************************************
				return_json += "{";
				return_json += "\"img_cnt\":\"" + sample_cnt + "\",";
				return_json += "\"pro_idx\":\"" + list.get(i).getPro_idx() + "\",";
				return_json += "\"pro_sort\":\"" + list.get(i).getPro_sort() + "\",";
				return_json += "\"pro_category\":\"" + list.get(i).getPro_category() + "\",";
				return_json += "\"pro_name\":\"" + list.get(i).getPro_name() + "\",";
				return_json += "\"pro_com_name\":\"" + list.get(i).getPro_com_name() + "\",";
				return_json += "\"pro_homepage\":\"" + list.get(i).getPro_homepage() + "\",";
				return_json += "\"pro_tel\":\"" + list.get(i).getPro_tel() + "\",";
				return_json += "\"pro_zipcode\":\"" + list.get(i).getPro_zipcode() + "\",";
				return_json += "\"pro_addr1\":\"" + list.get(i).getPro_addr1() + "\",";
				return_json += "\"pro_addr2\":\"" + list.get(i).getPro_addr2() + "\",";
				return_json += "\"pro_subway1\":\"" + list.get(i).getPro_subway1() + "\",";
				return_json += "\"pro_subway2\":\"" + list.get(i).getPro_subway2() + "\",";
				return_json += "\"pro_subway3\":\"" + list.get(i).getPro_subway3() + "\",";
				return_json += "\"pro_bus\":\"" + list.get(i).getPro_bus() + "\",";
				return_json += "\"pro_intro1\":\"" + list.get(i).getPro_intro1() + "\",";
				return_json += "\"pro_intro2\":\"" + list.get(i).getPro_intro2() + "\",";
				return_json += "\"pro_brand\":\"" + list.get(i).getPro_brand() + "\",";
				return_json += "\"pro_type\":\"" + list.get(i).getPro_type() + "\",";
				return_json += "\"pro_talk_time\":\"" + list.get(i).getPro_talk_time() + "\",";
				return_json += "\"pro_holiday\":\"" + list.get(i).getPro_holiday() + "\",";
				return_json += "\"pro_parking\":\"" + list.get(i).getPro_parking() + "\",";
				return_json += "\"pro_composition\":\"" + list.get(i).getPro_composition() + "\",";
				return_json += "\"pro_composition_pay\":\"" + list.get(i).getPro_composition_pay() + "\",";
				return_json += "\"pro_composition_charge\":\"" + list.get(i).getPro_composition_charge() + "\",";
				return_json += "\"pro_composition_price\":\"" + list.get(i).getPro_composition_price() + "\",";
				return_json += "\"pro_composition_dc\":\"" + list.get(i).getPro_composition_dc() + "\",";
				return_json += "\"pro_add_name\":\"" + list.get(i).getPro_add_name() + "\",";
				return_json += "\"pro_add_pay\":\"" + list.get(i).getPro_add_pay() + "\",";
				return_json += "\"pro_event\":\"" + list.get(i).getPro_event() + "\",";
				return_json += "\"pro_pay_engine\":\"" + list.get(i).getPro_pay_engine() + "\",";
				return_json += "\"pro_pay_number\":\"" + list.get(i).getPro_pay_number() + "\",";
				return_json += "\"pro_pay_name\":\"" + list.get(i).getPro_pay_name() + "\",";
				return_json += "\"pro_change_date\":\"" + list.get(i).getPro_change_date() + "\",";
				return_json += "\"pro_sorry_pay\":\"" + list.get(i).getPro_sorry_pay() + "\",";
				return_json += "\"scrap\":\"" + scrap_yn + "\",";
				return_json += "\"matching_point\":\""
						+ Math.round(matching_point * 5 / (double) matching_arr_dress.length) + "\",";
				return_json += "\"matching_obj\":\"" + matching_obj + "\",";
				return_json += "\"count\":\"" + list_size.size() + "\"";
				return_json += "}";
				result_arr.add(return_json);
				return_json = "";
				// *********************************make json
				// return******************************************
			}
			if (!"matching".equals(align)) {
				return_json = "["; // 초기화
				for (int i = 0; i < result_arr.size(); i++) {
					if (i != 0) {
						return_json += ",";
					}
					return_json += result_arr.get(i);
				}
				return_json += "]";
			} else {
				int add_cnt = 0;
				for (int i = 5; i >= 0; i--) // 5점만점이니까
				{
					for (int j = 0; j < result_arr.size(); j++) {
						String matching_result = (String) result_arr.get(j);
						int pro_point = Integer
								.parseInt(matching_result.substring(matching_result.indexOf("matching_point") + 17,
										matching_result.indexOf("matching_point") + 18));
						if (pro_point == i) {
							if (((page - 1) * cnt <= add_cnt) && (page * cnt > add_cnt)) {
								return_json += "," + matching_result;
							}
							add_cnt++;
						}
					}
				}
				if (return_json.length() > 0) {
					return_json = return_json.substring(1, return_json.length());
				}
				return_json = "[" + return_json + "]";
			}
		} else if ("makeup".equals(type)) {
			List<Makeup_vo> list_size = makeup_dao.selList_makeup(query);
			String sel_query = "";
			if (!"matching".equals(align)) {
				sel_query = query + " " + align + " limit " + ((page - 1) * cnt) + "," + cnt;
			} else {
				sel_query = query;
			}
			List<Makeup_vo> list = makeup_dao.selList_makeup(sel_query);
			for (int i = 0; i < list.size(); i++) {
				int sample_cnt = sample_cnt(list.get(i).getPro_idx(), type);
				String scrap_yn = scrap_yn(user_idx, type, list.get(i).getPro_idx());
				String matching_data[] = matching_data(user_idx, type, list.get(i).getPro_idx()).split("&&");
				int matching_point = Integer.parseInt(matching_data[0]);
				String matching_obj = "";

				for (int z = 1; z < matching_data.length; z++) {
					if (z != 1) {
						matching_obj += "&&";
					}
					matching_obj += matching_data[z];
				}
				// *********************************make json
				// return******************************************
				return_json += "{";
				return_json += "\"img_cnt\":\"" + sample_cnt + "\",";
				return_json += "\"pro_idx\":\"" + list.get(i).getPro_idx() + "\",";
				return_json += "\"pro_sort\":\"" + list.get(i).getPro_sort() + "\",";
				return_json += "\"pro_category\":\"" + list.get(i).getPro_category() + "\",";
				return_json += "\"pro_name\":\"" + list.get(i).getPro_name() + "\",";
				return_json += "\"pro_com_name\":\"" + list.get(i).getPro_com_name() + "\",";
				return_json += "\"pro_homepage\":\"" + list.get(i).getPro_homepage() + "\",";
				return_json += "\"pro_tel\":\"" + list.get(i).getPro_tel() + "\",";
				return_json += "\"pro_zipcode\":\"" + list.get(i).getPro_zipcode() + "\",";
				return_json += "\"pro_addr1\":\"" + list.get(i).getPro_addr1() + "\",";
				return_json += "\"pro_addr2\":\"" + list.get(i).getPro_addr2() + "\",";
				return_json += "\"pro_subway1\":\"" + list.get(i).getPro_subway1() + "\",";
				return_json += "\"pro_subway2\":\"" + list.get(i).getPro_subway2() + "\",";
				return_json += "\"pro_subway3\":\"" + list.get(i).getPro_subway3() + "\",";
				return_json += "\"pro_bus\":\"" + list.get(i).getPro_bus() + "\",";
				return_json += "\"pro_intro1\":\"" + list.get(i).getPro_intro1() + "\",";
				return_json += "\"pro_intro2\":\"" + list.get(i).getPro_intro2() + "\",";
				return_json += "\"pro_go\":\"" + list.get(i).getPro_go() + "\",";
				return_json += "\"pro_concept\":\"" + list.get(i).getPro_concept() + "\",";
				return_json += "\"pro_talk_time\":\"" + list.get(i).getPro_talk_time() + "\",";
				return_json += "\"pro_holiday\":\"" + list.get(i).getPro_holiday() + "\",";
				return_json += "\"pro_parking\":\"" + list.get(i).getPro_parking() + "\",";
				return_json += "\"pro_composition\":\"" + list.get(i).getPro_composition() + "\",";
				return_json += "\"pro_composition_pay\":\"" + list.get(i).getPro_composition_pay() + "\",";
				return_json += "\"pro_composition_charge\":\"" + list.get(i).getPro_composition_charge() + "\",";
				return_json += "\"pro_composition_price\":\"" + list.get(i).getPro_composition_price() + "\",";
				return_json += "\"pro_composition_dc\":\"" + list.get(i).getPro_composition_dc() + "\",";
				return_json += "\"pro_add_name\":\"" + list.get(i).getPro_add_name() + "\",";
				return_json += "\"pro_add_pay\":\"" + list.get(i).getPro_add_pay() + "\",";
				return_json += "\"pro_event\":\"" + list.get(i).getPro_event() + "\",";
				return_json += "\"pro_pay_engine\":\"" + list.get(i).getPro_pay_engine() + "\",";
				return_json += "\"pro_pay_number\":\"" + list.get(i).getPro_pay_number() + "\",";
				return_json += "\"pro_pay_name\":\"" + list.get(i).getPro_pay_name() + "\",";
				return_json += "\"pro_change_date\":\"" + list.get(i).getPro_change_date() + "\",";
				return_json += "\"pro_sorry_pay\":\"" + list.get(i).getPro_sorry_pay() + "\",";
				return_json += "\"scrap\":\"" + scrap_yn + "\",";
				return_json += "\"matching_point\":\""
						+ Math.round(matching_point * 5 / (double) matching_arr_makeup.length) + "\",";
				return_json += "\"matching_obj\":\"" + matching_obj + "\",";
				return_json += "\"count\":\"" + list_size.size() + "\"";
				return_json += "}";
				result_arr.add(return_json);
				return_json = "";
				// *********************************make json
				// return******************************************
			}
			if (!"matching".equals(align)) {
				return_json = "["; // 초기화
				for (int i = 0; i < result_arr.size(); i++) {
					if (i != 0) {
						return_json += ",";
					}
					return_json += result_arr.get(i);
				}
				return_json += "]";
			} else {
				int add_cnt = 0;
				for (int i = 5; i >= 0; i--) // 5점만점이니까
				{
					for (int j = 0; j < result_arr.size(); j++) {
						String matching_result = (String) result_arr.get(j);
						int pro_point = Integer
								.parseInt(matching_result.substring(matching_result.indexOf("matching_point") + 17,
										matching_result.indexOf("matching_point") + 18));
						if (pro_point == i) {
							if (((page - 1) * cnt <= add_cnt) && (page * cnt > add_cnt)) {
								return_json += "," + matching_result;
							}
							add_cnt++;
						}
					}
				}
				if (return_json.length() > 0) {
					return_json = return_json.substring(1, return_json.length());
				}
				return_json = "[" + return_json + "]";
			}
		} else if ("snap".equals(type)) {

			List<Snap_vo> list_size = snap_dao.selList_snap(query);
			String sel_query = "";
			if (!"matching".equals(align)) {
				sel_query = query + " " + align + " limit " + ((page - 1) * cnt) + "," + cnt;
			} else {
				sel_query = query;
			}
			List<Snap_vo> list = snap_dao.selList_snap(sel_query);
			for (int i = 0; i < list.size(); i++) {
				int sample_cnt = sample_cnt(list.get(i).getPro_idx(), type);
				String scrap_yn = scrap_yn(user_idx, type, list.get(i).getPro_idx());
				String matching_data[] = matching_data(user_idx, type, list.get(i).getPro_idx()).split("&&");
				int matching_point = Integer.parseInt(matching_data[0]);
				String matching_obj = "";

				for (int z = 1; z < matching_data.length; z++) {
					if (z != 1) {
						matching_obj += "&&";
					}
					matching_obj += matching_data[z];
				}
				// *********************************make json
				// return******************************************
				return_json += "{";
				return_json += "\"img_cnt\":\"" + sample_cnt + "\",";
				return_json += "\"pro_idx\":\"" + list.get(i).getPro_idx() + "\",";
				return_json += "\"pro_sort\":\"" + list.get(i).getPro_sort() + "\",";
				return_json += "\"pro_category\":\"" + list.get(i).getPro_category() + "\",";
				return_json += "\"pro_name\":\"" + list.get(i).getPro_name() + "\",";
				return_json += "\"pro_com_name\":\"" + list.get(i).getPro_com_name() + "\",";
				return_json += "\"pro_homepage\":\"" + list.get(i).getPro_homepage() + "\",";
				return_json += "\"pro_tel\":\"" + list.get(i).getPro_tel() + "\",";
				return_json += "\"pro_zipcode\":\"" + list.get(i).getPro_zipcode() + "\",";
				return_json += "\"pro_addr1\":\"" + list.get(i).getPro_addr1() + "\",";
				return_json += "\"pro_addr2\":\"" + list.get(i).getPro_addr2() + "\",";
				return_json += "\"pro_subway1\":\"" + list.get(i).getPro_subway1() + "\",";
				return_json += "\"pro_subway2\":\"" + list.get(i).getPro_subway2() + "\",";
				return_json += "\"pro_subway3\":\"" + list.get(i).getPro_subway3() + "\",";
				return_json += "\"pro_bus\":\"" + list.get(i).getPro_bus() + "\",";
				return_json += "\"pro_intro1\":\"" + list.get(i).getPro_intro1() + "\",";
				return_json += "\"pro_intro2\":\"" + list.get(i).getPro_intro2() + "\",";
				return_json += "\"pro_location\":\"" + list.get(i).getPro_location() + "\",";
				return_json += "\"pro_talk_time\":\"" + list.get(i).getPro_talk_time() + "\",";
				return_json += "\"pro_holiday\":\"" + list.get(i).getPro_holiday() + "\",";
				return_json += "\"pro_composition\":\"" + list.get(i).getPro_composition() + "\",";
				return_json += "\"pro_composition_pay\":\"" + list.get(i).getPro_composition_pay() + "\",";
				return_json += "\"pro_composition_charge\":\"" + list.get(i).getPro_composition_charge() + "\",";
				return_json += "\"pro_composition_price\":\"" + list.get(i).getPro_composition_price() + "\",";
				return_json += "\"pro_composition_dc\":\"" + list.get(i).getPro_composition_dc() + "\",";
				return_json += "\"pro_add_name\":\"" + list.get(i).getPro_add_name() + "\",";
				return_json += "\"pro_add_pay\":\"" + list.get(i).getPro_add_pay() + "\",";
				return_json += "\"pro_event\":\"" + list.get(i).getPro_event() + "\",";
				return_json += "\"pro_pay_engine\":\"" + list.get(i).getPro_pay_engine() + "\",";
				return_json += "\"pro_pay_number\":\"" + list.get(i).getPro_pay_number() + "\",";
				return_json += "\"pro_pay_name\":\"" + list.get(i).getPro_pay_name() + "\",";
				return_json += "\"scrap\":\"" + scrap_yn + "\",";
				return_json += "\"matching_point\":\"0\",";
				return_json += "\"matching_obj\":\"" + matching_obj + "\",";
				return_json += "\"count\":\"" + list_size.size() + "\"";
				return_json += "}";
				result_arr.add(return_json);
				return_json = "";
				// *********************************make json
				// return******************************************
			}
			if (!"matching".equals(align)) {
				return_json = "["; // 초기화
				for (int i = 0; i < result_arr.size(); i++) {
					if (i != 0) {
						return_json += ",";
					}
					return_json += result_arr.get(i);
				}
				return_json += "]";
			} else {
				int add_cnt = 0;
				for (int i = 5; i >= 0; i--) // 5점만점이니까
				{
					for (int j = 0; j < result_arr.size(); j++) {
						String matching_result = (String) result_arr.get(j);
						int pro_point = Integer
								.parseInt(matching_result.substring(matching_result.indexOf("matching_point") + 17,
										matching_result.indexOf("matching_point") + 18));
						if (pro_point == i) {
							if (((page - 1) * cnt <= add_cnt) && (page * cnt > add_cnt)) {
								return_json += "," + matching_result;
							}
							add_cnt++;
						}
					}
				}
				if (return_json.length() > 0) {
					return_json = return_json.substring(1, return_json.length());
				}
				return_json = "[" + return_json + "]";
			}

		} else if ("suit".equals(type)) {
			List<Suit_vo> list_size = suit_dao.selList_suit(query);
			String sel_query = "";
			if (!"matching".equals(align)) {
				sel_query = query + " " + align + " limit " + ((page - 1) * cnt) + "," + cnt;
			} else {
				sel_query = query;
			}
			List<Suit_vo> list = suit_dao.selList_suit(sel_query);
			for (int i = 0; i < list.size(); i++) {
				int sample_cnt = sample_cnt(list.get(i).getPro_idx(), type);
				String scrap_yn = scrap_yn(user_idx, type, list.get(i).getPro_idx());
				String matching_data[] = matching_data(user_idx, type, list.get(i).getPro_idx()).split("&&");
				int matching_point = Integer.parseInt(matching_data[0]);
				String matching_obj = "";

				for (int z = 1; z < matching_data.length; z++) {
					if (z != 1) {
						matching_obj += "&&";
					}
					matching_obj += matching_data[z];
				}
				// *********************************make json
				// return******************************************
				return_json += "{";
				return_json += "\"img_cnt\":\"" + sample_cnt + "\",";
				return_json += "\"pro_idx\":\"" + list.get(i).getPro_idx() + "\",";
				return_json += "\"pro_sort\":\"" + list.get(i).getPro_sort() + "\",";
				return_json += "\"pro_category\":\"" + list.get(i).getPro_category() + "\",";
				return_json += "\"pro_name\":\"" + list.get(i).getPro_name() + "\",";
				return_json += "\"pro_com_name\":\"" + list.get(i).getPro_com_name() + "\",";
				return_json += "\"pro_homepage\":\"" + list.get(i).getPro_homepage() + "\",";
				return_json += "\"pro_tel\":\"" + list.get(i).getPro_tel() + "\",";
				return_json += "\"pro_zipcode\":\"" + list.get(i).getPro_zipcode() + "\",";
				return_json += "\"pro_addr1\":\"" + list.get(i).getPro_addr1() + "\",";
				return_json += "\"pro_addr2\":\"" + list.get(i).getPro_addr2() + "\",";
				return_json += "\"pro_subway1\":\"" + list.get(i).getPro_subway1() + "\",";
				return_json += "\"pro_subway2\":\"" + list.get(i).getPro_subway2() + "\",";
				return_json += "\"pro_subway3\":\"" + list.get(i).getPro_subway3() + "\",";
				return_json += "\"pro_bus\":\"" + list.get(i).getPro_bus() + "\",";
				return_json += "\"pro_intro1\":\"" + list.get(i).getPro_intro1() + "\",";
				return_json += "\"pro_intro2\":\"" + list.get(i).getPro_intro2() + "\",";
				return_json += "\"pro_type\":\"" + list.get(i).getPro_type() + "\",";
				return_json += "\"pro_talk_time\":\"" + list.get(i).getPro_talk_time() + "\",";
				return_json += "\"pro_holiday\":\"" + list.get(i).getPro_holiday() + "\",";
				return_json += "\"pro_parking\":\"" + list.get(i).getPro_parking() + "\",";
				return_json += "\"pro_service\":\"" + list.get(i).getPro_service() + "\",";
				return_json += "\"pro_event\":\"" + list.get(i).getPro_event() + "\",";
				return_json += "\"pro_cashback\":\"" + list.get(i).getPro_cashback() + "\",";
				return_json += "\"pro_composition\":\"" + list.get(i).getPro_composition() + "\",";
				return_json += "\"pro_composition_charge\":\"" + list.get(i).getPro_composition_charge() + "\",";
				return_json += "\"pro_composition_price\":\"" + list.get(i).getPro_composition_price() + "\",";
				return_json += "\"pro_add_name\":\"" + list.get(i).getPro_add_name() + "\",";
				return_json += "\"pro_add_pay\":\"" + list.get(i).getPro_add_pay() + "\",";
				return_json += "\"pro_pay_engine\":\"" + list.get(i).getPro_pay_engine() + "\",";
				return_json += "\"pro_pay_number\":\"" + list.get(i).getPro_pay_number() + "\",";
				return_json += "\"pro_pay_name\":\"" + list.get(i).getPro_pay_name() + "\",";
				return_json += "\"scrap\":\"" + scrap_yn + "\",";
				return_json += "\"matching_point\":\""
						+ Math.round(matching_point * 5 / (double) matching_arr_suit.length) + "\",";
				return_json += "\"matching_obj\":\"" + matching_obj + "\",";
				return_json += "\"count\":\"" + list_size.size() + "\"";
				return_json += "}";
				result_arr.add(return_json);
				return_json = "";
				// *********************************make json
				// return******************************************
			}
			if (!"matching".equals(align)) {
				return_json = "["; // 초기화
				for (int i = 0; i < result_arr.size(); i++) {
					if (i != 0) {
						return_json += ",";
					}
					return_json += result_arr.get(i);
				}
				return_json += "]";
			} else {
				int add_cnt = 0;
				for (int i = 5; i >= 0; i--) // 5점만점이니까
				{
					for (int j = 0; j < result_arr.size(); j++) {
						String matching_result = (String) result_arr.get(j);
						int pro_point = Integer
								.parseInt(matching_result.substring(matching_result.indexOf("matching_point") + 17,
										matching_result.indexOf("matching_point") + 18));
						if (pro_point == i) {
							if (((page - 1) * cnt <= add_cnt) && (page * cnt > add_cnt)) {
								return_json += "," + matching_result;
							}
							add_cnt++;
						}
					}
				}
				if (return_json.length() > 0) {
					return_json = return_json.substring(1, return_json.length());
				}
				return_json = "[" + return_json + "]";
			}
		} else if ("korea".equals(type)) {
			List<Korea_vo> list_size = korea_dao.selList_korea(query);
			String sel_query = "";
			if (!"matching".equals(align)) {
				sel_query = query + " " + align + " limit " + ((page - 1) * cnt) + "," + cnt;
			} else {
				sel_query = query;
			}
			List<Korea_vo> list = korea_dao.selList_korea(sel_query);
			for (int i = 0; i < list.size(); i++) {
				int sample_cnt = sample_cnt(list.get(i).getPro_idx(), type);
				String scrap_yn = scrap_yn(user_idx, type, list.get(i).getPro_idx());
				String matching_data[] = matching_data(user_idx, type, list.get(i).getPro_idx()).split("&&");
				int matching_point = Integer.parseInt(matching_data[0]);
				String matching_obj = "";

				for (int z = 1; z < matching_data.length; z++) {
					if (z != 1) {
						matching_obj += "&&";
					}
					matching_obj += matching_data[z];
				}
				// *********************************make json
				// return******************************************
				return_json += "{";
				return_json += "\"img_cnt\":\"" + sample_cnt + "\",";
				return_json += "\"pro_idx\":\"" + list.get(i).getPro_idx() + "\",";
				return_json += "\"pro_sort\":\"" + list.get(i).getPro_sort() + "\",";
				return_json += "\"pro_category\":\"" + list.get(i).getPro_category() + "\",";
				return_json += "\"pro_name\":\"" + list.get(i).getPro_name() + "\",";
				return_json += "\"pro_com_name\":\"" + list.get(i).getPro_com_name() + "\",";
				return_json += "\"pro_homepage\":\"" + list.get(i).getPro_homepage() + "\",";
				return_json += "\"pro_tel\":\"" + list.get(i).getPro_tel() + "\",";
				return_json += "\"pro_zipcode\":\"" + list.get(i).getPro_zipcode() + "\",";
				return_json += "\"pro_addr1\":\"" + list.get(i).getPro_addr1() + "\",";
				return_json += "\"pro_addr2\":\"" + list.get(i).getPro_addr2() + "\",";
				return_json += "\"pro_subway1\":\"" + list.get(i).getPro_subway1() + "\",";
				return_json += "\"pro_subway2\":\"" + list.get(i).getPro_subway2() + "\",";
				return_json += "\"pro_subway3\":\"" + list.get(i).getPro_subway3() + "\",";
				return_json += "\"pro_bus\":\"" + list.get(i).getPro_bus() + "\",";
				return_json += "\"pro_intro1\":\"" + list.get(i).getPro_intro1() + "\",";
				return_json += "\"pro_intro2\":\"" + list.get(i).getPro_intro2() + "\",";
				return_json += "\"pro_type\":\"" + list.get(i).getPro_type() + "\",";
				return_json += "\"pro_talk_time\":\"" + list.get(i).getPro_talk_time() + "\",";
				return_json += "\"pro_holiday\":\"" + list.get(i).getPro_holiday() + "\",";
				return_json += "\"pro_parking\":\"" + list.get(i).getPro_parking() + "\",";
				return_json += "\"pro_service\":\"" + list.get(i).getPro_service() + "\",";
				return_json += "\"pro_event\":\"" + list.get(i).getPro_event() + "\",";
				return_json += "\"pro_cashback\":\"" + list.get(i).getPro_cashback() + "\",";
				return_json += "\"pro_composition\":\"" + list.get(i).getPro_composition() + "\",";
				return_json += "\"pro_composition_charge\":\"" + list.get(i).getPro_composition_charge() + "\",";
				return_json += "\"pro_composition_price\":\"" + list.get(i).getPro_composition_price() + "\",";
				return_json += "\"pro_add_name\":\"" + list.get(i).getPro_add_name() + "\",";
				return_json += "\"pro_add_pay\":\"" + list.get(i).getPro_add_pay() + "\",";
				return_json += "\"pro_pay_engine\":\"" + list.get(i).getPro_pay_engine() + "\",";
				return_json += "\"pro_pay_number\":\"" + list.get(i).getPro_pay_number() + "\",";
				return_json += "\"pro_pay_name\":\"" + list.get(i).getPro_pay_name() + "\",";
				return_json += "\"scrap\":\"" + scrap_yn + "\",";
				return_json += "\"matching_point\":\""
						+ Math.round(matching_point * 5 / (double) matching_arr_korea.length) + "\",";
				return_json += "\"matching_obj\":\"" + matching_obj + "\",";
				return_json += "\"count\":\"" + list_size.size() + "\"";
				return_json += "}";
				result_arr.add(return_json);
				return_json = "";
				// *********************************make json
				// return******************************************
			}
			if (!"matching".equals(align)) {
				return_json = "["; // 초기화
				for (int i = 0; i < result_arr.size(); i++) {
					if (i != 0) {
						return_json += ",";
					}
					return_json += result_arr.get(i);
				}
				return_json += "]";
			} else {
				int add_cnt = 0;
				for (int i = 5; i >= 0; i--) // 5점만점이니까
				{
					for (int j = 0; j < result_arr.size(); j++) {
						String matching_result = (String) result_arr.get(j);
						int pro_point = Integer
								.parseInt(matching_result.substring(matching_result.indexOf("matching_point") + 17,
										matching_result.indexOf("matching_point") + 18));
						if (pro_point == i) {
							if (((page - 1) * cnt <= add_cnt) && (page * cnt > add_cnt)) {
								return_json += "," + matching_result;
							}
							add_cnt++;
						}
					}
				}
				if (return_json.length() > 0) {
					return_json = return_json.substring(1, return_json.length());
				}
				return_json = "[" + return_json + "]";
			}
		} else if ("jewelry".equals(type)) {
			List<Jewelry_vo> list_size = jewelry_dao.selList_jewelry(query);
			String sel_query = "";
			if (!"matching".equals(align)) {
				sel_query = query + " " + align + " limit " + ((page - 1) * cnt) + "," + cnt;
			} else {
				sel_query = query;
			}
			List<Jewelry_vo> list = jewelry_dao.selList_jewelry(sel_query);
			for (int i = 0; i < list.size(); i++) {
				int sample_cnt = sample_cnt(list.get(i).getPro_idx(), type);
				String scrap_yn = scrap_yn(user_idx, type, list.get(i).getPro_idx());
				String matching_data[] = matching_data(user_idx, type, list.get(i).getPro_idx()).split("&&");
				int matching_point = Integer.parseInt(matching_data[0]);
				String matching_obj = "";

				for (int z = 1; z < matching_data.length; z++) {
					if (z != 1) {
						matching_obj += "&&";
					}
					matching_obj += matching_data[z];
				}
				// *********************************make json
				// return******************************************
				return_json += "{";
				return_json += "\"img_cnt\":\"" + sample_cnt + "\",";
				return_json += "\"pro_idx\":\"" + list.get(i).getPro_idx() + "\",";
				return_json += "\"pro_sort\":\"" + list.get(i).getPro_sort() + "\",";
				return_json += "\"pro_category\":\"" + list.get(i).getPro_category() + "\",";
				return_json += "\"pro_name\":\"" + list.get(i).getPro_name() + "\",";
				return_json += "\"pro_com_name\":\"" + list.get(i).getPro_com_name() + "\",";
				return_json += "\"pro_homepage\":\"" + list.get(i).getPro_homepage() + "\",";
				return_json += "\"pro_tel\":\"" + list.get(i).getPro_tel() + "\",";
				return_json += "\"pro_zipcode\":\"" + list.get(i).getPro_zipcode() + "\",";
				return_json += "\"pro_addr1\":\"" + list.get(i).getPro_addr1() + "\",";
				return_json += "\"pro_addr2\":\"" + list.get(i).getPro_addr2() + "\",";
				return_json += "\"pro_subway1\":\"" + list.get(i).getPro_subway1() + "\",";
				return_json += "\"pro_subway2\":\"" + list.get(i).getPro_subway2() + "\",";
				return_json += "\"pro_subway3\":\"" + list.get(i).getPro_subway3() + "\",";
				return_json += "\"pro_bus\":\"" + list.get(i).getPro_bus() + "\",";
				return_json += "\"pro_intro1\":\"" + list.get(i).getPro_intro1() + "\",";
				return_json += "\"pro_intro2\":\"" + list.get(i).getPro_intro2() + "\",";
				return_json += "\"pro_talk_time\":\"" + list.get(i).getPro_talk_time() + "\",";
				return_json += "\"pro_holiday\":\"" + list.get(i).getPro_holiday() + "\",";
				return_json += "\"pro_parking\":\"" + list.get(i).getPro_parking() + "\",";
				return_json += "\"pro_service\":\"" + list.get(i).getPro_service() + "\",";
				return_json += "\"pro_event\":\"" + list.get(i).getPro_event() + "\",";
				return_json += "\"pro_cashback\":\"" + list.get(i).getPro_cashback() + "\",";
				return_json += "\"pro_composition\":\"" + list.get(i).getPro_composition() + "\",";
				return_json += "\"pro_composition_charge\":\"" + list.get(i).getPro_composition_charge() + "\",";
				return_json += "\"pro_composition_price\":\"" + list.get(i).getPro_composition_price() + "\",";
				return_json += "\"pro_add_name\":\"" + list.get(i).getPro_add_name() + "\",";
				return_json += "\"pro_add_pay\":\"" + list.get(i).getPro_add_pay() + "\",";
				return_json += "\"pro_pay_engine\":\"" + list.get(i).getPro_pay_engine() + "\",";
				return_json += "\"pro_pay_number\":\"" + list.get(i).getPro_pay_number() + "\",";
				return_json += "\"pro_pay_name\":\"" + list.get(i).getPro_pay_name() + "\",";
				return_json += "\"scrap\":\"" + scrap_yn + "\",";
				return_json += "\"matching_point\":\""
						+ Math.round(matching_point * 5 / (double) matching_arr_jewelry.length) + "\",";
				return_json += "\"matching_obj\":\"" + matching_obj + "\",";
				return_json += "\"count\":\"" + list_size.size() + "\"";
				return_json += "}";
				result_arr.add(return_json);
				return_json = "";
				// *********************************make json
				// return******************************************
			}
			if (!"matching".equals(align)) {
				return_json = "["; // 초기화
				for (int i = 0; i < result_arr.size(); i++) {
					if (i != 0) {
						return_json += ",";
					}
					return_json += result_arr.get(i);
				}
				return_json += "]";
			} else {
				int add_cnt = 0;
				for (int i = 5; i >= 0; i--) // 5점만점이니까
				{
					for (int j = 0; j < result_arr.size(); j++) {
						String matching_result = (String) result_arr.get(j);
						int pro_point = Integer
								.parseInt(matching_result.substring(matching_result.indexOf("matching_point") + 17,
										matching_result.indexOf("matching_point") + 18));
						if (pro_point == i) {
							if (((page - 1) * cnt <= add_cnt) && (page * cnt > add_cnt)) {
								return_json += "," + matching_result;
							}
							add_cnt++;
						}
					}
				}
				if (return_json.length() > 0) {
					return_json = return_json.substring(1, return_json.length());
				}
				return_json = "[" + return_json + "]";
			}
		} else if ("pb".equals(type)) {
			List<Pb_vo> list_size = pb_dao.selList_pb(query);
			String sel_query = "";
			if (!"matching".equals(align)) {
				sel_query = query + " " + align + " limit " + ((page - 1) * cnt) + "," + cnt;
			} else {
				sel_query = query;
			}
			List<Pb_vo> list = pb_dao.selList_pb(sel_query);
			for (int i = 0; i < list.size(); i++) {
				int sample_cnt = sample_cnt(list.get(i).getPro_idx(), type);
				String scrap_yn = scrap_yn(user_idx, type, list.get(i).getPro_idx());
				String matching_data[] = matching_data(user_idx, type, list.get(i).getPro_idx()).split("&&");
				int matching_point = Integer.parseInt(matching_data[0]);
				String matching_obj = "";

				for (int z = 1; z < matching_data.length; z++) {
					if (z != 1) {
						matching_obj += "&&";
					}
					matching_obj += matching_data[z];
				}
				// *********************************make json
				// return******************************************
				return_json += "{";
				return_json += "\"img_cnt\":\"" + sample_cnt + "\",";
				return_json += "\"pro_idx\":\"" + list.get(i).getPro_idx() + "\",";
				return_json += "\"pro_sort\":\"" + list.get(i).getPro_sort() + "\",";
				return_json += "\"pro_category\":\"" + list.get(i).getPro_category() + "\",";
				return_json += "\"pro_name\":\"" + list.get(i).getPro_name() + "\",";
				return_json += "\"pro_com_name\":\"" + list.get(i).getPro_com_name() + "\",";
				return_json += "\"pro_homepage\":\"" + list.get(i).getPro_homepage() + "\",";
				return_json += "\"pro_tel\":\"" + list.get(i).getPro_tel() + "\",";
				return_json += "\"pro_zipcode\":\"" + list.get(i).getPro_zipcode() + "\",";
				return_json += "\"pro_addr1\":\"" + list.get(i).getPro_addr1() + "\",";
				return_json += "\"pro_addr2\":\"" + list.get(i).getPro_addr2() + "\",";
				return_json += "\"pro_subway1\":\"" + list.get(i).getPro_subway1() + "\",";
				return_json += "\"pro_subway2\":\"" + list.get(i).getPro_subway2() + "\",";
				return_json += "\"pro_subway3\":\"" + list.get(i).getPro_subway3() + "\",";
				return_json += "\"pro_bus\":\"" + list.get(i).getPro_bus() + "\",";
				return_json += "\"pro_intro1\":\"" + list.get(i).getPro_intro1() + "\",";
				return_json += "\"pro_intro2\":\"" + list.get(i).getPro_intro2() + "\",";
				return_json += "\"pro_eat\":\"" + list.get(i).getPro_eat() + "\",";
				return_json += "\"pro_talk_time\":\"" + list.get(i).getPro_talk_time() + "\",";
				return_json += "\"pro_holiday\":\"" + list.get(i).getPro_holiday() + "\",";
				return_json += "\"pro_parking\":\"" + list.get(i).getPro_parking() + "\",";
				return_json += "\"pro_service\":\"" + list.get(i).getPro_service() + "\",";
				return_json += "\"pro_composition\":\"" + list.get(i).getPro_composition() + "\",";
				return_json += "\"pro_composition_charge\":\"" + list.get(i).getPro_composition_charge() + "\",";
				return_json += "\"pro_composition_price\":\"" + list.get(i).getPro_composition_price() + "\",";
				return_json += "\"pro_add_name\":\"" + list.get(i).getPro_add_name() + "\",";
				return_json += "\"pro_add_pay\":\"" + list.get(i).getPro_add_pay() + "\",";
				return_json += "\"pro_pay_engine\":\"" + list.get(i).getPro_pay_engine() + "\",";
				return_json += "\"pro_pay_number\":\"" + list.get(i).getPro_pay_number() + "\",";
				return_json += "\"pro_pay_name\":\"" + list.get(i).getPro_pay_name() + "\",";
				return_json += "\"scrap\":\"" + scrap_yn + "\",";
				return_json += "\"matching_point\":\""
						+ Math.round(matching_point * 5 / (double) matching_arr_pb.length) + "\",";
				return_json += "\"matching_obj\":\"" + matching_obj + "\",";
				return_json += "\"count\":\"" + list_size.size() + "\"";
				return_json += "}";
				result_arr.add(return_json);
				return_json = "";
				// *********************************make json
				// return******************************************
			}
			if (!"matching".equals(align)) {
				return_json = "["; // 초기화
				for (int i = 0; i < result_arr.size(); i++) {
					if (i != 0) {
						return_json += ",";
					}
					return_json += result_arr.get(i);
				}
				return_json += "]";
			} else {
				int add_cnt = 0;
				for (int i = 5; i >= 0; i--) // 5점만점이니까
				{
					for (int j = 0; j < result_arr.size(); j++) {
						String matching_result = (String) result_arr.get(j);
						int pro_point = Integer
								.parseInt(matching_result.substring(matching_result.indexOf("matching_point") + 17,
										matching_result.indexOf("matching_point") + 18));
						if (pro_point == i) {
							if (((page - 1) * cnt <= add_cnt) && (page * cnt > add_cnt)) {
								return_json += "," + matching_result;
							}
							add_cnt++;
						}
					}
				}
				if (return_json.length() > 0) {
					return_json = return_json.substring(1, return_json.length());
				}
				return_json = "[" + return_json + "]";
			}
		}
		return return_json;
	}

	// 매칭데이터 검색 포인트
	public String matching_data(int user_idx, String type, int pro_idx) {
		List<Answer2_vo> ans_list = answer2_dao.selAns_idx(user_idx);
		int matching_point = 0;
		String matching_obj = "";
		if ("hall".equals(type)) {
			List<Hall_vo> list = hall_dao.selList_hall("pro_idx = " + pro_idx);

			String val = "";
			try {
				if (ans_list.size() > 0 && !"".equals(ans_list.get(0).getAns_data())
						&& ans_list.get(0).getAns_data().indexOf("\"웨딩홀\":") > -1) {
					JSONObject json_1 = new JSONObject(ans_list.get(0).getAns_data());
					JSONObject json_2 = json_1.getJSONObject("웨딩홀");
					for (int i = 0; i < matching_arr_hall.length; i++) {
						if (ans_list.get(0).getAns_data().indexOf("\"" + matching_arr_hall[i] + "\":") > -1) {
							JSONObject json_3 = json_2.getJSONObject(matching_arr_hall[i]);
							val = json_3.getString("ques_value");

							// **************************************매칭**********************************************
							// 지역 매칭
							if (!"".equals(val) && i == 0) {
								String pro_addr[] = list.get(0).getPro_addr1().replaceAll("특별", "").replaceAll("광역", "")
										.split(" ");
								String user_addr[] = val.replaceAll("특별", "").replaceAll("광역", "").split(" ");

								if (pro_addr.length > 1 && user_addr.length > 1) {
									if (pro_addr[0].equals(user_addr[0]) && pro_addr[1].equals(user_addr[1])) {
										matching_point++;
										matching_obj += "&&" + matching_arr_hall[i];
									}
								}
							}
							// 지역 매칭

							// 웨딩홀유형 매칭
							if (!"".equals(val) && i == 1) {
								String user_hall_type[] = val.replaceAll("일반/컨벤션 웨딩홀", "일반웨딩홀&&컨벤션웨딩홀").split("&&");

								for (int j = 0; j < user_hall_type.length; j++) {
									if (list.get(0).getPro_type().indexOf(user_hall_type[j]) > -1) {
										matching_point++;
										matching_obj += "&&" + matching_arr_hall[i];
										break;
									}
								}
							}

							// 웨딩홀유형 매칭

							// 메뉴 매칭
							if (!"".equals(val) && i == 2) {
								String user_menu[] = val.split("&&");
								for (int j = 0; j < user_menu.length; j++) {
									if (list.get(0).getPro_menu().indexOf(user_menu[j]) > -1) {
										matching_point++;
										matching_obj += "&&" + matching_arr_hall[i];
										break;
									}
								}
							}
							// 메뉴 매칭

							// 예식타입 매칭
							if (!"".equals(val) && i == 3) {
								String user_wedding_type[] = val.split("&&");
								for (int j = 0; j < user_wedding_type.length; j++) {
									if (list.get(0).getPro_wedding_type().indexOf(user_wedding_type[j]) > -1) {
										matching_point++;
										matching_obj += "&&" + matching_arr_hall[i];
										break;
									}
								}
							}

							// 예식타입 매칭

							// **************************************매칭**********************************************
						}

					}
				}

			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if ("studio".equals(type)) {
			List<Studio_vo> list = studio_dao.selList_studio("pro_idx = " + pro_idx);

			String val = "";
			try {
				if (ans_list.size() > 0 && !"".equals(ans_list.get(0).getAns_data())
						&& ans_list.get(0).getAns_data().indexOf("\"스드메\":") > -1) {
					JSONObject json_1 = new JSONObject(ans_list.get(0).getAns_data());
					JSONObject json_2 = json_1.getJSONObject("스드메");
					for (int i = 0; i < matching_arr_studio.length; i++) {
						if (ans_list.get(0).getAns_data().indexOf("\"" + matching_arr_studio[i] + "\":") > -1) {
							JSONObject json_3 = json_2.getJSONObject(matching_arr_studio[i]);
							val = json_3.getString("ques_value");

							// **************************************매칭**********************************************

							// 촬영유형 매칭
							if (!"".equals(val) && i == 0) {
								String user_type[] = val.split("&&");
								for (int j = 0; j < user_type.length; j++) {
									if (list.get(0).getPro_type().indexOf(user_type[j]) > -1) {
										matching_point++;
										matching_obj += "&&" + matching_arr_studio[i];
										break;
									}
								}
							}
							// 촬영유형 매칭

							// 컨셉 매칭
							if (!"".equals(val) && i == 1) {
								String user_concept[] = val.split("&&");
								for (int j = 0; j < user_concept.length; j++) {
									if (list.get(0).getPro_concept1().indexOf(user_concept[j]) > -1) {
										matching_point++;
										matching_obj += "&&" + matching_arr_studio[i];
										break;
									}
								}
							}
							// 컨셉 매칭

							// 예산 매칭
							if (!"".equals(val) && i == 2) {
								String user_money = val;
								if (!"".equals(list.get(0).getPro_sdm_pay()) && list.get(0).getPro_sdm_pay() != null) {
									String pro_money[] = list.get(0).getPro_sdm_pay().split("&&");
									for (int j = 0; j < pro_money.length; j++) {
										if (pro_money[j].equals(user_money)) {
											matching_point++;
											matching_obj += "&&" + matching_arr_studio[i];
											break;
										}
									}
								}
							}
							// 예산 매칭

							// **************************************매칭**********************************************
						}

					}
				}

			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if ("dress".equals(type)) {
			List<Dress_vo> list = dress_dao.selList_dress("pro_idx = " + pro_idx);

			String val = "";
			try {
				if (ans_list.size() > 0 && !"".equals(ans_list.get(0).getAns_data())
						&& ans_list.get(0).getAns_data().indexOf("\"스드메\":") > -1) {
					JSONObject json_1 = new JSONObject(ans_list.get(0).getAns_data());
					JSONObject json_2 = json_1.getJSONObject("스드메");
					for (int i = 0; i < matching_arr_dress.length; i++) {
						if (ans_list.get(0).getAns_data().indexOf("\"" + matching_arr_dress[i] + "\":") > -1) {
							JSONObject json_3 = json_2.getJSONObject(matching_arr_dress[i]);
							val = json_3.getString("ques_value");

							// **************************************매칭**********************************************

							// 브랜드 매칭
							if (!"".equals(val) && i == 0) {
								String user_brand[] = val.split("&&");

								for (int j = 0; j < user_brand.length; j++) {
									if ("국내 자체제작".equals(user_brand[j]) && "".equals(list.get(0).getPro_brand())) {
										matching_point++;
										matching_obj += "&&" + matching_arr_dress[i];
										break;
									} else if ("수입 드레스".equals(user_brand[j])
											&& list.get(0).getPro_brand().indexOf("수입드레스") > -1) {
										matching_point++;
										matching_obj += "&&" + matching_arr_dress[i];
										break;
									} else if ("멀티샵".equals(user_brand[j])
											&& list.get(0).getPro_brand().indexOf("멀티샵") > -1) {
										matching_point++;
										matching_obj += "&&" + matching_arr_dress[i];
										break;
									}
								}
							}
							// 브랜드 매칭

							// 예산 매칭

							if (!"".equals(val) && i == 1) {
								String user_money = val;
								if (!"".equals(list.get(0).getPro_sdm_pay()) && list.get(0).getPro_sdm_pay() != null) {
									String pro_money[] = list.get(0).getPro_sdm_pay().split("&&");
									for (int j = 0; j < pro_money.length; j++) {
										if (pro_money[j].equals(user_money)) {
											matching_point++;
											matching_obj += "&&" + matching_arr_dress[i];
											break;
										}
									}
								}
							}
							// 예산 매칭
							// **************************************매칭**********************************************
						}

					}
				}

			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if ("makeup".equals(type)) {
			List<Makeup_vo> list = makeup_dao.selList_makeup("pro_idx = " + pro_idx);

			String val = "";
			try {
				if (ans_list.size() > 0 && !"".equals(ans_list.get(0).getAns_data())
						&& ans_list.get(0).getAns_data().indexOf("\"스드메\":") > -1) {
					JSONObject json_1 = new JSONObject(ans_list.get(0).getAns_data());
					JSONObject json_2 = json_1.getJSONObject("스드메");
					for (int i = 0; i < matching_arr_makeup.length; i++) {
						if (ans_list.get(0).getAns_data().indexOf("\"" + matching_arr_makeup[i] + "\":") > -1) {
							JSONObject json_3 = json_2.getJSONObject(matching_arr_makeup[i]);
							val = json_3.getString("ques_value");

							// **************************************매칭**********************************************
							// 컨셉 매칭
							if (!"".equals(val) && i == 0) {
								String user_concept[] = val.split("&&");

								for (int j = 0; j < user_concept.length; j++) {
									if (list.get(0).getPro_concept().indexOf(user_concept[j]) > -1) {
										matching_point++;
										matching_obj += "&&" + matching_arr_makeup[i];
										break;
									}
								}
							}
							// 컨셉 매칭

							// 예산 매칭
							if (!"".equals(val) && i == 1) {
								String user_money = val;
								if (!"".equals(list.get(0).getPro_sdm_pay()) && list.get(0).getPro_sdm_pay() != null) {
									String pro_money[] = list.get(0).getPro_sdm_pay().split("&&");
									for (int j = 0; j < pro_money.length; j++) {
										if (pro_money[j].equals(user_money)) {
											matching_point++;
											matching_obj += "&&" + matching_arr_makeup[i];
											break;
										}
									}
								}
							}
							// 예산 매칭
							// **************************************매칭**********************************************
						}

					}
				}

			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if ("snap".equals(type)) {

		} else if ("suit".equals(type)) {
			List<Suit_vo> list = suit_dao.selList_suit("pro_idx = " + pro_idx);

			String val = "";
			try {
				if (ans_list.size() > 0 && !"".equals(ans_list.get(0).getAns_data())
						&& ans_list.get(0).getAns_data().indexOf("\"예복\":") > -1) {
					JSONObject json_1 = new JSONObject(ans_list.get(0).getAns_data());
					JSONObject json_2 = json_1.getJSONObject("예복");
					for (int i = 0; i < matching_arr_suit.length; i++) {
						if (ans_list.get(0).getAns_data().indexOf("\"" + matching_arr_suit[i] + "\":") > -1) {
							JSONObject json_3 = json_2.getJSONObject(matching_arr_suit[i]);
							val = json_3.getString("ques_value");

							// **************************************매칭**********************************************
							// 지역 매칭
							if (!"".equals(val) && i == 0) {
								String pro_addr[] = list.get(0).getPro_addr1().replaceAll("특별", "").replaceAll("광역", "")
										.split(" ");
								String user_addr[] = val.replaceAll("특별", "").replaceAll("광역", "").split(" ");
								if (pro_addr.length > 1 && user_addr.length > 1) {
									if (pro_addr[0].equals(user_addr[0]) && pro_addr[1].equals(user_addr[1])) {
										matching_point++;
										matching_obj += "&&" + matching_arr_suit[i];
									}
								}
							}
							// 지역 매칭

							// 판매방식 매칭
							if (!"".equals(val) && i == 1) {
								String user_suit_type[] = val.split("&&");

								for (int j = 0; j < user_suit_type.length; j++) {
									if (list.get(0).getPro_type().indexOf(user_suit_type[j]) > -1) {
										matching_point++;
										matching_obj += "&&" + matching_arr_suit[i];
										break;
									}
								}
							}
							// 판매방식 매칭

							// 예산 매칭
							if (!"".equals(val) && i == 2) {
								matching_point++;
								matching_obj += "&&" + matching_arr_suit[i];
							}
							// 예산 매칭

							// **************************************매칭**********************************************
						}

					}
				}

			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if ("korea".equals(type)) {
			List<Korea_vo> list = korea_dao.selList_korea("pro_idx = " + pro_idx);

			String val = "";
			try {
				if (ans_list.size() > 0 && !"".equals(ans_list.get(0).getAns_data())
						&& ans_list.get(0).getAns_data().indexOf("\"한복\":") > -1) {
					JSONObject json_1 = new JSONObject(ans_list.get(0).getAns_data());
					JSONObject json_2 = json_1.getJSONObject("한복");
					for (int i = 0; i < matching_arr_korea.length; i++) {
						if (ans_list.get(0).getAns_data().indexOf("\"" + matching_arr_korea[i] + "\":") > -1) {
							JSONObject json_3 = json_2.getJSONObject(matching_arr_korea[i]);
							val = json_3.getString("ques_value");

							// **************************************매칭**********************************************
							// 지역 매칭
							if (!"".equals(val) && i == 0) {
								String user_addr[] = val.replaceAll("&&", "/").split("/");

								for (int j = 0; j < user_addr.length; j++) {
									if (list.get(0).getPro_addr1().indexOf(user_addr[j]) > -1) {
										matching_point++;
										matching_obj += "&&" + matching_arr_korea[i];
										break;
									}
								}
							}
							// 지역 매칭

							// 판매방식 매칭
							if (!"".equals(val) && i == 1) {
								String user_korea_type[] = val.split("&&");

								for (int j = 0; j < user_korea_type.length; j++) {
									if (list.get(0).getPro_type().indexOf(user_korea_type[j]) > -1) {
										matching_point++;
										matching_obj += "&&" + matching_arr_korea[i];
										break;
									}
								}
							}

							// 판매방식 매칭

							// 예산 매칭
							if (!"".equals(val) && i == 2) {
								matching_point++;
								matching_obj += "&&" + matching_arr_korea[i];
							}
							// 예산 매칭

							// **************************************매칭**********************************************
						}

					}
				}

			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if ("jewelry".equals(type)) {
			List<Jewelry_vo> list = jewelry_dao.selList_jewelry("pro_idx = " + pro_idx);

			String val = "";
			try {
				if (ans_list.size() > 0 && !"".equals(ans_list.get(0).getAns_data())
						&& ans_list.get(0).getAns_data().indexOf("\"예물\":") > -1) {
					JSONObject json_1 = new JSONObject(ans_list.get(0).getAns_data());
					JSONObject json_2 = json_1.getJSONObject("예물");
					for (int i = 0; i < matching_arr_jewelry.length; i++) {
						if (ans_list.get(0).getAns_data().indexOf("\"" + matching_arr_jewelry[i] + "\":") > -1) {
							JSONObject json_3 = json_2.getJSONObject(matching_arr_jewelry[i]);
							val = json_3.getString("ques_value");

							// **************************************매칭**********************************************
							// 지역 매칭
							if (!"".equals(val) && i == 0) {
								String user_addr[] = val.replaceAll("&&", "/").replaceAll(" 귀금속", "").split("/");

								for (int j = 0; j < user_addr.length; j++) {
									if (list.get(0).getPro_addr1().indexOf(user_addr[j]) > -1) {
										matching_point++;
										matching_obj += "&&" + matching_arr_jewelry[i];
										break;
									}
								}
							}
							// 지역 매칭

							// 예산 매칭
							if (!"".equals(val) && i == 1) {
								matching_point++;
								matching_obj += "&&" + matching_arr_jewelry[i];
							}
							// 예산 매칭

							// **************************************매칭**********************************************
						}

					}
				}

			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if ("pb".equals(type)) {
			List<Pb_vo> list = pb_dao.selList_pb("pro_idx = " + pro_idx);

			String val = "";
			try {
				if (ans_list.size() > 0 && !"".equals(ans_list.get(0).getAns_data())
						&& ans_list.get(0).getAns_data().indexOf("\"폐백\":") > -1) {
					JSONObject json_1 = new JSONObject(ans_list.get(0).getAns_data());
					JSONObject json_2 = json_1.getJSONObject("폐백");
					for (int i = 0; i < matching_arr_pb.length; i++) {
						if (ans_list.get(0).getAns_data().indexOf("\"" + matching_arr_pb[i] + "\":") > -1) {
							JSONObject json_3 = json_2.getJSONObject(matching_arr_pb[i]);
							val = json_3.getString("ques_value");

							// **************************************매칭**********************************************

							// 예산 매칭
							if (!"".equals(val) && i == 0) {
								matching_point++;
								matching_obj += "&&" + matching_arr_pb[i];
							}
							// 예산 매칭

							// **************************************매칭**********************************************
						}

					}
				}

			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return matching_point + "" + matching_obj;
	}

	public String scrap_yn(int user_idx, String type, int pro_idx) {
		String scrap_query = "1";

		scrap_query += " and scrap_user_idx = " + user_idx;
		scrap_query += " and scrap_pro_idx = '" + pro_idx + "'";
		scrap_query += " and scrap_pro_category = '" + type + "'";
		List<Scrap_vo> scrap_list = scrap_dao.selList_scrap(scrap_query);
		if (scrap_list.size() > 0) {
			return "on";
		} else {
			return "off";
		}
	}

	public int sample_cnt(int pro_idx, String type) {
		int sample_cnt = 0;
		File directory = new File("/plan/weddingQ_product/" + type + "/" + pro_idx);
		File[] files = directory.listFiles();
		if (files != null) {
			for (File file : files) {
				if ((file.getName()).indexOf("sample") > -1) {
					sample_cnt++;
				}
			}
		}
		return sample_cnt;
	}

	public void send_push(int user_idx, String title, String content) {

		// String ApiKey =
		// "key=AAAAP0xnzj0:APA91bHpxwE6jPP3I5NZ5os28b_LxkX5nEaP0XRzUiD-9HJhe4RloYCBCq0_-kNZ-ORFtHVlIw8Py8_mRBq1mzai7ly6HTEx2-xtaB7CXeeDqVaVRlO5LwKOa6c-BA2eYNAFP7iHWirR";
		// 웨딩큐

		String ApiKey = "key=AAAA2_YTOwk:APA91bHuha_qv5GE-oaYSHRH2PihwAFejIJRneP7LQFhKq0vlut4Aj8xLsjqmiAyFldbK-8J1LC18U0qkKk46ScaIDCNhvHFMD__DlPgz1_LO3v5uq8aCchiWN-SN4AIoNMhbmmZgTeM";
		// 재상씨꺼

		List<User2_vo> list = user2_dao.find_user(user_idx);
		String token = list.get(0).getUser_token();

		String url = "https://fcm.googleapis.com/fcm/send";
		org.apache.http.client.HttpClient httpClient = new DefaultHttpClient();
		HttpPost httppost = new HttpPost(url);
		httppost.setHeader(HTTP.CONTENT_TYPE, "application/json");
		httppost.setHeader("Authorization", ApiKey);

		JSONObject jsonObject = new JSONObject();
		JSONObject object = new JSONObject();
		try {
			jsonObject.put("to", token);
			object.put("title", title);
			object.put("content", content);
			jsonObject.put("data", object);
			httppost.setEntity(new StringEntity(jsonObject.toString(), Consts.UTF_8));

			HttpResponse response = httpClient.execute(httppost);
			HttpEntity resEntity = response.getEntity();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
