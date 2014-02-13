package servlets;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.stream.JsonParser;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;
import org.restlet.ext.json.JsonRepresentation;

import starcraft.userprofile.UserProfile;
import starcraft.userprofile.UserProfileReader;

/**
 * Servlet implementation class DisplayProfile
 */
@WebServlet("/DisplayProfile")
public class DisplayProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public DisplayProfile() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	/*
	 * Process should be to come to this page, perform the necessary java tasks,
	 * and then send to actual jsp page to display
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String profileURL = request.getParameter("profileURL");
		UserProfile up = UserProfileReader.retrieveLadderInfo(profileURL);

		request.setAttribute("profile", up.toString());

		request.getRequestDispatcher("/pages/Profile.jsp").forward(request,
				response);
	}

}
