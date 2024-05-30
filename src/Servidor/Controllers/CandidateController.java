package Servidor.Controllers;

import Infrastructure.Requests.CandidateRequest;
import Servidor.Services.CandidateService;

import java.io.PrintWriter;

public class CandidateController extends BaseController {

    public static void Read(PrintWriter out, String json){
        var request = _gson.fromJson(json, CandidateRequest.class);

        var response = CandidateService.Read(request);
        var result = _gson.toJson(response);
        out.println(result);
    }

    public static void All(PrintWriter out, String json){

    }

    public static void Create(PrintWriter out, String json){
        var request = _gson.fromJson(json, CandidateRequest.class);

        var response = CandidateService.Create(request);
        var result = _gson.toJson(response);
        out.println(result);
    }

    public static void Update(PrintWriter out, String json){
        var request = _gson.fromJson(json, CandidateRequest.class);

        var response = CandidateService.Update(request);
        var result = _gson.toJson(response);
        out.println(result);
    }

    public static void Delete(PrintWriter out, String json){
        var request = _gson.fromJson(json, CandidateRequest.class);

        var response = CandidateService.Delete(request);
        var result = _gson.toJson(response);
        out.println(result);
    }
}
