/*
 * File     : MainActivity.java
 * Project  : TemplateActivity
 * Author   : Markus Jaton 2 juillet 2014
 * 			  Fabien Dutoit 28 août 2018
 *            IICT / HEIG-VD
 *
 * mailto:fabien.dutoit@heig-vd.ch
 *
 * This piece of code reads a [email_account / password ] combination.
 * It is used as a template project for the SYM module element given at HEIG-VD
 * Target audience : students IL, TS, IE [generally semester 1, third bachelor year]
 *
 * THIS SOFTWARE IS PROVIDED "AS IS" AND ANY EXPRESSED OR IMPLIED WARRANTIES,
 * INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY
 * AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL
 * THE REGENTS OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED
 * TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 */
package ch.heigvd.sym.template;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    // For logging purposes
    private static final String TAG = MainActivity.class.getSimpleName();

    private Button btn_asynchrone = null;
    private Button btn_differe = null;
    private Button btn_graphQl = null;
    private Button btn_serialisation = null;
    private Button btn_compresse = null;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        int requestCode = 1;

        switch (item.getItemId()) {
            case R.id.asynchrone_menu:
                intent = new Intent(MainActivity.this, ch.heigvd.sym.template.asynchrone.class);
                startActivityForResult(intent, requestCode);

                Toast.makeText(MainActivity.this, getResources().getString(R.string.good), Toast.LENGTH_LONG).show();
                return true;

            case R.id.differe_menu:
                intent = new Intent(MainActivity.this, ch.heigvd.sym.template.differe.class);
                startActivityForResult(intent, requestCode);

                Toast.makeText(MainActivity.this, getResources().getString(R.string.good), Toast.LENGTH_LONG).show();
                return true;

            case R.id.graph_ql_menu:
                intent = new Intent(MainActivity.this, ch.heigvd.sym.template.graphQl.class);
                startActivityForResult(intent, requestCode);

                Toast.makeText(MainActivity.this, getResources().getString(R.string.good), Toast.LENGTH_LONG).show();
                return true;

            case R.id.serialisation_menu:
                intent = new Intent(MainActivity.this, ch.heigvd.sym.template.serialisation.class);
                startActivityForResult(intent, requestCode);

                Toast.makeText(MainActivity.this, getResources().getString(R.string.good), Toast.LENGTH_LONG).show();
                return true;

            case R.id.compresse_menu:
                intent = new Intent(MainActivity.this, compress.class);
                startActivityForResult(intent, requestCode);

                Toast.makeText(MainActivity.this, getResources().getString(R.string.good), Toast.LENGTH_LONG).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        // start new activity
        btn_asynchrone = findViewById(R.id.btn_asynchrone);
        btn_asynchrone.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ch.heigvd.sym.template.asynchrone.class);
                int requestCode = 1;
                startActivityForResult(intent, requestCode);

                Toast.makeText(MainActivity.this, getResources().getString(R.string.good), Toast.LENGTH_LONG).show();
            }
        });

        btn_compresse = findViewById(R.id.btn_compresse);
        btn_compresse.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, compress.class);
                int requestCode = 1;
                startActivityForResult(intent, requestCode);

                Toast.makeText(MainActivity.this, getResources().getString(R.string.good), Toast.LENGTH_LONG).show();
            }
        });

        btn_differe = findViewById(R.id.btn_differe);
        btn_differe.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ch.heigvd.sym.template.differe.class);
                int requestCode = 1;
                startActivityForResult(intent, requestCode);

                Toast.makeText(MainActivity.this, getResources().getString(R.string.good), Toast.LENGTH_LONG).show();
            }
        });

        btn_graphQl = findViewById(R.id.btn_graphQl);
        btn_graphQl.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ch.heigvd.sym.template.graphQl.class);
                int requestCode = 1;
                startActivityForResult(intent, requestCode);

                Toast.makeText(MainActivity.this, getResources().getString(R.string.good), Toast.LENGTH_LONG).show();
            }
        });

        btn_serialisation = findViewById(R.id.btn_serialisation);
        btn_serialisation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ch.heigvd.sym.template.serialisation.class);
                int requestCode = 1;
                startActivityForResult(intent, requestCode);

                Toast.makeText(MainActivity.this, getResources().getString(R.string.good), Toast.LENGTH_LONG).show();
            }
        });

    }
}
