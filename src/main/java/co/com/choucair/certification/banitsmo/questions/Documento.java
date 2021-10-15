package co.com.choucair.certification.banitsmo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import static co.com.choucair.certification.banitsmo.util.PdfHandling.readPdfContent;

public class Documento implements Question<Boolean> {
    private String titulo;
    public Documento(String titulo) {
        this.titulo = titulo;
    }

    public static Documento descarga(String titulo) {
        return new Documento(titulo);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean flag = false;
        try {
            String url = "https://www.grupobancolombia.com/wcm/connect/www.grupobancolombia.com15880/fee51124-9970-433f-919b-48af49d1c081/Contrato+Inversi%C3%B3n+Virtual.pdf?MOD=AJPERES&CVID=mGPj0Ri";
            String pdfContent = readPdfContent(url);
            flag = pdfContent.contains(titulo);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return flag;
    }
}
