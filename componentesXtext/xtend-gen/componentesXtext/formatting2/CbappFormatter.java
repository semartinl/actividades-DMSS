/**
 * generated by Xtext 2.33.0
 */
package componentesXtext.formatting2;

import com.google.inject.Inject;
import componentes.CBAPP;
import componentes.Componente;
import componentes.Conector;
import componentes.ProvidedInterface;
import componentes.RequiredInterface;
import componentesXtext.services.CbappGrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class CbappFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private CbappGrammarAccess _cbappGrammarAccess;

  protected void _format(final CBAPP cBAPP, @Extension final IFormattableDocument document) {
    EList<Conector> _conectores = cBAPP.getConectores();
    for (final Conector conector : _conectores) {
      document.<Conector>format(conector);
    }
    EList<Componente> _componentes = cBAPP.getComponentes();
    for (final Componente componente : _componentes) {
      document.<Componente>format(componente);
    }
  }

  protected void _format(final Componente componente, @Extension final IFormattableDocument document) {
    EList<ProvidedInterface> _provides = componente.getProvides();
    for (final ProvidedInterface providedInterface : _provides) {
      document.<ProvidedInterface>format(providedInterface);
    }
    EList<RequiredInterface> _requires = componente.getRequires();
    for (final RequiredInterface requiredInterface : _requires) {
      document.<RequiredInterface>format(requiredInterface);
    }
  }

  public void format(final Object cBAPP, final IFormattableDocument document) {
    if (cBAPP instanceof XtextResource) {
      _format((XtextResource)cBAPP, document);
      return;
    } else if (cBAPP instanceof CBAPP) {
      _format((CBAPP)cBAPP, document);
      return;
    } else if (cBAPP instanceof Componente) {
      _format((Componente)cBAPP, document);
      return;
    } else if (cBAPP instanceof EObject) {
      _format((EObject)cBAPP, document);
      return;
    } else if (cBAPP == null) {
      _format((Void)null, document);
      return;
    } else if (cBAPP != null) {
      _format(cBAPP, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(cBAPP, document).toString());
    }
  }
}
