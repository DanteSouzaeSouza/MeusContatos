package br.com.theoldpinkeye.meuscontatos;

import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import br.com.theoldpinkeye.meuscontatos.models.ContactEntry;
import br.com.theoldpinkeye.meuscontatos.models.Contato;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

  // Criando a variável para receber os dados de contatos
  List<Contato> contatos;
  // Criando contato de teste
  Contato contatoTeste;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    // instanciando a lista de contatos
    contatos = new ArrayList<>();
    // adicionando elementos para teste
    contatoTeste = new Contato();


    List<ContactEntry> contactEntries = new ArrayList<>();

    ContactEntry contactEntry = new ContactEntry();
    contactEntry.setLabel("tel. Comercial");
    contactEntry.setType("Tel.");
    contactEntry.setEntryId("1");
    contactEntry.setUri("11 32323232");

    ContactEntry contactEntry2 = new ContactEntry();
    contactEntry2.setLabel("E-mail Comercial");
    contactEntry2.setType("email");
    contactEntry2.setEntryId("2");
    contactEntry2.setUri("dante.s@uni9.pro.br");

    contactEntries.add(contactEntry);
    contactEntries.add(contactEntry2);

    contatoTeste.setContactEntries(contactEntries);
    contatoTeste.setFname("Dante");


    contatos.add(contatoTeste);

    // Exibindo os dados no Console (LogCat)
    Log.i("Dado", contatos.toString());




  }
}
