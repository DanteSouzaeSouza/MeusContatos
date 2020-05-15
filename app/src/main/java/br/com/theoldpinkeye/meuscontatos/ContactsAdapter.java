package br.com.theoldpinkeye.meuscontatos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import br.com.theoldpinkeye.meuscontatos.models.Contato;
import java.util.List;

public class ContactsAdapter extends BaseAdapter {

  // Criando variáveis de suporte
  private Context context;
  private List<Contato> contacts;

  // Adicionando constructor
  public ContactsAdapter(Context context,
      List<Contato> contacts) {
    this.context = context;
    this.contacts = contacts;
  }

  @Override
  public int getCount() {
    return 0;
  }

  @Override
  public Object getItem(int position) {
    return null;
  }

  @Override
  public long getItemId(int position) {
    return 0;
  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent) {
    View contato = LayoutInflater.from(context).inflate(R.layout.list_item_card, parent, false);
    TextView nomeTV = contato.findViewById(R.id.nomeTextView);
    TextView telefoneTV = contato.findViewById(R.id.telefoneTextView);
    TextView emailTV = contato.findViewById(R.id.emailTextView);




    return null;
  }
}
