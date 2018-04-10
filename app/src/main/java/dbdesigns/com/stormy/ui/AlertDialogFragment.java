package dbdesigns.com.stormy.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

import dbdesigns.com.stormy.R;

/**
 * Created by dennisb on 20/2/16.
 */
public class AlertDialogFragment extends DialogFragment {
        // Builder med felmeddelande ifall att hämtningen utav data misslyckats //
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                .setTitle(context.getString(R.string.error_title))
                .setMessage(context.getString(R.string.error_message))
                .setPositiveButton(context.getString(R.string.error_ok_button_text), null);
        // skapar och retunerar builder //
        AlertDialog dialog = builder.create();
        return dialog;
    }
}
