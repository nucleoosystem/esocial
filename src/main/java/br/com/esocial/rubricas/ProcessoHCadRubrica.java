package br.com.esocial.rubricas;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name = "TSOC_HCPL_CAD_RUB_PROC", schema = "ESOCIAL")
public class ProcessoHCadRubrica {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequencePrcoHCadRubrica")
	@SequenceGenerator(name = "sequencePrcoHCadRubrica", sequenceName = ".ESOC_SEQ_ID_HCPL_1010_PROC")
	private Integer idHistProcRub;
	private Integer idProcRub;
	private Integer idCadRub;
	private Integer tpproc;
	private String nrproc;
	private Integer extdecisao;
	private Integer codsusp;
	private Calendar datIng;
	private Calendar datUltAtu;
	private String nomUsuUltAtu;
	private String nomProUltAtu;
	private Integer tipProcesso;
	private Integer seqHist;
	private String flgInput;

}
